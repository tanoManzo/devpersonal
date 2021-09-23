public class Student implements Comparable<Student>{
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s){
        if (this.getAge()>s.getAge())
            return 1;
        else
            return -1;
      
    }

   
}
