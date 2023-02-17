package com.javaguide.employeeservice.dto;

import com.javaguide.employeeservice.constansts.EmployeeErrorConstants;
import com.javaguide.employeeservice.constansts.EmployeeUrlPathConstants;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long id;

    @NotNull(message = EmployeeErrorConstants.NAME_NOT_BE_NULL)
    @NotEmpty(message = EmployeeErrorConstants.NAME_NOT_BE_EMPTY)
    private String name;
    @NotNull(message = EmployeeErrorConstants.EMAIL_NOT_BE_NULL)
    @NotEmpty(message = EmployeeErrorConstants.EMAIL_NOT_BE_EMPTY)
    @Email(message = EmployeeErrorConstants.NOT_VALID_EMAIL)
    private String email;
}
