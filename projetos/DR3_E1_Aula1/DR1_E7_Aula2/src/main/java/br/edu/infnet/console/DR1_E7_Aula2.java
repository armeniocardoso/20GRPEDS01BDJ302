package br.edu.infnet.console;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;

public class DR1_E7_Aula2 {

    public static void main(String[] args) {

        //testaString();
        //testaMatches();
        //testaSubstring();
        //testaConcatString();
        //testaConcatStringBuider();
        //testaRandom();
        //testaFormatacoes();
        //testaDate();
        //testaLocale();
        exercicio();
    }

    private static void testaString() {

        String a = "123";
        String b = new String("123");
        String c = "123";

        System.out.println("a == b " + (a == b ? "SIM" : "NAO"));
        System.out.println("a.equals(b) " + (a.equals(b) ? "SIM" : "NAO"));
        System.out.println("a == c " + (a == c ? "SIM" : "NAO"));
        System.out.println("a.equals(c) " + (a.equals(c) ? "SIM" : "NAO"));

        //Nunca use == para comparar objetos ---> use equals
    }

    private static void testaMatches() {

        String campo = "2122-8800";
        String regex1 = "[0-9]*";
        String regex2 = "\\d*";

        System.out.println("Campo " + isDigit(campo));
    }

    private static boolean isEmpty(String campo) {

        return campo == null || campo.length() == 0;
    }

    private static boolean isDigit(String campo) {

        return !isEmpty(campo) && campo.matches("\\d*");
    }

    private static void testaSubstring() {

        //                 012345678901234
        String dataHora = "20200319 202200";
        String[] campos = dataHora.split(" ");
        System.out.println("Ano  ---> " + dataHora.substring(0, 4));
        System.out.println("Mes  ---> " + dataHora.substring(4, 6));
        System.out.println("Dia  ---> " + dataHora.substring(6, 8));
        System.out.println("Hora ---> " + dataHora.substring(9));
    }

    private static void testaValueOf() {

        String valor1 = String.valueOf(40);
        String valor2 = 40 + "";
    }
    
    private static void testaConcatString() {
        
        long ini = System.currentTimeMillis();
        String resultado = "";
        for(int i = 0; i < 100_000; i++) {
            
            resultado += i;
        }
        long fim = System.currentTimeMillis();
        long dif = fim - ini;
        System.out.println("O processo levou " + dif + " millis");
    }
    
    private static void testaConcatStringBuider() {
        
        long ini = System.currentTimeMillis();
        StringBuilder resultado = new StringBuilder();
        for(int i = 0; i < 100_000; i++) {
            
            resultado.append(i);
        }
        long fim = System.currentTimeMillis();
        long dif = fim - ini;
        System.out.println("O processo levou " + dif + " millis");
    }
    
    private static void testaRandom() {
        
        //Gera um número fracionário entre 0 (inclusive) e 1 (exclusive)
        double randomico = Math.random();
        System.out.println("Randomico entre 0-50 ---> " + (int)(randomico * 50 + 1));
    }
    
    private static void testaFormatacoes() {
        
        double numero = 5678.3456;
        NumberFormat nfc = NumberFormat.getCurrencyInstance();
        NumberFormat nfp = NumberFormat.getPercentInstance();
        System.out.println("Moeda      ---> " + nfc.format(numero));
        System.out.println("Percentual ---> " + nfp.format(numero));
        DecimalFormat df = new DecimalFormat("##,#####,###");
        System.out.println("Mascara    ---> " + df.format(numero));
    }
    
    private static void testaDate() {
        
        Date agora = new Date();
        System.out.println("Agora ---> " + agora);
        Date qualquer = new Date(2020-1900, 3-1, 31);
        System.out.println("Assesment ---> " + qualquer);
        LocalDate local = LocalDate.now();
        System.out.println("Local ---> " + local);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Agora Formatado ---> " + df.format(agora));
        String dataHora = "20200319 202200";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd kkmmss");
        try {
            
            Date umaData = sdf.parse(dataHora);
            System.out.println("Uma Data        ---> " + umaData);
            System.out.println("Agora Formatado ---> " + sdf.format(agora));
        } catch (ParseException ex) {
            
            System.out.println("Erro de conversão");
        }
    }
    
    private static void testaLocale() {
        
        double numero = 5678.3456;
        Locale eua1 = new Locale("en-US");
        Locale port = new Locale("pt-PT");
        NumberFormat nfEua  = NumberFormat.getCurrencyInstance(eua1);        
        NumberFormat nfPort = NumberFormat.getCurrencyInstance(port);        
        NumberFormat nfBr   = NumberFormat.getCurrencyInstance();        
        System.out.println("Dolar ---> " + nfEua.format(numero));
        System.out.println("Euro  ---> " + nfPort.format(numero));
        System.out.println("Real  ---> " + nfBr.format(numero));
    }
    
    private static void exercicio() {
        
        double numero = 5678.3456;
        Locale [] locales = Locale.getAvailableLocales();        
        for (Locale locale : locales) {
            
            System.out.println("Pais: " + locale.getDisplayCountry() 
                    + " Idioma: " + locale.getDisplayLanguage());
            NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
            System.out.println("Moeda: " + nf.format(numero));
            DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
            System.out.println("Data: " + df.format(new Date()));
            System.out.println("--------------------------------------------------");
        }
        System.out.println("Quantos locales existem? " + locales.length);
    }
}
