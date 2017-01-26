package org.adams.training.java.exception;

public class Example {
	/* Create two private fields. */
	private String key = null;
	private Integer value;
	
	public Example(String key, Integer value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return this.key;
	}
	
	public Integer getValue() {
		return this.value;
	}

}
