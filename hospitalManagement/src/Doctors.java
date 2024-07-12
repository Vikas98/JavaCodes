import java.util.ArrayList;

public class Doctors {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String speciality;
    private int availability;
    private Patients patients = null;
    public Doctors(int id, String name, int age, String gender, String speciality, int availablity) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.speciality = speciality;
        this.availability = availablity;
    }

    public Doctors() {
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public Patients getPatients() {
        return patients;
    }

    public void setPatients(Patients patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", speciality='" + speciality + '\'' +
                ", availablity='" + availability + '\'' +
                '}';
    }
    static ArrayList<Doctors> al = new ArrayList<>();
    public static void addDoctor(Doctors doc) {

        al.add(doc);
        System.out.println("Doctor added successfully");
    }
    public static void removeDoctor(int id)
    {
        for(Doctors d: al)
        {
            if(d.getId()==id) {
                al.remove(d);
                System.out.println("Doctor removed successfully");
                return;
            }
        }
        System.out.println("Doctor with ID "+ id + " does not exist");

    }
    public static void printDoctors()
    {
        for (Doctors doc : al) {
            System.out.println(doc);
        }
    }
    public static Doctors checkAvailablity(String speciality)
    {
        for (Doctors doc : al) {
            String spec = doc.getSpeciality();
            int avail = doc.getAvailability();
            if(spec.equals(speciality)&& avail == 1)
            {
                System.out.println(doc);
                return doc;
            }
        }
        return null;
    }
    public static Doctors releaseAvailablity(int ID)
    {

        for (Doctors doc : al) {
            if(doc.getPatients() == null)
            {
                return null;
            }
            if(doc.getPatients().getId()==ID)
            {
                return doc;
            }
        }
        return null;
    }
}
