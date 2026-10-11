/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import android.net.Uri;
import ax.U0.k;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class y {
    private static final AtomicLong h = new AtomicLong();
    public final long a;
    public final k b;
    public final Uri c;
    public final Map<String, List<String>> d;
    public final long e;
    public final long f;
    public final long g;

    public y(long l8, k k8, long l9) {
        this(l8, k8, k8.a, Collections.EMPTY_MAP, l9, 0L, 0L);
    }

    public y(long l8, k k8, Uri uri, Map<String, List<String>> map, long l9, long l10, long l11) {
        this.a = l8;
        this.b = k8;
        this.c = uri;
        this.d = map;
        this.e = l9;
        this.f = l10;
        this.g = l11;
    }

    public static long a() {
        return h.getAndIncrement();
    }
}

