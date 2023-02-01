package com.luchiana.vaadin.crm.data.repository;

import com.luchiana.vaadin.crm.data.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
