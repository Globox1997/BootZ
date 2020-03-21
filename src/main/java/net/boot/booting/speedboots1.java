package net.boot.booting;

import java.util.List;
import java.util.Random;

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

public class speedboots1 extends ArmorItem {

    int zz = 0;

    public speedboots1(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new Item.Settings().group(ItemGroup.COMBAT));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.boot.boots1.tooltip"));
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        StatusEffectInstance spd = new StatusEffectInstance(StatusEffect.byRawId(1), 0, 0, false, false);
        LivingEntity bob = (LivingEntity) entity;
        Random random = new Random();
        Random random2 = new Random();
        double z1 = (random.nextInt() % 25);
        double z2 = z1 / 100;
        double z3 = random2.nextInt() % 25;
        double z4 = z3 / 100;
        if (slot == 0) {
            zz++;
            if (zz == 3) {
                zz = 0;
                if (bob.isFallFlying()) {
                    world.addParticle(ParticleTypes.FLAME, bob.getX(), bob.getY() + z2, bob.getZ(), 0.0D, 0.0D, 0.0D);
                } else {
                    world.addParticle(ParticleTypes.FLAME, bob.getX() + z2, bob.getY(), bob.getZ() + z4, 0.0D, 0.0D,
                            0.0D);
                }
            }

            bob.addStatusEffect(spd);
        }

    }
}
