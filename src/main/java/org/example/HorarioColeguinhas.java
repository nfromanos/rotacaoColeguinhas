package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HorarioColeguinhas
{
    public static void main( String[] args )
    {
        List<String> nicolauList = new ArrayList<>();
        List<String> cominoList = new ArrayList<>();
        List<String> matheusList = new ArrayList<>();
        List<String> renanList = new ArrayList<>();
        List<String> regatinhaList = new ArrayList<>();
        List<String> allanList = new ArrayList<>();
        List<String> claytinhoList = new ArrayList<>();

        List<List<String>> coleguinhasList = Arrays.asList(nicolauList, cominoList, matheusList, renanList, regatinhaList, allanList, claytinhoList);
        List<String> coleguinhas = Arrays.asList("Nicolau", "Comino", "Matheus", "Renan", "Regatinha", "Allan", "Claytinho");

        int week = 0;

        int dayOfWeek = 0;

        int count = 0;

        for (int i = 0; i < coleguinhas.size(); i++) {
            dayOfWeek++;
            if(dayOfWeek == 1 || dayOfWeek == 5){
                System.out.printf("Dia da semana: " + dayOfWeek + " - O colega " + coleguinhas.get(i) + " faz o plantão e todos estão de home, ninguém se vê.\n");
            }
            else{
                System.out.println("\n" + coleguinhas.get(i) + " faz o plantão e todos os restantes foram para o escritório.");
                for (int j = 0; j < coleguinhasList.size(); j++) {
                    for (int k = 0; k < coleguinhas.size(); k++) {
                        if(!(coleguinhas.get(k).equals(coleguinhas.get(i))) && !(coleguinhasList.get(j).contains(coleguinhas.get(k))) && !(k == j) && !(i == j)){
                            coleguinhasList.get(j).add(coleguinhas.get(k));
                        }
                    }
                    System.out.println("Dia da semana: " + dayOfWeek + " - O colega " + coleguinhas.get(j) + " já viu esses colegas" + coleguinhasList.get(j));
                }
            }
            if (dayOfWeek == 5){
                week++;
                dayOfWeek = 0;
                i = 0;
            }
            for (int j = 0; j < coleguinhas.size(); j++) {
                if(coleguinhasList.get(j).size() == 6){
                    count++;
                    if (count == 7){
                        System.exit(0);
                    }
                }
            }
            count = 0;
        }
    }
}
