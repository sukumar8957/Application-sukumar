package backend;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
@Id
private int Employee_id;
private String Name;
private String Email;
private String Team;
@ManyToMany
private List<Training> training;
public int getEmployee_id() {
	return Employee_id;
}
public void setEmployee_id(int employee_id) {
	Employee_id = employee_id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getTeam() {
	return Team;
}
public void setTeam(String team) {
	Team = team;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int employee_id, String name, String email, String team) {
	super();
	Employee_id = employee_id;
	Name = name;
	Email = email;
	Team = team;
}
public List<Training> getTraining() {
	return training;
}
public void setTraining(List<Training> training) {
	this.training = training;
}
public Employee(List<Training> training) {
	super();
	this.training = training;
}



}
