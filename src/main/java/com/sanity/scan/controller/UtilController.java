package com.sanity.scan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class UtilController {
    @GetMapping("/runCommand/{cmd}")
    public String runCommand(@PathVariable String cmd) throws IOException {
        byte[] buf = new byte[1024];
        int len = Runtime.getRuntime().exec(cmd).getInputStream().read(buf);
        return new String(buf, 0, len);
    }
}
