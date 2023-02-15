package Projeler.UdemyCoursePlayer;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Lesson> courseLessons;
    private ArrayList<Teacher> courseTeachers;
    private ArrayList<Student> courseStudents;
    private boolean onAir;

    public Course(String courseName, Teacher firstTeacher) {
        this.courseName = courseName;
        this.courseLessons = new ArrayList<>();
        this.courseTeachers = new ArrayList<>();
        this.courseStudents = new ArrayList<>();
        courseTeachers.add(0,firstTeacher);
        this.onAir = false;
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Lesson> getCourseLessons() {
        return courseLessons;
    }

    public ArrayList<Teacher> getCourseTeachers() {
        return courseTeachers;
    }

    public ArrayList<Student> getCourseStudents() {
        return courseStudents;
    }

    public void addTeacherInCourse(Teacher newTeacher){ // This method for add new teachers
        if (!courseTeachers.contains(newTeacher)){ //
            System.out.println(newTeacher.getName() + " is add the course to new teacher");
            courseTeachers.add(newTeacher);
        }else {
            System.out.println(newTeacher.getName() + " is already in the course");
        }
    }
    public void deleteTeacherInCourse(Teacher deleteTeacher){
        if (deleteTeacher.getName().equals(courseTeachers.get(0).getName())){
            // if you want to delete teacher's name equals the first name, you can't delete this.
            // firstTeacher can't delete from teacherlist so we made this loop
            System.out.println(deleteTeacher.getName() + " is first teacher in course. You can't delete it.");
        }else {
            courseTeachers.remove(deleteTeacher);
            System.out.println(deleteTeacher.getName() + " is delete from course teacher");
        }
    }
    public void addStudyToCourse(Lesson addLesson){ // if you want to add
        courseLessons.add(addLesson);
    }
    public int lessonsInCourses(){
        return courseLessons.size();
    }
    public int sumOfCoursesMinute(){
        double sum = 0;
        for (Lesson lesson : courseLessons){
             sum = sum + lesson.getMinute();
        }
        return (int) sum;
    }
    public boolean CheckOnAir(){
        if (courseLessons.size() > 5 && sumOfCoursesMinute() > 60){
            onAir = true;
            return true;
        } else return false;
    }
}
