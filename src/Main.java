import com.metaphorce.model.Task;
import com.metaphorce.model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Task tarea1 = new Task(1, false, "High", "Complete the project", "Project Task");
        Task tarea2 = new Task(2, true, "Medium", "Review the code", "Code Review");
        Task tarea3 = new Task(3, false, "High", "Estudiar para el examen de matemáticas", "Study for Math Exam");
        Task tarea4 = new Task(4, false, "Medium", "Terminar el challenge del Booster", "Finish Booster Challenge");
        Task tarea5 = new Task(5, false, "Low", "Sacar cita para el doctor", "Schedule Doctor Appointment");
        Task tarea6 = new Task(6, false, "High", "Agendar entrevista con Metaphorce", "Schedule Interview with Metaphorce");

        System.out.println(tarea1);
        System.out.println(tarea2);
        System.out.println(tarea3);
        System.out.println(tarea4);
        System.out.println(tarea5);
        System.out.println(tarea6);

        User user = new User(1, "Checo Perez", "perez@example.com");

        user.addTask(tarea1);
        user.addTask(tarea2);
        user.addTask(tarea3);
        user.addTask(tarea4);
        user.addTask(tarea5);
        user.addTask(tarea6);

        System.out.println(user);
    }
}
