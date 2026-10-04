package com.mrs.spring_medical_reservation_system;

import org.springframework.boot.SpringApplication;

public class TestSpringMedicalReservationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringMedicalReservationSystemApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
