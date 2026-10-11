/*
 * Decompiled with CFR 0.152.
 */
package ax.Vc;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class b
implements Serializable,
Iterable<EventListener> {
    private final CopyOnWriteArrayList<EventListener> q = new CopyOnWriteArrayList();

    public int e() {
        return this.q.size();
    }

    @Override
    public Iterator<EventListener> iterator() {
        return this.q.iterator();
    }
}

