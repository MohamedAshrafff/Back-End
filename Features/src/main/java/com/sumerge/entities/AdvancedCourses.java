package com.sumerge.entities;

import com.sumerge.task3.CourseRecommender;
import com.sumerge.task3.DatabaseClasses.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdvancedCourses implements CourseRecommender {

    @Override
    public List<Course> recommendedCourses() {
        return new ArrayList<>(Arrays.asList(
                new Course("MID Courses"),
                new Course("Object Oriented Programming"),
                new Course("Data Analytics 1")
        ));
    }

}
