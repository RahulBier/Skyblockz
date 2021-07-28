package de.rahulbier.skyblockz.commands;

import com.google.common.collect.Lists;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;

import java.util.List;

public class CalculatorCommand extends CommandBase {

    private final List<String> aliases = Lists.newArrayList("calculator");

    @Override
    public String getName() {
        return "calc";
    }

    @Override
    public List<String> getAliases() {
        return aliases;
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "calculate";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
            sender.sendMessage(new TextComponentString("Test"));
    }
}
