package in.co.javacoder.pathologyservicems.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.javacoder.pathologyservicems.models.Disease;
import in.co.javacoder.pathologyservicems.service.DiseaseService;

@RestController
@RequestMapping("/pathology")
public class PathalogyResource {
	
	@Autowired
	private DiseaseService diseaseService;
	
	@GetMapping("/diseases")
	public Iterable<Disease> getAll(){
		return diseaseService.findAll(); 
	}
	
	@GetMapping("/disease/{id}")
	public Disease getDisease(@PathVariable Integer id) {
		return diseaseService.getDisease(id);
	}

}
