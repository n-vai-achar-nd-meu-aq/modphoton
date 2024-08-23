package net.mcreator.modphoton.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.modphoton.block.display.CtmdDisplayItem;

public class CtmdDisplayModel extends GeoModel<CtmdDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CtmdDisplayItem animatable) {
		return new ResourceLocation("modphoton", "animations/ctmd.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CtmdDisplayItem animatable) {
		return new ResourceLocation("modphoton", "geo/ctmd.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CtmdDisplayItem entity) {
		return new ResourceLocation("modphoton", "textures/block/ctmd.png");
	}
}
