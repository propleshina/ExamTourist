// Разработать класс для хранения данных о пользователе туристического агенства.
// Используя созданный класс, смоделировать работу приложения туристического агенства.
// Загрузить проект в отдельный репозиторий с названием

import java.io.Console;

class User {
    String Name;
    String Surname;
    String Patronymic;
    String DateOfBirth;
    String Passport;

    User(){
        Name = "Не установлено";
        Surname = "Не установлено";
        Patronymic = "Не установлено";
        DateOfBirth = "Не установлено";
        Passport = "Не установлено";
    }

    User (String name, String surname, String patronymic, String dateOfBirth, String passport){
        Name = name;
        Surname = surname;
        Patronymic = patronymic;
        DateOfBirth = dateOfBirth;
        Passport = passport;
    }

    void ConsoleInformation() {
System.out.print("\nИмя: "+Name+"\nФамилия: "+Surname+"\nОтчество: "+Patronymic+"\nДата рождения: "+DateOfBirth+"\nСерия и номер паспорта: "+Passport+"\n\n");
    }
}

public class Main {
    public static void main(String[] args) {
    User NullUser = new User();
    User FirstUser = new User("Анатолий","Иванов","Иванович","12.12.2000","2116124567");
User SecondUser = new User();

FirstUser.ConsoleInformation();
NullUser.ConsoleInformation();
SecondUser.ConsoleInformation();
        }
    }