package ToDo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToDoServiceImpl implements ToDoService {
    Map<Long, ToDo> todoRepository;


    @Override
    public void saveToDo(String title, String description) {
        Long id = (long) todoRepository.size();

        ToDo newToDo = new ToDo(id, title, description);

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
