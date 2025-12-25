package com.ichthyss;

import net.kyori.adventure.text.Component;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemStackUtilities extends ItemStack {

    public ItemStack addDisplayName(Component component){

        ItemStack tmp = this;
        ItemMeta meta = tmp.getItemMeta();
        meta.displayName(component);
        tmp.setItemMeta(meta);

        return tmp;
    }

    public ItemStack addLore(List<? extends Component> list){

        ItemStack tmp = this;
        ItemMeta meta = tmp.getItemMeta();
        meta.lore(list);
        tmp.setItemMeta(meta);

        return tmp;
    }
}
