package io.javabrains.springbootstarter.topic;

public class Topic {
	private String id;
	private String Decription;
	private String name;
	
	public Topic(String id, String decription, String name) {
		super();
		this.id = id;
		Decription = decription;
		this.name = name;
	}
	//public Topic(String id2, String decription2, String name2) {
		// TODO Auto-generated constructor stub
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDecription() {
		return Decription;
	}
	public void setDecription(String decription) {
		Decription = decription;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
