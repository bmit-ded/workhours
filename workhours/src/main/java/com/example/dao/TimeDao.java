package com.example.dao;

import java.util.UUID;

import com.example.model.Time;

public interface TimeDao {
	
	int insertTime(UUID id, Time time);
	
	default int addTime(Time time) {
		UUID id = UUID.randomUUID();
		return insertTime(id, time);
	}

}
