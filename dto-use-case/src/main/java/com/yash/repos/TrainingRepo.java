package com.yash.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yash.entities.Trainings;

@Repository
public interface TrainingRepo extends JpaRepository<Trainings, Long> {
	
	
	@Query("select count(t), t.state from  Trainings t group by t.state order by t.state")
	public List<Object[]> getCountByTrainingState();

	@Query("select  t.trainingName, t.state from  Trainings t   group by t.state, t.trainingName")
	public List<Object[]> getTrainingNameStateWise();

}
