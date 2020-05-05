package com.cg.gla.fs.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.gla.fs.model.Screen;

@Repository
public interface ScreenRepository extends CrudRepository<Screen,String> {
	public Screen findByScreenId(int screenId);
    public List<Screen> findByTheaterId(int theatreId);
}
