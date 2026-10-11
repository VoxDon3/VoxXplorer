/*
 * Decompiled with CFR 0.152.
 */
package ax.m9;

import ax.Q8.a;
import ax.Q8.m;
import ax.Q8.o;
import ax.Q8.r;
import ax.Q8.t;
import ax.Xd.d;
import ax.Xd.f;
import ax.c9.e;
import ax.h9.c;
import ax.l9.n;
import ax.m9.i;
import ax.r9.b;

public class k
extends i {
    private static final d d = f.k(k.class);
    private ax.l9.m b;
    private n c;

    public k(ax.l9.m m8, n n8) {
        this.b = m8;
        this.c = n8;
    }

    @Override
    protected void e(r r8) throws e {
        long l8;
        o o8;
        if (((t)r8.b()).i() == -1L) {
            d.n("Message ID is 0xFFFFFFFFFFFFFFFF, no verification necessary");
            this.a.a(r8);
            return;
        }
        if (r8.f()) {
            d.n("Passthrough Signature Verification as packet is decrypted");
            this.a.a(r8);
            return;
        }
        Object object = (t)r8.b();
        if (((t)object).o(o8 = o.f0)) {
            long l9 = ((t)r8.b()).k();
            if (l9 != 0L && ((t)r8.b()).h() != m.d0) {
                object = this.b.b(l9);
                if (object == null) {
                    d.p("Could not find session << {} >> for packet {}.", l9, r8);
                    this.a.a(new a((c)r8.b()));
                    return;
                }
                if (this.c.a(r8, ((b)object).q((t)r8.b(), false))) {
                    d.s("Signature for packet {} verified.", r8);
                    this.a.a(r8);
                    return;
                }
                d.b("Invalid packet signature for packet {}", r8);
                this.a.a(new a((c)r8.b()));
                return;
            }
            this.a.a(r8);
            return;
        }
        if (!((t)r8.b()).o(o8) && !r8.g() && !r8.h() && (object = this.b.b(l8 = ((t)r8.b()).k())) != null && ((b)object).A()) {
            d.b("Illegal request, session requires message signing, but packet {} is not signed.", r8);
            this.a.a(new a((c)r8.b()));
            return;
        }
        this.a.a(r8);
    }
}

