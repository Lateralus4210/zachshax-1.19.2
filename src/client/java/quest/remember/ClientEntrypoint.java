package quest.remember;

import net.fabricmc.api.ClientModInitializer;

public class ClientEntrypoint implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ZachsHax.LOGGER.info("ZachsHax: ClientEntrypoint initialized");
        ClientInputHandler.init();
    }
}
