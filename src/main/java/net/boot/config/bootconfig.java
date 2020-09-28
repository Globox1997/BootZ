package net.boot.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@Config(name = "boot")
@Config.Gui.Background("minecraft:textures/block/stone.png")
public class bootconfig implements ConfigData {
  @ConfigEntry.Gui.PrefixText
  public int iron_speed_boost = 0;
  public int gold_speed_boost = 1;
  public int diamond_speed_boost = 2;
  public int netherite_speed_boost = 2;
  @ConfigEntry.Gui.PrefixText
  public int iron_durability = 10;
  public int gold_durability = 13;
  public int diamond_durability = 26;
  public int netherite_durability = 32;
  @ConfigEntry.Gui.PrefixText
  public int iron_protection = 1;
  public int gold_protection = 2;
  public int diamond_protection = 3;
  public int netherite_protection = 3;
  @ConfigEntry.Gui.Tooltip(count = 6)
  public int boots_particle_effect = 0;

}