package io.github.evilarceus.xero.common.block;

import io.github.evilarceus.xero.Xero;
import io.github.evilarceus.xero.common.reference.Reference;
import io.github.evilarceus.xero.creativeTab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockWrapper extends Block {

    public BlockWrapper(Material material)
    {
        super(material);
    }

    public BlockWrapper()
    {
        this(Material.ROCK);
        setCreativeTab(CreativeTab.XERO);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MODID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
