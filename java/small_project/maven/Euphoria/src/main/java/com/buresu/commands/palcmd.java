package com.buresu.commands;

import com.buresu.codes.palindrome;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.OptionType;

public class palcmd extends ListenerAdapter {
    public static final String NAME = "palindrome";

    public static net.dv8tion.jda.api.interactions.commands.build.SlashCommandData getCommand() {
        return Commands.slash(NAME, "Checks whether a word or number is a palindrome")
        .addOption(OptionType.STRING,"content","Enter a word or number",true);
    }

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equals("palindrome")) {
            String word = event.getOption("content").getAsString();
            event.reply(palindrome.check(word) ? word + " is a Palindrome." : word + " is not a Palindrome!!!").queue();
        }
    }
}