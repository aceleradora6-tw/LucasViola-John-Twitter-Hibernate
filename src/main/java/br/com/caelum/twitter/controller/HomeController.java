package br.com.caelum.twitter.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;

@Resource
public class HomeController {
	
	@Get("/")
	public void home() {
		System.out.println("hello world");
	}

}