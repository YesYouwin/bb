package com.buresu;

import com.buresu.commands.palcmd;
import com.buresu.commands.embed;
import com.buresu.commands.upldstat;
import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class Bot {
    public static void main(String[] args) throws InterruptedException{
        Dotenv dotenv = Dotenv.load();
        String token = dotenv.get("DISCORD_TOKEN"); 
        
        if (token == null || token.isBlank()){ 
            throw new IllegalStateException("Missing DISCORD_TOKEN in .env ");
        }

        JDA jda = JDABuilder.createDefault(token)
            .setActivity(Activity.playing("with Balls"))
            .addEventListeners(new palcmd(), new upldstat(), new embed())
            .build(); 
        jda.awaitReady();

        var guild = jda.getGuildById("1282315118373507103");
        
        if (guild == null) {
            System.err.println("Guild not found!");
            jda.shutdown();
            return;
        }
        
        guild.upsertCommand(palcmd.getCommand()).queue(
            success -> System.out.println("Registered /palindrome in " + guild.getName()),
            error -> System.err.println("Registration Failed For /palcmd: " + error.getMessage()));

        guild.upsertCommand(upldstat.getCommand()).queue(
            success -> System.out.println("Registered /upldstat in " + guild.getName()),
            error -> System.err.println("Registration Failed For /upldstat: " + error.getMessage()));

        guild.upsertCommand(embed.getCommand()).queue(
            success -> System.out.println("Registered /embed in " + guid.getName()),
            error -> System.err.println("Registration Failed For /embed: "+ error.getMessage());
        )
    }
}
