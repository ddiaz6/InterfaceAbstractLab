/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author HP
 */
public abstract class WctcCourse {    
    private String courseName;
    private String courseNumber;
    private double credits;
    
    
    public void wctcCourse(){
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName.isEmpty() || courseName.length() < 15) {
            throw new IllegalArgumentException("Error: courseName cannot be null of empty string.");
        }
        
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
         if (courseNumber.isEmpty() || courseNumber.length() < 15) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string.");
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
          if (credits <.5 || credits > 4) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        }
        this.credits = credits;
    }
    
    
    
}
