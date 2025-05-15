import entities.Alumne;
import providers.DataProvider;
import providers.DataProviderFactory;

public class Main {
    public static void main(String[] args) {
        DataProvider dataProvider = DataProviderFactory.createInstance();
        Alumne alumne = dataProvider.find(Alumne.class, 20);
        System.out.println(alumne);
    }
}
