package com.education.model;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

@Data
public class Attendee {

    @Size(min = 2,max = 30)
    private String name;

    @NotEmpty @Email
    private String email;
}
