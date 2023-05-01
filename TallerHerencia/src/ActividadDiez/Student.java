package ActividadDiez;

import java.util.Date;

public class Student extends Person {
    private int id;
    private String major;
    private String degree;
    private int gradYear;
    private double gpa;
public Student(String firstName, String middleName, String lastName, Date dateOfBirth, int id, String major, String degree, int gradYear, double gpa) {
    super(firstName, middleName, lastName, dateOfBirth);
    this.id = id;
    this.major = major;
    this.degree = degree;
    this.gradYear = gradYear;
    this.gpa = gpa;
}

public int getId() {
    return id;
}

public String getMajor() {
    return major;
}

public String getDegree() {
    return degree;
}

public int getGradYear() {
    return gradYear;
}

public double getGpa() {
    return gpa;
}

public void setMajor(String major) {
    this.major = major;
}

public double calculateGPA(String[] grades) {
    double totalPoints = 0;
    int numCourses = grades.length;
    
    for (int i = 0; i < numCourses; i++) {
        switch (grades[i]) {
            case "4":
                totalPoints += 4.0;
                break;
            case "3.67":
                totalPoints += 3.67;
                break;
            case "3.33":
                totalPoints += 3.33;
                break;
            case "3":
                totalPoints += 3.0;
                break;
            case "2.67":
                totalPoints += 2.67;
                break;
            case "2.33":
                totalPoints += 2.33;
                break;
            case "2":
                totalPoints += 2.0;
                break;
            case "1":
                totalPoints += 1.0;
                break;
            case "0":
                totalPoints += 0.0;
                break;
            default:
                System.out.println("Calificación inválida");
                break;
        }
    }

    return totalPoints / numCourses;
}
}