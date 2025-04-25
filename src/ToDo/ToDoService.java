package ToDo;

import java.util.List;

public interface ToDoService {
    void saveToDo(String title, String description, int hours, int minutes);
    void deleteToDo(Long id);
    List<ToDo> getToDoList();
}
