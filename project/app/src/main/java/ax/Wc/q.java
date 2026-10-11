/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Nd.i;
import ax.Wc.A;
import ax.Wc.J;
import ax.Wc.O;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.IOException;
import java.math.BigInteger;

public class q
extends A {
    static final O d0 = new O(q.class, 2){

        @Override
        A d(t0 t02) {
            return ax.Wc.q.C(t02.G());
        }
    };
    private final int c0;
    private final byte[] q;

    public q(long l8) {
        this.q = BigInteger.valueOf(l8).toByteArray();
        this.c0 = 0;
    }

    public q(BigInteger bigInteger) {
        this.q = bigInteger.toByteArray();
        this.c0 = 0;
    }

    q(byte[] byArray, boolean bl) {
        if (!ax.Wc.q.M(byArray)) {
            byte[] byArray2 = bl ? a.d(byArray) : byArray;
            this.q = byArray2;
            this.c0 = ax.Wc.q.N(byArray);
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }

    static q C(byte[] byArray) {
        return new q(byArray, false);
    }

    public static q D(J j8, boolean bl) {
        return (q)d0.e(j8, bl);
    }

    public static q E(Object object) {
        if (object != null && !(object instanceof q)) {
            if (object instanceof byte[]) {
                try {
                    object = (q)d0.b((byte[])object);
                    return object;
                }
                catch (Exception exception) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("encoding error in getInstance: ");
                    stringBuilder.append(((Object)exception).toString());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("illegal object in getInstance: ");
            stringBuilder.append(object.getClass().getName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return (q)object;
    }

    static int J(byte[] byArray, int n8, int n9) {
        int n10 = byArray.length;
        int n11 = Math.max(n8, n10 - 4);
        n8 = n9 & byArray[n11];
        n9 = n11;
        while (++n9 < n10) {
            n8 = n8 << 8 | byArray[n9] & 0xFF;
        }
        return n8;
    }

    static boolean M(byte[] byArray) {
        int n8 = byArray.length;
        if (n8 != 0) {
            return n8 != 1 && byArray[0] == byArray[1] >> 7 && !i.b("org.bouncycastle.asn1.allow_unsafe_integer");
        }
        return true;
    }

    static int N(byte[] byArray) {
        int n8;
        byte by;
        int n9 = byArray.length;
        int n10 = 0;
        while (n10 < n9 - 1 && (by = byArray[n10]) == byArray[n8 = n10 + 1] >> 7) {
            n10 = n8;
        }
        return n10;
    }

    public BigInteger G() {
        return new BigInteger(this.q);
    }

    public boolean I(int n8) {
        byte[] byArray = this.q;
        int n9 = byArray.length;
        int n10 = this.c0;
        return n9 - n10 <= 4 && ax.Wc.q.J(byArray, n10, -1) == n8;
    }

    public int K() {
        byte[] byArray = this.q;
        int n8 = byArray.length;
        int n9 = this.c0;
        if (n8 - n9 <= 4) {
            return ax.Wc.q.J(byArray, n9, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    @Override
    public int hashCode() {
        return a.l(this.q);
    }

    @Override
    boolean r(A a8) {
        if (!(a8 instanceof q)) {
            return false;
        }
        a8 = (q)a8;
        return a.b(this.q, ((q)a8).q);
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 2, this.q);
    }

    @Override
    boolean t() {
        return false;
    }

    public String toString() {
        return this.G().toString();
    }

    @Override
    int w(boolean bl) {
        return y.g(bl, this.q.length);
    }
}

