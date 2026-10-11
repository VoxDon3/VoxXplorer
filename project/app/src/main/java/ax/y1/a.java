/*
 * Decompiled with CFR 0.152.
 */
package ax.y1;

import ax.q1.M;
import ax.q1.P;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import ax.y1.b;
import java.io.IOException;
import java.util.List;

public final class a
implements r {
    private final r a;

    public a(int n8) {
        if ((n8 & 1) != 0) {
            this.a = new P(65496, 2, "image/jpeg");
            return;
        }
        this.a = new b();
    }

    @Override
    public void a(t t8) {
        this.a.a(t8);
    }

    @Override
    public void b(long l8, long l9) {
        this.a.b(l8, l9);
    }

    @Override
    public boolean c(s s8) throws IOException {
        return this.a.c(s8);
    }

    @Override
    public void d() {
        this.a.d();
    }

    @Override
    public /* synthetic */ r e() {
        return q.b(this);
    }

    @Override
    public int f(s s8, M m8) throws IOException {
        return this.a.f(s8, m8);
    }

    public /* synthetic */ List k() {
        return q.a(this);
    }
}

