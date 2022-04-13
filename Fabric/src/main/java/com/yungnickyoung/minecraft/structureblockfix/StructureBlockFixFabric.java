package com.yungnickyoung.minecraft.structureblockfix;

import net.fabricmc.api.ModInitializer;

public class StructureBlockFixFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        StructureBlockFixCommon.init();
    }
}
