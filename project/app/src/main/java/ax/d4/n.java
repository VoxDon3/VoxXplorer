/*
 * Decompiled with CFR 0.152.
 */
package ax.d4;

import ax.g4.b;
import ax.k4.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public class n {
    private final Set<b> a = Collections.newSetFromMap(new WeakHashMap());
    private final List<b> b = new ArrayList<b>();
    private boolean c;

    public boolean a(b b8) {
        boolean bl = false;
        if (b8 == null) {
            return false;
        }
        boolean bl2 = this.a.remove(b8);
        if (this.b.remove(b8) || bl2) {
            bl = true;
        }
        if (bl) {
            b8.clear();
            b8.recycle();
        }
        return bl;
    }

    public void b() {
        Iterator<b> iterator = i.i(this.a).iterator();
        while (iterator.hasNext()) {
            this.a(iterator.next());
        }
        this.b.clear();
    }

    public void c() {
        this.c = true;
        for (b b8 : i.i(this.a)) {
            if (!b8.isRunning()) continue;
            b8.f();
            this.b.add(b8);
        }
    }

    public void d() {
        for (b b8 : i.i(this.a)) {
            if (b8.i() || b8.isCancelled()) continue;
            b8.f();
            if (!this.c) {
                b8.h();
                continue;
            }
            this.b.add(b8);
        }
    }

    public void e() {
        this.c = false;
        for (b b8 : i.i(this.a)) {
            if (b8.i() || b8.isCancelled() || b8.isRunning()) continue;
            b8.h();
        }
        this.b.clear();
    }

    public void f(b b8) {
        this.a.add(b8);
        if (!this.c) {
            b8.h();
            return;
        }
        this.b.add(b8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{numRequests=");
        stringBuilder.append(this.a.size());
        stringBuilder.append(", isPaused=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

