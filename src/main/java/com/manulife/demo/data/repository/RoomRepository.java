package com.manulife.demo.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manulife.demo.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
