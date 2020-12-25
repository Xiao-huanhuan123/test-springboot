package com.whlearn.springboot03_readconfigproperties.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@Component
@ConfigurationProperties(prefix = "my-profile")
@Validated
public class MyProfileProperties {
    @NotEmpty
    private String name;

    @Email
    @NotEmpty
    private String email;
}
