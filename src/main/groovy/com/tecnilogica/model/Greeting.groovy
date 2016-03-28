package com.tecnilogica.model

import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotBlank;

public class Greeting {

    @Min(1l)
    long id
    @NotBlank
    String content

}
