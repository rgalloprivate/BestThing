package com.ryangallo.gwt.bestthing.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class MainPlace extends Place {
	private String token;

	public MainPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public static class Tokenizer implements PlaceTokenizer<MainPlace> {
		@Override
		public String getToken(MainPlace place) {
			return place.getToken();
		}

		@Override
		public MainPlace getPlace(String token) {
			return new MainPlace(token);
		}
	}
}