/*
 * Decompiled with CFR 0.152.
 */
package ax.h5;

import ax.h5.b;
import ax.h5.c;
import ax.i5.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

public class d {
    private static List<c> a = new ArrayList<c>();
    private static TimeZone b = TimeZone.getDefault();

    static {
        d.c(new e());
    }

    public static b a(ax.j5.c c8, ax.e5.a a8) throws IOException, a {
        Iterator<c> iterator = a.iterator();
        while (iterator.hasNext()) {
            b b8 = iterator.next().a(c8, a8);
            if (b8 == null) continue;
            return b8;
        }
        throw new a();
    }

    public static TimeZone b() {
        return b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(c c8) {
        synchronized (d.class) {
            a.add(c8);
            return;
        }
    }

    public static class a
    extends IOException {
    }
}

