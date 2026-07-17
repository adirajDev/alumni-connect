package io.github.adirajdev.alumni_connect.repository;

import io.github.adirajdev.alumni_connect.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    @Query("SELECT m FROM Message m JOIN FETCH m.user WHERE m.topic.topicName = :topicName ORDER BY m.timestamp ASC")
    List<Message> findByTopicNameWithUser(String topicName);
}