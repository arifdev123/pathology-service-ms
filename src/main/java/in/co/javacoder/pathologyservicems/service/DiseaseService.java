package in.co.javacoder.pathologyservicems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.javacoder.pathologyservicems.models.Disease;
import in.co.javacoder.pathologyservicems.repository.DiseaseRepository;

@Service
public class DiseaseService {
	
	@Autowired
	private DiseaseRepository diseaseRepository;
	
	public Iterable<Disease> findAll() {
		return diseaseRepository.findAll();
	}
	
	public Disease getDisease(Integer id) {
		return diseaseRepository.findById(id).get();
	}

}
