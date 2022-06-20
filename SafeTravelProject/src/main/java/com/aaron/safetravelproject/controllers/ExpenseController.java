package com.aaron.safetravelproject.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.aaron.safetravelproject.models.Expense;
import com.aaron.safetravelproject.services.ExpenseServices;



@Controller
public class ExpenseController {
    //Import
    @Autowired
    ExpenseServices expenseService;
    //Read
    @GetMapping("/")
    public String dashboard() {
        return "redirect:/expenses";
    }

    @GetMapping("/expenses")
    public String index(@ModelAttribute("expense") Expense expense, Model model) {
        List<Expense> expenses = expenseService.allExpenses();
        model.addAttribute("expenses", expenses);
        return "index.jsp";
    }
  //Create
    @PostMapping("/expenses")
    public String index(@Valid @ModelAttribute("expense") 
    Expense expense, BindingResult result, Model model) 
    {
        if(result.hasErrors()) {
            List<Expense> expenses = expenseService.allExpenses();
            model.addAttribute("expenses", expenses);
            return "index.jsp";
        }else {
        	expenseService.createExpense(expense);
            return "redirect:/expenses";
        }
    }
    //Read


    //Update
    @GetMapping("/edit/{id}")
    public String edit(
            @PathVariable("id") Long id,
            Model model
            ){
        // Find one object from DB
        Expense editExpense = expenseService.findExpense(id);
        // Pass the travel object 
        model.addAttribute("expenseObj", editExpense);

        return "edit.jsp";
    }
    @PutMapping("/edit/{id}")
    public String update( @PathVariable("id") Long id,
            @Valid @ModelAttribute("expenseObj") Expense updatedExpense,
            BindingResult results
            ) {
    // Validations failed
            if(results.hasErrors()) {
                return "edit.jsp";
            }
    // Validations passed
            expenseService.updateExpense(updatedExpense);
            return "redirect:/expenses";
    }


    //Delete
    @DeleteMapping("/delete/{id}")
    public String delete(
            @PathVariable("id") Long id
            ) {
            expenseService.deleteExpense(id);
            return "redirect:/expenses";
    }


}
		
		
		
		
		
		
