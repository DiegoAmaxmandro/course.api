package com.course.service;

import com.course.models.CourseModel;
import com.course.models.CourseUserModel;

import java.util.UUID;

public interface CourseUserService {

    boolean existsByCourseAndUserId(CourseModel courseModel, UUID userId);


    CourseUserModel save(CourseUserModel courseUserModel);

    CourseUserModel saveAndSendSubscriptionUserInCourse(CourseUserModel courseUserModel);
}
