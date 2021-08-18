public class BmiService {
    public float calculate(float mass, float height) {
        float res= mass/(float) Math.pow(height, 2);
        return res;
    }
}
