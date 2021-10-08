package students;

import java.time.LocalDate;

public class LearningDay {
    public LocalDate date;
    private Teacher teacher;

    public LearningDay(Teacher teacher) {
        date = LocalDate.now();
        this.teacher = teacher;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date + ", " + teacher.getlName() + ' ' + teacher.getfName().substring(0, 1) + ".";
    }
}
