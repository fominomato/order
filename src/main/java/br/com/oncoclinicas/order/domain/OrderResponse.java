package br.com.oncoclinicas.order.domain;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OrderResponse {

    private Long id;

    private Date createdAt;

}