package com.cg.gla.fs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.gla.fs.model.Theater;
@Repository
public interface TheaterRepository extends CrudRepository<Theater,String> {
	Theater findByTheaterId(int theaterId);
	Theater findByTheaterNameAndTheaterCity(String theaterName,String theaterCity);

}
