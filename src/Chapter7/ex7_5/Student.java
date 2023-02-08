package Chapter7.ex7_5;

class Student {
    private String name;
    private String dept;
    private String code;
    private double grade;

    public Student(String name, String dept, String code, double grade) {
        this.name = name;
        this.dept = dept;
        this.code = code;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getCode() {
        return code;
    }

    public double getGrade() {
        return grade;
    }
    public void findStudent(String name){
        if(name.equals(this.name)){
            System.out.println(this.name+" "+this.dept+" "+this.code+" "+this.grade);
        }
    }
}

