package kodlama.io.rentAcar.dataAcces.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.rentAcar.business.requests.CreateBrandRequest;
import kodlama.io.rentAcar.entities.concretes.Brand;


public interface BrandRepository  extends JpaRepository<Brand,Integer> {

	void save(CreateBrandRequest createBrandRequest);
	
	
}
