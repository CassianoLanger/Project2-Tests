package br.com.cassiano.domain;

public class Client {

	private String cpf;
	private String name;
	private String city;
	private String address;
	private String number;
	private String state;
	private String phoneNumber;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = String.valueOf(cpf);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = String.valueOf(number);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = String.valueOf(phoneNumber);
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
}
