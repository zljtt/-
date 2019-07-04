 package name.handlers;



@EventBusSubscriber
public class RegistryHandler 
{
	static Minecraft mc = Minecraft.getMinecraft();

	@SubscribeEvent
	public static void registerItem(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void registerBlock(RegistryEvent.Register<Block> event)
	{ 
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
//		TileEntityHandler.registerTileEntities();
//		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCopperChest.class, new RenderCopperChest());
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event)
	{		
//		Main.proxy.registerModel(Item.getItemFromBlock(BlockInit.COPPER_CHEST), 0);
		
		for(Item item : ItemInit.ITEMS)
		{			
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}

	
	public static void preInitRegistries()
	{        
		
	

        MinecraftForge.EVENT_BUS.register(new CapabilityHandler());
        MinecraftForge.EVENT_BUS.register(new EventHandler());

        

	}
	
	public static void initRegistries()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	}

	public static void postInitRegistries() 
	{
	}
	
	public static void serverInitRegistries(FMLServerStartingEvent event)
	{
	}
}
