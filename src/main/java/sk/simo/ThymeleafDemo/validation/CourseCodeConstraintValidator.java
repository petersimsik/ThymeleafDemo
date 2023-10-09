package sk.simo.ThymeleafDemo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String validCoursePrefix;

    @Override
    public void initialize(CourseCode courseCode) {
        this.validCoursePrefix = courseCode.value();
    }

    @Override
    public boolean isValid(String courseCode, ConstraintValidatorContext constraintValidatorContext) {
        //constraintValidatorContext - here we can place additional error messages
        if (courseCode == null)
            return false;
        else
            return courseCode.startsWith(validCoursePrefix);
    }
}
