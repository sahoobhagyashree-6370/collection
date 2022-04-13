package collectionBasic;
public class Student implements  Comparable<Student>{
    private String name;
    private int rollNo;
    private double cpi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", cpi=" + cpi +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int response = this.name.compareTo(o.name);
        return response;
    }
}