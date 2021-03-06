package com.wanderlinker.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TreasureContoller {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/treasure")
	public Treasure treasure(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Treasure(counter.incrementAndGet(), String.format(template, name));
	}
}