package br.com.octa.sap.server;

import java.util.Hashtable;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sap.conn.jco.AbapClassException;
import com.sap.conn.jco.AbapException;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.server.JCoServer;
import com.sap.conn.jco.server.JCoServerContext;
import com.sap.conn.jco.server.JCoServerFactory;
import com.sap.conn.jco.server.JCoServerFunctionHandler;
import com.sap.conn.jco.server.JCoServerFunctionHandlerFactory;
import com.sap.conn.jco.server.JCoServerState;

public class Server {
	private static Server INSTANCIA;
	JCoServer server;
	Logger logger = LogManager.getLogger(Server.class);

	static class MyFunctionHandlerFactory implements JCoServerFunctionHandlerFactory {
		class SessionContext {
			Hashtable<String, Object> cachedSessionData = new Hashtable<String, Object>();
		}

		private Map<String, SessionContext> statefulSessions = new Hashtable<String, SessionContext>();
		private StfcConnectionFunctionHandles stfcConnectionFunctionHandler = new StfcConnectionFunctionHandles();
		private KTTSendConsNfeDestWsFunctionHandler kTTSendConsNfeDestWsFunctionHandler = new KTTSendConsNfeDestWsFunctionHandler();
		private KTTSendEnvConfRecebtoWSFunctionHandler kTTSendEnvConfRecebtoWSFunctionHandler = new KTTSendEnvConfRecebtoWSFunctionHandler();

		public JCoServerFunctionHandler getCallHandler(JCoServerContext serverCtx, String functionName) {
			JCoServerFunctionHandler handler = null;

			System.out.println(functionName);

			if ("STFC_CONNECTION".equals(functionName))
				handler = stfcConnectionFunctionHandler;
			else if ("/KTT/SENDCONSNFEDESTWS".equals(functionName))
				handler = kTTSendConsNfeDestWsFunctionHandler;
			else if ("/KTT/SENDENVCONFRECEBTOWS".equals(functionName))
				handler = kTTSendEnvConfRecebtoWSFunctionHandler;

			if (handler instanceof StatefulFunctionModule) {
				SessionContext cachedSession;
				if (!serverCtx.isStatefulSession()) {
					serverCtx.setStateful(true);
					cachedSession = new SessionContext();
					statefulSessions.put(serverCtx.getSessionID(), cachedSession);
				} else {
					cachedSession = statefulSessions.get(serverCtx.getSessionID());
					if (cachedSession == null)
						throw new RuntimeException(
								"Unable to find the session context for session id " + serverCtx.getSessionID());
				}
				((StatefulFunctionModule) handler).setSessionData(cachedSession.cachedSessionData);
				return handler;
			}

			// null leads to a system failure on the ABAP side
			return null;
		}

		public void sessionClosed(JCoServerContext serverCtx, String message, boolean error) {
			System.out.println(
					"Session " + serverCtx.getSessionID() + " was closed " + (error ? message : "by SAP system"));
			statefulSessions.remove(serverCtx.getSessionID());
		}
	}

	static abstract class StatefulFunctionModule implements JCoServerFunctionHandler {
		Hashtable<String, Object> sessionData;

		public void setSessionData(Hashtable<String, Object> sessionData) {
			this.sessionData = sessionData;
		}
	}

	/// KTT/SENDCONSNFEDESTWS
	static class KTTSendConsNfeDestWsFunctionHandler extends StatefulFunctionModule {

		@Override
		public void handleRequest(JCoServerContext context, JCoFunction function)
				throws AbapException, AbapClassException {
			ConsultaNFeDestinatario(function);
		}

	}

	/// KTT/SENDENVCONFRECEBTOWS
	static class KTTSendEnvConfRecebtoWSFunctionHandler extends StatefulFunctionModule {

		@Override
		public void handleRequest(JCoServerContext context, JCoFunction function)
				throws AbapException, AbapClassException {
			EnvioEvento(function);
		}
	}

	static class StfcConnectionFunctionHandles extends StatefulFunctionModule {
		public void handleRequest(JCoServerContext serverCtx, JCoFunction function) {
			function.getExportParameterList().setValue("ECHOTEXT",
					function.getImportParameterList().getString("REQUTEXT"));
			function.getExportParameterList().setValue("RESPTEXT", "OCTA HUB SAP INTEGRATOR");
			new EasterEgg().showLogo(function.getImportParameterList().getString("REQUTEXT"));
		}

	}

	public static void main(String[] args) {
		new Server().start();
	}

	public void stop() {
		server.stop();
	}

	public Boolean start() {
		logger.info("Inicializando Servidor SAP");
		try {
			server = JCoServerFactory.getServer("SERVER");
			logger.info("Obtendo dados de configuração");
		} catch (JCoException ex) {
			logger.info("Unable to create the server " + "SERVER" + ", because of " + ex.getMessage(), ex);

			return false;

		}
		server.setCallHandlerFactory(new MyFunctionHandlerFactory());
		server.start();
		logger.info("Servidor iniciado");
		return true;
	}

	public static synchronized Server getInstance() {
		if (INSTANCIA == null) {
			INSTANCIA = new Server();
		}
		return INSTANCIA;
	}
	public JCoServerState getServerStatus() {
		return server.getState();
	}
	
	
	public static void EnvioEvento(JCoFunction function) {

	}

	public static void ConsultaNFeDestinatario(JCoFunction function) {

	}

}