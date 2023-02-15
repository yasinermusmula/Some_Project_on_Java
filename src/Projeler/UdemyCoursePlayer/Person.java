package Projeler.UdemyCoursePlayer;

abstract public class Person {
    private String name;
    private int idNumber;
    private String coverLetter;

    public Person(String name, int idNumber, String coverLetter) {
        this.name = name;
        this.idNumber = idNumber;
        this.coverLetter = coverLetter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getCoverLetter() {
        return coverLetter;
    }

    public void setCoverLetter(String coverLetter) {
        this.coverLetter = coverLetter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", coverLetter='" + coverLetter + '\'' +
                '}';
    }
}
