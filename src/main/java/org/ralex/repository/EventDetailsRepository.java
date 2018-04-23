package org.ralex.repository;

import org.ralex.entity.EventDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDetailsRepository extends JpaRepository<EventDetailsEntity, Long> {
}
