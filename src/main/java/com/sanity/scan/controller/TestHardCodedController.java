package com.sanity.scan.controller;

import com.sanity.scan.model.Address;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestHardCodedController extends BaseTestHardCodedController {

    @GetMapping("/object/primitive")
    String primitive(@RequestParam(required=true) String path) {
        System.out.println("got path " + path);
        String result = "done";
        return result;
    }

    @PostMapping("/object/custom")
    Address custom(@RequestBody Address address) {
        System.out.println("got address " + address);
        address.setStreet("pardes");
        return address;
    }

    @GetMapping("/object/spring")
    ResponseEntity<String> spring(HttpServletRequest servletRequest) {
        System.out.println("got servletRequest");
        String result = "done";
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }

}
