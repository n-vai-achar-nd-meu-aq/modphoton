package net.mcreator.modphoton.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.modphoton.block.model.CtmdDisplayModel;
import net.mcreator.modphoton.block.display.CtmdDisplayItem;

public class CtmdDisplayItemRenderer extends GeoItemRenderer<CtmdDisplayItem> {
	public CtmdDisplayItemRenderer() {
		super(new CtmdDisplayModel());
	}

	@Override
	public RenderType getRenderType(CtmdDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
