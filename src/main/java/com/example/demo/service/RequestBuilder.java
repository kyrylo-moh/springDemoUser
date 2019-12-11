package com.example.demo.service;

import com.example.demo.dto.MovieDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
public class RequestBuilder {

    Logger logger = LoggerFactory.getLogger(RequestBuilder.class);

    public MovieDTO getResponseBody(String requestURL) {
        HttpEntity<MovieDTO> httpEntity = new HttpEntity<>(getHttpHeader());

        ResponseEntity<MovieDTO> movieDTOResponseEntity = new RestTemplate().exchange(
                requestURL, HttpMethod.GET, httpEntity, MovieDTO.class);

        logger.info("GET method for " + MovieDTO.class + " success by" + " url " + requestURL);

        if (movieDTOResponseEntity.getStatusCode() == HttpStatus.OK &&
                movieDTOResponseEntity.getBody() != null) {
            logger.info("Status of request " + movieDTOResponseEntity.getStatusCode());
            return movieDTOResponseEntity.getBody();
        } else {
            throw new NumberFormatException("Miss response body");
        }
    }

    public HttpHeaders getHttpHeader() {
        HttpHeaders httpHeaders = new HttpHeaders();
        List<MediaType> mediaTypes = Collections.singletonList(APPLICATION_JSON);
        httpHeaders.setAccept(mediaTypes);
        httpHeaders.setContentType(APPLICATION_JSON);
        return  httpHeaders;
    }

}
