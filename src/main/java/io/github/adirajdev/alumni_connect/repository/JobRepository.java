package io.github.adirajdev.alumni_connect.repository;

import io.github.adirajdev.alumni_connect.entity.Job;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {

    @Query("SELECT j FROM Job j JOIN FETCH j.user WHERE j.id = :id")
    Optional<Job> findByIdWithUser(Long id);

    @Query("SELECT j FROM Job j JOIN FETCH j.user ORDER BY j.createdAt DESC")
    List<Job> findLatestWithUser(Pageable pageable);
}