/*
 * Decompiled with CFR 0.152.
 */
package ax.Sb;

import ax.Fb.l;
import ax.Sb.a;
import ax.Sb.b;
import ax.Sb.d;
import ax.Sb.k;
import ax.sb.t;

public final class e {
    public static final <E> d<E> a(int n8, a a8, l<? super E, t> l8) {
        if (n8 != -2) {
            if (n8 != -1) {
                if (n8 != 0) {
                    if (n8 != Integer.MAX_VALUE) {
                        if (a8 == a.q) {
                            return new b<E>(n8, l8);
                        }
                        return new k<E>(n8, a8, l8);
                    }
                    return new b<E>(Integer.MAX_VALUE, l8);
                }
                if (a8 == a.q) {
                    return new b<E>(0, l8);
                }
                return new k<E>(1, a8, l8);
            }
            if (a8 == a.q) {
                return new k<E>(1, a.c0, l8);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (a8 == a.q) {
            return new b<E>(d.a.a(), l8);
        }
        return new k<E>(1, a8, l8);
    }

    public static /* synthetic */ d b(int n8, a a8, l l8, int n9, Object object) {
        if ((n9 & 1) != 0) {
            n8 = 0;
        }
        if ((n9 & 2) != 0) {
            a8 = a.q;
        }
        if ((n9 & 4) != 0) {
            l8 = null;
        }
        return e.a(n8, a8, l8);
    }
}

