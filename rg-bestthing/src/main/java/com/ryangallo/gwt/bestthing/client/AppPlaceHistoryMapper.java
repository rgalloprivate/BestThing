package com.ryangallo.gwt.bestthing.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.ryangallo.gwt.bestthing.client.place.MainPlace;

@WithTokenizers({ MainPlace.Tokenizer.class })
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper
{
}