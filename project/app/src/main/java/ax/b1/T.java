/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.net.Uri;
import ax.U0.k;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class T
extends IOException {
    public final Uri c0;
    public final Map<String, List<String>> d0;
    public final long e0;
    public final k q;

    public T(k k8, Uri uri, Map<String, List<String>> map, long l8, Throwable throwable) {
        super(throwable);
        this.q = k8;
        this.c0 = uri;
        this.d0 = map;
        this.e0 = l8;
    }
}

