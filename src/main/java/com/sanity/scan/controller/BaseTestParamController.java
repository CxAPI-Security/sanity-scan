package com.sanity.scan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.sanity.scan.util.Const.PATH_FOR_BASE;


@RequestMapping(PATH_FOR_BASE)
public class BaseTestParamController {
    @GetMapping("/health")
    void health() {
        System.out.println("healthy");
    }
}
