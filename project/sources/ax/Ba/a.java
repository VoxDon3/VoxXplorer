package ax.Ba;

import ax.Q8.m;
import ax.Q8.t;
import java.io.IOException;

/* loaded from: classes3.dex */
public class a extends IOException {
    private final m c0;
    private final long d0;
    private final ax.K8.a q;

    public a(t tVar, String str) {
        super(String.format("%s returned %s (%d/%d): %s", tVar.h(), Long.valueOf(tVar.m()), Long.valueOf(tVar.m()), Long.valueOf(tVar.m()), str));
        this.q = ax.K8.a.l(tVar.m());
        this.d0 = tVar.m();
        this.c0 = tVar.h();
    }

    public ax.K8.a a() {
        return this.q;
    }
}
