package program;

public class Doctor implements Staff{

    @Override
    public float getSalary() {
        return 6000;
    }

    @Override
    public int getYearsOfWork() {
        return 17; 
    }
    
}
