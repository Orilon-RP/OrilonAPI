package fr.orilon.api.utils;

import net.kyori.adventure.text.Component;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ItemBuilder {
    private final ItemStack itemStack;
    private final ItemMeta itemMeta;

    public ItemBuilder(Material material) {
        this(material, 1);
    }

    public ItemBuilder(Material material, int amount) {
        this.itemStack = new ItemStack(material, amount);
        this.itemMeta = itemStack.getItemMeta();

        if (this.itemMeta == null) {
            throw new IllegalArgumentException("Le type " + itemStack.getType() + " n'est pas compatible avec les item meta !");
        }
    }

    public ItemBuilder setName(String name) {
        this.itemMeta.displayName(Component.text(name));
        return this;
    }

    public ItemBuilder setLore(Component... lore) {
        return this.setLore(Arrays.asList(lore));
    }

    public ItemBuilder setLore(List<Component> lore) {
        this.itemMeta.lore(lore);
        return this;
    }

    public ItemBuilder addEnchants(Map<Enchantment, Integer> enchantments) {
        this.itemStack.addEnchantments(enchantments);
        return this;
    }

    public ItemBuilder addEnchant(int level, Enchantment enchantment) {
        final Map<Enchantment, Integer> returnMap = new HashMap<>();
        returnMap.put(enchantment, level);
        return addEnchants(returnMap);
    }

    public ItemBuilder removeEnchants(Enchantment... enchantments) {
        for (Enchantment enchantment : enchantments) {
            this.itemStack.removeEnchantment(enchantment);
        }
        return this;
    }

    public ItemBuilder removeEnchant(Enchantment enchantment) {
        return this.removeEnchants(enchantment);
    }

    public ItemBuilder setColorArmor(DyeColor color) {
        if (this.itemStack.getType() == Material.LEATHER_BOOTS || this.itemStack.getType() == Material.LEATHER_LEGGINGS ||
                this.itemStack.getType() == Material.LEATHER_CHESTPLATE || this.itemStack.getType() == Material.LEATHER_HELMET) {
            return this.setItemMeta(LeatherArmorMeta.class, leatherArmorMeta -> leatherArmorMeta.setColor(color.getColor()));
        } else {
            throw new IllegalArgumentException("L'item n'est pas une armure en cuir !");
        }
    }

    public ItemBuilder setMaterial(Material material) {
        this.itemStack.setType(material);
        return this;
    }

    public <T extends ItemMeta> ItemBuilder setItemMeta(Class<T> itemMetaClass, Consumer<T> consumer) {
        if (itemMetaClass.isInstance(this.itemMeta)) {
            consumer.accept(itemMetaClass.cast(this.itemMeta));
        } else {
            throw new ClassCastException(itemMetaClass.getSimpleName() + " n'est pas le même ItemMeta que " + this.itemMeta.getClass().getSimpleName());
        }
        return this;
    }

    public ItemBuilder setItemMeta(Consumer<ItemMeta> consumer) {
        consumer.accept(this.itemMeta);
        return this;
    }

    public ItemMeta getItemMeta() {
        return this.itemMeta;
    }

    public ItemStack toItemStack() {
        this.itemStack.setItemMeta(itemMeta);
        return this.itemStack;
    }
}
