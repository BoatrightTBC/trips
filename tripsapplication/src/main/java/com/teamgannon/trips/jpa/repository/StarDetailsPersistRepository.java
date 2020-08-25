package com.teamgannon.trips.jpa.repository;

import com.teamgannon.trips.jpa.model.StarDetailsPersist;
import org.springframework.data.repository.CrudRepository;

public interface StarDetailsPersistRepository extends CrudRepository<StarDetailsPersist, String> {

    /**
     * find a star by stellar class which is unique
     *
     * @param stellarClass the stellar class
     * @return the unique stellar class
     */
    StarDetailsPersist findByStellarClass(String stellarClass);

}
