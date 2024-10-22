package winlyps.noMobNoDrop

import org.bukkit.plugin.java.JavaPlugin

class NoMobNoDrop : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doEntityDrops", "false")
        }
        logger.info("NoMobNoDrop plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoMobNoDrop plugin has been disabled.")
    }
}