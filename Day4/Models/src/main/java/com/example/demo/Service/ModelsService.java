package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ModelsRepo;
import com.example.demo.entity.Models;

@Service
public class ModelsService {
@Autowired
private ModelsRepo repo;
public Models addModels(Models obj)
{
	return repo.save(obj);
}
public List<Models>getAllModels()
{
	return repo.findAll();
}
public String delete(int Model_num)
{
	repo.deleteById(Model_num);
	return "deleted";
}
public List<Models>q()
{
	List<Models>c=repo.findAll();
	return c;
}
public Models update(int Model_num,Models obj){
	return repo.saveAndFlush(obj);
}
}
