package com.teamgannon.trips.config.application;

import com.teamgannon.trips.search.SearchContext;
import lombok.Data;

@Data
public class TripsContext {

    private ApplicationPreferences appPreferences = new ApplicationPreferences();

    private SearchContext searchContext = new SearchContext();

}