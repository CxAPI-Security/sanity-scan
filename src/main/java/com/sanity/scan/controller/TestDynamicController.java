//TODO uncomment when sast support requestMappingHandlerMapping.registerMapping
//package com.sanity.scan.controller;
//
//import com.sanity.scan.model.Address;
//import com.sanity.scan.model.Credentials;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
//import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
//import org.springframework.web.util.pattern.PathPatternParser;
//
//import javax.servlet.http.HttpServletRequest;
//import java.lang.reflect.Method;
//
//@RestController
//public class TestDynamicController {
//
//    public TestDynamicController(RequestMappingHandlerMapping requestMappingHandlerMapping) {
//        RequestMappingInfo.BuilderConfiguration options = new RequestMappingInfo.BuilderConfiguration();
//        options.setPatternParser(new PathPatternParser());
//
//        RequestMappingInfo mappingInfo = RequestMappingInfo
//                .paths("test/dynamic/object/primitive")
//                .methods(RequestMethod.GET)
//                .consumes(MediaType.ALL_VALUE)
////				.produces(MediaType.APPLICATION_JSON_VALUE)
//                .options(options)  //This is Builder config
//                .build();
//
//        RequestMappingInfo mappingInfo1 = RequestMappingInfo
//                .paths("test/dynamic/object/custom")
//                .methods(RequestMethod.POST)
//                .consumes(MediaType.APPLICATION_JSON_VALUE)
//				.produces(MediaType.APPLICATION_JSON_VALUE)
//                .options(options)  //This is Builder config
//                .build();
//
//        RequestMappingInfo mappingInfo2 = RequestMappingInfo
//                .paths("test/dynamic/object/spring")
//                .methods(RequestMethod.GET)
//                //.consumes(MediaType.APPLICATION_JSON_VALUE)
//                .produces(MediaType.ALL_VALUE)
//                .options(options)  //This is Builder config
//                .build();
//
//        Method Method = null;
//        try {
//            Method = TestDynamicController.class.getMethod("primitive", String.class);
//            requestMappingHandlerMapping.registerMapping(mappingInfo, this, Method);
//
//            Method = TestDynamicController.class.getMethod("custom", Address.class);
//            requestMappingHandlerMapping.registerMapping(mappingInfo1, this, Method);
//
//            Method = TestDynamicController.class.getMethod("spring", HttpServletRequest.class);
//            requestMappingHandlerMapping.registerMapping(mappingInfo2, this, Method);
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public String primitive(@RequestParam(required=true) String path) {
//        System.out.println("got path " + path);
//        String result = "done";
//        return result;
//    }
//
//    public Address custom(@RequestBody Address address) {
//        System.out.println("got address " + address);
//        address.setStreet("pardes");
//        return address;
//    }
//
//    public ResponseEntity<String> spring(HttpServletRequest servletRequest) {
//        System.out.println("got servletRequest");
//        String result = "done";
//        return new ResponseEntity<String>(result, HttpStatus.OK);
//    }
//
//}
