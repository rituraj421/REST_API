package com.springBasics.springProject;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080/courses
// [
//     {
//         "id" :1,
//         "name": "Learn REST",
//         "author" :"rituraj"
//     }
// ]

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "passenger", "rituraj"),
                new Course(2, "passenger", "aditi"));
    }
}
