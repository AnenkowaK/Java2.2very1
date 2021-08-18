public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float mass = 50;
        float height = (float) 1.68;
        float bodyMassIndex = service.calculate(mass, height);
        System.out.println(bodyMassIndex);
    }
}
