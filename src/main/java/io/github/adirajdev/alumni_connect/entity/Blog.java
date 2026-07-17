package io.github.adirajdev.alumni_connect.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "blogs")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "blogs_seq")
    @SequenceGenerator(name = "blogs_seq", sequenceName = "blogs_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "heading", nullable = false, length = 200)
    private String heading;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "cover_image")
    private String coverImage;

    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
}
