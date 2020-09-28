package net.boot.config;

import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;

public class particleset {

  public static DefaultParticleType particleSetting(int set) {
    switch (set) {
      case 1:
        return ParticleTypes.ANGRY_VILLAGER;
      case 2:
        return ParticleTypes.BUBBLE;
      case 3:
        return ParticleTypes.CAMPFIRE_COSY_SMOKE;
      case 4:
        return ParticleTypes.CLOUD;
      case 5:
        return ParticleTypes.CRIMSON_SPORE;
      case 6:
        return ParticleTypes.CRIT;
      case 7:
        return ParticleTypes.DOLPHIN;
      case 8:
        return ParticleTypes.DRAGON_BREATH;
      case 9:
        return ParticleTypes.DRIPPING_HONEY;
      case 10:
        return ParticleTypes.DRIPPING_LAVA;
      case 11:
        return ParticleTypes.DRIPPING_OBSIDIAN_TEAR;
      case 12:
        return ParticleTypes.ENCHANT;
      case 13:
        return ParticleTypes.END_ROD;
      case 14:
        return ParticleTypes.EXPLOSION;
      case 15:
        return ParticleTypes.FIREWORK;
      case 16:
        return ParticleTypes.FLASH;
      case 17:
        return ParticleTypes.HAPPY_VILLAGER;
      case 18:
        return ParticleTypes.HEART;
      case 19:
        return ParticleTypes.MYCELIUM;
      case 20:
        return ParticleTypes.NOTE;
      case 21:
        return ParticleTypes.PORTAL;
      case 22:
        return ParticleTypes.SOUL;
      case 23:
        return ParticleTypes.SOUL_FIRE_FLAME;
      case 24:
        return ParticleTypes.SQUID_INK;
      case 25:
        return ParticleTypes.WITCH;
      default:
        return ParticleTypes.FLAME;
    }
  }

}
