package ax.m9;

import ax.Q8.C0917a;
import ax.Q8.o;
import ax.Q8.r;
import ax.Q8.t;
import ax.l9.m;
import ax.l9.n;
import ax.r9.C3016b;

/* loaded from: classes3.dex */
public class k extends i {
    private static final ax.Xd.d d = ax.Xd.f.k(k.class);
    private m b;
    private n c;

    public k(m mVar, n nVar) {
        this.b = mVar;
        this.c = nVar;
    }

    @Override // ax.m9.i
    protected void e(r rVar) throws ax.c9.e {
        if (rVar.b().i() == -1) {
            d.n("Message ID is 0xFFFFFFFFFFFFFFFF, no verification necessary");
            this.a.a(rVar);
            return;
        }
        if (rVar.f()) {
            d.n("Passthrough Signature Verification as packet is decrypted");
            this.a.a(rVar);
            return;
        }
        t b = rVar.b();
        o oVar = o.SMB2_FLAGS_SIGNED;
        if (!b.o(oVar)) {
            if (!rVar.b().o(oVar) && !rVar.g() && !rVar.h()) {
                C3016b b2 = this.b.b(Long.valueOf(rVar.b().k()));
                if (b2 != null && b2.A()) {
                    d.b("Illegal request, session requires message signing, but packet {} is not signed.", rVar);
                    this.a.a(new C0917a(rVar.b()));
                    return;
                }
            }
            this.a.a(rVar);
            return;
        }
        long k = rVar.b().k();
        if (k == 0 || rVar.b().h() == ax.Q8.m.SMB2_SESSION_SETUP) {
            this.a.a(rVar);
            return;
        }
        C3016b b3 = this.b.b(Long.valueOf(k));
        if (b3 == null) {
            d.p("Could not find session << {} >> for packet {}.", Long.valueOf(k), rVar);
            this.a.a(new C0917a(rVar.b()));
        } else if (this.c.a(rVar, b3.q(rVar.b(), false))) {
            d.s("Signature for packet {} verified.", rVar);
            this.a.a(rVar);
        } else {
            d.b("Invalid packet signature for packet {}", rVar);
            this.a.a(new C0917a(rVar.b()));
        }
    }
}
