package net.moltak.app.store;

import com.squareup.otto.Subscribe;
import net.moltak.app.actions.Action;
import net.moltak.app.dispatcher.Dispatcher;

import javax.inject.Inject;

/**
 * Created by engeng on 8/12/15.
 */
public class AddressStore extends Store {
    @Inject AddressStore(Dispatcher dispatcher) {
        super(dispatcher);
    }

    @Override
    StoreChangeEvent changeEvent() {
        return null;
    }

    @Subscribe
    @Override
    public void onAction(Action action) {

    }
}
