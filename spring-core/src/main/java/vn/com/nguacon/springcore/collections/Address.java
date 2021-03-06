package vn.com.nguacon.springcore.collections;

import java.util.List;
import java.util.Map;

public class Address {
	private List<String> provinces;
	private Map<String, String> provincesMap;
	private Person person;
	
	public List<String> getProvinces() {
		return provinces;
	}

	public void setProvinces(List<String> provinces) {
		this.provinces = provinces;
	}

	public Map<String, String> getProvincesMap() {
		return provincesMap;
	}

	public void setProvincesMap(Map<String, String> provincesMap) {
		this.provincesMap = provincesMap;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
