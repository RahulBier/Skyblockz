package de.rahulbier.skyblockz.mixin;

import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.awt.*;

@Mixin(GuiMainMenu.class)
public class MixinGuiMainMenu extends GuiScreen {

    @Inject(method = "drawScreen", at = @At("TAIL"), cancellable = true)
    public void dScreen(CallbackInfo callbackInfo) {
        this.mc.fontRenderer.drawString("Test", 2, 2, new Color(255, 255, 255).getRGB());
    }

}
