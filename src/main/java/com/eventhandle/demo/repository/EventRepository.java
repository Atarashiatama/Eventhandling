package com.eventhandle.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventhandle.demo.model.Events;
import com.eventhandle.demo.model.Userdb;

@Repository
public interface EventRepository extends JpaRepository<Events,Long{
List<Events>findByCategory(Userdb category);
}
