package com.teamgannon.trips.graphics.panes;

import java.util.UUID;

public interface DatabaseUpdater {

    void astrographicUpdate(UUID recordId, String notes);

}