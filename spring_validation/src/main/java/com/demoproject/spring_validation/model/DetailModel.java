
package com.sample.validation.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;
@Entity
@Table(name = "Details")
public class Details {
    @Id
    private Long id;
    @Size(min = 3, max = 30)
    private String name;
    @Email(message = "please enter the valid email address")
    @NotBlank
    private String email;
    @NotBlank
    private String gender;
    @Min(value = 20_000)
    @Max(value = 200_000)
    private Long income;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getIncome() {
        return income;
    }

    public void setIncome(Long income) {
        this.income = income;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
