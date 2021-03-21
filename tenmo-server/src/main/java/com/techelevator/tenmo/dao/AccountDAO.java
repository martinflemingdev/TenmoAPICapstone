package com.techelevator.tenmo.dao;

import java.math.BigDecimal;
import java.util.List;

import com.techelevator.tenmo.model.Account;

public interface AccountDAO {

	public Account getAccountByID(int account_id);
	
	public int getAccountIdByUserId(int user_id);
	
	public void updateAccountByID(Account account, int id);
	
	public BigDecimal getAccountBalanceByUserId(int user_id);
}
