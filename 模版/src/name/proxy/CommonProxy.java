package name.proxy;


public class CommonProxy implements IProxy
{
	
	public void registerItemRenderer(Item item, int meta, String id ) 
	{
			
	}
		
	public void registerVariantRenderer(Item item, int meta, String filename, String id) 
	{
			
	}

	@Override
	public EntityPlayer getPlayerEntityFromContext(MessageContext ctx) 
	{
        return ctx.getServerHandler().player;
	}



}
