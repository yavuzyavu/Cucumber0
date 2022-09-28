package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntryUpdate {
    public static void main(String[] args) {

        // soy ismi can olanlarin bransini DataScience yapalim

        Map<Integer,String> sinifListMap = ReusableMethods.mapOlustur();

        // Entry'leri alalim
        Set<Map.Entry<Integer,String>> entrySeti= sinifListMap.entrySet();

        String entryValue;
        String[] entryArr;

        for (Map.Entry<Integer,String> each : entrySeti){
            entryValue=each.getValue();
            entryArr=entryValue.split(", ");

            if (entryArr[1].equals("Can")){
                entryArr[2]="DataScience";
                each.setValue(entryArr[0]+", "+entryArr[1]+", "+entryArr[2]);
            }
        }

        System.out.println(sinifListMap);

    }
}
