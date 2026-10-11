package ax.i1;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ax.i1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2234y {
    private static final AtomicLong h = new AtomicLong();
    public final long a;
    public final ax.U0.k b;
    public final Uri c;
    public final Map<String, List<String>> d;
    public final long e;
    public final long f;
    public final long g;

    public C2234y(long j, ax.U0.k kVar, long j2) {
        this(j, kVar, kVar.a, Collections.EMPTY_MAP, j2, 0L, 0L);
    }

    public static long a() {
        return h.getAndIncrement();
    }

    public C2234y(long j, ax.U0.k kVar, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.a = j;
        this.b = kVar;
        this.c = uri;
        this.d = map;
        this.e = j2;
        this.f = j3;
        this.g = j4;
    }
}
