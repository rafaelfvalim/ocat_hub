package br.com.octa.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import br.com.octa.service.SAPService;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SapServiceMetrics implements HealthIndicator {

	@Autowired
	public SAPService sapService;

	@Override
	public Health health() {

		try {
			if (sapService.getServerStatus() != null) {
				return Health.up().withDetail("status", sapService.getServerStatus().name()).build();
			} else {
				return Health.up().withDetail("status", "DOWN").build();
			}
		} catch (RestClientException ex) {
			return Health.down().withException(ex).build();
		}

	}

//		

//	@Override
//	public void bindTo(MeterRegistry registry) {
//		
//		Gauge.builder("sap_connection_state", this, value -> SAPService.getServerStatus())
//				.description("Status do servidor SAP")
//				.tags(Tags.of(Tag.of("data", LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")))))
//				.baseUnit("sap_server") // uma palavra adicionada a chave da sua métrica pra você encontrar mais
//										// facilmente na lista de informações expostas
//				.register(registry);
//	}

}
