package com.example.chestesp;

import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.lwjgl.input.Keyboard;

@Mod(modid = ChestESPMod.MODID, name = ChestESPMod.NAME, version = ChestESPMod.VERSION)
public class ChestESPMod {
    public static final String MODID = "chestesp";
    public static final String NAME = "chestESP";
    public static final String VERSION = "alf1.0.0";
    
    private boolean isChestESPToggled = false;
    
    @Mod.Instance(MODID)
    public static ChestESPMod instance;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Pre-initialization code
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Initialization code
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
    
    @Mod.EventHandler
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            isChestESPToggled = !isChestESPToggled;
        }
    }
    
    @Mod.EventHandler
    public void onRenderWorldLast(RenderWorldLastEvent event) {
        if (isChestESPToggled) {
        }
    }
    
    @Mod.EventHandler
    public void onClientTick(TickEvent.ClientTickEvent event) {
    }
}
