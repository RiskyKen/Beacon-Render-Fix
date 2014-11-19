package riskyken.beaconRenderFix.proxies;

import net.minecraft.tileentity.TileEntityBeacon;
import riskyken.beaconRenderFix.client.render.RenderBlockBeacon;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    
    @Override
    public void preInit() {
    }

    @Override
    public void initRenderers() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBeacon.class, new RenderBlockBeacon());
    }

    @Override
    public void init() {
    }
    
    @Override
    public void postInit() {
    }
}
