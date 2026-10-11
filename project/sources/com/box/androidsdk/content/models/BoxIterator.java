package com.box.androidsdk.content.models;

import ax.O4.d;
import com.box.androidsdk.content.models.BoxJsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class BoxIterator<E extends BoxJsonObject> extends BoxJsonObject implements Iterable<E> {
    private static final long serialVersionUID = 8036181424029520417L;

    public Long C() {
        return t("total_count");
    }

    public E D(int i) {
        return E(I(), i);
    }

    public E E(BoxJsonObject.b<E> bVar, int i) {
        return G().get(i);
    }

    public ArrayList<E> G() {
        return (ArrayList<E>) s(I(), "entries");
    }

    protected abstract BoxJsonObject.b<E> I();

    public Long J() {
        return t("offset");
    }

    @Override // com.box.androidsdk.content.models.BoxJsonObject
    public void i(d dVar) {
        super.i(dVar);
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return G() == null ? Collections.EMPTY_LIST.iterator() : G().iterator();
    }
}
