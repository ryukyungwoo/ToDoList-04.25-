package ToDo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToDoServiceImpl implements ToDoService {
    Map<Long, ToDo> todoRepository;


    @Override
    public void saveToDo(String title, String description, int hours, int minutes) {
        Long id = (long) todoRepository.size();

        if (hours > 24 && minutes > 60) {
            return;
        }

        ToDo newToDo = new ToDo(id, title, description, hours, minutes);

        todoRepository.put(id, newToDo);
    }

    @Override
    public void deleteToDo(Long id) {
        todoRepository.remove(id);
    }

    @Override
    public List<ToDo> getToDoList() {
        return todoRepository.values().stream().collect(Collectors.toList());
    }


}
