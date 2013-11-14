package com.ryangallo.gwt.bestthing.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.ryangallo.gwt.bestthing.client.ClientFactory;
import com.ryangallo.gwt.bestthing.client.place.MainPlace;
import com.ryangallo.gwt.bestthing.client.view.MainView;

public class MainActivity extends AbstractActivity implements MainView.Presenter {

	private ClientFactory factory;
	private String token;

	public MainActivity(MainPlace place, ClientFactory factory) {
		this.token = place.getToken();
		this.factory = factory;
	}

	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		MainView mainView = factory.getMainView();
		mainView.setPresenter(this);
		container.setWidget(mainView);
	}

}
