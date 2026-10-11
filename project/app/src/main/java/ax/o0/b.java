/*
 * Decompiled with CFR 0.152.
 */
package ax.o0;

import ax.Gb.l;
import ax.n0.a;
import ax.wb.e;
import java.io.IOException;

public final class b<T>
implements ax.n0.b<T> {
    private final ax.Fb.l<a, T> a;

    public b(ax.Fb.l<? super a, ? extends T> l8) {
        l.f(l8, "produceNewData");
        this.a = l8;
    }

    @Override
    public Object a(a a8, e<? super T> e8) throws IOException {
        return this.a.invoke(a8);
    }
}

