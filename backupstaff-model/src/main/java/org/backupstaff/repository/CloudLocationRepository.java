package org.backupstaff.repository;

import org.backupstaff.model.CloudLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudLocationRepository extends JpaRepository<CloudLocation, Long> {

}
