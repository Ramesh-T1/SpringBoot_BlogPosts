package blogpost.project.models;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	public String firstname;
	public String lastname;
	public String email;
	public String password;
	public Long phoneno;
	public String gender;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	public LocalDate dob;
	@OneToMany(mappedBy="account")
	public List<Post> px;
	
	public List<Post> getPx() {
		return px;
	}
	public void setPx(List<Post> px) {
		this.px = px;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", phoneno=" + phoneno + ", gender=" + gender + ", dob=" + dob + ", px="
				+ px + "]";
	}

}
