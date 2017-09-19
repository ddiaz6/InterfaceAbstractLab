/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class StartUp {
    public static void main(String[] args) {
           WctcCourse course1 = new IntroToProgrammingCourse("Intro to Programming", "412");  
           WctcCourse course2 = new IntroJavaCourse("Intro Java", "134");           
           WctcCourse course3 = new AdvancedJavaCourse("Intro to Programming", "117");           

           System.out.println(course1.getCourseName());
           System.out.println(course1.getCourseNumber());
           
           System.out.println(course2.getCourseName());
           System.out.println(course2.getCourseNumber());
           
           
    
    }
}
