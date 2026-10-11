/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Nd.j;
import ax.Wc.A;
import ax.Wc.G;
import ax.Wc.O;
import ax.Wc.t0;
import ax.Wc.w0;
import ax.Wc.y;
import java.io.IOException;

public abstract class B
extends A
implements G {
    static final O c0 = new O(B.class, 19){

        @Override
        A d(t0 t02) {
            return B.C(t02.G());
        }
    };
    final byte[] q;

    B(String string, boolean bl) {
        if (bl && !B.D(string)) {
            throw new IllegalArgumentException("string contains illegal characters");
        }
        this.q = j.e(string);
    }

    B(byte[] byArray, boolean bl) {
        byte[] byArray2 = byArray;
        if (bl) {
            byArray2 = a.d(byArray);
        }
        this.q = byArray2;
    }

    static B C(byte[] byArray) {
        return new w0(byArray, false);
    }

    public static boolean D(String string) {
        for (int i8 = string.length() - 1; i8 >= 0; --i8) {
            char c8 = string.charAt(i8);
            if (c8 > '\u007f') {
                return false;
            }
            if ('a' <= c8 && c8 <= 'z' || 'A' <= c8 && c8 <= 'Z' || '0' <= c8 && c8 <= '9' || c8 == ' ' || c8 == ':' || c8 == '=' || c8 == '?') continue;
            switch (c8) {
                default: {
                    switch (c8) {
                        default: {
                            return false;
                        }
                        case '+': 
                        case ',': 
                        case '-': 
                        case '.': 
                        case '/': 
                    }
                }
                case '\'': 
                case '(': 
                case ')': 
            }
        }
        return true;
    }

    @Override
    public final String h() {
        return j.b(this.q);
    }

    @Override
    public final int hashCode() {
        return a.l(this.q);
    }

    @Override
    final boolean r(A a8) {
        if (!(a8 instanceof B)) {
            return false;
        }
        a8 = (B)a8;
        return a.b(this.q, ((B)a8).q);
    }

    @Override
    final void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 19, this.q);
    }

    @Override
    final boolean t() {
        return false;
    }

    public String toString() {
        return this.h();
    }

    @Override
    final int w(boolean bl) {
        return y.g(bl, this.q.length);
    }
}

