package ToDo;

import java.util.List;

public class ToDoController {

    final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    void makeToDo(String title, String description, int hours, int minutes) {
        toDoService.saveToDo(title, description, hours, minutes);
    }

    void deleteToDo(Long id) {
        toDoService.deleteToDo(id);
    }

    List<ToDo> getToDoList() {
        return toDoService.getToDoList();
    }
}
