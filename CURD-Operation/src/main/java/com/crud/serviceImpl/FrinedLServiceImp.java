package com.crud.serviceImpl;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.FriendL;
import com.crud.repository.FrinedLRepository;
import com.crud.service.FrinedLService;

@Service
public class FrinedLServiceImp implements FrinedLService {

	@Autowired
	private FrinedLRepository frinedLRepository;

	@Override
	public FriendL CreateFL(FriendL fL) {

		return frinedLRepository.save(fL);
	}

	@Override
	public List<FriendL> GetAll() {

		return frinedLRepository.findAll();
	}

	@Override
	public FriendL GetById(Long id) {

		return frinedLRepository.findById(id).orElse(null);
	}

	@Override
	public FriendL UpdateById(FriendL friendL, Long id) {
		if (frinedLRepository.existsById(id)) {
			friendL.setId(id);// ??
			frinedLRepository.save(friendL);// save value in the data base //save is a inbuilt method
		}
		return friendL;

	}

	@Override
	public void DeleteById(Long id) {
		
		frinedLRepository.deleteById(id);;
	}

}
