
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modphoton.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.modphoton.block.entity.CtmdTileEntity;
import net.mcreator.modphoton.ModphotonMod;

public class ModphotonModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ModphotonMod.MODID);
	public static final RegistryObject<BlockEntityType<CtmdTileEntity>> ARCANE_TABLE = REGISTRY.register("arcane_table", () -> BlockEntityType.Builder.of(CtmdTileEntity::new, ModphotonModBlocks.ARCANE_TABLE.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
