package string;

import java.util.LinkedList;


public class cache {

    LinkedList<String> list = new LinkedList<>();

    public int solution(int cacheSize, String[] cities) {

        int time = 0;

        if (cacheSize == 0) {
            return 5 * cities.length;
        }

        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toUpperCase();
        }

        for (String city : cities) {
            if (list.contains(city)) {
                time += 1;
                list.remove(city);
            }
            else{
                time+=5;
                if (list.size() >= cacheSize) {
                    list.remove(0);
                }
            }
            list.add(city);
        }

        return time;
    }



}
