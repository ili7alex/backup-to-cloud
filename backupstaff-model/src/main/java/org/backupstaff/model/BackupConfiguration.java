package org.backupstaff.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BackupConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Name;
	private String sourcePath;
	
	@ManyToOne
	private CloudLocation cloudLocation;
	
	private String targetPath;
	private String includeFilesMask;
	private String excludeFilesMask;
	private String sourceLocationUser;
	private String sourceLocationPassword;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSourcePath() {
		return sourcePath;
	}
	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}
	public CloudLocation getCloudLocation() {
		return cloudLocation;
	}
	public void setCloudLocation(CloudLocation cloudLocation) {
		this.cloudLocation = cloudLocation;
	}
	public String getTargetPath() {
		return targetPath;
	}
	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
	}
	public String getIncludeFilesMask() {
		return includeFilesMask;
	}
	public void setIncludeFilesMask(String includeFilesMask) {
		this.includeFilesMask = includeFilesMask;
	}
	public String getExcludeFilesMask() {
		return excludeFilesMask;
	}
	public void setExcludeFilesMask(String excludeFilesMask) {
		this.excludeFilesMask = excludeFilesMask;
	}
	public String getSourceLocationUser() {
		return sourceLocationUser;
	}
	public void setSourceLocationUser(String sourceLocationUser) {
		this.sourceLocationUser = sourceLocationUser;
	}
	public String getSourceLocationPassword() {
		return sourceLocationPassword;
	}
	public void setSourceLocationPassword(String sourceLocationPassword) {
		this.sourceLocationPassword = sourceLocationPassword;
	}
	
	
	
}
