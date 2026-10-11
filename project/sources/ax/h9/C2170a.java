package ax.h9;

import ax.Z8.a;

/* renamed from: ax.h9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2170a {
    /* JADX WARN: Type inference failed for: r2v0, types: [ax.h9.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ax.h9.c] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ax.h9.c] */
    public static byte[] a(AbstractC2173d<?, ?> abstractC2173d) {
        C2171b b = abstractC2173d.b();
        int S = b.S();
        b.T(abstractC2173d.c().a());
        byte[] bArr = new byte[abstractC2173d.c().c() - abstractC2173d.c().a()];
        try {
            b.E(bArr);
            b.T(S);
            return bArr;
        } catch (a.b e) {
            throw new ax.k9.d("Cannot read packet bytes from buffer", e);
        }
    }
}
