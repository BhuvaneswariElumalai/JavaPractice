package practicePackage;

import java.util.ArrayList;
import java.util.List;

public class Person {

	// POJO - Plain old java Object
	private String username;
	private int empolyeeId;
	private String nationality;
	List<String> languages = new ArrayList<String>();

	public Person(String username,int empolyeeId,String nationality,List<String> languages ) {

		this.username=username;
		this.empolyeeId=empolyeeId;
		this.nationality=nationality;
		this.languages=languages;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getEmpolyeeId() {
		return empolyeeId;
	}

	public void setEmpolyeeId(int empolyeeId) {
		this.empolyeeId = empolyeeId;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	
	
	
	

}
