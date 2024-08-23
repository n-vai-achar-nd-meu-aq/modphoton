
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modphoton.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.modphoton.block.display.CtmdDisplayItem;
import net.mcreator.modphoton.ModphotonMod;

public class ModphotonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ModphotonMod.MODID);
	public static final RegistryObject<Item> ARCANE_TABLE = REGISTRY.register(ModphotonModBlocks.ARCANE_TABLE.getId().getPath(), () -> new CtmdDisplayItem(ModphotonModBlocks.ARCANE_TABLE.get(), new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
