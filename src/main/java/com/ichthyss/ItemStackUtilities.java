package com.ichthyss;

import net.kyori.adventure.text.Component;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemStackUtilities extends ItemStack {

    public ItemStack setName(Component component){

        ItemStack tmp = this;
        ItemMeta meta = this.getItemMeta();
        meta.displayName(component);
        tmp.setItemMeta(meta);

        return tmp;
    }
}
