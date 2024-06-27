package org.users.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {

  //	@Bean
  //	public Jackson2ObjectMapperBuilder objectMapperBuilder() {
  //		Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
  //		builder.serializationInclusion(JsonInclude.Include.NON_NULL);
  //		return builder;
  //	}
  @Bean
  public ObjectMapper objectMapper() {
    return new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
  }
}
