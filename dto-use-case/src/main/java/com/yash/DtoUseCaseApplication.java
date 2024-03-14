package com.yash;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yash.constants.TrainingStateConstant;
import com.yash.entities.Trainings;
import com.yash.repos.TrainingRepo;
import com.yash.repos.UserRepo;

@SpringBootApplication
public class DtoUseCaseApplication implements CommandLineRunner {
//	@Autowired
//	private UserRepo userRepo;

	@Autowired
	private TrainingRepo trainingRepo;

	public static void main(String[] args) {
		SpringApplication.run(DtoUseCaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		userRepo.save(new User("ankit@gmail.com", "enc password", "7898311713", "Sr. Software Engg.",
//				"Base 64 encodeing image", "Indore", RoleConstants.ASSOCIATES));
//		userRepo.save(new User("rajat@gmail.com", "enc password", "7898311713", "Software Engg.",
//				"Base 64 encodeing image", "Indore", RoleConstants.ASSOCIATES));
//		userRepo.save(new User("aditya@gmail.com", "enc password", "7898311713", "Trainees", "Base 64 encodeing image",
//				"Indore", RoleConstants.ASSOCIATES));
//		userRepo.save(new User("snehal@gmail.com", "enc password", "7898311713", "Jr. Manager",
//				"Base 64 encodeing image", "Indore", RoleConstants.TRAINER));
//		userRepo.save(new User("jaynam@gmail.com", "enc password", "7898311713", "Jr. Manager",
//				"Base 64 encodeing image", "Indore", RoleConstants.TRAINER));
//
//		userRepo.save(new User("pankaj@gmail.com", "enc password", "7898311713", "Sr. Manager",
//				"Base 64 encodeing image", "Indore", RoleConstants.ADMIN));
//
//		userRepo.save(new User("harsh@gmail.com", "enc password", "7898311713", "Sr. Developer",
//				"Base 64 encodeing image", "CIT Indore", RoleConstants.ASSOCIATES));

		trainingRepo.save(new Trainings("angular", LocalDate.now(), LocalDate.now().plusDays(15), "online",
				TrainingStateConstant.OPEN, "jaynam@gmail.com"));

		trainingRepo.save(new Trainings("spring boot", LocalDate.now(), LocalDate.now().plusDays(15), "offline",
				TrainingStateConstant.OPEN, "snehal@gmail.com"));

		trainingRepo.save(new Trainings("microservices", LocalDate.now(), LocalDate.now().plusDays(15), "online",
				TrainingStateConstant.OPEN, "snehal@gmail.com"));

		trainingRepo.save(new Trainings("microservices", LocalDate.of(2024, 2, 01), LocalDate.now().plusDays(15),
				"online", TrainingStateConstant.UPCOMING, "snehal@gmail.com"));

		trainingRepo.save(new Trainings("angular", LocalDate.of(2024, 2, 01), LocalDate.now().plusDays(15), "online",
				TrainingStateConstant.UPCOMING, "jaynam@gmail.com"));

	}

}
