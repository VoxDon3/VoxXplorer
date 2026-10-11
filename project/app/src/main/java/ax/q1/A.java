/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.S0.a;
import ax.S0.d0;
import ax.q1.B;
import ax.q1.N;
import ax.q1.O;

public final class A
implements N {
    private final B a;
    private final long b;

    public A(B b8, long l8) {
        this.a = b8;
        this.b = l8;
    }

    private O a(long l8, long l9) {
        return new O(l8 * 1000000L / (long)this.a.e, this.b + l9);
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public N.a l(long l8) {
        ax.S0.a.i(this.a.k);
        Object object = this.a;
        Object object2 = ((B)object).k;
        long[] lArray = ((B.a)object2).a;
        object2 = ((B.a)object2).b;
        int n8 = d0.h(lArray, ((B)object).i(l8), true, false);
        Object object3 = 0L;
        long l9 = n8 == -1 ? 0L : lArray[n8];
        if (n8 != -1) {
            object3 = object2[n8];
        }
        object = this.a(l9, (long)object3);
        if (((O)object).a != l8 && n8 != lArray.length - 1) {
            return new N.a((O)object, this.a(lArray[++n8], (long)object2[n8]));
        }
        return new N.a((O)object);
    }

    @Override
    public long n() {
        return this.a.f();
    }
}

