import java.sql.Time;
import java.util.*;

public class Appoinment {
    static Map<Doctors,Patients> map = new HashMap<Doctors,Patients>();
    static ArrayList<Appoinment> ap = new ArrayList<>();
   public static void bookAppointment(Doctors d, Patients p)
   {
        Appoinment appoinment = new Appoinment();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the patients ID");
        p.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the patients name");
        p.setName(sc.nextLine());
        System.out.println("Enter the patients gender");
        p.setGender(sc.nextLine());
        System.out.println("Enter the patients age");
        p.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the date of appointment");
        p.setDateofAppointment(sc.nextLine());
        System.out.println("Enter the time of appointment");
        p.setTimeOfAppointment(sc.nextLine());
        Patients.addPatient(p);
        d.setPatients(p);
        d.setAvailability(0);
        p.setDoctor(d);
        map.put(d,p);
        System.out.println("Appointment Booked!");
   }
   public static void printAppointments()
   {
       if(map.isEmpty()) {
           System.out.println("No appointments found");
           return;
       }
       for(Map.Entry<Doctors,Patients> entry : map.entrySet())
       {
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
   }
   public static void releaseAppointment(Doctors d,int ID)
   {
      for(Map.Entry<Doctors,Patients> entry : map.entrySet())
      {
          if(entry.getValue().getId()==ID)
          {
              d.setAvailability(1);
              d.setPatients(null);
              map.remove(entry.getKey());
              Patients.removePatient(ID);
              System.out.println("Appointment Released!");
          }

      }
   }
}
