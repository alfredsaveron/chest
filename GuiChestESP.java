package com.example.chestesp;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class GuiChestESP extends GuiScreen {
    private GuiButton toggleButton;

    @Override
    public void initGui() {
        super.initGui();

        int centerX = width / 2;
        int centerY = height / 2;

        toggleButton = new GuiButton(0, centerX - 50, centerY - 10, 100, 20, "Toggle Chest ESP");
        buttonList.add(toggleButton);
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if (button == toggleButton) {
            // Handle toggle button click event
            // Activate/deactivate the chest ESP feature
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);

        // Draw additional screen elements or information
    }
}
