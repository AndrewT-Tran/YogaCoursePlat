package tran.andrew.javabelt.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tran.andrew.javabelt.models.Yoga;

@Repository
public interface YogaClassRepository extends CrudRepository<Yoga, Long> {
	List<Yoga> findAll();
}
