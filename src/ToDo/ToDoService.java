package ToDo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

public interface ToDoService {
    void saveToDo(BufferedReader reader, BufferedWriter writer) throws IOException;
    void deleteToDo(BufferedReader reader, BufferedWriter writer) throws IOException;
    void getToDoList(BufferedReader reader, BufferedWriter writer) throws IOException;
}
