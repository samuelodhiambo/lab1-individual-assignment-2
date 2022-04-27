package task1;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;





class StudentEnrol {
    private final Set<String> coresOffered = new HashSet<String>(Arrays.asList("P1", "OS", "SEF", "DC", "WP"));
    private final Set<String> electivesOffered = new HashSet<String>(Arrays.asList("C++", "PHP", "Web3D", "IT"));
    private Set<String> electives = new HashSet<String>();
    private Set<String> cores = new HashSet<String>();

    // constructor
    public StudentEnrol(Set<String> electives, Set<String> cores) throws Exception {
        this.electives = electives;
        this.cores = cores;
        validateState();
    }

    // Add Invariant
    private void validateState() throws Exception {
        Exception error = new Exception();
        String message = "";
        // Check if electives is empty
        if (electives.isEmpty()) {
            message = message + "-electives cannot be empty. ";
        }
        // check if cores is empty
        if (cores.isEmpty()) {
            message = message + " -cores cannot be empty.";
        }
        throw new Exception(message);
    }




    // Adding a core
    // ADD pre-condition




    // ADD post-condition

    public void addCore(String core) {
        cores.add(core);
    }




    // Adding an elective
    // ADD pre-condition




    // ADD post-condition




    public void addElective(String elective) {
        electives.add(elective);
    }





    // Removing a core
    // ADD pre-condition





    // ADD post-condition





    public void removeCore(String core) {
        cores.remove(core);
    }

    // Removing an elective
    // ADD pre-condition




    // ADD post-condition




    public void removeElective(String elective) {
        electives.remove(elective);
    }




    // Listing all courses enrolled
    public void display() {
        for (String course : cores) System.out.println(course);
        for (String course : electives) System.out.println(course);
    }

    public static void main(String[] args) {
        StudentEnrol enrol = new StudentEnrol();
        enrol.display();
    }
}
