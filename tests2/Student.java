package Lecture16;

import java.io.Serializable;

public class Student implements Serializable{
    private int stId;
    private String stName;
    private char stGrade;
    private boolean stGender;
    public Student(  int stId, String stName,
            char stGrade, boolean stGender) {
        this.stName = stName;
        this.stId = stId;
        this.stGrade = stGrade;
        this.stGender = stGender;
    }
    public int getId() {return this.stId; }
    public void setId(int stId) {
        this.stId = stId;
    }
 
    public String getName() {return this.stName;}
    public void setName(String stName) {
        this.stName = stName;
    }
 
    public boolean getGender() { return this.stGender;}
    public void setGender(boolean stGender) {
        this.stGender = stGender;
    }
 
    public char getGrade() { return this.stGrade;}
    public void setGrade(char stGrade) {
        this.stGrade = stGrade;
    }
    @Override
    public String toString() {
        return "Student{" + "stId=" + stId + 
                ", stName=" + stName + 
                ", stGrade=" + stGrade + 
                ", stGender=" + stGender + '}';
    }
}