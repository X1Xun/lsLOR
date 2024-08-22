package me.xixun.lslor;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static org.bukkit.GameMode.SURVIVAL;

public class nloevent implements Listener{
    public boolean ladno = false;
    public static double x = 525;
    public static double z = 416;
    public static double y = 118;
    public static double x2 = 525;
    public static double z2 = 415;
    public static double z3 = 416;
    public static double x3 = 524;
    public static double x4 = 524;
    public static double z4 = 415;
    @EventHandler
    public void move(PlayerMoveEvent event)  {
        Player sender = event.getPlayer();
        int px = sender.getLocation().getBlockX();
        int pz = sender.getLocation().getBlockZ();
        int py = sender.getLocation().getBlockY();




        if (px == x) {
            if (pz == z) {
                sender.damage(2);
                sender.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 10, 2));

            }
        }
        if (px == x2) {
            if (pz == z2) {
                sender.damage(2);

                sender.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 10, 2));
            }
        }
        if (px == x4) {
            if (pz == z4) {
                sender.damage(2);
                sender.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 10, 2));

            }
        }
        if (px == x3) {
            if (pz == z3) {
                sender.damage(2);
                sender.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 10, 2));

            }
        }






        Location location = new Location(sender.getWorld(), x, y, z);
        World world = sender.getWorld();
        world.spawnParticle(Particle.GLOW_SQUID_INK, location, 100, 0.1, 25, 0.1, 0.1);

        GameMode xui = sender.getGameMode();

        if (xui == SURVIVAL) {

            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @e[tag=dd] as @a[distance=..20, limit=1] run damage @s 10 minecraft:magic");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @e[tag=dd] as @a[distance=..100, limit=1] run title @a times 0 100 5");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @e[tag=dd] as @a[distance=..80, limit=1] run title @s subtitle {\"text\":\"\\u0441\\u0442\\u0440\\u0435\\u043b\\u044f\\u0435\\u0442 \\u043f\\u043e \\u0432\\u0430\\u043c\",\"italic\":true,\"color\":\"dark_purple\"}");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @e[tag=dd] as @a[distance=..80, limit=1] run title @s title {\"text\":\"\\u0421\\u0438\\u0441\\u0442\\u0435\\u043c\\u0430 \\u0431\\u0435\\u0437\\u043e\\u043f\\u0430\\u0441\\u043d\\u043e\\u0441\\u0442\\u0438 \\u043a\\u043e\\u0440\\u0430\\u0431\\u043b\\u044f\",\"italic\":true,\"color\":\"dark_purple\"}");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @e[tag=dd] as @a[distance=..10] run damage @s 200 minecraft:magic");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @e[tag=dd] as @a[distance=..40, limit=1] run damage @s 5 minecraft:magic");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @e[tag=dd] as @a[distance=..60 limit=1] run damage @s 3 minecraft:magic");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "execute at @e[tag=dd] as @a[distance=..80, limit=1] run damage @s 1 minecraft:magic");
        }

    }


}
