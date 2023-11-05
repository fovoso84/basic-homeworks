package ru.matsishin.homeworks.homework10;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User("Petrov", "Oleg", "Petrovich", 1977, "petrov@gmail.com"),
                new User("Ivanov", "Ivan", "Ivanovich", 1999, "ivanov@gmail.com"),
                new User("Alexandrov", "Alexander", "Alexandrovich", 1965, "alexandrov@gmail.com"),
                new User("Glebov", "Gleb", "Glebovich", 1967, "glebovv@gmail.com"),
                new User("Artemov", "Artem", "Artemovich", 1994, "artemov@gmail.com"),
                new User("Nikolaev", "Nikolay", "Nikolaevich", 1995, "nikolaev@gmail.com"),
                new User("Borisov", "Boris", "Borisovich", 1996, "borisov@gmail.com"),
                new User("Alekseev", "Alexey", "Alekseevich", 1997, "alexeev@gmail.com"),
                new User("Kirilov", "Kirill", "Kirilovich", 1998, "kirilov@gmail.com"),
                new User("Maximov", "Maxim", "Maximovich", 1999, "maximov@gmail.com"),
        };
        for (int i = 0; i < users.length; i++) {
            if (2023 - users[i].getYearOfBirth() > 40) {
                users[i].info();
                System.out.println();
            }
        }

        Box box = new Box(10, 10, 10, "black", true, "ball");
        box.Info();
        box.open();
        box.close();
        box.put("ball");
        box.repaint("white");
        box.remove();


    }


}





