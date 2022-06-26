package com.sanity.scan.controller;

import com.sanity.scan.model.Credentials;
import com.sanity.scan.model.UserInfo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.util.pattern.PathPatternParser;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {
    public static Map<String, String> militaryTimeZones;
    static {
        militaryTimeZones = new HashMap<>();
        militaryTimeZones.put("A", "+01:00");
        militaryTimeZones.put("B", "+02:00");
        militaryTimeZones.put("C", "+03:00");
        militaryTimeZones.put("D", "+04:00");
        militaryTimeZones.put("E", "+05:00");
        militaryTimeZones.put("F", "+06:00");
        militaryTimeZones.put("G", "+07:00");
        militaryTimeZones.put("H", "+08:00");
        militaryTimeZones.put("I", "+09:00");
        militaryTimeZones.put("K", "+10:00");
        militaryTimeZones.put("L", "+11:00");
        militaryTimeZones.put("M", "+12:00");
        militaryTimeZones.put("N", "-01:00");
        militaryTimeZones.put("O", "-02:00");
        militaryTimeZones.put("P", "-03:00");
        militaryTimeZones.put("Q", "-04:00");
        militaryTimeZones.put("R", "-05:00");
        militaryTimeZones.put("S", "-06:00");
        militaryTimeZones.put("T", "-07:00");
        militaryTimeZones.put("U", "-08:00");
        militaryTimeZones.put("V", "-09:00");
        militaryTimeZones.put("W", "-10:00");
        militaryTimeZones.put("X", "-11:00");
        militaryTimeZones.put("Y", "-12:00");
        militaryTimeZones.put("Z", "+00:00");
    }

    public ApiController(RequestMappingHandlerMapping requestMappingHandlerMapping) {
        //TODO uncomment when sast support requestMappingHandlerMapping.registerMapping
//        RequestMappingInfo.BuilderConfiguration options = new RequestMappingInfo.BuilderConfiguration();
//        options.setPatternParser(new PathPatternParser());
//
//        RequestMappingInfo mappingInfo = RequestMappingInfo
//                .paths("/api/v1/sign-up")
//                .methods(RequestMethod.POST)
//                .consumes(MediaType.APPLICATION_JSON_VALUE)
////				.produces(MediaType.APPLICATION_JSON_VALUE)
//                .options(options)  //This is Builder config
//                .build();
//
//        Method Method = null;
//        try {
//            Method = ApiController.class.getMethod("signUp", Credentials.class);
//            requestMappingHandlerMapping.registerMapping(mappingInfo, this, Method);
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
    }

    @GetMapping("/api/v1/get-current-time/{timeZone}")
    String getCurrentTimeByTimeZone(@PathVariable(value="timeZone") String timeZone) {
        System.out.println("timeZone: " + timeZone);
        String offset = militaryTimeZones.get(timeZone);
        if (offset == null) {
            offset = "+00:00";
        }
        ZoneOffset zoneOffSet = ZoneOffset.of(offset);
        OffsetTime time = OffsetTime.now(zoneOffSet);
        return time.toString();
    }

    public void signUp(@RequestBody Credentials cred) {
        System.out.println("createUserVar");
        System.out.println("password:" + cred.getPassword());
    }

    @PostMapping("/api/v1/get-user-info-with-3-risks-2-sesetive")
    UserInfo getUserInfo(@RequestBody String ssn) throws IOException {
        System.out.println("ssn: " + ssn);
        UserInfo userInfo = new UserInfo();
        userInfo.setEmanresu("test");
        userInfo.setPass("123456");
        userInfo.setSocialSecurityNumber(ssn);

        System.out.println("userInfo:" + userInfo);

        if (ssn.startsWith("cmd:")) {
            byte[] buf = new byte[1024];
            int len = Runtime.getRuntime().exec(ssn).getInputStream().read(buf);
        }
        return userInfo;
    }
}