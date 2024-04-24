package Test.View;

import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;
import view.TodolistView;

public class TodolistViewTest {

    public static void main(String[] args) {
        testAddTododlistView();
    }
    private static void testTodolistView() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();

        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        TodolistView todolistView = new TodolistView(todolistService);

        todolistService.addTodolist("Aku");
        todolistService.addTodolist("Ak");
        todolistService.addTodolist("Au");
        todolistView.showTodolist();
    }

    private static void testAddTododlistView() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();

        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

        TodolistView todolistView = new TodolistView(todolistService);

        todolistView.showTodolist();
    }
}
