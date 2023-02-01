package com.luchiana.vaadin.crm.data.repository;

import com.luchiana.vaadin.crm.data.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
