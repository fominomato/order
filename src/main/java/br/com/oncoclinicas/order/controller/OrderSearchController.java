package br.com.oncoclinicas.order.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.common.collect.ImmutableMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.oncoclinicas.order.domain.OrderResponse;

@RestController
@RequestMapping("/order/search")
public class OrderSearchController {

    @GetMapping
    public ArrayList<OrderResponse> findAll() {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setCreatedAt(new Date());
        orderResponse.setId(1L);

        ArrayList<OrderResponse> response = new ArrayList<>();
        response.add(orderResponse);

        return response;
    }
}
