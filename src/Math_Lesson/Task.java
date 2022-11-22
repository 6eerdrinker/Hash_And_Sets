package Math_Lesson;

import java.util.Objects;

public class Task{
    private final int value1;
    private final int value2;

    public Task(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return (value1 == task.value1 && value2 == task.value2) // проверка аргументов с перестановкой, т.е. правый
                || (value1 == task.value2 && value2 == task.value1); // аргумет равен левому аргументу и левый равен
                                                                // правому, т.е. 2*9 и 9*2 являются повтором.

    }

    @Override
    public int hashCode() {
        return Objects.hash(value1 * value2, value1 + value2);
    } // качественный Хэш код для нормального распределения значений, например: 3 * 4, 3 + 4 получаем 12, 7 и
                                                                      //        2 * 6, 2 + 6 получаем 12, 8

    @Override
    public String toString() {
        return String.format("%s * %s = ?", this.value1, this.value2);
    }
}

