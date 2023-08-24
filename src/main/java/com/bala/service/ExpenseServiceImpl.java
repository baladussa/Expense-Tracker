package com.bala.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bala.model.Expenses;
import com.bala.repository.ExpenseRepository;
@Service
public class ExpenseServiceImpl implements ExpenseService {
	@Autowired
	ExpenseRepository expenseRepository;

	@Override
	public List<Expenses> findAll() {
		return expenseRepository.findAll();
	}

}
