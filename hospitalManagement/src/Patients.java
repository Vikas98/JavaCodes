import java.util.ArrayList;

public class Patients {
    private int id;
    private String name;
    private int age;
    private String gender;
    private Doctors doctor = null;
    public Patients(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    private String  dateofAppointment;
    private String timeOfAppointment;

    public String getDateofAppointment() {
        return dateofAppointment;
    }

    public void setDateofAppointment(String dateofAppointment) {
        this.dateofAppointment = dateofAppointment;
    }

    public String getTimeOfAppointment() {
        return timeOfAppointment;
    }

    public void setTimeOfAppointment(String timeOfAppointment) {
        this.timeOfAppointment = timeOfAppointment;
    }
    public Patients() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    static ArrayList<Patients> al = new ArrayList<>();
    public static void addPatient(Patients p) {

        al.add(p);
        System.out.println("Patient added successfully");
    }
    public static void removePatient(int id)
    {
        for(Patients p: al)
        {
            if(p.getId()==id) {
                al.remove(p);
                System.out.println("patient removed successfully");
                return;
            }
        }
        System.out.println("Patient with ID "+ id + " does not exist");

    }
    public static void printPatients()
    {
        for (Patients p : al) {
            System.out.println(p);
        }
    }
    @Override
    public String toString() {
        return "Patients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void setDoctor(Doctors d) {

    }
}
