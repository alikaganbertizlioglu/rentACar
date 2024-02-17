package alikagan.rentACar.dataAcces;

import alikagan.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;


//brandDao olarak da isimlendirilebilir
public interface BrandRepository extends JpaRepository<Brand,Integer>{
    boolean existsByName(String name);//spring jpa keywords

}