public class Main {

    public static void main(String[] args) {

        Tourist tourist1 = new Tourist("Emma Peters", 100.0, 30,false);
        Tourist tourist2 = new Tourist("Jan Janssen", 80.0, 40, false);
        Tourist tourist3 = new Tourist("Vera Mennen", 60.0, 15, false);
        Tourist tourist4 = new Tourist("Rob Botsen", 55.0, 11, false);
        Tourist tourist5 = new Tourist("Lilly Peters", 45.0, 10, true);

        Gondola gondola1 = new Gondola("Camp Bas", 500, 1100, 10);
        Gondola gondola2 = new Gondola("Central", 1100, 2050, 7);
        Gondola gondola3 = new Gondola("Plafond", 2050, 2950, 5);

        Zitlift zitlift1 = new Zitlift("Camp Bas II", 500, 1100, 10);

        WeatherForecast weatherForecast1 = new WeatherForecast(4);
        WeatherForecast weatherForecast2 = new WeatherForecast(6);
        WeatherForecast weatherForecast3 = new WeatherForecast(8);
        WeatherForecast weatherForecast4 = new WeatherForecast(11);


        gondola1.controlAccess(tourist1);
        //answer: access allowed
        gondola2.controlAccess(tourist2);
        //answer: access allowed
        gondola3.controlAccess(tourist3);
        //answer: access allowed
        gondola1.controlAccess(tourist4);
        //answer: no access allowed
        gondola2.controlAccess(tourist5);
        //answer: access allowed

        zitlift1.controlAccess(tourist1);
        //answer: no access allowed
        zitlift1.controlAccess(tourist2);
        //answer: access allowed
        zitlift1.controlAccess(tourist3);
        //answer: access allowed
        zitlift1.controlAccess(tourist4);
        //answer: access allowed
        zitlift1.controlAccess(tourist5);
        //answer: access allowed

        System.out.println(gondola1.checkWeatherForecast(weatherForecast1));
        System.out.println(gondola2.checkWeatherForecast(weatherForecast2));
        System.out.println(gondola3.checkWeatherForecast(weatherForecast3));
        System.out.println(gondola3.checkWeatherForecast(weatherForecast4));
    }


}
