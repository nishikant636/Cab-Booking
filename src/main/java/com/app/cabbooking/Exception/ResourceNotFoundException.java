package com.app.cabbooking.Exception;

public class ResourceNotFoundException extends RuntimeException {
	
	
	private Long fieldValue;
	private String resourceName;
	private String fieldName;
	public ResourceNotFoundException(Long fieldValue, String resourceName, String fieldName) {
		super();
		this.fieldValue = fieldValue;
		this.resourceName = resourceName;
		this.fieldName = fieldName;
	}
	public Long getFieldValue() {
		return fieldValue;
	}
	public void setFieldValue(Long fieldValue) {
		this.fieldValue = fieldValue;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	

}
