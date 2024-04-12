//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        University university = new University("Monster Inc");

        university.generateStudent(1, "Mike");
        university.generateCourse(1, "Anatomia");

        try {

            university.suscribeStudent(2, 1);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }




    }
}