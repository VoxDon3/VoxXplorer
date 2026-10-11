package ax.Vb;

import ax.Qb.M0;

/* loaded from: classes3.dex */
final class N {
    public final ax.wb.i a;
    private final Object[] b;
    private final M0<Object>[] c;
    private int d;

    public N(ax.wb.i iVar, int i) {
        this.a = iVar;
        this.b = new Object[i];
        this.c = new M0[i];
    }

    public final void a(M0<?> m0, Object obj) {
        Object[] objArr = this.b;
        int i = this.d;
        objArr[i] = obj;
        M0<Object>[] m0Arr = this.c;
        this.d = i + 1;
        ax.Gb.l.d(m0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        m0Arr[i] = m0;
    }

    public final void b(ax.wb.i iVar) {
        int length = this.c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            M0<Object> m0 = this.c[length];
            ax.Gb.l.c(m0);
            m0.L(iVar, this.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
