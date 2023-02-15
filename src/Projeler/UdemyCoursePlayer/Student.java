package Projeler.UdemyCoursePlayer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Student extends Person { // Student is a person so we can extend from "person" class
    // We need to list that keep the course inside. We can use arraylist
    private ArrayList<Course> applyCoursesList;
    private LinkedList<Lesson> watchLessonList;

    public Student(String name, int idNumber, String coverLetter) {
        super(name, idNumber, coverLetter);
        applyCoursesList = new ArrayList<>(); // When we create student object, we are creating "applyCourses"
        watchLessonList = new LinkedList<>();
    }

    public void addCourse(Course addingCourse){
        if (addingCourse.CheckOnAir()){
            //If the course which i want the add is on air,add the student at "this".
            addingCourse.getCourseStudents().add(this);
            applyCoursesList.add(addingCourse); // When add this course, applycourses list add which course "addingCourse"
            System.out.println(this.getName() + " user " + addingCourse.getCourseName() + " is add the course");
        }else {
            System.out.println(addingCourse.getCourseName() + " course is not on air. You can't add.");
        }
    }
    public void addWatchingLesson(Lesson watchingLesson){
        boolean lessonFind = false;
        if (applyCoursesList.size() > 0){
            for (Course random : applyCoursesList){
                 if (random.getCourseLessons().contains(watchingLesson)){
                     System.out.println("The watching list inside course name " + random.getCourseName() + " belongs "+ watchingLesson.getStudyTitle()+ " lesson add.");
                     watchLessonList.add(watchingLesson);
                     lessonFind = true;
                     break;
                 }
            }
            if (!lessonFind){
                System.out.println("Applying lesson does not find the course list or you dont have permission");
            }
        }
    }

    public LinkedList<Lesson> getWatchLessonList() {
        return watchLessonList;
    }

    @Override
    public String toString() { // We can take toString function from "Person" class
        // and we can use it together special student class object
        return super.toString() + "Student{" +
                "applyCourses=" + applyCoursesList +
                '}';
    }

}
