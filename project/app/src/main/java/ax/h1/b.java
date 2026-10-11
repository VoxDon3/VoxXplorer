/*
 * Decompiled with CFR 0.152.
 */
package ax.h1;

import android.net.Uri;
import ax.P0.L;
import ax.h1.a;
import ax.m1.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class b<T extends a<T>>
implements p.a<T> {
    private final p.a<? extends T> a;
    private final List<L> b;

    public b(p.a<? extends T> a8, List<L> list) {
        this.a = a8;
        this.b = list;
    }

    public T b(Uri object, InputStream object2) throws IOException {
        object2 = (a)this.a.a((Uri)object, (InputStream)object2);
        List<L> list = this.b;
        object = object2;
        if (list != null) {
            object = list.isEmpty() ? object2 : (a)object2.a(this.b);
        }
        return (T)object;
    }
}

