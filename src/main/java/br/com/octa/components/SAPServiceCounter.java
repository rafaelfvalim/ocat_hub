package br.com.octa.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.octa.model.Documento;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;

@Component
public class SAPServiceCounter {
    private List<Documento> documentos = new ArrayList<>();
    
    private Counter documentoNFE;
    private Counter documentoCTE;
	
	  private final MeterRegistry meterRegistry;
	  public SAPServiceCounter(MeterRegistry meterRegistry) {
		  this.meterRegistry = meterRegistry;
		  initDocumentoCounters();
		  Gauge.builder("homsoft.totalDocumentos",documentos, Collection::size)
          .description("Documentos Homsoft")
          .register(meterRegistry);
	  }
	  
	  private void initDocumentoCounters() {
		  documentoNFE = this.meterRegistry.counter("homsoft.documentos", "type", "NFe"); // 1 - create a counter
		  documentoCTE = this.meterRegistry.counter("homsoft.documentos", "type", "CTe"); // 1 - create a counter
	       
//		  documentoCTE = Counter.builder("beer.orders")    // 2- create a counter using the fluent API
//	                .tag("type", "ale")
//	                .description("The number of orders ever placed for Ale beers")
//	                .register(meterRegistry);
	    }
	  
	  public void getStatus(Documento documento) {
	        documentos.add(documento);

	        if ("NFe".equals(documento.getTipo())) {
	        	documentoNFE.increment(1.0);  // 3 - increment the counters
	        } else if ("CTe".equals(documento.getTipo())) {
	        	documentoCTE.increment();
	        }
	    }
	 
	  
}
