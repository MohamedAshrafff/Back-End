package com.sumerge.mappers;

import com.sumerge.task3.DTOs.AssessmentDTO;
import com.sumerge.task3.DatabaseClasses.Assessment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AssessmentMapper {

    @Mapping(source = "assessment_id" , target = "assessment_id")
    @Mapping(source = "assessment_content" , target = "assessment_content")

    AssessmentDTO assessmentToAssessmentDTO(Assessment assessment);
}
