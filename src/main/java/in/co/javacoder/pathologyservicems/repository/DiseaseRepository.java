package in.co.javacoder.pathologyservicems.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.javacoder.pathologyservicems.models.Disease;

@Repository
public interface DiseaseRepository extends CrudRepository<Disease, Integer> {

}
