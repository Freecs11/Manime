package com.manime.repository;

import com.manime.model.Task;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;

@Table(name = "task")
public interface TaskRepository extends JpaRepository<Task, Long> {
}