package ax.Vc;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class b implements Serializable, Iterable<EventListener> {
    private final CopyOnWriteArrayList<EventListener> q = new CopyOnWriteArrayList<>();

    public int e() {
        return this.q.size();
    }

    @Override // java.lang.Iterable
    public Iterator<EventListener> iterator() {
        return this.q.iterator();
    }
}
