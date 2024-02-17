package alikagan.rentACar.business.abstracts;

import alikagan.rentACar.business.requests.CreateBrandRequest;
import alikagan.rentACar.business.requests.UpdateBrandRequest;
import alikagan.rentACar.business.responses.GetAllBrandsResponse;
import alikagan.rentACar.business.responses.GetByIdBrandResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();//response

    void add(CreateBrandRequest createBrandRequest);

    void update(UpdateBrandRequest updateBrandRequest);

    void delete(int id);

    GetByIdBrandResponse getById(int id);


}
