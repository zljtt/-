package name.init;

import java.util.ArrayList;
import java.util.List;

import name.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block EXAMPLE = new BlockBase("name", Material.GOURD);
}
