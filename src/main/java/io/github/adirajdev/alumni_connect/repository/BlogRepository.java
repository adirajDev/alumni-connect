package io.github.adirajdev.alumni_connect.repository;

import io.github.adirajdev.alumni_connect.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BlogRepository extends JpaRepository<Blog, Long> {

    @Query("SELECT b FROM Blog b JOIN FETCH b.user WHERE b.id = :id")
    Optional<Blog> findByIdWithUser(Long id);

    @Query("SELECT b FROM Blog b JOIN FETCH b.user ORDER BY b.createdAt DESC")
    List<Blog> findTop5LatestWithUser();
}
