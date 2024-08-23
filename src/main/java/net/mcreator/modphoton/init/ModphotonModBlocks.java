
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modphoton.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.modphoton.block.CtmdBlock;
import net.mcreator.modphoton.ModphotonMod;

public class ModphotonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ModphotonMod.MODID);
	public static final RegistryObject<Block> CTMD = REGISTRY.register("ctmd", () -> new CtmdBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
