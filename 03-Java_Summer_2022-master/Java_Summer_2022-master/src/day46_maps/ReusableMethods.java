package day46_maps;

import java.util.*;

public class ReusableMethods {

    public static Map<Integer,String > mapOlustur(){
        Map<Integer,String> sinifMap= new HashMap<>();

        sinifMap.put(101,"Ali, Can, JDev");
        sinifMap.put(102,"Enes, Cem, Tester");
        sinifMap.put(103,"Taha, Emre, JDev");
        sinifMap.put(104,"Derya, Deniz, Devops");
        sinifMap.put(105,"Enes, Can, Tester");
        sinifMap.put(106,"Taha, Deniz, JDev");
        sinifMap.put(107,"Derya, Cem, Tester");


        return sinifMap;
    }


    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {

        int sira=1;

        for (String each : ogrenciMap.values()) {
            System.out.println(sira+" - "+each);
            sira++;
        }

    }


    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {

    List<String> metoddakiList = new ArrayList<>();

    String[] eachArr;

        for (String each : ogrenciMap.values()) {
            eachArr=each.split(", ");
            metoddakiList.add(eachArr[0] + " " + eachArr[1]);
        }

    return metoddakiList;
    }


    public static void BranslariYazdir(Map<Integer, String> ogrenciMap) {
        List<String> branslar = new ArrayList<>();
        String[] eachArr;

        for (String each : ogrenciMap.values()) {

            eachArr = each.split(", ");
            branslar.add(eachArr[2].toUpperCase());
        }

        Map<String,Integer> bransMap = new HashMap<>();

        for (int i = 0; i < branslar.size(); i++) {
            if (bransMap.containsKey(branslar.get(i))){
                bransMap.put(branslar.get(i),bransMap.get(branslar.get(i))+1);
            }else {
                bransMap.put(branslar.get(i),1 );
            }
        }

        System.out.println(bransMap);
        
    }


    public static void bransOgrenciSayisiYazdir(Map<Integer, String> sinifListMap) {

        // brans=branstakiOgrenciSayisi
        Map<String,Integer> bransOgrSayiMap=new TreeMap<>();

        Collection<String> valuesCollection=sinifListMap.values();

        String[] valueArr;
        String brans;
        Integer branstakiOgrSayisi;

        for (String each: valuesCollection) {
            valueArr=each.split(", ");
            brans=valueArr[2];

            // brans'in bransOgrSayiMapinde key olarak daha onceden eklenip eklenmedigini kontrol etmeliyiz
            if (!bransOgrSayiMap.containsKey(brans)){
                bransOgrSayiMap.put(brans,1);
            }else {
                branstakiOgrSayisi= bransOgrSayiMap.get(brans);
                bransOgrSayiMap.put(brans,++branstakiOgrSayisi);
            }
        }
        System.out.println(bransOgrSayiMap);

    }


    public static void entryYazdir(Map<Integer, String> sinifListMap) {

        Set<Map.Entry<Integer, String>> sinifListEntrySeti = sinifListMap.entrySet();

        for (Map.Entry<Integer, String> enrty : sinifListEntrySeti) {
            System.out.println(enrty);
        }

    }
}
