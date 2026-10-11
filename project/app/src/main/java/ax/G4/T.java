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

public final class T
extends Enum<T> {
    public static final /* enum */ T c0;
    private static final T[] d0;
    public static final /* enum */ T q;

    static {
        T t8;
        T t9;
        q = t9 = new T();
        c0 = t8 = new T();
        d0 = new T[]{t9, t8};
    }

    public static T valueOf(String string) {
        return Enum.valueOf(T.class, string);
    }

    public static T[] values() {
        return (T[])d0.clone();
    }

    static class b
    extends f<T> {
        public static final b b = new b();

        b() {
        }

        public T s(j j8) throws IOException, i {
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

        public void t(T t8, g g8) throws IOException, ax.T4.f {
            if (a.a[t8.ordinal()] != 1) {
                g8.s0("other");
                return;
            }
            g8.s0("is_shared_folder");
        }
    }
}

