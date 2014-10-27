package br.com.caelum.twitter.controller;

import java.util.ArrayList;

import br.com.caelum.twitter.model.Tweet;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;


@Resource
public class TwitterController {
	
	private Tweet tweets;

	public TwitterController(Tweet tweet) {
		this.tweets = tweet;
	}
	
	@Get("/newsfeed")
	public ArrayList<Tweet> newsfeed() {
		return new ArrayList<Tweet>();
	}

}
