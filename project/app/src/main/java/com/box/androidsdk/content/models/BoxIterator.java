/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.models;

import ax.O4.d;
import com.box.androidsdk.content.models.BoxJsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public abstract class BoxIterator<E extends BoxJsonObject>
extends BoxJsonObject
implements Iterable<E> {
    private static final long serialVersionUID = 8036181424029520417L;

    public Long C() {
        return this.t("total_count");
    }

    public E D(int n8) {
        return this.E(this.I(), n8);
    }

    public E E(BoxJsonObject.b<E> b8, int n8) {
        return (E)((BoxJsonObject)this.G().get(n8));
    }

    public ArrayList<E> G() {
        return this.s(this.I(), "entries");
    }

    protected abstract BoxJsonObject.b<E> I();

    public Long J() {
        return this.t("offset");
    }

    @Override
    public void i(d d8) {
        super.i(d8);
    }

    @Override
    public Iterator<E> iterator() {
        if (this.G() == null) {
            return Collections.EMPTY_LIST.iterator();
        }
        return this.G().iterator();
    }
}

