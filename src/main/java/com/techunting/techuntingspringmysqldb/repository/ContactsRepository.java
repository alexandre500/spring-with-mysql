package com.techunting.techuntingspringmysqldb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techunting.techuntingspringmysqldb.model.ContactsModel;

public interface ContactsRepository extends JpaRepository<ContactsModel, Integer>{

}
