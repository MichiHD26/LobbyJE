package net.minecraft5333.je.plugins.builds;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class ItemBuilder {
    private ItemMeta itemMeta;
    private ItemStack itemStack;
    public ItemBuilder(Material mat){
        itemStack = new ItemStack(mat);
        itemMeta = itemStack.getItemMeta();
    }
    public ItemBuilder setDisplayName(String s){
        itemMeta.setDisplayName(s);
        return this;
    }
    public ItemBuilder setLocalizedName(String s){
        itemMeta.setLocalizedName(s);
        return this;
    }
    public ItemStack setLore(String... s){
        itemMeta.setLore(Arrays.asList(s));
        return this;
    }
    public ItemBuilder setUnbreakable(boolean s){
        itemMeta.setUnbreakable(s);
        return this;
    }
    public ItemBuilder addItemFlags(ItemFlag... s){
        itemMeta.addItemFlags(s);
        return this;
    }

    @Override
    public String toString() {
        return "Itembuilder{" +
                "itemMeta=" + itemMeta +
                ", itemStack=" + itemStack +
                '}';
    }
    public  ItemStack build(){
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
