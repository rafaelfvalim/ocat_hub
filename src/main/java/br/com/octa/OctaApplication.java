package br.com.octa;

import java.time.Duration;
import java.util.concurrent.Executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import br.com.octa.components.SAPServiceCounter;
import br.com.octa.model.Documento;
import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import reactor.core.publisher.Flux;


@SpringBootApplication
@EnableScheduling
@EnableAsync
public class OctaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OctaApplication.class, args);

	}
	
	@Autowired 
	private BeerService beerService;
	@Autowired 
	private SAPServiceCounter sapServiceCounter;

//	    public OctaApplication(BeerService beerService, SAPServiceCounter sapServiceCounter) {
//	        this.beerService = beerService;
//	        this.beerService = beerService;
//	    }

	    @EventListener(ApplicationReadyEvent.class)
	    public void orderBeers() {
	        Flux.interval(Duration.ofSeconds(2))
	                .map(OctaApplication::toOrder)
	                .doOnEach(o -> beerService.orderBeer(o.get()))
	                .subscribe();
	    }
	    
	   
	    private static Orden toOrder(Long l) {
	        Long amount = l % 5;
	        String type = l % 2 == 0 ? "ale" : "light";
	        return new Orden(amount.intValue(), type);
	    }

	    private static Documento toDoc(Long l) {
	        Long amount = l % 5;
	        String type = l % 2 == 0 ? "NFe" : "CTe";
	        Documento doc = new Documento();
	        doc.setChave("1111");
	        doc.setTipo(type);
	        return doc;
	    }
	    @EventListener(ApplicationReadyEvent.class)
	    public void hmsDocumentos() {
	        Flux.interval(Duration.ofSeconds(2))
	                .map(OctaApplication::toDoc)
	                .doOnEach(o -> sapServiceCounter.getStatus(o.get()))
	                .subscribe();
	    }
	    
	    
	    @Bean
	    public TimedAspect timedAspect(MeterRegistry registry) {
	        return new TimedAspect(registry);
	    }
	    
	    @Bean(name = "fileExecutor")
	    public Executor asyncExecutor() {
	        final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(1);
	        executor.setMaxPoolSize(15);
	        executor.initialize();
	        return executor;
	    }

}
