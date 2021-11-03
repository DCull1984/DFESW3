package com.qa.puppies.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.puppies.domain.Puppy;

@Service
public class PuppyServiceList implements PuppyService{
	
	//PURELY FOR DEMO PURPOSES
		private List<Puppy> puppies = new ArrayList<>(); //Placeholder for a DataBase
		
		@Override
		public Puppy createPuppy(Puppy newPuppy) { //a puppy object in the request + response
			this.puppies.add(newPuppy);
			return this.puppies.get(this.puppies.size() - 1);
		}

		
		@Override
		public List<Puppy> getPuppy() {
			return this.puppies;
		}
		
		@Override
		public Puppy getPuppy(Integer id) {
			return this.puppies.get(id);
		}
		
		@Override
		public Puppy replacePuppy(Integer id, Puppy newPuppy) {
			return this.puppies.set(id, newPuppy); //replaces puupy at index
		}
		
		@Override
		public boolean removePuppy(Integer id) {
			Puppy toRemove = this.puppies.get(id);
			this.puppies.remove(id.intValue());
			return !this.puppies.contains(toRemove);
		}
}
