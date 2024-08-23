
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modphoton.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.modphoton.ModphotonMod;

public class ModphotonModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModphotonMod.MODID);
	public static final RegistryObject<CreativeModeTab> MOD = REGISTRY.register("mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.modphoton.mod")).icon(() -> new ItemStack(ModphotonModBlocks.ARCANE_TABLE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ModphotonModBlocks.ARCANE_TABLE.get().asItem());
				tabData.accept(ModphotonModItems.ANELAGUA.get());
			})

					.build());
}
