import MyFood.Facade;
import easyaccept.EasyAcceptFacade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> tests = new ArrayList<>();

        tests.add("tests/us1_1.txt");
        tests.add("tests/us1_2.txt");
        tests.add("tests/us2_1.txt");
//        tests.add("tests/us2_2.txt");
//        tests.add("tests/us3_1.txt");
//        tests.add("tests/us3_2.txt");
//        tests.add("tests/us4_1.txt");
//        tests.add("tests/us4_2.txt");

        EasyAcceptFacade eaFacade = new EasyAcceptFacade(new Facade(), tests);

        eaFacade.executeTests();

        System.out.println(eaFacade.getCompleteResults());
    }
}