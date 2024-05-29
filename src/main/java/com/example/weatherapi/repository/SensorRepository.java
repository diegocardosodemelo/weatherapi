package com.example.weatherapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.weatherapi.model.Sensor;

public interface SensorRepository extends JpaRepository<Sensor, Long> {
}