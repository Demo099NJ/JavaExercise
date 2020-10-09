// Hello.java
import java.util.*;

class Weather {
    private String weather = new String();
    private boolean is_sunny = true;

    public boolean today_is_sunny() {
        return is_sunny;
    }

    public void show_weather() {
        System.out.println(weather);
        return;
    }

    public boolean set_weather(String wea) {
        weather = wea;
        if (weather == "Sunny") {
            is_sunny = true;
        }
        else {
            is_sunny = false;
        }
        return true;
    }
}

public class Hello {
    static Date date = new Date();
    static Weather weather = new Weather();
    public static int total_days = 10;

    private static void set_weather(String wea) {
        weather.set_weather(wea);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        set_weather(new String("Sunny"));

        System.out.println(date);
        //System.out.println(weather);
        weather.show_weather();
        System.out.println(total_days);

        return;
    }
}
