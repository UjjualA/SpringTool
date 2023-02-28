package com.example.demo.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.ModelsService;
import com.example.demo.entity.Models;

@RestController
public class ModelsController {
	@Autowired
	private ModelsService Modelserv;
	@PostMapping("/add")
	public Models addModels(@RequestBody Models obj)
	{
		return Modelserv.addModels(obj);
	}
	@GetMapping("/show")
	public List<Models>getModels()
	{
		List<Models>arr=new ArrayList<>();
		arr=Modelserv.getAllModels();
		return arr;
	}
	@DeleteMapping("/Delete/{Model_num}")
	public void delete(@PathVariable int Num)
	{
		Modelserv.delete(Num);
	}
	@PutMapping("/update/{Model_num}")
	public Models update(@PathVariable int Model_num,@RequestBody Models obj)
	{
		return Modelserv.update(Model_num,obj);
	}
	
}
