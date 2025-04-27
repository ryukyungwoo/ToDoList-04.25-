package ToDo;

import java.io.*;

public class ToDoSelector {
    public void menuSelector() throws IOException {

        final ToDoService toDoService = new ToDoServiceImpl();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            writer.write("사용할 기능 >> 1. To Do 모두 보기 2. To Do 만들기 3. To Do 삭제하기 4. 그만두기");
            writer.newLine();
            writer.flush();

            int menuNum = Integer.parseInt(reader.readLine());

            if (menuNum < 1 || menuNum > 4) {
                writer.write("1 ~ 4의 메뉴 안에서만 골라주세요");
                writer.newLine();
                writer.flush();
                return;
            }

            switch (menuNum) {

                case 1 -> {
                    toDoService.getToDoList(reader, writer);
                }
                case 2 -> {
                    toDoService.saveToDo(reader, writer);
                }
                case 3 -> {
                    toDoService.deleteToDo(reader, writer);
                }
                case 4-> {
                    return;
                }
            }
        }
    }
}