public abstract class Event {
    private String title;
    private int releaseYear;
    private int age;

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getAge() {
        return age;
    }

    public Event(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" " + releaseYear + "г. (" + age + "+)";
    }
}


