package Codes;

import Codes.datas.BankAccount;

public class MainDrive {

	public static void main(String[] args) {

		BankAccount ba1 = new BankAccount();

		ba1.ownerName = "김준기";
		ba1.setMoney(50000000000L); // L을 붙여서 long type 명시.

		ba1.setMoney(-10000000000L);

		System.out.println("잔고 : " + ba1.getMoney() + "원 있습니다.");

	}

}
