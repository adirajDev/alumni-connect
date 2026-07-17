package io.github.adirajdev.alumni_connect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.adirajdev.alumni_connect.entity.Topic;

import java.util.Optional;
import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    
    boolean existsByTopicName(String topicName);

    Optional<Topic> findByTopicName(String topicName);

    // traverses Topic.category.category — underscore disambiguates the nested path
    // TODO: change category name from category to name
    List<Topic> findByCategory_Category(String category);
}
