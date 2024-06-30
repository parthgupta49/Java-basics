package interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("PowerEngine Starts");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine Stopped");
    }

    @Override
    public void acc() {
        System.out.println("PowerEngine Accerlates");
    }
}
