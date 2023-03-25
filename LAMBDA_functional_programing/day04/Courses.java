package LAMBDA_functional_programing.day04;

public class Courses {
    private String Season;
    private String courseName;
    private int avaregeScore;
    private int numberOfStudents;

    public Courses(){

    }


    public Courses(String season, String courseName, int avaregeScore, int numberOfStudents) {
        Season = season;
        this.courseName = courseName;
        this.avaregeScore = avaregeScore;
        this.numberOfStudents = numberOfStudents;
    }

    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAvaregeScore() {
        return avaregeScore;
    }

    public void setAvaregeScore(int avaregeScore) {
        this.avaregeScore = avaregeScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString (){
        return "Course: Season" + Season + ", course Name=" + courseName+
                ", average Score = "+avaregeScore+", number Of Students="+numberOfStudents;
    }
}
