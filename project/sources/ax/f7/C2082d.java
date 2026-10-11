package ax.f7;

import ax.i7.n;
import ax.i7.p;
import ax.i7.s;
import ax.i7.x;
import ax.m7.v;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ax.f7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2082d implements x, n {
    static final Logger d = Logger.getLogger(C2082d.class.getName());
    private final C2080b a;
    private final n b;
    private final x c;

    public C2082d(C2080b c2080b, p pVar) {
        this.a = (C2080b) v.d(c2080b);
        this.b = pVar.g();
        this.c = pVar.o();
        pVar.v(this);
        pVar.D(this);
    }

    @Override // ax.i7.n
    public boolean a(p pVar, boolean z) throws IOException {
        n nVar = this.b;
        boolean z2 = nVar != null && nVar.a(pVar, z);
        if (z2) {
            try {
                this.a.l();
                return z2;
            } catch (IOException e) {
                d.log(Level.WARNING, "exception thrown while calling server callback", (Throwable) e);
            }
        }
        return z2;
    }

    @Override // ax.i7.x
    public boolean b(p pVar, s sVar, boolean z) throws IOException {
        x xVar = this.c;
        boolean z2 = xVar != null && xVar.b(pVar, sVar, z);
        if (z2 && z && sVar.h() / 100 == 5) {
            try {
                this.a.l();
                return z2;
            } catch (IOException e) {
                d.log(Level.WARNING, "exception thrown while calling server callback", (Throwable) e);
            }
        }
        return z2;
    }
}
