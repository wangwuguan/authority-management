package com.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("LoanAccount")
public class LoanAccountController {

	
	
	@RequestMapping("toLoanAccount")
	public String toCollectionAccount(){
		return "finance/loanAccount";	
	}
}
