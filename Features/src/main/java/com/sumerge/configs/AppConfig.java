package com.sumerge.configs;

import com.sumerge.AdvancedCourses;
import com.sumerge.MidCourses;
import com.sumerge.mappers.AssessmentMapper;
import com.sumerge.mappers.AuthorMapper;
import com.sumerge.mappers.CourseMapper;
import com.sumerge.mappers.RatingMapper;
import com.sumerge.services.CourseService;
import com.sumerge.task3.CourseRecommender;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


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
