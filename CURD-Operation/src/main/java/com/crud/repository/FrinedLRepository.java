package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.entity.FriendL;
@Repository
public interface FrinedLRepository extends JpaRepository<FriendL, Long> {

}
