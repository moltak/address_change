package net.moltak.app.components;

import dagger.Component;
import net.moltak.app.actioncreator.AddressActionCreator;
import net.moltak.app.dispatcher.Dispatcher;
import net.moltak.app.modules.AddressStoreModule;
import net.moltak.app.modules.DispatcherModule;
import net.moltak.app.store.AddressStore;

import javax.inject.Singleton;

/**
 * Created by engeng on 8/12/15.
 */
@Singleton
@Component(modules = {
        AddressStoreModule.class,
        DispatcherModule.class
})
public interface AddressStoreComponents {
    Dispatcher dipatcher();
    AddressStore store();
    AddressActionCreator actionCreator();
}
