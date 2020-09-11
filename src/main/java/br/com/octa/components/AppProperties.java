package br.com.octa.components;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@ConfigurationProperties("app")
public class AppProperties {
 
 private String folderWatch ;
 private Boolean startSapServer;
 private Boolean enableFolderWatch;

  
}