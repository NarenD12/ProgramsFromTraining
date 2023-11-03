package com.infinite.swagger;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	private MyService myservice;

	@GetMapping("/asyn")
	public CompletableFuture<String> asynEndpoint() {
		CompletableFuture<String> futureResult = myservice.asyncMethod();
		futureResult.thenApply(result -> {
			// handle the result here
			return "Result is " + result;
		});
		return futureResult;

	}
}