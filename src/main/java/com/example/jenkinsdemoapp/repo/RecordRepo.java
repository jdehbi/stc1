package com.example.jenkinsdemoapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jenkinsdemoapp.models.Record;

public interface RecordRepo extends JpaRepository<Record, Long> {

}
