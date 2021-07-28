package de.rahulbier.skyblockz.mixin.mixins;

import de.rahulbier.skyblockz.Skyblockz;
import de.rahulbier.skyblockz.utils.FontUtils;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.awt.*;

@Mixin({GuiMainMenu.class})
public class MixinGuiMainMenu extends GuiScreen {

    private FontUtils font = new FontUtils(Skyblockz.MAIN_FONT_NAME, Font.PLAIN, 16);

    @Inject(method = {"drawScreen"}, at = {@At("TAIL")}, cancellable = true)
    public void drawText(CallbackInfo callbackInfo) {
        this.font.drawStringWithShadow(Skyblockz.MOD_NAME, 1, 1, 0xa30000);
    }
}
