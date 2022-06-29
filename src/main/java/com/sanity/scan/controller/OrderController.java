package com.sanity.scan.controller;

import com.sanity.scan.model.Order;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @DeleteMapping("/order/delete/{orderId}")
    public void deleteOrder(@PathVariable("orderId") String orderId) {
        //TODO implement
        System.out.println("deleteBook, orderId: " + orderId);
    }

    @PutMapping("/order/delete")
    public void putOrder(@RequestBody Order order) {
        //TODO implement
        System.out.println("putOrder, order: " + order);
    }
}
