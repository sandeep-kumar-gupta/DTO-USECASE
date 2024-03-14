package com.yash.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.constants.TrainingStateConstant;
import com.yash.dtos.CountDto;
import com.yash.repos.TrainingRepo;

@Service
public class DashboardService {

	@Autowired
	private TrainingRepo trainingRepo;

	public CountDto getCountForDashBoard() {
		List<Object[]> trainingCountStateWise = trainingRepo.getCountByTrainingState();
		List<Object[]> trainingNameStateWise = trainingRepo.getTrainingNameStateWise();
		CountDto dto = new CountDto();

		for (Object[] obj : trainingCountStateWise) {
			switch ((TrainingStateConstant) obj[1]) {
			case OPEN:
				dto.setOpentraining_count(Long.parseLong(obj[0].toString()));
				break;
			case UPCOMING:
				dto.setUpcomingtraining_count(Long.parseLong(obj[0].toString()));
				break;
			default:
				System.out.println("no state matched....");
				break;
			}
		}
		for (Object[] obj : trainingNameStateWise) {
			switch ((TrainingStateConstant) obj[1]) {
			case OPEN:
				dto.addOpenTraining_name(obj[0].toString());
				break;
			case UPCOMING:
				dto.addUpcomingtraining_name(obj[0].toString());
				break;
			default:
				System.out.println("no state matched....");
				break;
			}
		}

		return dto;

	}

}
