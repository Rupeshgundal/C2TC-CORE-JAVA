package tnsif.c2tc.pr.entity;




import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Placement {
	@Id
private long id;
private String name;
private String college;
private String qualification;
int year;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}

public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}

}
