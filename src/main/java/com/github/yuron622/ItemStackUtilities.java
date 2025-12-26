package com.github.yuron622;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class ItemStackUtilities extends ItemStack {

    public ItemStackUtilities(@NotNull Material type, int amount) {
        super(type, amount);
    }

    public ItemStack getSetDisplayName(Component component){

        ItemStack tmp = this;
        ItemMeta meta = tmp.getItemMeta();
        meta.displayName(component);
        tmp.setItemMeta(meta);

        return tmp;
    }

    public ItemStack getAddLore(Component component){

        ItemStack tmp = this;
        ItemMeta meta = tmp.getItemMeta();
        List<Component> loreList = meta.lore();

        if (loreList == null){
            meta.lore(Collections.singletonList(component));

        } else {
            loreList.add(component);
            meta.lore(loreList);
        }

        tmp.setItemMeta(meta);

        return tmp;
    }


}
