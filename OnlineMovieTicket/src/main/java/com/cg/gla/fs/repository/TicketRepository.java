package com.cg.gla.fs.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.gla.fs.model.Ticket;
@Repository
public interface TicketRepository extends CrudRepository<Ticket,String>{
	List<Ticket> findByScreenName(String screenName);
	

}
