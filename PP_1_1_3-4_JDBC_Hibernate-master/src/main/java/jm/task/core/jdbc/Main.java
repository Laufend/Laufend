package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        //userService.createUsersTable();

        //userService.saveUser("Ivan", "Efimov", (byte) 19);
        //userService.saveUser("Petr", "Ivanov", (byte) 26);
        //userService.saveUser("Alexei", "Romanov", (byte) 32);
        //userService.saveUser("Dmitriy", "Fro", (byte) 35);

        //userService.getAllUsers();

        //userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}

