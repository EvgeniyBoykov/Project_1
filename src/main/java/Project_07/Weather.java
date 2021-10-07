package Project_07;

import java.io.IOException;

public interface Weather {
    void getWeather (String city, Period period) throws IOException;
}