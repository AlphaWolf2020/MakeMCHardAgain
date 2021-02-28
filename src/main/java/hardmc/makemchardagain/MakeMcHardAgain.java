package hardmc.makemchardagain;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;



public final class MakeMcHardAgain extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Make MC Hard Again is Enabled! Have fun!");
        System.out.println(ChatColor.GREEN + "[HardMC] Enabled");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Make MC Hard Again is Disabled! Thanks for using my plugin!");
        System.out.println(ChatColor.RED + "[HardMC] Disabled! Shutting Down...");
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "say Nyaa! Welcome!" + event.getPlayer().getName());
    }
}
