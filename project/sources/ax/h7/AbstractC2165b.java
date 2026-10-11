package ax.h7;

import ax.e7.C1984b;
import ax.g7.AbstractC2128b;
import ax.i7.s;

/* renamed from: ax.h7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2165b<T> extends AbstractC2128b<T> {
    private final Object r0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected AbstractC2165b(ax.h7.AbstractC2164a r8, java.lang.String r9, java.lang.String r10, java.lang.Object r11, java.lang.Class<T> r12) {
        /*
            r7 = this;
            r0 = 0
            if (r11 != 0) goto La
        L3:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            r5 = r0
            goto L29
        La:
            ax.k7.a r1 = new ax.k7.a
            ax.l7.c r2 = r8.k()
            r1.<init>(r2, r11)
            ax.l7.e r2 = r8.d()
            java.util.Set r2 = r2.c()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L22
            goto L24
        L22:
            java.lang.String r0 = "data"
        L24:
            ax.k7.a r0 = r1.h(r0)
            goto L3
        L29:
            r1.<init>(r2, r3, r4, r5, r6)
            r1.r0 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.h7.AbstractC2165b.<init>(ax.h7.a, java.lang.String, java.lang.String, java.lang.Object, java.lang.Class):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.g7.AbstractC2128b
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public C1984b x(s sVar) {
        return C1984b.d(o().k(), sVar);
    }

    @Override // ax.g7.AbstractC2128b
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public AbstractC2165b<T> f(String str, Object obj) {
        return (AbstractC2165b) super.f(str, obj);
    }

    @Override // ax.g7.AbstractC2128b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public AbstractC2164a o() {
        return (AbstractC2164a) super.o();
    }
}
