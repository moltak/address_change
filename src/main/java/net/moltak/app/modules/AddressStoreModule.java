package net.moltak.app.modules;

import dagger.Module;
import dagger.Provides;
import net.moltak.app.actioncreator.ActionCreator;
import net.moltak.app.actioncreator.AddressActionCreator;
import net.moltak.app.store.AddressStore;
import net.moltak.app.store.Store;

import javax.inject.Singleton;

/**
 * Created by engeng on 8/12/15.
 */
@Singleton
@Module
public class AddressStoreModule {
    @Provides @Singleton Store provideAddressStore(AddressStore addressStore) {
        return addressStore;
    }

    @Provides @Singleton ActionCreator provideAddressActionCreator(AddressActionCreator addressActionCreator) {
        return addressActionCreator;
    }
}
