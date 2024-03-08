package com.glackfag.weak_redstone_block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class Weak_redstone_block implements ModInitializer {

	@Override
	public void onInitialize() {
		Registry.register(Registries.BLOCK, WeakRedstoneBlock.ID, WeakRedstoneBlock.INSTANCE);
		Registry.register(Registries.ITEM, WeakRedstoneBlock.ID, new BlockItem(WeakRedstoneBlock.INSTANCE, new FabricItemSettings()));
	}
}