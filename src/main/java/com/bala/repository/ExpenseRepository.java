package com.bala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bala.model.Expenses;
@Repository
public interface ExpenseRepository extends JpaRepository<Expenses, Long>{
	
}
