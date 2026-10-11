/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.c;
import ax.v4.f;
import java.io.IOException;

public final class S
extends Enum<S> {
    public static final /* enum */ S c0;
    private static final S[] d0;
    public static final /* enum */ S q;

    static {
        S s8;
        S s9;
        q = s9 = new S();
        c0 = s8 = new S();
        d0 = new S[]{s9, s8};
    }

    public static S valueOf(String string) {
        return Enum.valueOf(S.class, string);
    }

    public static S[] values() {
        return (S[])d0.clone();
    }

    static class b
    extends f<S> {
        public static final b b = new b();

        b() {
        }

        public S s(j j8) throws IOException, i {
            boolean bl;
            Object object;
            if (j8.j() == m.r0) {
                object = c.i(j8);
                j8.H();
                bl = true;
            } else {
                c.h(j8);
                object = ax.v4.a.q(j8);
                bl = false;
            }
            if (object != null) {
                object = "is_shared_folder".equals(object) ? q : c0;
                if (!bl) {
                    c.n(j8);
                    c.e(j8);
                }
                return object;
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(S s8, g g8) throws IOException, ax.T4.f {
            if (a.a[s8.ordinal()] != 1) {
                g8.s0("other");
                return;
            }
            g8.s0("is_shared_folder");
        }
    }
}

