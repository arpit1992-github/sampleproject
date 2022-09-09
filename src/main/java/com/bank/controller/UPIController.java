package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.service.UserService;

@RestController
@Validated
@RequestMapping("/upi")
public class UPIController {
	@Autowired
	UserService userService;
	
	@GetMapping("/checkMobStatus/{mobNumber}")
	public ResponseEntity<Boolean> checkUserRegMobNumber(@PathVariable String mobNumber){ 
		       boolean message=userService.checkUserRegMob(mobNumber);
		       return new ResponseEntity<Boolean>(message,HttpStatus.OK);
	}
}
