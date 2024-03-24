package backend;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Training {
@Id
private int Training_id;
private String Name;
public int getTraining_id() {
	return Training_id;
}
public void setTraining_id(int training_id) {
	Training_id = training_id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Training() {
	super();
	// TODO Auto-generated constructor stub
}
public Training(int training_id, String name) {
	super();
	Training_id = training_id;
	Name = name;
}

}
