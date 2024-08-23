package net.mcreator.modphoton.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.modphoton.block.model.CtmdBlockModel;
import net.mcreator.modphoton.block.entity.CtmdTileEntity;

public class CtmdTileRenderer extends GeoBlockRenderer<CtmdTileEntity> {
	public CtmdTileRenderer() {
		super(new CtmdBlockModel());
	}

	@Override
	public RenderType getRenderType(CtmdTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
