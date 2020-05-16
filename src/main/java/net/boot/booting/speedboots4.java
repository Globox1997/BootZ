package net.boot.booting;

import java.util.List;
import java.util.Random;

import net.boot.SpeedingItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class speedboots4 extends ArmorItem {

  public speedboots4(ArmorMaterial material, EquipmentSlot slot) {
    super(material, slot, new Item.Settings().group(ItemGroup.COMBAT));
  }

  @Override
  public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
    tooltip.add(new TranslatableText("item.boot.boots4.tooltip"));
  }

  public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
    StatusEffectInstance spd3 = new StatusEffectInstance(StatusEffect.byRawId(1), 0, 2, false, false);
    LivingEntity bob = (LivingEntity) entity;
    Random random = new Random();
    Random random2 = new Random();
    double z1 = (random.nextInt() % 27);
    double z2 = z1 / 100;
    double z3 = random2.nextInt() % 27;
    double z4 = z3 / 100;
    if (bob.getEquippedStack(EquipmentSlot.FEET).isItemEqual(new ItemStack(SpeedingItem.boots4)) && !bob.isSwimming()
        && bob.isSprinting()) {
      if (bob.isFallFlying()) {
        world.addParticle(ParticleTypes.FLAME, bob.getX(), bob.getY() + z2, bob.getZ(), 0.0D, 0.0D, 0.0D);
      } else {
        world.addParticle(ParticleTypes.FLAME, bob.getX() + z2, bob.getY(), bob.getZ() + z4, 0.0D, 0.0D, 0.0D);
      }
      bob.addStatusEffect(spd3);
    }

  }
}
