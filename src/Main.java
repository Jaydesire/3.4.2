public class Main {

    public static void main(String[] args) {
        // write your code here
        for (Event event :
                getMovies()) {
            validEvent(event);
            System.out.println(event);
        }

        System.out.println();

        for (Event event :
                getTheatres()) {
            validEvent(event);
            System.out.println(event);
        }
        System.out.println();
        System.out.println("Все события корректны");
    }

    public static void validEvent(Event event) {
        if (event.getTitle() == null || event.getTitle().equals("") || event.getReleaseYear() == 0 || event.getAge() == 0) {
            throw new RuntimeException("Value is null");
        }

    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Кульминация", 2019, 18),
                new Movie("Конец", 2022, 21),
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Анна Каренина: Возвращение", 2019, 17),
                new Theatre("Карен Аннин", 2018, 18),

        };
    }

}
