package com.buresu.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.OptionType;

public class embed extends ListenerAdapter{
    public static final String NAME = "embed";

    public static net.dv8tion.jda.api.interactions.commands.build.SlashCommandData getCommand() {
        return Commands.slash(NAME, "Returns Embed")
        .addOption(OptionType.STRING,"content","Enter a word or number",true);
}