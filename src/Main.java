 public class Main {
            public static void main(String[] args) {

                int startScore = 100;    // Начальный счет
                int depositAmount = 2000; // Сумма пополнения
                int bonus;               // Бонусные рубли
                int finalScore;          // Итоговый счет

                if (depositAmount > 1000) {
                    bonus = (depositAmount/100);

                } else {
                    bonus = 0;
                }

                finalScore = startScore + depositAmount + bonus;
                System.out.println("Начислены бонусы в размере " + bonus + " руб.");
                System.out.println("Общий баланс составляет " + finalScore + " руб.");

            }
        }

