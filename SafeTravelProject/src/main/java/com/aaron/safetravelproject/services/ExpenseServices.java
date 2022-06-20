package com.aaron.safetravelproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aaron.safetravelproject.models.Expense;
import com.aaron.safetravelproject.repositories.ExpenseRepository;

@Service
public class ExpenseServices {
	
	private final ExpenseRepository expenseRepository;
	
	public ExpenseServices(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	
	public List<Expense> allExpenses() {
		return expenseRepository.findAll();
	
	}
	
	public Expense createExpense(Expense b) {
		return expenseRepository.save(b);
	}
	
	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}
	//updates a travel
    public Expense updateExpense(Expense expense) {
        return expenseRepository.save(expense);
    }
    //deletes a travel
    public void deleteExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isPresent()) {
            expenseRepository.deleteById(id);
        }
    }

}