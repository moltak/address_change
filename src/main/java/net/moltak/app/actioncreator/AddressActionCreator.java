package net.moltak.app.actioncreator;

import net.moltak.app.dispatcher.Dispatcher;

import javax.inject.Inject;

/**
 * Created by engeng on 8/12/15.
 */
public class AddressActionCreator implements ActionCreator {
    private final Dispatcher dispatcher;

    @Inject AddressActionCreator(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }
}
