package Person;

public abstract class Person {
    Job job;
    Person(){
    }
    Person(Job job){
        this.job = job;
    }
    public abstract void eat();
    public abstract void study();
    public abstract void exercise();
}
