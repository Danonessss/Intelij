package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        User result = getUserByLoginAndPassword(login,password);
        validateUser(result);

    }
    public static User[] getUsers() {
        User user1 = new User("danila", "danila@gmail.com", "123", 19);
        User user2 = new User("danon", "danon@gmail.com", "321", 17);
        User user3 = new User("admin", "admin@gmail.com", "213", 20);
        return new User[]{user1,user2, user3};
    }
    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
        if (user.getLogin().equals(login)&&user.getPassword().equals(password)){
            System.out.println("Проверка данных...");
            return user;
        }
        }
        throw new UserNotFoundException("Логин или пароль введены неверно");
    }
    public static User validateUser(User user) throws AccessDeniedException{
        User[] users = getUsers();
            if (user.getAge()<18){
                throw new AccessDeniedException("Возрастное ограничение 18+");
            }else {
                System.out.println("Доступ разрешен");
            }
        return user;
    }
}