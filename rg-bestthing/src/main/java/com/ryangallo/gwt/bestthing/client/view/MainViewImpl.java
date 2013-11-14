package com.ryangallo.gwt.bestthing.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MainViewImpl extends Composite implements MainView {

	private static MainViewImplUiBinder uiBinder = GWT.create(MainViewImplUiBinder.class);

	interface MainViewImplUiBinder extends UiBinder<Widget, MainViewImpl> {
	}

	private Presenter presenter;

	public MainViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

}
