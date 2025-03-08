package com.jyujyu.review.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestRequestApi {

    // Request Parameter

    @GetMapping("/test/param")
    public String requestParam(
            @RequestParam("name") String name,
            @RequestParam("age") Integer age
    ) {
        return "Hello, Request Param, I am " + name + " and " + age;
    }

    @GetMapping("/test/path/{name}/{age}")
    public String requestPathVariable(
            @PathVariable("name") String name,
            @PathVariable("age") Integer age
    ) {
        return "Hello, Path Variable " + name + ", " + age;
    }

    @PostMapping("test/body")
    public String requestBody(
            @RequestBody TestRequestBody request
    ) {
        return "Hello, Request Body " + request.name + ", " + request.age;
    }

    public static class TestRequestBody {
        String name;
        Integer age;

        public TestRequestBody(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

    }
}
