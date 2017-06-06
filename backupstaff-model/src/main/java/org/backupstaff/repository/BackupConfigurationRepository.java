package org.backupstaff.repository;

import org.backupstaff.model.BackupConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackupConfigurationRepository extends JpaRepository<BackupConfiguration, Long> {

}
