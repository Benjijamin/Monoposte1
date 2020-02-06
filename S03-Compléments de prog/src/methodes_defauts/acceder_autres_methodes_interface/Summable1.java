package methodes_defauts.acceder_autres_methodes_interface;

public interface Summable1 {
    int getA();

    int getB();

    default int calculateSum() {
        return getA() + getB();
    }
}