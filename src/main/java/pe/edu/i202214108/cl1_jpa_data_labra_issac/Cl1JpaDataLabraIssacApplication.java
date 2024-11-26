package pe.edu.i202214108.cl1_jpa_data_labra_issac;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202214108.cl1_jpa_data_labra_issac.entity.Country;
import pe.edu.i202214108.cl1_jpa_data_labra_issac.repository.CountryRepository;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataLabraIssacApplication  implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataLabraIssacApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		findCountry();

		countryRepository.deleteAllById(List.of("COL", "ARG"));
		countryRepository.flush();
		System.out.println("Países COL y ARG eliminados con cascada.");

		findCountry();

	}
	private void findCountry() {
		Optional<Country> optionalArg = countryRepository.findById("ARG");
		optionalArg.ifPresentOrElse(country -> {
			System.out.println("En argentina hablan : " + country.getName());
			country.getCountryLanguageList().forEach(language ->{
						System.out.println(language.getLanguage());
					}

			);
		}, () -> {
			System.out.println("Country ARG not found.");
			countryRepository.findById("PER").ifPresent(perCountry ->
					perCountry.getCountryLanguageList().forEach(language ->
							System.out.println(language.getLanguage())
					)
			);
		});
	}

}
