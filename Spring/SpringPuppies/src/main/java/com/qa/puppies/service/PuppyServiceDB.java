package com.qa.puppies.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.qa.puppies.domain.Puppy;
import com.qa.puppies.repos.PuppyRepo;

@Service
public class PuppyServiceDB implements PuppyService {

	private PuppyRepo repo;

	@Override
	public Puppy createPuppy(Puppy newPuppy) {
		return this.repo.save(newPuppy);
	}

	public void patchPuppy() {

	}

	@Override
	public List<Puppy> getPuppy() {
		return this.repo.findAll();
	}

	@Override
	public Puppy getPuppy(Integer id) {

		Optional<Puppy> puppyOptional = this.repo.findByID(id);

		if (puppyOptional.isPresent()) {
			Puppy puppy = puppyOptional.get();
			return puppy;
		}

		else {
			throw new EntityNotFoundException("No puppy found with id: " + id);
		}

	}

	@Override
	public Puppy replacePuppy(Integer id, Puppy newPuppy) {
		Puppy existing = this.getPuppy(id);

		existing.setBreed(newPuppy.getBreed());
		existing.setHeight(newPuppy.getHeight());
		existing.setName(newPuppy.getName());

		return this.repo.save(existing);
	}

	@Override
	public boolean removePuppy(Integer id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

}
