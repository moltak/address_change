package net.moltak.app.store;

import net.moltak.app.actions.Action;
import net.moltak.app.dispatcher.Dispatcher;

/**
 * Created by engeng on 8/12/15.
 */
public abstract class Store {
    final Dispatcher dispatcher;

    protected Store(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    void emitStoreChange() {
        dispatcher.emitChange(changeEvent());
    }

    abstract StoreChangeEvent changeEvent();
    public abstract void onAction(Action action);

    public interface StoreChangeEvent {}
}
