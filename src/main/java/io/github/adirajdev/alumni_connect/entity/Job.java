package io.github.adirajdev.alumni_connect.entity;

import io.github.adirajdev.alumni_connect.enums.JobMode;
import io.github.adirajdev.alumni_connect.enums.JobType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "jobs")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jobs_seq")
    @SequenceGenerator(name = "jobs_seq", sequenceName = "jobs_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "salary", length = 100)
    private String salary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "job_role", nullable = false, length = 150)
    private String jobRole;

    @Column(name = "company_name", nullable = false, length = 150)
    private String companyName;

    @Column(name = "location", length = 150)
    private String location;

    @Enumerated(EnumType.STRING)
    @Column(name = "job_type", nullable = false, length = 20)
    private JobType jobType;

    @Enumerated(EnumType.STRING)
    @Column(name = "job_mode", nullable = false, length = 20)
    private JobMode jobMode;

    @Column(name = "validity", nullable = false)
    private LocalDateTime validity;

    @Column(name = "job_link", length = 500)
    private String jobLink;

    @Column(name = "job_description", columnDefinition = "TEXT")
    private String jobDescription;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
}
