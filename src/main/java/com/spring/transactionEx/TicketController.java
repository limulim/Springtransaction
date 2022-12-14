package com.spring.transactionEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TicketController {
	
	@Autowired
	private BuyDAO BuyDAO;
	
	@RequestMapping("/buy")
	public String buy() {
		return"buy";
	}

	@RequestMapping("/buyOk")
		public	String buyOk(BuyVO buyVO, Model model) {
		System.out.println("티켓 결제 진행 중");
		System.out.println("고객 아이디: " + buyVO.getUserId());
		System.out.println("티켓 수량: " + buyVO.getAmount());
		
		BuyDAO.buyTicket(buyVO);
		
		return "buyResult";
	}
}
