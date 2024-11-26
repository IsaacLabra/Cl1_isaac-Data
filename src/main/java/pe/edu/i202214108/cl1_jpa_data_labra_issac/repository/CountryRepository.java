package pe.edu.i202214108.cl1_jpa_data_labra_issac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.i202214108.cl1_jpa_data_labra_issac.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
}
