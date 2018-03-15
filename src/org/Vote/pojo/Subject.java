package org.Vote.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Subject implements Serializable {
	private Integer id;
	
	private String title;
	
	private Integer type;
	
	private List<Option> options = new ArrayList<>(); //主题对应的选项集合
	
	public Subject() {
		options.add(new Option());
		options.add(new Option());
		options.add(new Option());
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
}
