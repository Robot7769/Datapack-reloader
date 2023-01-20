package io.github.robot7769.datapack_reload;

import io.github.robot7769.datapack_reload.commands.DataReloader;
import org.bukkit.plugin.java.JavaPlugin;

public class Reloader extends JavaPlugin {
    @Override
    public void onEnable() {
       getCommand("datapackreload").setExecutor(new DataReloader());
    }

    @Override
    public void onDisable() {

    }
}
