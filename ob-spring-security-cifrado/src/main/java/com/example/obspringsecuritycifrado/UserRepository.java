package com.example.obspringsecuritycifrado;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long >{
}
