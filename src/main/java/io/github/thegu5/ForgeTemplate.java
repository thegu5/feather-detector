package io.github.thegu5;

import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = "featherdetector", name = "Feather Detector", version = "1.0")
public class ForgeTemplate {
    @Mod.EventHandler
    public void onFMLPostInitialization(FMLPostInitializationEvent event) {
        if (Loader.isModLoaded("feather")) {
            Minecraft.getMinecraft().crashed(new CrashReport("dont use feather :)", new Throwable()));
        }
    }
}
