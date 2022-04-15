package com.idomsoft.repositories.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="users")
public class User extends AbstractEntity {

    @NotEmpty(message= "User name may not be empty")
    @Size(min = 5, max = 32, message = "User name must be between 5 and 32 cahracters long")
    private String userName;

    @NotEmpty(message = "Password may not empty")
    @Size(min = 6, max = 32, message = "Password must be between 6 and 32 characters long")
    private String password;

}
