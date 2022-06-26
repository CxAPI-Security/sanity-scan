package com.sanity.scan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("test/hard")
public class BaseTestHardCodedController {
    @GetMapping("/health")
    void health() {
        System.out.println("healthy");
    }
}
