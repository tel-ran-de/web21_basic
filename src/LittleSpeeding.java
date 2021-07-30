public class LittleSpeeding {
    /*
    *
    Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
    при езде до 50 км/час нарушений нет;
    за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
    за превышение скорости от 16 км/час — 40 евро штрафа;
    за езду от 100 км/час до 130 км/час — штраф 500 евро;
    и за езду свыше 130 км/час — штраф в 1000 евро,
    конфискация прав на 3 года и конфискация транспортного средства.
    * */
    public static void streetPoliceApplication(int speed) {
        if (speed <= 50) {
            System.out.println("нарушений нет, приятного пути");
        } else if (speed <= 65) {   // (speed > 50 && speed <= 65)
            System.out.println("устное порицание и лекция на 5 минут;");
        } else if (speed <= 100) {   // (speed > 65 && speed <= 100)
            System.out.println("40 евро штрафа");
        } else if (speed <= 130) {  // (speed > 100 && speed < 130)
            System.out.println("штраф 500 евро");
        } else {
            System.out.println("штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства");
        }
    }

    public static void main(String[] args) {
        streetPoliceApplication(45); // ничего
        streetPoliceApplication(55); // занудная лекция
        streetPoliceApplication(75); // 40 евро штрафа;
        streetPoliceApplication(90);  // 40 евро штрафа;
        streetPoliceApplication(110); // 500
        streetPoliceApplication(140);  // штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного
    }
}
