package com.ryangallo.gwt.bestthing.client;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.ryangallo.gwt.bestthing.client.view.MainView;
import com.ryangallo.gwt.bestthing.client.view.MainViewImpl;

public class ClientFactoryImpl implements ClientFactory {

	private static final EventBus eventBus = new SimpleEventBus();
	private static final PlaceController placeController = new PlaceController(eventBus);
	private static MainView mainView = null;

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

	@Override
	public MainView getMainView() {
		if (mainView == null) {
			mainView = new MainViewImpl();
		}
		return mainView;
	}

	@Override
	public void goTo(Place place) {
		placeController.goTo(place);
	}

}
