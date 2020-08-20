package com.example.demo;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@SpringBootApplication
public class ApiHelloWorldBackendApplication {

  public static void main(String[] args) {
    SpringApplication.run(ApiHelloWorldBackendApplication.class, args);
  }

  @Bean
  public RouterFunction<ServerResponse> router() {

    return RouterFunctions.route(GET("hello"), request -> ServerResponse.ok().bodyValue("Hello"))
        .andRoute(GET("world"), request -> ServerResponse.ok().bodyValue("World"));
  }
}
