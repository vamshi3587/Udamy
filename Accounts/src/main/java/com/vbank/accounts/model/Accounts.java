package com.vbank.accounts.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Accounts {
	@Column(name="customer_id")
private int customerId;
	@Column(name="account_number")
	@Id
private long accountNumber;
	@Column(name="account_type")
private String accountType;
	@Column(name="brance_address")
private String branceAddress;
	@Column(name="create_date")
private LocalDate createDt;
}
