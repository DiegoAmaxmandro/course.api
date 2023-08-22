package com.course.repositories;

import com.course.models.CourseModel;
import com.course.models.CourseUserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseUserRepository extends JpaRepository<CourseUserModel, UUID> {
    boolean existsByCourseAndUserId(CourseModel courseModel, UUID userId);
}
