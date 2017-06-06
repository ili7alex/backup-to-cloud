package org.backupstaff.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CloudLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    @ManyToOne
	private Cloud cloud;
	private String targetPath;
	
	@OneToMany(mappedBy="cloudLocation")
	private Set<BackupConfiguration> backupConfigurations = new HashSet<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Cloud getCloud() {
		return cloud;
	}
	public void setCloud(Cloud cloud) {
		this.cloud = cloud;
	}
	public String getTargetPath() {
		return targetPath;
	}
	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
	}

	
	
}
