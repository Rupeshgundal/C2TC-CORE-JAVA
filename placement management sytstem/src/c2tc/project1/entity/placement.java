package c2tc.project1.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class placement {
	@Id
private long id;
private String name;
private String college;
private Date date;
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
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
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
@Override
public String toString() {
	return "placement [id=" + id + ", name=" + name + ", college=" + college + ", date=" + date + ", qualification="
			+ qualification + ", year=" + year + "]";
}

}
