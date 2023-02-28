package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Models")
public class Models {
	@Id
	private int Model_num;
	private String Model_name;
	private String Model_status;
	private Long Model_rate;
	public int getModel_num() {
		return Model_num;
	}
	public void setModel_num(int model_num) {
		Model_num = model_num;
	}
	public String getModel_name() {
		return Model_name;
	}
	public void setModel_name(String model_name) {
		Model_name = model_name;
	}
	public String getModel_status() {
		return Model_status;
	}
	public void setModel_status(String model_status) {
		Model_status = model_status;
	}
	public Long getModel_rate() {
		return Model_rate;
	}
	public void setModel_rate(Long model_rate) {
		Model_rate = model_rate;
	}
	public Models(int model_num, String model_name, String model_status, Long model_rate) {
		super();
		Model_num = model_num;
		Model_name = model_name;
		Model_status = model_status;
		Model_rate = model_rate;
	}
	public Models()
	{
		
	}
}
