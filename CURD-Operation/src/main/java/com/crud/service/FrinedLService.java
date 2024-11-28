package com.crud.service;

import java.util.List;

import com.crud.entity.FriendL;

public interface FrinedLService {

	public FriendL CreateFL(FriendL fL);
	
	public List<FriendL> GetAll();
	
	public FriendL GetById(Long id);
	
	public void DeleteById(Long id);
	
	public FriendL UpdateById(FriendL friendL, Long id);

//	public FriendL GetByName(String name);
	
	//	public FriendL UpdateByName(FriendL friendL);
	
}
