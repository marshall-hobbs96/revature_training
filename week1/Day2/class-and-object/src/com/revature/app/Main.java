package com.revature.app;
import com.revature.model.*;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");		
		Reimbursement reimbursement1 = new Reimbursement();
		Reimbursement reimbursement2 = new Reimbursement();
		
		reimbursement1.submitter = "Marshall Hobbs";
		reimbursement1.description = "Reimbursement Request";
		reimbursement1.approved = false;
		reimbursement1.amount = 100.32;
		
		reimbursement2.submitter = "Bach Tran";
		reimbursement2.description = "Reimbursement Request";
		reimbursement2.approved = true;
		reimbursement2.amount = 50.99;
		
		
		
		System.out.println(reimbursement1.submitter);
		System.out.println(reimbursement1.description);
		System.out.println(reimbursement1.approved);
		System.out.println(reimbursement1.amount);
		
		
		System.out.println(reimbursement2.submitter);
		System.out.println(reimbursement2.description);
		System.out.println(reimbursement2.approved);
		System.out.println(reimbursement1.amount);
		
		
	}

}
