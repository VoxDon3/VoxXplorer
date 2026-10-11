package ax.l1;

import ax.P0.P;
import ax.j1.AbstractC2306d;
import ax.j1.InterfaceC2307e;
import java.util.List;

/* renamed from: ax.l1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2446E extends AbstractC2454c {
    private final int i;
    private final Object j;

    public C2446E(P p, int i, int i2) {
        this(p, i, i2, 0, null);
    }

    @Override // ax.l1.InterfaceC2445D
    public int d() {
        return 0;
    }

    @Override // ax.l1.InterfaceC2445D
    public int n() {
        return this.i;
    }

    @Override // ax.l1.InterfaceC2445D
    public Object q() {
        return this.j;
    }

    public C2446E(P p, int i, int i2, int i3, Object obj) {
        super(p, new int[]{i}, i2);
        this.i = i3;
        this.j = obj;
    }

    @Override // ax.l1.InterfaceC2445D
    public void c(long j, long j2, long j3, List<? extends AbstractC2306d> list, InterfaceC2307e[] interfaceC2307eArr) {
    }
}
