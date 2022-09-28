package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C03_Update {
    public static void main(String[] args) {

        /*
        map.containsKey() => verdigimiz key'in map'de olup olmadigini boolean olarak doner
        map.containsValue() => bir butun olarak value'nun map'de olup olmadigini doner

        ONEMLI NOT : map.contains(value) value'nun icindeki bir parcayi bulmada ise yaramaz
                     eger value icindeki bir parcayi aratmak istiyorsak
                     map uzerinde manipulation yapmamiz lazim

                     map.get(key) => verilen key'e ait degeri dondurur
         */

        Map<Integer, String > sinifListMap = ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);
        //{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Devops, 105=Enes, Can, Tester, 106=Taha, Deniz, JDev, 107=Derya, Cem, Tester}

        System.out.println(sinifListMap.containsKey(104));// true
        System.out.println(sinifListMap.containsKey(114));// false


        System.out.println(sinifListMap.containsValue("Ali, Can, JDev"));// true

        System.out.println(sinifListMap.containsValue("JDev"));// false


        // verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim
        // Map'lerde replace tum value'yu degistirmek istersek kullanilabilir
        // kısmi degisikliklerde kullanamayiz

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        //Map'e guncelleme yapmak icin key. yenideger'i map'e eklemeliyiz
        // ornegin key 101 icin value Ali, Can, JDev
        // guncelleme icin sinifListMap.put(101,"Ali, Can, JDev") girmeliyiz

        // bunu yapabilmek icin her bir key'e ve ona ait value'ya ihtiyacim var

        Set<Integer> keySeti = sinifListMap.keySet();

        String eachValue;

        for (Integer each : keySeti) {
            eachValue=sinifListMap.get(each);
            eachValue=eachValue.replace("JDev","JavaDeveloper");
            sinifListMap.put(each,eachValue);
            /*
            Biz key'lerin tamamini aldik
            her bir key'in value'sunu getirdik
            value uzerinde degisikligi yapip
            yeni halini put(key,yeniDeger) ile map'e koyduk
             */
        }

        System.out.println(sinifListMap);


    }
}
