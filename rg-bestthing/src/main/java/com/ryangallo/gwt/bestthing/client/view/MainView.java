package com.ryangallo.gwt.bestthing.client.view;

import com.google.gwt.user.client.ui.IsWidget;

public interface MainView extends IsWidget {

	public interface Presenter {

	}

	void setPresenter(Presenter presenter);

}
