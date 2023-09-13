package com.practice.jobsearch.api;

import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

import java.util.Map;

@Headers("Accept: application/json")
public interface APIfake {

        @RequestLine("GET /products")
        List<Products> product(@QueryMap Map<String, Object> queryMap);

        @RequestLine("GET /products/{id}.json")
        Products product(@Param("id") String id);
    }

