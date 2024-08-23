package net.mcreator.modphoton.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.modphoton.init.ModphotonModBlockEntities;
import net.mcreator.modphoton.block.renderer.CtmdTileRenderer;
import net.mcreator.modphoton.ModphotonMod;

@Mod.EventBusSubscriber(modid = ModphotonMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(ModphotonModBlockEntities.ARCANE_TABLE.get(), context -> new CtmdTileRenderer());
	}
}
