package Exception;

import java.util.Scanner;

import javax.security.auth.login.AccountException;

public class Bank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	/*	Account a=new Account();
		
		try {
			a.setAccId(sc.next());
				}
		
		catch (AccountException e) {
		
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		a.setAccType(sc.next());
		System.out.println(a);*/
		try {
			Account a1=new Account(sc.next(), sc.next());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}

}
