package com.zhangge.entity;

public class Category {

	public Integer id;
	public String name;
	public Integer channel_id;
	public Integer sorted;

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", channel_id=" + channel_id + ", sorted=" + sorted + "]";
	}

	public Category(Integer id, String name, Integer channel_id, Integer sorted) {
		super();
		this.id = id;
		this.name = name;
		this.channel_id = channel_id;
		this.sorted = sorted;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(Integer channel_id) {
		this.channel_id = channel_id;
	}

	public Integer getSorted() {
		return sorted;
	}

	public void setSorted(Integer sorted) {
		this.sorted = sorted;
	}

}
