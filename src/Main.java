public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
    Student std1 = new Student();
    Student std2 = (Student) std1.clone();


    std2.displayUniversity();
    }
}