package net.freshplatform;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import dev.isxander.yacl3.api.YetAnotherConfigLib;

public class ModMenuIntegration implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> {
            YetAnotherConfigLib gui = ModConfig.HANDLER
                    .generateGui();
            return gui.generateScreen(parent);
        };
    }
}
