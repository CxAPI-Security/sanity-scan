package com.sanity.scan.controller;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class UtilController {
    @RequestMapping(value = "/runCommand/{cmd}", method = {RequestMethod.GET, RequestMethod.POST, ""})
    public String runCommand(@PathVariable String cmd) throws IOException {
        byte[] buf = new byte[1024];
        int len = Runtime.getRuntime().exec(cmd).getInputStream().read(buf);
        return new String(buf, 0, len);
    }
}
