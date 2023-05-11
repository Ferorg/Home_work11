public class Student implements Comparable<Student>{
    private String name;
    private String surName;
    private String dateOfBirth;
    private String cityOfBirth;
    private int averageMark;

    public Student(String name, String surName, String dateOfBirth, String cityOfBirth, int averageMark) {
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.cityOfBirth = cityOfBirth;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\n' +
                ", surName='" + surName + '\n' +
                ", dateOfBirth='" + dateOfBirth + '\n' +
                ", cityOfBirth='" + cityOfBirth + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }

    @Override
    public int compareTo(Student p) {
        return (this.averageMark -p.averageMark);
    }}

