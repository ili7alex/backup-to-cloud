package org.backupstaff.repository;

import org.backupstaff.model.Cloud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudRepository extends JpaRepository<Cloud, Long> {

    @Query("select c from Cloud c where c.cloudType = ?1")
    Cloud findCloudByType(String cloudType);

}
