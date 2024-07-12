import javax.print.Doc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("Enter your choice");
            System.out.println("1. Add Patient");
            System.out.println("2. Delete Patient");
            System.out.println("3. Display Patient");
            System.out.println("4. Add Doctor");
            System.out.println("5. Delete Doctor");
            System.out.println("6. Display Doctor");
            System.out.println("7. Book an appointment");
            System.out.println("8. Print appointments");
            System.out.println("9. Release appointments");
            System.out.println("10. Exit");
            Scanner in = new Scanner(System.in);
            int cas = in.nextInt();
            switch(cas)
            {
                case 1:
                    Patients p = new Patients();
                    System.out.println("Enter Patient ID");
                    p.setId((in.nextInt()));
                    in.nextLine();
                    System.out.println("Enter Patient Name");
                    p.setName(in.nextLine());
                    System.out.println("Enter Patient Age");
                    p.setAge(in.nextInt());
                    in.nextLine();
                    System.out.println("Enter Patient Gender");
                    p.setGender(in.nextLine());
                    Patients.addPatient(p);
                    break;
                case 2:
                    System.out.println("Enter patients ID which you wants to delete");
                    int ID = in.nextInt();
                    Patients.removePatient(ID);
                    break;
                case 3:
                    Patients.printPatients();
                    break;
                case 4:
                    Doctors doc = new Doctors();
                    System.out.println("Enter Doctor ID");
                    doc.setId(in.nextInt());
                    in.nextLine();
                    System.out.println("Enter Doctor Name");
                    doc.setName(in.nextLine());
                    System.out.println("Enter Doctor Age");
                    doc.setAge(in.nextInt());
                    in.nextLine();
                    System.out.println("Enter Doctor Gender");
                    doc.setGender(in.nextLine());
                    System.out.println("Enter Doctor speciality");
                    doc.setSpeciality(in.nextLine());
                    System.out.println("Enter Doctor availability");
                    doc.setAvailability(in.nextInt());
                    doc.addDoctor(doc);
                    break;
                case 5:
                    System.out.println("Enter doctors ID which you wants to delete");
                    int ID2 = in.nextInt();
                    Doctors.removeDoctor(ID2);
                    break;
                case 6:
                    Doctors.printDoctors();
                    break;
                case 7:
                    System.out.println("Enter the Speciality of doctor");
                    Scanner sc = new Scanner(System.in);
                    String speciality = sc.nextLine();
                    Doctors d = Doctors.checkAvailablity(speciality);
                    if(d==null) {
                        System.out.println("No doctor is available");
                        break;
                    }
                    else{
                        Appoinment.bookAppointment(d,new Patients());
                    }
                    break;
                case 8:
                    Appoinment.printAppointments();
                    break;
                case 9:
                    System.out.println("Enter patient ID which you wants to release appointment");
                    Scanner sc2 = new Scanner(System.in);
                    int ID3 = sc2.nextInt();
                    Doctors doc1 = Doctors.releaseAvailablity(ID3);
                    if(doc1==null) {

                        break;
                    }
                    Appoinment.releaseAppointment(doc1,ID3);
                    break;
                case 10:
                    return;
            }
        }

    }
}