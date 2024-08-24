package ProblemSolving.KK.MapInterface;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapApp {

    public static enum DataEnum {
        Free,
        Standard,
        Premium,
        VIP,
    }

    public static void main(String[] args) {
        Map<DataEnum, String> testData = new EnumMap<>(DataEnum.class);
        testData.put(DataEnum.Free, "AUDYARI");
        testData.put(DataEnum.Standard, "ASEP");
        testData.put(DataEnum.Premium, "ASEP");
        testData.put(DataEnum.VIP, "ASEP");

        System.out.println(testData);

        System.out.println(testData.get(DataEnum.Free));
        System.out.println(testData.get(DataEnum.Standard));

        System.out.println("");
        System.out.println("");

        for (var data:testData.keySet()){
            System.out.println(data);
        }
        System.out.println("");
        System.out.println("");


        for (var data:testData.values()){
            System.out.println(data);
        }


    }
}
