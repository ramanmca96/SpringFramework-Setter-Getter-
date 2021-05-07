package AlphaCollection;

import java.util.*;

public class StudentInfo {

	public int getStud_id() {
		return Stud_id;
	}
	public void setStud_id(int stud_id) {
		Stud_id = stud_id;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	public Map<String, String> getSub_marks() {
		return Sub_marks;
	}
	public void setSub_marks(Map<String, String> sub_marks) {
		Sub_marks = sub_marks;
	}
	public List<String> getParents() {
		return parents;
	}
	@Override
	public String toString() {
		return "StudentInfo [Stud_id=" + Stud_id + ", subjects=" + subjects + ", phones=" + phones + ", Sub_marks="
				+ Sub_marks + ", parents=" + parents + "]";
	}
	public void setParents(List<String> parents) {
		this.parents = parents;
	}
	private int Stud_id;
	private List<String> subjects;
	private Set<String> phones;
	private Map<String, String> Sub_marks;
	private List<String> parents;
}
