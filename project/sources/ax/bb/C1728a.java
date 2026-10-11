package ax.bb;

import ax.db.s;
import ax.db.t;
import ax.db.x;
import ax.db.z;
import ax.gb.AbstractC2134a;
import ax.q7.n;
import ax.u7.k;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: ax.bb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1728a extends AbstractC2134a {
    static final List<String> b = Collections.singletonList("X-Cloud-Trace-Context");
    static final x c = x.a().b(true).a();
    static final x d = x.b;
    static final int e = 3;
    private static final z f = z.b().b();

    C1728a() {
    }

    private static long b(t tVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.put(tVar.j());
        return allocate.getLong(0);
    }

    @Override // ax.gb.AbstractC2134a
    public <C> void a(s sVar, C c2, AbstractC2134a.c<C> cVar) {
        n.o(sVar, "spanContext");
        n.o(cVar, "setter");
        n.o(c2, "carrier");
        StringBuilder sb = new StringBuilder();
        sb.append(sVar.b().j());
        sb.append('/');
        sb.append(k.d(b(sVar.a())));
        sb.append(";o=");
        sb.append(sVar.c().d() ? "1" : "0");
        cVar.a(c2, "X-Cloud-Trace-Context", sb.toString());
    }
}
