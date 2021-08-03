package de.rahulbier.skyblockz;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SkyblockZ.MOD_ID)
public class SkyblockZ {

    public static Logger logger;

    public static final String MOD_ID = "skyblockz";

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }
}
