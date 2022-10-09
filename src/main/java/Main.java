
import StartApp.TelegramBot.StartAppTelegramBot;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Main {

    public static void main (String [] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("src/main/resources/config.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        new StartAppTelegramBot(properties.getProperty("TOKEN_BOT")).runBot();

    }
}
