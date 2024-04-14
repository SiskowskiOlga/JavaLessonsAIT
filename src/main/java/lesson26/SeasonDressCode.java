package lesson26;

public class SeasonDressCode {
    /*
  Используя созданный enum `Season`, напишите метод, который принимает значение
   `Season` и выводит сообщение о том, как одеваться в этот сезон, используя конструкцию `switch`.
   */

        public static void dressCode(Season season) {
            switch (season) {
                case SPRING:
                    System.out.println("Весна: Носите куртку и легкую обувь.");
                    break;
                case SUMMER:
                    System.out.println("Лето: Одевайтесь в легкую, прохладную одежду и обувь.");
                    break;
                case AUTUMN:
                    System.out.println("Осень: Берегитесь дождя. Носите куртку и удобную обувь.");
                    break;
                case WINTER:
                    System.out.println("Зима: Наденьте теплую куртку, шапку, шарф и варежки.");
                    break;
                default:
                    System.out.println("Неизвестный сезон.");
            }
        }

        public static void main(String[] args) {
            lesson26.SeasonDressCode.dressCode(Season.SPRING);
            lesson26.SeasonDressCode.dressCode(Season.SUMMER);
            lesson26.SeasonDressCode.dressCode(Season.AUTUMN);
            lesson26.SeasonDressCode.dressCode(Season.WINTER);
        }
    }

