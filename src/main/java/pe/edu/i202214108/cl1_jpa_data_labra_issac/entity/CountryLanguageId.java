package pe.edu.i202214108.cl1_jpa_data_labra_issac.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
public class CountryLanguageId implements Serializable {
    private String countryCode;
    private String language;
}
