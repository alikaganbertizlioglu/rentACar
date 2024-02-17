package alikagan.rentACar.business.concretes;

import alikagan.rentACar.business.abstracts.ModelService;
import alikagan.rentACar.business.requests.CreateModelRequest;
import alikagan.rentACar.business.responses.GetAllModelsResponse;
import alikagan.rentACar.core.utilities.mappers.ModelMapperService;
import alikagan.rentACar.dataAcces.ModelRepository;
import alikagan.rentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {

    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;
    @Override
    public List<GetAllModelsResponse> getAll() {

        List<Model> models = modelRepository.findAll();

        List<GetAllModelsResponse> modelsResponse = models.stream()
                .map(model-> this.modelMapperService.forResponse().map(model,GetAllModelsResponse.class))
                .collect(Collectors.toList());
        return modelsResponse;
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {
            Model model = this.modelMapperService.forRequest().map(createModelRequest,Model.class);
            this.modelRepository.save(model);
    }
}
