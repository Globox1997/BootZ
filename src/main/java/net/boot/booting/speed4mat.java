package net.boot.booting;

import net.boot.speed;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class speed4mat implements ArmorMaterial {
  private static final int[] BASE_DURABILITY = new int[] { speed.CONFIG.netherite_durability, 1, 1, 1 };
  private static final int[] PROTECTION_AMOUNTS = new int[] { speed.CONFIG.netherite_protection, 3, 1 };

  @Override
  public int getDurability(EquipmentSlot equipmentSlot) {
    return BASE_DURABILITY[equipmentSlot.getEntitySlotId()] * 15;
  }

  @Override
  public int getProtectionAmount(EquipmentSlot equipmentSlot) {
    return PROTECTION_AMOUNTS[equipmentSlot.getEntitySlotId()];
  }

  @Override
  public int getEnchantability() {
    return 15;
  }

  @Override
  public SoundEvent getEquipSound() {
    return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return Ingredient.ofItems(Items.NETHERITE_INGOT);
  }

  @Override
  public String getName() {
    return "boots4";
  }

  @Override
  public float getToughness() {
    return 2F;
  }

  @Override
  public float getKnockbackResistance() {
    return 1F;
  }

}