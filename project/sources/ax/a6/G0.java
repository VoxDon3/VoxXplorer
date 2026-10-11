package ax.a6;

import ax.Y6.d;

/* loaded from: classes3.dex */
public final class G0 implements ax.Y6.c {
    private final C1417p a;
    private final M0 b;
    private final C1377G c;
    private final Object d = new Object();
    private final Object e = new Object();
    private boolean f = false;
    private boolean g = false;
    private ax.Y6.d h = new d.a().a();

    public G0(C1417p c1417p, M0 m0, C1377G c1377g) {
        this.a = c1417p;
        this.b = m0;
        this.c = c1377g;
    }

    @Override // ax.Y6.c
    public final boolean a() {
        C1417p c1417p = this.a;
        if (!c1417p.f()) {
            int a = !b() ? 0 : c1417p.a();
            if (a != 1 && a != 3) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.d) {
            z = this.f;
        }
        return z;
    }
}
