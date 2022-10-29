package oop2_2;

public class Human {
    private int yearOfBirth;
    String name;
    private String town;
    String job;

    public Human(int yearOfBirth, String name, String town, String job) {
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        if (name == null || name.isBlank()){
            this.name = "Информация не указана ";
        }else {
            this.name = name;
        }
        if (job == null || job.isBlank()){
            this.job = "Информация не указана ";
        }else {
            this.job = job;
        }
    }

    void greet(){
        System.out.println( "Привет! Меня зовут " + name + ". Я из города " + getTown() + ". Я родился в " + getYearOfBirth() + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }

    public int getYearOfBirth() {
        if (yearOfBirth < 0){
            yearOfBirth = 0;
        }
        return yearOfBirth;
    }
    public String getTown() {
        return town;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0){
            yearOfBirth = 0;
        }else{
        this.yearOfBirth = yearOfBirth;
        }
    }

    public void setTown(String town) {
        if (town == null || town.isBlank()) {
            town = "Информация не указана";
        } else {
            this.town = town;
        }

    }
}


