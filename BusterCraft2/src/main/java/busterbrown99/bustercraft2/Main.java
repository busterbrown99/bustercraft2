package busterbrown99.bustercraft2;

import busterbrown99.bustercraft2.proxy.CommonProxy;
import busterbrown99.bustercraft2.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	//PREINIT
	public static void PreInit(FMLPreInitializationEvent event)
	{
		//Fuck you Kevin
	}
	        //s
	//INIT
	public static void init(FMLInitializationEvent event) {
		//fuck you kevin
		
	}
	
	//POSTINIT
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
	
}
