package name.proxy;


public class ClientProxy extends CommonProxy implements IProxy
{
	 
	@Override
	public void registerItemRenderer(Item item, int meta, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	@Override
	public void registerVariantRenderer(Item item, int meta, String filename, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, filename), id));
	}
	@Override
    public EntityPlayer getPlayerEntityFromContext(MessageContext ctx)
    {

        return (ctx.side.isClient() ? Minecraft.getMinecraft().player : ctx.getServerHandler().player);
    }

}
