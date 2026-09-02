public class Student {

    private int id;
    private String name;
    private String registerNumber;
    private String email;
    private String password;
    private String department;

    public Student(int id, String name, String registerNumber,
                   String email, String password, String department) {

        this.id = id;
        this.name = name;
        this.registerNumber = registerNumber;
        this.email = email;
        this.password = password;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDepartment() {
        return department;
    }
}