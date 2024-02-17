package alikagan.rentACar.business.abstracts;

import alikagan.rentACar.business.requests.CreateModelRequest;
import alikagan.rentACar.business.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {
     List<GetAllModelsResponse> getAll();
     void add(CreateModelRequest createModelRequest);

}
