

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {
    public static void main(String[] args) {
        String BOT_TOKEN = "";
        try{
            File tokenFile = new File("src/util/token.txt");
            Scanner myReader = new Scanner(tokenFile);
            BOT_TOKEN = myReader.nextLine();

        }catch (FileNotFoundException e){
            System.out.println("An error occurred: ");
            e.printStackTrace();
        }
        JDA api = JDABuilder.createDefault(BOT_TOKEN, GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT).addEventListeners(new MyListener()).build();

    }
}


