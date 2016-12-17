package com.caveofprogramming.test;

public class Person {
	private int id;
	private String name;
	private int taxId;
	private Address address;
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public Person() {
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/*
	 * Notice: that the factory method in the bean MUST be "static".
	 * */
	public static Person getInstance(int id, String name) {
		System.out.println("Creating Person using factory method");
		return new Person(id, name);
	}
	
	/*
	 * its registered by the default-init-method global property 
	 * 
	 * Here it doesn't work because we defined a dedicated init method for Person bean.
	 * */
	public void init() {
		System.out.println("Person bean created (Global): " + this);
	}
	
	public void onCreate() {
		System.out.println("Person created: " + this);
	}
	/*
	 * Would only Destory "singleton" beans
	 * The Spring Ioc container in a way washes it hand from a prototype bean. 
	 * It basically hand you the bean and tell u do what u want with him.
	 * In singleton it owns it in a way.
	 * U can c in the implementation that spring creates a singleton bean by placing 
	 * it in a HashMap<key=beanId,Value=beanClass>. 
	 *
	 */
	public void onDestroy() {
		System.out.println("Person destoryed: " + this);
	}

	public void speak(){
		System.out.println("Hello! Im a Person");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", address=" + address + "]";
	}
	
}
