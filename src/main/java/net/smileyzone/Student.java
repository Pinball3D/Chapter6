package net.smileyzone;

class Student extends Person {

    private int studentNumber;
    private boolean truth;
    public Student(){
        super();
        studentNumber = 0;
        truth = false;
    }
    public Student(String initialName, int initialStudentNumber){
        super(initialName);
        studentNumber = initialStudentNumber;
        truth = false;
    }
    public void reset(String newName, int newStudentNumber){
        setName(newName);
        studentNumber = newStudentNumber;
    }
    public void setStudentNumber(int newStudentNumber){
        studentNumber = newStudentNumber;
    }
    public void setEquals(Student otherStudent){
        super.setTruth(otherStudent);
        truth = super.getTruth()&&(this.studentNumber == otherStudent.studentNumber);
    }
    public int getStudentNumber(){
        return studentNumber;
    }
    public boolean getTruth(){
        return truth;
    }
    public String toString(Student other){
        return "Name: "+super.getName()+"\nStudent ID: "+getStudentNumber()+"\n\n"+compare(other)+"\n\n"+"Name: "+other.getName()+"\nStudent ID: "+other.getStudentNumber();
    }
    public String compare( Student other){
        setEquals(other);
        if(getTruth())
            return "is the same person as";
        return "is not the same person as";

    }
}

