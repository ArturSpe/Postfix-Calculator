package StartApp.TelegramBot;

import StartApp.StartApp;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.request.SendMessage;
public class StartAppTelegramBot {
    private final TelegramBot bot;
    private final StartApp startApp;

    public StartAppTelegramBot(String token){
        startApp = new StartAppImpl();
        bot = new TelegramBot(token);
    }

    public void runBot (){
        bot.setUpdatesListener(updates ->{
            updates.forEach(update -> {
                if (update.message() != null) {
                    SendMessage message = new SendMessage(update.message().chat().id(), startApp.start(update.message().text()));
                    bot.execute(message);
                }
            });
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }
}
