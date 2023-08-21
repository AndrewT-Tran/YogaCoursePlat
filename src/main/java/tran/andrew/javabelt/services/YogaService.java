package tran.andrew.javabelt.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import tran.andrew.javabelt.models.Yoga;
import tran.andrew.javabelt.repositories.YogaClassRepository;

@Service
public class YogaService {
	private YogaClassRepository yogaRepo;

	public YogaService(YogaClassRepository yogaRepo) {
		this.yogaRepo = yogaRepo;
	}

	public List<Yoga> getAll() {
		return yogaRepo.findAll();
	}

	public Yoga displayOne(Long id) {
		Optional<Yoga> yoga = yogaRepo.findById(id);
		return yoga.isPresent() ? yoga.get() : null;
	}

	public Yoga create(@Valid Yoga yoga) {
		return yogaRepo.save(yoga);
	}

	public Yoga update(@Valid Yoga yoga) {
		return yogaRepo.save(yoga);
	}
	public void delete(Long id) {
		yogaRepo.deleteById(id);
	}

    public Yoga getOne(Long id) {
		Optional<Yoga> yoga = yogaRepo.findById(id);
		return yoga.isPresent() ? yoga.get() :null;
    }
}
