package Math_Lesson;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MathLesson {
    private final Set<Task> tasks = new HashSet<>();

    public MathLesson() {
        Random random = new Random();
        while (tasks.size() < 15) {
            tasks.add(new Task(random.nextInt(8)+2, random.nextInt(8)+2));
        }
    }


    @Override

    public String toString() {
        return "MathLesson{" +
                "tasks=" + tasks +
                '}';
    }
}
