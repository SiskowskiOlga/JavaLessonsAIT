package konsultation;

   /*
   Создайте enum `Season`, который включает четыре времени года:
   `SPRING`, `SUMMER`, `AUTUMN`, `WINTER`.
   Напишите метод в этом enum, который возвращает рекомендуемую активность для каждого сезона
   (например, лыжи зимой).
    */
   public enum Season {
       SPRING,
       SUMMER,
       AUTUMN,
       WINTER;

       public String getActivity() {
           switch (this) {
               case SPRING:
                   return "Пикник в парке";
               case SUMMER:
                   return "Купание на пляже";
               case AUTUMN:
                   return "Прогулка по лесу сбор грибов";
               case WINTER:
                   return "Лыжи или сноуборд на горнолыжном курорте";
               default:
                   return "Нет рекомендации для этого сезона";
           }
       }

       public static void main(String[] args) {
           for (Season season : Season.values()) {
               System.out.println("Время года: " + season + ", Рекомендуемая активность: " + season.getActivity());
           }
       }
   }


