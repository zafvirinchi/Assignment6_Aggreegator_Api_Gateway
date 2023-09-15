package com.tcs.aggregate.aggregatorservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.aggregate.aggregatorservice.model.AggregateData;
import com.tcs.aggregate.aggregatorservice.service.AggregatorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/aggregate-service")
@RequiredArgsConstructor
public class AggregatorController {
	
	@Autowired
	private AggregatorService orderService;
	
	@GetMapping("/order/payment/{orderId}")
	public AggregateData getAggregateData(@PathVariable Long orderId) {

		return orderService.getAggregateData(orderId);

	}


}
