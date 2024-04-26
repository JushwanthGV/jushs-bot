package com.jush;

import com.jush.commands.Ban;
import com.jush.commands.Buttons;
import com.jush.commands.Embed;
import com.jush.commands.Modals;
import com.jush.commands.Mute;
import com.jush.commands.music.NowPlaying;
import com.jush.commands.music.Play;
import com.jush.commands.Staff;
import com.jush.commands.Sum;
import com.jush.commands.UnStaff;
import com.jush.commands.Unmute;
import com.jush.commands.music.Queue;
import com.jush.commands.music.Repeat;
import com.jush.commands.music.Skip;
import com.jush.commands.music.Stop;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;


public class Main {
    static String discordToken = System.getProperty("discordToken");

    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault(discordToken).build();
        jda.addEventListener(new Listeneres());
        CommandManager manager = new CommandManager();
        manager.add(new Sum());
        manager.add(new Embed());
        manager.add(new Buttons());
        manager.add(new Modals());
        manager.add(new Ban());
        manager.add(new Mute());
        manager.add(new Staff());
        manager.add(new UnStaff());
        manager.add(new Unmute());
        manager.add(new Play());
        manager.add(new Skip());
        manager.add(new Stop());
        manager.add(new NowPlaying());
        manager.add(new Queue());
        manager.add(new Repeat());
        jda.addEventListener(manager);
    }
}