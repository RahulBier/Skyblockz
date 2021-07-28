package de.rahulbier.skyblockz.listener;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ItemToolTipListener {
    @SubscribeEvent
    public void onTooltip(ItemTooltipEvent event) {
        if(GuiScreen.isShiftKeyDown()) {
            event.getItemStack(),
            event.getToolTip().add(String.valueOf(TextFormatting.RESET));
            event.getToolTip().add("\nTEST");
        }
    }
}
