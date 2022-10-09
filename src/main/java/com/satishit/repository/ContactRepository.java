package com.satishit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satishit.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Serializable> {

}
