package ru.netology;

public class AfishaManager {
    private String[] items = new String[0];

    private int limit;

    public AfishaManager() {
        limit = 10;
    }


    public void add(String item) {
        String[] tmp = new String[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public String[] findAll() {
        return items;
    }

    public String[] findLast() {
        int resultLength;
        if (limit < items.length) {
            resultLength = limit;
        } else {
            resultLength = items.length;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;
    }


}
