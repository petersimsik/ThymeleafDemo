package sk.simo.ThymeleafDemo.model;

import jakarta.validation.constraints.*;
import sk.simo.ThymeleafDemo.validation.CourseCode;

public class Customer {
    private String firstName;
    @NotNull(message = "Surname could not be empty")
    @Size(min = 1, message = "Surname could not be empty")
    private String surname;

    @Min(value = 1, message = "Free passes should be >= 1")
    @Max(value = 10, message = "Free passes should be <= 10")
    private Integer freePasses;

    @Pattern(regexp = "^[A-Za-z0-9]{5}", message = "Zip code should be 5 characters")
    private String zipCode;

    @CourseCode(value = "LUV", message = "Course code should start with LUV")
    private String courseCode;


    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", freePasses=" + freePasses +
                ", zipCode='" + zipCode + '\'' +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }
}
