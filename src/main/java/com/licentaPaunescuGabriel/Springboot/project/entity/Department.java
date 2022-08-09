package com.licentaPaunescuGabriel.Springboot.project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @NotBlank(message = "Please Add Department Name")
    /*@Length(max=5, min=1)
    @Size(max = 10, min = 4)
    @Email
    @Positive
    @Negative
    @PositiveOrZero
    @NegativeOrZero
    @Past
    @PastOrPresent*/
    private String departmentName;
    private String departmentAdress;
    private String departmentCode;


}
