package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.service.FundTransferService;

public class UPIFundTransferController {
	@Autowired
	FundTransferService fundTransferService;
}
