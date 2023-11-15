import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MyListener extends ListenerAdapter
{
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if(event.getAuthor().isBot()) return;
        Message message = event.getMessage();
        String content = message.getContentRaw();
        MessageChannel channel = event.getChannel();
        if(content.charAt(0)  == '!')
        {

            switch(content){
                case "!ping":
                    channel.sendMessage("Pong!").queue();
                    break;
                case "!lets":
                    channel.sendMessage("TP my kittens").queue();
                    break;
                default:
                    channel.sendMessage("This command does not exist").queue();
            }
        }

    }
}