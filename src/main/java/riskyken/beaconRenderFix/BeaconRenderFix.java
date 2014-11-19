package riskyken.beaconRenderFix;

import riskyken.beaconRenderFix.common.lib.LibModInfo;
import riskyken.beaconRenderFix.proxies.CommonProxy;
import riskyken.beaconRenderFix.utils.ModLogger;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LibModInfo.ID, name = LibModInfo.NAME, version = LibModInfo.VERSION)
public class BeaconRenderFix {

    @Mod.Instance(LibModInfo.ID)
    public static BeaconRenderFix instance;

    @SidedProxy(clientSide = LibModInfo.PROXY_CLIENT_CLASS, serverSide = LibModInfo.PROXY_COMMNON_CLASS)
    public static CommonProxy proxy;
    
    @Mod.EventHandler
    public void perInit(FMLPreInitializationEvent event) {
        ModLogger.log("Loading " + LibModInfo.NAME + " " + LibModInfo.VERSION);
        proxy.preInit();
        proxy.initRenderers();
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.init();
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }
}
