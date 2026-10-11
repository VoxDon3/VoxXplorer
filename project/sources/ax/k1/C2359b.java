package ax.k1;

import ax.N1.j;
import ax.N1.k;
import ax.N1.t;

/* renamed from: ax.k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2359b extends j {
    private final t p;

    public C2359b(String str, t tVar) {
        super(str);
        this.p = tVar;
    }

    @Override // ax.N1.j
    protected k C(byte[] bArr, int i, boolean z) {
        if (z) {
            this.p.a();
        }
        return this.p.b(bArr, 0, i);
    }
}
