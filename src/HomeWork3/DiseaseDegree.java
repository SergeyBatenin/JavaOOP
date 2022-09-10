package HomeWork3;
import java.util.Map;

public class DiseaseDegree {
    private static Map<Disease, Integer> diseaseDegree = Map.of(
            Disease.NONE, 0,
            Disease.FLU, 2,
            Disease.OSPA, 3,
            Disease.PLAGUE, 4,
            Disease.COVID, 5,
            Disease.EBOLA, 6
    );
    private Disease disease;
    private int degree;

    public DiseaseDegree(Disease disease) {
        this.disease = disease;
        this.degree = diseaseDegree.get(disease);
    }
    public DiseaseDegree() {
        this(Disease.NONE);
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return getDisease().toString();
    }
}
