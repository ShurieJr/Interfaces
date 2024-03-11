public class Student implements university, Faculty, Cloneable{
    private String id;

    Student(String id){
        this.id = id;
    }
    Student(){
        id = "C112160";
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public void displayUniversity() {
        System.out.println("Id: " + id);
        System.out.println("university: " + university.name);
        System.out.println("Faculty id: " + facultyId);
        System.out.println("Faculty name: " + Faculty.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
