package ax.M5;

/* renamed from: ax.M5.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0822q {
    private static C0822q b;
    private static final r c = new r(0, false, false, 0, 0);
    private r a;

    private C0822q() {
    }

    public static synchronized C0822q b() {
        C0822q c0822q;
        synchronized (C0822q.class) {
            try {
                if (b == null) {
                    b = new C0822q();
                }
                c0822q = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0822q;
    }

    public r a() {
        return this.a;
    }

    public final synchronized void c(r rVar) {
        if (rVar == null) {
            this.a = c;
            return;
        }
        r rVar2 = this.a;
        if (rVar2 == null || rVar2.C() < rVar.C()) {
            this.a = rVar;
        }
    }
}
