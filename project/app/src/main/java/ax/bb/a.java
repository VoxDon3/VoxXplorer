/*
 * Decompiled with CFR 0.152.
 */
package ax.bb;

import ax.db.s;
import ax.db.t;
import ax.db.x;
import ax.db.z;
import ax.gb.a;
import ax.q7.n;
import ax.u7.k;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

final class a
extends ax.gb.a {
    static final List<String> b = Collections.singletonList("X-Cloud-Trace-Context");
    static final x c = x.a().b(true).a();
    static final x d = x.b;
    static final int e = 3;
    private static final z f = z.b().b();

    a() {
    }

    private static long b(t t8) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.put(t8.j());
        return byteBuffer.getLong(0);
    }

    @Override
    public <C> void a(s object, C c8, a.c<C> c9) {
        n.o(object, "spanContext");
        n.o(c9, "setter");
        n.o(c8, "carrier");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((s)object).b().j());
        stringBuilder.append('/');
        stringBuilder.append(k.d(a.b(((s)object).a())));
        stringBuilder.append(";o=");
        object = ((s)object).c().d() ? "1" : "0";
        stringBuilder.append((String)object);
        c9.a(c8, "X-Cloud-Trace-Context", stringBuilder.toString());
    }
}

