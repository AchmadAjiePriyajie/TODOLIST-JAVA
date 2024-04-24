package Test.Service;

import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;

public class TodolistServiceTest {

    public static void main(String[] args) {
        testRemoveTodolist();
    }
    public static void testRemoveTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        todolistService.addTodolist("Ajgg");
        todolistService.addTodolist("Aji");
        todolistService.addTodolist("Ajie");
        todolistService.addTodolist("Ajngg");
        todolistService.showTodolist();
        todolistService.removeTodolist(2);
        todolistService.removeTodolist(20);
        System.out.println("Sesudah dihapus");
        todolistService.showTodolist();
    }
    public static void testAddTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        for (int i = 0; i < 25; i++) {
            todolistService.addTodolist("Contoh Todo Ke." + i);
        }

        todolistService.showTodolist();
    }

    public static void testShowTodolist() {
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
        todolistRepository.data[0] = new Todolist("Aku");
        todolistRepository.data[1] = new Todolist("Aku AS");
        todolistRepository.data[2] = new Todolist("Aku Po");

        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        todolistService.showTodolist();
    }
}
