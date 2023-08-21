package tran.andrew.javabelt.services;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import tran.andrew.javabelt.models.Yoga;
import tran.andrew.javabelt.repositories.YogaClassRepository;

@Service
public class YogaService {
	private YogaClassRepository yogaRepo;

	public YogaService(YogaClassRepository yogarepo) {
		this.setYogaRepo(yogarepo);
	}

	public List<Yoga> getAll() {
		return yogaRepo.findAll();
	}

	public YogaClassRepository getYogaRepo() {
		return yogaRepo;
	}

	public void setYogaRepo(YogaClassRepository yogaRepo) {
		this.yogaRepo = yogaRepo;
	}

	public void create(@Valid Yoga yoga) {
	}

	public void update(@Valid Yoga yoga) {
	}

	public Object getOne(Long id) {
		return null;
	}

	public void delete(Long id) {
	}
}
