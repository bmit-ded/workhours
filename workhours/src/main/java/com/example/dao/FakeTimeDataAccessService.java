package com.example.dao;

import java.util.List;
import java.util.UUID;

import com.example.model.Time;

public class FakeTimeDataAccessService implements TimeDao {
	
	private static List<Time> DB = new ArrayList<>();
	@Override
	public int insertTime(UUID id, Time time) {
		DB.add(new Time(id, time.getHours(), time.getDay()));
		return 1;
	}

}
