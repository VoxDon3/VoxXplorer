package ax.pb;

import java.util.Map;

/* renamed from: ax.pb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2801e extends C2794a0 {
    public int d0;
    public long e0;
    public String f0;
    public String g0;
    public String h0;
    public String i0;
    public boolean j0;
    public long k0;
    Map m0;
    String n0 = null;
    C2801e l0 = this;

    void f(C2801e c2801e) {
        c2801e.l0 = this.l0;
        this.l0 = c2801e;
    }

    @Override // ax.pb.C2794a0, java.lang.Throwable
    public String toString() {
        return "DfsReferral[pathConsumed=" + this.d0 + ",server=" + this.f0 + ",share=" + this.g0 + ",link=" + this.h0 + ",path=" + this.i0 + ",ttl=" + this.e0 + ",expiration=" + this.k0 + ",resolveHashes=" + this.j0 + "]";
    }
}
