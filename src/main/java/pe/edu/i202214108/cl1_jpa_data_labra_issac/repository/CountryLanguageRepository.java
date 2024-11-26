package pe.edu.i202214108.cl1_jpa_data_labra_issac.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.i202214108.cl1_jpa_data_labra_issac.entity.CountryLanguage;
import pe.edu.i202214108.cl1_jpa_data_labra_issac.entity.CountryLanguageId;

public interface CountryLanguageRepository extends CrudRepository<CountryLanguage, CountryLanguageId> {
}
