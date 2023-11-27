package kodlama.io.rentAcar.business.responses;

import kodlama.io.rentAcar.business.requests.CreateBrandRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandsResponse {

	private int id;
	private String name;
}
