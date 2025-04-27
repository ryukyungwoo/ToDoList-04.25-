package ToDo;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToDoServiceImpl implements ToDoService {
    Map<Long, ToDo> todoRepository = new HashMap<>();

    static Long id = 0L;

    @Override
    public void saveToDo(BufferedReader reader, BufferedWriter writer) throws IOException {

        writer.write("To Do 제목: ");
        writer.flush();
        String title = reader.readLine();

        writer.write("To Do 내용: ");
        writer.flush();
        String description = reader.readLine();

        writer.write("To Do 시: ");
        writer.flush();
        int hours = readInt(reader, writer);

        writer.write("To Do 분: ");
        writer.flush();
        int minutes = readInt(reader, writer);

        if (hours > 24 || minutes > 60) {
            writer.write("시각은 ~24시, 분은 ~60까지만 가능합니다 ");
            writer.newLine();
            writer.flush();
            return;
        }

        id++;

        ToDo newToDo = new ToDo(id, title, description, hours, minutes);

        todoRepository.put(id, newToDo);
    }

    @Override
    public void deleteToDo(BufferedReader reader, BufferedWriter writer) throws IOException {
        writer.write("삭제할 To Do ID : ");
        writer.flush();
        writer.newLine();

        Long removeId = Long.parseLong(reader.readLine());

        if (todoRepository.get(removeId) == null){
            writer.write("없는 ID 입니다 ");
            writer.flush();
            writer.newLine();
            return;
        }

        todoRepository.remove(removeId);

        writer.write("삭제 완료");
        writer.flush();
        writer.newLine();
    }

    @Override
    public void getToDoList(BufferedReader reader, BufferedWriter writer) throws IOException {
        if (todoRepository.isEmpty()) {
            writer.write("To Do가 없습니다.");
            writer.newLine();
            writer.flush();
        } else {
            List<ToDo> toDoList = todoRepository.values().stream().collect(Collectors.toList());
            for (ToDo toDo : toDoList) {
                writer.write(String.valueOf(toDo.toString()));
                writer.newLine();
            }
            writer.flush();
        }
    }

    private int readInt(BufferedReader reader, BufferedWriter writer) throws IOException {
        while (true) {
            try {
                String input = reader.readLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                writer.write("숫자만 입력하세요: ");
                writer.flush();
            }
        }
    }

}
