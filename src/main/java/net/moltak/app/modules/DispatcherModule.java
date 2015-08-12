package net.moltak.app.modules;

import com.squareup.otto.Bus;
import dagger.Module;
import dagger.Provides;
import net.moltak.app.dispatcher.Dispatcher;

import javax.inject.Singleton;

/**
 * Created by engeng on 8/12/15.
 */
@Singleton
@Module
public class DispatcherModule {

    final Bus bus;

    public DispatcherModule(Bus bus) {
        this.bus = bus;
    }

    @Provides @Singleton Dispatcher provideDispatcher() {
        return new Dispatcher(bus);
    }
}
