/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.B0;
import ax.a6.C;
import ax.a6.D;
import ax.a6.I;
import ax.a6.O;
import ax.a6.Q;
import ax.a6.W;
import ax.a6.g;
import ax.a6.r;
import ax.a6.t;
import ax.a6.w;
import ax.a6.w0;
import ax.a6.x0;
import ax.a6.y0;
import ax.a6.z0;

final class j
implements w {
    private final g a;
    final B0 b;
    final B0 c;
    final B0 d;
    final B0 e;
    final B0 f;

    j(g g8, I object) {
        B0 b02;
        this.a = g8;
        this.b = b02 = x0.b(new Q(g8.c));
        this.c = object = z0.b(object);
        w0 w02 = new w0();
        this.d = w02;
        B0 b03 = g8.c;
        y0 y02 = r.a;
        y0 y03 = t.a;
        B0 b04 = g8.i;
        B0 b05 = g8.l;
        B0 b06 = g8.d;
        y03 = new W(b03, b02, y02, y03, b04, b05, w02, b06);
        this.e = y03;
        y02 = new O(b02, y02, y03);
        this.f = y02;
        w0.b(w02, x0.b(new D(b03, g8.e, b02, b06, (B0)object, y02)));
    }

    @Override
    public final C a() {
        return (C)this.d.a();
    }
}

