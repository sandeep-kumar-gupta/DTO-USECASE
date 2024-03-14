package com.yash.dtos;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountDto {
	private Long opentraining_count;
	private Long upcomingtraining_count;
	private List<String> opentraining_name = new ArrayList<>();
	private List<String> upcomingtraining_name = new ArrayList<>();

	public void addOpenTraining_name(String trainingName) {
		this.opentraining_name.add(trainingName);
	}

	public void addUpcomingtraining_name(String trainingName) {
		this.upcomingtraining_name.add(trainingName);
	}

}
