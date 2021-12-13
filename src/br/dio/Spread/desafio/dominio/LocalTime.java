package br.dio.Spread.desafio.dominio;

public class LocalTime {
    public static void main(String[] args) {
        String data = "11/12/2021 16:55:00";
        java.time.LocalTime hr = java.time.LocalTime.of(Integer.valueOf(data.substring(11,13)), Integer.valueOf(data.substring(13,15)));
    }
}
