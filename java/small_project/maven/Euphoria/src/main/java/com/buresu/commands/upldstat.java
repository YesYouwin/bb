package com.buresu.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.SlashCommandData;

import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class upldstat extends ListenerAdapter {
    public static final String NAME = "stat_upload";

    public static net.dv8tion.jda.api.interactions.commands.build.SlashCommandData getCommand() {
        return Commands.slash(NAME, "Upload Stats For Visual Glimpse")
        .addOption(OptionType.ATTACHMENT,"file","Upload The stat.txt file",true)
        .addOption(OptionType.STRING,"playername","Enter The Player Name",true);
    }

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (!(event.getName().equals("stat_upload"))) { return; } // Don't know why but we just return first check ifs later

        var attachment = event.getOption("file").getAsAttachment(); // Giving attachment a variable name. Since it's not String really we just use var
        String playername = event.getOption("playername").getAsString();
        event.deferReply().queue();

        attachment.getProxy().download().thenAccept(file -> { // Downloading the attachment to read internally
            try{
                String text = new String(file.readAllBytes(), StandardCharsets.UTF_8);
                event.getHook().sendMessage("File received! Looking for **"+ playername+"**\n" + "Characters read: "+text.length()).queue();
            } 
            catch (IOException e){event.getHook().sendMessage("That file ain't readable").queue();}
            }).exceptionally(error -> {
                event.getHook().sendMessage("The file download failed.").queue();
                return null;
        });
    }
}

