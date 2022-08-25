package com.spring.transactionEx;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class BuyDAO {

	
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


public void buyTicket(BuyVO buyVO) {
	
}

}
