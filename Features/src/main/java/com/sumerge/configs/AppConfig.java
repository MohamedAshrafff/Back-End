package com.sumerge.configs;

import com.sumerge.entities.AdvancedCourses;
import com.sumerge.entities.MidCourses;
import com.sumerge.services.CourseService;
import com.sumerge.task3.CourseRecommender;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.sumerge")
public class AppConfig {

    @Bean
    public CourseService courseService(@Qualifier("basicRecommenderBean") CourseRecommender courseRecommender){
        return new CourseService(courseRecommender);
    }

    @Bean(name = "basicRecommenderBean")
    public CourseRecommender basicCoursesRecommender() { return new MidCourses();}

    @Bean(name = "advancedRecommenderBean")
    public CourseRecommender advancedCoursesRecommender() { return new AdvancedCourses();}
}
