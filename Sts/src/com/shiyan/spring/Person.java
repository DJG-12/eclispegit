package com.shiyan.spring;

public class Person {
	private String pname;
	private int page;
	private String psex;
	//sheh
	
	
	public Person() {
		
	}
	public Person(String pname, int page, String psex) {
		super();
		this.pname = pname;
		this.page = page;
		this.psex = psex;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPsex() {
		return psex;
	}
	public void setPsex(String psex) {
		this.psex = psex;
	}
	public void  show(){
		System.out.println(pname+" "+page+" "+psex );
	}
	

}
