package name;


import name.handlers.RegistryHandler;
import name.proxy.ClientProxy;
import name.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.server.FMLServerHandler;
import scala.tools.nsc.backend.icode.TypeKinds.REFERENCE;

@Mod(modid=Reference.MODID, name=Reference.NAME, version=Reference.VERSION)
public class Main
{

	@Instance
	public static Main instance;

	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static ClientProxy proxy;
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries();
	}
	@EventHandler
	public static void init(FMLInitializationEvent event)
    {
		RegistryHandler.initRegistries();
    }
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
    {
		RegistryHandler.postInitRegistries();
    }
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event)
    {
		RegistryHandler.serverInitRegistries(event);
    }
}
