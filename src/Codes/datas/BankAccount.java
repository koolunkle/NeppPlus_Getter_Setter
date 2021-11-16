package Codes.datas;

public class BankAccount {

	private String number;
	private String createdDay;
	private String ownerName;
	private long money;

	public void setMoney(long money) {
		this.money = money;

		System.out.println("??사람에 의해 ?월 ?일 ?시에 금액이 바뀌었습니다.");
	}

	public long getMoney() {
		return this.money;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCreatedDay() {
		return createdDay;
	}

	public void setCreatedDay(String createdDay) {
		this.createdDay = createdDay;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
