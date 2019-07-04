package name.handlers;

import java.lang.annotation.ElementType;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;


public class EventHandler 
{
	Minecraft mc = Minecraft.getMinecraft();

	@SubscribeEvent
    public void onPlayerLogsIn(PlayerLoggedInEvent event)
    {

    }

}
