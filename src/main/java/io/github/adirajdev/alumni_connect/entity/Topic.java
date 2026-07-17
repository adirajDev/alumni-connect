package io.github.adirajdev.alumni_connect.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "topics")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "topics_seq")
    @SequenceGenerator(name = "topics_seq", sequenceName = "topics_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "topic_name", nullable = false, unique = true, length = 100)
    private String topicName;

    @Column(name = "topic_full_name", nullable = false, length = 200)
    private String topicFullName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
