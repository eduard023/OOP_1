public class Human {
    int yearOfBirth;
    String name;
    String town;
    String job;

    public Human(int yearOfBirth, String name, String town, String job) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.job = job;
    }

    void greet(){
        System.out.println( "Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился в " + getYearOfBirth() + " году. Я работаю на должности " + getJob() + ". Будем знакомы!");
    }

    public int getYearOfBirth() {
        if (yearOfBirth < 0){
            yearOfBirth = 0;
        }
        return yearOfBirth;
    }

    public String getName() {
        if (name == null){
            name = "Информация не указана";
        }
        return name;
    }

    public String getTown() {
        if (town == null){
            town = "Информация не указана";
        }
        return town;
    }

    public String getJob() {
        if (job == null){
            job = "Информация не указана";
        }
        return job;
    }
}
