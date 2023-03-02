package com.example.rewrite.controller;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.Parameter;

import lombok.Getter;
import lombok.Setter;

@Join(path = "/mypath", to = "/index.jsf")
public class MyController {
	@Parameter("someParam")
	@Setter
	@Getter
	private String someParam = "myParam";
}
