package Beings;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public interface Names {
    List<String> origin = List.of("Ukraine", "Russia", "Slovakia", "Czechia");
    List<String> namesSlovak = List.of("Adam", "Andrej", "Barbora", "Daniel", "Eva", "Filip", "Gabriel", "Helena", "Ivana", "Jakub", "Katarína", "Lukáš", "Michaela", "Nikola", "Oliver", "Petra", "Radovan", "Silvia", "Tomáš", "Veronika");
    List<String> surnameSlovak = List.of("Novák", "Horváth", "Kováč", "Tóth", "Simon", "Szabó", "Molnár", "Nagy", "Farkas", "Balázs", "Varga", "Kiss", "Mészáros", "Fekete", "Takács", "Juhász", "Szilágyi", "Magyar", "Nagy", "Németh");
    List<String> namesRussian = List.of("Anastasia", "Andriy", "Bohdan", "Daria", "Dmytro", "Hanna", "Ivan", "Kateryna", "Kyrylo", "Larysa", "Maksym", "Natalia", "Oksana", "Pavlo", "Ruslan", "Sofiya", "Taras", "Valentyna", "Vasyl", "Yuliya");
    List<String> surnamesRussian = List.of("Ivanov", "Smirnov", "Kuznetsov", "Popov", "Vasilyev", "Petrov", "Sokolov", "Mikhailov", "Fedorov", "Morozov", "Volkov", "Novikov", "Sergeev", "Kuzmin", "Yakovlev", "Vasiliev", "Zaytsev", "Pavlov", "Semyonov", "Golubev");


    static String getOrigin() {
        Random rand = new Random();
        int rand_int_1 = 1;
        int rand_int = rand.nextInt(origin.size());
        return origin.get(rand_int);
    }

    static String getName(String origin) {
        Random rand = new Random();
        int rand_int_1 = 0;
        if (origin == "Slovakia") {
            rand_int_1 = rand.nextInt(namesSlovak.size());
        }
        return namesSlovak.get(rand_int_1);
    }
}