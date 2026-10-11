/*
 * Decompiled with CFR 0.152.
 */
package ax.b5;

import ax.b5.g;

public final class h<F extends g> {
    protected int a;

    protected h(int n8) {
        this.a = n8;
    }

    public static <F extends g> h<F> a(F[] FArray) {
        int n8 = FArray.length;
        if (n8 <= 31) {
            int n9 = FArray.length;
            int n10 = 0;
            for (int i8 = 0; i8 < n9; ++i8) {
                F f8 = FArray[i8];
                n8 = n10;
                if (f8.d()) {
                    n8 = n10 | f8.h();
                }
                n10 = n8;
            }
            return new h<F>(n10);
        }
        throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", FArray[0].getClass().getName(), FArray.length));
    }

    public h<F> b(F f8) {
        int n8 = this.a;
        n8 = f8.h() | n8;
        if (n8 == this.a) {
            return this;
        }
        return new h<F>(n8);
    }
}

