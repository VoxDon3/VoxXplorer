/*
 * Decompiled with CFR 0.152.
 */
package ax.j5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d {
    private static List<a> a = new ArrayList<a>();

    static {
        d.b(new ax.k5.b());
        d.b(new ax.l5.b());
    }

    public static ax.j5.b a(ax.e5.a a8) throws IOException {
        Iterator<a> iterator = a.iterator();
        while (iterator.hasNext()) {
            ax.j5.b b8 = iterator.next().a(a8);
            if (b8 == null) continue;
            return b8;
        }
        throw new b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(a a8) {
        synchronized (d.class) {
            a.add(a8);
            return;
        }
    }

    public static interface a {
        public ax.j5.b a(ax.e5.a var1) throws IOException;
    }

    public static class b
    extends IOException {
    }
}

