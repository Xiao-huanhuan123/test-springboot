package com.whlearn.springboot03_readconfigproperties;

import com.whlearn.springboot03_readconfigproperties.config.LibraryProperties;
import com.whlearn.springboot03_readconfigproperties.config.MyProfileProperties;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot03ReadconfigpropertiesApplication implements InitializingBean {

    private final LibraryProperties library;
    private final MyProfileProperties profile;

    public Springboot03ReadconfigpropertiesApplication(LibraryProperties library,MyProfileProperties profile) {
        this.library = library;
        this.profile = profile;
    }

    public static void main(String[] args) {
        SpringApplication.run(Springboot03ReadconfigpropertiesApplication.class, args);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        System.out.println(library.getBooks());
//        System.out.println(library.getLocation());
        System.out.println(profile.toString());
//        System.out.println(profile.getEmail());
    }
}
