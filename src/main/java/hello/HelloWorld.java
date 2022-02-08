package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.*;
import org.joda.time.LocalTime;

public class HelloWorld {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
	    logger.debug("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        Albums a = new Albums();
        a.limit = "Limit";
        a.page = 1;
        a.title = "Title";
        Gson gson = new Gson();
        logger.info(greeter.getHello());
        logger.info(gson.toJson(a));
    }
}
