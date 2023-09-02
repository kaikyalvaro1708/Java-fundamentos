public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo, esse é o Scream Match");
        System.out.println("Filme: Top Gun: Maverick");

        int year = 2022;
        System.out.println("Ano de lançamento: " + year);
        boolean incluidoNoPlano = true;

        //media calculada pelas 3 notas disponíveis
        double media = (9.8 + 6.3 + 8.8) / 3;
        System.out.println(media);
        String sinopse = """
                Filme Top Gun 
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                 """ + year;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);


        //Calculo de temparatura
        double temperatureEmCelsius = 30.4;
        double temperatureEmFahrenheit =  (temperatureEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperatureEmCelsius, temperatureEmFahrenheit);

        System.out.println(mensagem);

        int temperatureEmFahrenheitInteira = (int) temperatureEmFahrenheit;

        System.out.println("A temperatura em Fahrenheit inteira é: " + temperatureEmFahrenheitInteira);
    }
}