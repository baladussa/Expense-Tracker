package com.bala.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.bala.model.Expenses;
import com.bala.service.ExpenseService;


@Controller
public class MasterController {
	
	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav=new ModelAndView("home");
		mav.addObject("message", "List of Expenses");
		List<Expenses> expense=expenseService.findAll();
		System.out.println(expense);
		return mav;
	}

}
