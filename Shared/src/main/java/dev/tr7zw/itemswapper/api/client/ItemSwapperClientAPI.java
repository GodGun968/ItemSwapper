package dev.tr7zw.itemswapper.api.client;

import dev.tr7zw.itemswapper.ItemSwapperSharedMod;

public class ItemSwapperClientAPI {

    private static final ItemSwapperClientAPI INSTANCE = new ItemSwapperClientAPI();
    private final ItemSwapperSharedMod modInstance = ItemSwapperSharedMod.instance;

    private ItemSwapperClientAPI() {

    }

    public static ItemSwapperClientAPI getInstance() {
        return INSTANCE;
    }

    /**
     * These providers will be called before the inventory gets checked. Example
     * usecase: systems that suck up picked up items, and that now should get used
     * up before the inventory.
     * 
     * @param provider
     */
    public void registerEarlyItemProvider(ItemProvider provider) {
        modInstance.getClientProviderManager().registerEarlyItemProvider(provider);
    }

    /**
     * These providers will be called after the inventory gets checked. Example
     * usecase: Checking remote storage like enderchests/refined storage
     * 
     * @param provider
     */
    public void registerLateItemProvider(ItemProvider provider) {
        modInstance.getClientProviderManager().registerLateItemProvider(provider);
    }

    /**
     * Register a {@link ContainerProvider} that can grab items out of containers
     * inside the players inventory
     * 
     * @param provider
     */
    public void registerContainerProvider(ContainerProvider provider) {

    }

}