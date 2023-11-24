package kodlama.io.rentAcar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentAcar.business.abstracts.BrandService;
import kodlama.io.rentAcar.dataAcces.abstracts.BrandRepository;
import kodlama.io.rentAcar.entities.concretes.Brand;

@Service
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;
	
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}



	@Override
	public List<Brand> GetAll() {
		// TODO Auto-generated method stub
		return brandRepository.getAll();
	}

}
