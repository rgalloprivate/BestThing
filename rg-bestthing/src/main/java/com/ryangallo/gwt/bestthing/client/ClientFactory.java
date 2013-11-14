package com.ryangallo.gwt.bestthing.client;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.ryangallo.gwt.bestthing.client.view.MainView;

public interface ClientFactory {

	EventBus getEventBus();

	PlaceController getPlaceController();

	MainView getMainView();

	void goTo(Place place);
}
