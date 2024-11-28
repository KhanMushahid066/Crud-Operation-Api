package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.FriendL;
import com.crud.service.FrinedLService;

@RestController
@RequestMapping("api/v1")
public class FriendLController {

	@Autowired
	private FrinedLService frinedLService;
	
	@PostMapping("/CreateFL")
	public FriendL CreateFL(@RequestBody FriendL friendL) {
		return frinedLService.CreateFL(friendL);
	}
	
	@GetMapping("/GetAll")
	public List<FriendL> GetAll(){
		return frinedLService.GetAll();	
	}
	
	@GetMapping("/getById/{id}")
	public FriendL GetById(@PathVariable Long id) {
		return frinedLService.GetById(id);
	}
	
	@DeleteMapping("DeleteById/{id}")
	public void DeleteById(@PathVariable Long id) {
		frinedLService.DeleteById(id);
	}
	
	
	@PutMapping("/UpdateById/{id}")
	public FriendL UpdateById(@PathVariable Long id, @RequestBody FriendL friendL) {
		return frinedLService.UpdateById(friendL,id);
	}
	
}
