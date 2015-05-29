package piedatasource;

import java.math.BigInteger;

import java.security.SecureRandom;

import java.util.ArrayList;
import java.util.Random;

public class PieData {
    
    private ArrayList<Data> list;

    public PieData() {
        super();
        list = new ArrayList<Data>();
        list.add(new Data("Карантин: истекло кол-во повторов операций", 49));
        list.add(new Data("Отклонено (Поручение к валютному счёту)", 5));
        list.add(new Data("Задание исполнено", 1));
        list.add(new Data("Истёк срок ожидания квитанции", 3));
    }
    
    public void setList(ArrayList<Data> list) {
        this.list = list;
    }

    public ArrayList<Data> getList() {
        return list;
    }
    
    public String makeItRain(){
        SecureRandom random = new SecureRandom();
        String newData = new BigInteger(130, random).toString(32);
        int max = 50;
        int min = 1;
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        this.list.add(new Data(newData, randomNum));
        System.err.println("Make It rain: " + newData + " " + randomNum + " [" + list.toString() + "]");
        return null;   
    }
}
