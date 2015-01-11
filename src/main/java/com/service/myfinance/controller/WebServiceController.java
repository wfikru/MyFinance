package com.service.myfinance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.myfinance.service.RestService;

@Controller
public class WebServiceController {

	@Autowired
	private RestService service;

	public void setService(RestService service) {
		this.service = service;
	}

	@RequestMapping("/team6_myfinance")
	public @ResponseBody String Validate(
			@RequestParam("ccn") String creditCardNumber,
			@RequestParam("address") String address,
			@RequestParam("profit") double profit,
			@RequestParam("total") double total,
			@RequestParam("myprofit") double myProfit) {

		PaymentInfo info = new PaymentInfo();
		info.setAddress(address);
		info.setCreditCardNumber(creditCardNumber);
		info.setProfit(myProfit);
		info.setProfiToMycompany(myProfit);
		info.setTotal(total);

		try {
			service.savePaymentInfo(info);
			return "y";
		} catch (Exception e) {
			return "n";
		}

	}
}
