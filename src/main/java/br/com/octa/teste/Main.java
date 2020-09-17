package br.com.octa.teste;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.hibersap.bapi.BapiRet2;
import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;

import br.com.octa.helper.DateHelper;
import br.com.octa.sap.Flight;
import br.com.octa.sap.FlightListBapi;
import br.com.octa.sap.OctaCoundDoc;
import br.com.octa.sap.dto.HomsoftDocCountDto;

public class Main {

	public SessionManager createSessionManager() {
		AnnotationConfiguration configuration = new AnnotationConfiguration("A12");
		return configuration.buildSessionManager();
	}

	
	
	
	public void showFlightList() {

		SessionManager sessionManager = createSessionManager();
		Session session = sessionManager.openSession();
		try {
			FlightListBapi flightList = new FlightListBapi("DE", "Frankfurt", "DE", "Berlin", null, false, 10);
			session.execute(flightList);
			showResult(flightList);
		} finally {
			session.close();
		}
	}
	
	public void teste() {
		SessionManager sessionManager = createSessionManager();
		Session session = sessionManager.openSession();

		try {
			
			OctaCoundDoc info =  new OctaCoundDoc();
			info.setDateDe(new Date());
			info.setDateAte(new Date());
			session.execute(info);
			
			info.getItDoc().stream().map(HomsoftDocCountDto::new).collect(Collectors.toList());

		} finally {
			session.close();
		}
		
	
	}
	
	
	

	private void showResult(FlightListBapi flightList) {

		System.out.println("AirlineId: " + flightList.getFromCountryKey());
		System.out.println("FromCity: " + flightList.getFromCity());
		System.out.println("ToCountryKey: " + flightList.getToCountryKey());
		System.out.println("ToCity: " + flightList.getToCity());
		System.out.println("AirlineCarrier: " + flightList.getAirlineCarrier());
		System.out.println("Afternoon: " + flightList.getAfternoon());
		System.out.println("MaxRead: " + flightList.getMaxRead());

		System.out.println("\nFlightData");
		List<Flight> flights = flightList.getFlightList();
		for (Flight flight : flights) {
			System.out.print("\t" + flight.getAirportFrom());
			System.out.print("\t" + flight.getAirportTo());
			System.out.print("\t" + flight.getCarrierId());
			System.out.print("\t" + flight.getConnectionId());
			System.out.print("\t" + flight.getSeatsMax());
			System.out.print("\t" + flight.getSeatsOccupied());
			System.out.println("\t" + flight.getDepartureTime());
		}

		System.out.println("\nReturn");
		BapiRet2 returnStruct = flightList.getReturnData();
		System.out.println("\tMessage: " + returnStruct.getMessage());
		System.out.println("\tNumber: " + returnStruct.getNumber());
		System.out.println("\tType: " + returnStruct.getType());
		System.out.println("\tId: " + returnStruct.getId());
	}
     
	public static void main(String[] args) {
		
		System.out.println(DateHelper.toDate("06.06.2019").toString());
//		new Main().teste();
//		Server server = Server.getInstance();
//		server.start();
//		
		
	}
	
	public void testeXMLConv() {
		

	    
	    
	}
	
	
}
