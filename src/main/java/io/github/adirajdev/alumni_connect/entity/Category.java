package io.github.adirajdev.alumni_connect.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categories_seq")
    @SequenceGenerator(name = "categories_seq", sequenceName = "categories_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "category", nullable = false, unique = true,  length = 100)
    private String category;

    @Column(name = "category_full_name", nullable = false, length = 200)
    private String categoryFullName;

    @Column(name = "category_description")
    private String categoryDescription;
}
