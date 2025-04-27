import ToDo.ToDoSelector;
import ToDo.ToDoService;
import ToDo.ToDoServiceImpl;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        ToDoSelector toDoSelector = new ToDoSelector();
        toDoSelector.menuSelector();
    }
}
