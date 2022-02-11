package com.kodilla.kodillaconverter.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

@Configuration
public class ConverterConfig {

    /*@Bean
    public HttpMessageConverter<Object> customSlashConverter() {
        return new MyCustomSlashConverter();
    }*/

    @Bean
    public HttpMessageConverter<Object> myConverter() {
        return new NewDtoConverter();
    }
}
