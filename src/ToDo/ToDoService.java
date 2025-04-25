package ToDo;

import java.util.List;

public interface ToDoService {
    void saveToDo(String title, String description);
    void deleteToDo(Long id);
    List<ToDo> getToDoList();
}
