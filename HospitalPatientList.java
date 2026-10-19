import java.util.ArrayList;
import java.util.HashSet;

class Q12 {
    public static void main(String[] args) {

        ArrayList<String> patients = new ArrayList<>();

        patients.add("Rahul");
        patients.add("Aman");
        patients.add("Neha");
        patients.add("Priya");

        HashSet<String> patientIds = new HashSet<>();

        patientIds.add("P101");
        patientIds.add("P102");
        patientIds.add("P103");
        patientIds.add("P102");

        System.out.println("Patient Names: " + patients);
        System.out.println("Unique Patient IDs: " + patientIds);

        patients.remove("Aman");
        System.out.println("After Removing Aman: " + patients);

        if (patients.contains("Neha")) {
            System.out.println("Neha found in patient list.");
        }

        patientIds.remove("P103");

        System.out.println("Final Patient Names: " + patients);
        System.out.println("Final Patient IDs: " + patientIds);
    }
}