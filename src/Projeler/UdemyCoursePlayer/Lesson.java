package Projeler.UdemyCoursePlayer;

public class Lesson {
    private int studyNo;
    private String studyTitle;
    private double minute;

    public Lesson(int studyNo, String studyTitle, double minute) {
        this.studyNo = studyNo;
        this.studyTitle = studyTitle;
        this.minute = minute;
    }

    public int getStudyNo() {
        return studyNo;
    }

    public void setStudyNo(int studyNo) {
        this.studyNo = studyNo;
    }

    public String getStudyTitle() {
        return studyTitle;
    }

    public void setStudyTitle(String studyTitle) {
        this.studyTitle = studyTitle;
    }

    public double getMinute() {
        return minute;
    }

    public void setMinute(double minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "Study{" +
                "studyNo=" + studyNo +
                ", studyTitle='" + studyTitle + '\'' +
                ", minute=" + minute +
                '}';
    }
}
