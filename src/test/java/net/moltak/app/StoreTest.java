package net.moltak.app;

import net.moltak.app.store.AddressStore;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by engeng on 8/12/15.
 */
public class StoreTest {

    @Inject
    AddressStore store;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void shouldReturnsStore() {
        assertThat(store, notNullValue());
    }
}
