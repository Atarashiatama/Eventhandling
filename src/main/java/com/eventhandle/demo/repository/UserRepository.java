package com.eventhandle.demo.repository;

import java.util.Optional;

import com.eventhandle.demo.model.Userdb;

public interface UserRepository extends JpaRepository<Userdb ,long>{
    Optional<Userdb> findByEmail(String email);    

}
