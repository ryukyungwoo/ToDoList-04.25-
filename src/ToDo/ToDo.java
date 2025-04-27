package ToDo;

public class ToDo {

    Long id;
    int hours;
    int minutes;
    String title;
    String description;

    public ToDo(Long id, String title, String description, int hours, int minutes) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", hours=" + hours +
                ", minutes=" + minutes +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


}
