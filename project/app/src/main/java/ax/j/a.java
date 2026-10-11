/*
 * Decompiled with CFR 0.152.
 */
package ax.j;

import android.content.Context;
import ax.Gb.l;
import ax.j.b;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a {
    private final Set<b> a = new CopyOnWriteArraySet<b>();
    private volatile Context b;

    public final void a(b b8) {
        l.f(b8, "listener");
        Context context = this.b;
        if (context != null) {
            b8.a(context);
        }
        this.a.add(b8);
    }

    public final void b() {
        this.b = null;
    }

    public final void c(Context context) {
        l.f(context, "context");
        this.b = context;
        Iterator<b> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(context);
        }
    }

    public final Context d() {
        return this.b;
    }

    public final void e(b b8) {
        l.f(b8, "listener");
        this.a.remove(b8);
    }
}

