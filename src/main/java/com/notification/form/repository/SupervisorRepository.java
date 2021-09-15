package com.notification.form.repository;

import com.notification.form.model.Supervisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface SupervisorRepository extends JpaRepository<Supervisor, Long> { }
