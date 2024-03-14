package com.yash.entities;

import java.time.LocalDate;

import com.yash.constants.TrainingStateConstant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "trainings")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Trainings {

	public Trainings(String trainingName, LocalDate trainingStartDate, LocalDate trainingEndDate, String modeoftraining,
			TrainingStateConstant state, String user) {
		super();
		this.trainingName = trainingName;
		this.trainingStartDate = trainingStartDate;
		this.trainingEndDate = trainingEndDate;
		this.modeoftraining = modeoftraining;
		this.state = state;
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trainingcode")
	private Long trainingCode;

	@Column(name = "trainingname")
	private String trainingName;

	@Column(name = "trainingstartdate")
	private LocalDate trainingStartDate;

	@Column(name = "trainingenddate")
	private LocalDate trainingEndDate;

	@Column(name = "modeoftraining")
	private String modeoftraining;

	@Column(name = "state")
	private TrainingStateConstant state;

	@Column(name = "user")
	private String user;

}
