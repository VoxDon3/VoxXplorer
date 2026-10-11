package ax.b7;

import ax.i7.C2281e;
import ax.i7.E;
import ax.i7.l;
import ax.i7.p;
import ax.i7.r;
import java.io.IOException;

/* renamed from: ax.b7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1722a implements l, r {
    private final boolean a;

    public C1722a() {
        this(false);
    }

    private boolean c(p pVar) throws IOException {
        String i = pVar.i();
        if (i.equals("POST")) {
            return false;
        }
        if (!i.equals("GET") ? this.a : pVar.p().l().length() > 2048) {
            return !pVar.n().f(i);
        }
        return true;
    }

    @Override // ax.i7.l
    public void a(p pVar) throws IOException {
        if (c(pVar)) {
            String i = pVar.i();
            pVar.z("POST");
            pVar.f().f("X-HTTP-Method-Override", i);
            if (i.equals("GET")) {
                pVar.t(new E(pVar.p().clone()));
                pVar.p().clear();
            } else if (pVar.c() == null) {
                pVar.t(new C2281e());
            }
        }
    }

    @Override // ax.i7.r
    public void b(p pVar) {
        pVar.w(this);
    }

    C1722a(boolean z) {
        this.a = z;
    }
}
