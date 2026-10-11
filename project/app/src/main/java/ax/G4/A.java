/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.M;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;

public final class A {
    private c a;
    private M b;

    private A() {
    }

    public static A d(M m8) {
        if (m8 != null) {
            return new A().f(c.q, m8);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private A f(c c8, M m8) {
        A a8 = new A();
        a8.a = c8;
        a8.b = m8;
        return a8;
    }

    public M b() {
        if (this.a == c.q) {
            return this.b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid tag: required Tag.PATH, but was Tag.");
        stringBuilder.append(this.a.name());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean c() {
        return this.a == c.q;
    }

    public c e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof A) {
            object = (A)object;
            Object object2 = this.a;
            if (object2 != ((A)object).a) {
                return false;
            }
            if (ax.G4.A$a.a[object2.ordinal()] != 1) {
                return false;
            }
            object2 = this.b;
            object = ((A)object).b;
            return object2 == object || ((M)object2).equals(object);
            {
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.A$b.b.j(this, false);
    }

    static class b
    extends f<A> {
        public static final b b = new b();

        b() {
        }

        public A s(j j8) throws IOException, i {
            boolean bl;
            Object object;
            if (j8.j() == m.r0) {
                object = ax.v4.c.i(j8);
                j8.H();
                bl = true;
            } else {
                ax.v4.c.h(j8);
                object = ax.v4.a.q(j8);
                bl = false;
            }
            if (object != null) {
                if ("path".equals(object)) {
                    ax.v4.c.f("path", j8);
                    object = A.d(M.b.b.s(j8));
                    if (!bl) {
                        ax.v4.c.n(j8);
                        ax.v4.c.e(j8);
                    }
                    return object;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown tag: ");
                stringBuilder.append((String)object);
                throw new i(j8, stringBuilder.toString());
            }
            throw new i(j8, "Required field missing: .tag");
        }

        public void t(A a8, g object) throws IOException, ax.T4.f {
            if (ax.G4.A$a.a[a8.e().ordinal()] == 1) {
                ((g)object).o0();
                this.r("path", (g)object);
                ((g)object).o("path");
                M.b.b.t(a8.b, (g)object);
                ((g)object).m();
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unrecognized tag: ");
            ((StringBuilder)object).append((Object)a8.e());
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
    }

    public static final class c
    extends Enum<c> {
        private static final c[] c0;
        public static final /* enum */ c q;

        static {
            c c8;
            q = c8 = new c();
            c0 = new c[]{c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])c0.clone();
        }
    }
}

