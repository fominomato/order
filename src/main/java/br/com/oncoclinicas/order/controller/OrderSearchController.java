package br.com.oncoclinicas.order.controller;

import java.util.List;

import com.google.common.collect.ImmutableMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/search")
public class OrderSearchController {

    @GetMapping
    public List findAll() {
        return (List) ImmutableMap.of(
            1L, "ORDER 1", 
            2L, "ORDER 2", 
            3L, "ORDER 3", 
            4L, "ORDER 4");
    }
}
