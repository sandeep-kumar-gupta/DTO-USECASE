package com.yash.entities;

import java.io.Serializable;
import java.util.Set;

import com.yash.constants.RoleConstants;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	public User(String username, String password, String mobilenumber, String designation, String userimage,
			String location, RoleConstants userrole) {
		super();
		this.username = username;
		this.password = password;
		this.mobilenumber = mobilenumber;
		this.designation = designation;
		this.userimage = userimage;
		this.location = location;
		this.userrole = userrole;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "mobilenumber")
	private String mobilenumber;

	@Column(name = "designation")
	private String designation;

	@Column(name = "userimage")
	private String userimage;

	@OneToMany(fetch = FetchType.EAGER, targetEntity = Skills.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "user", referencedColumnName = "username")
	private Set<Skills> userSkills;

	@Column(name = "location")
	private String location;

	@OneToMany(fetch = FetchType.EAGER, targetEntity = Trainings.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "user", referencedColumnName = "username")
	private Set<Trainings> usertrainingList;

	@Column(name = "userrole")
	private RoleConstants userrole;
	

}
