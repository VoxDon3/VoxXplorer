/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.d;
import ax.v4.f;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

public final class T0 {
    public static final T0 c = new T0().d(ax.G4.T0$c.q);
    public static final T0 d = new T0().d(ax.G4.T0$c.c0);
    private c a;
    private String b;

    private T0() {
    }

    public static T0 c(String string) {
        if (string != null) {
            if (string.length() >= 9) {
                if (Pattern.matches("[0-9a-f]+", string)) {
                    return new T0().e(ax.G4.T0$c.d0, string);
                }
                throw new IllegalArgumentException("String does not match pattern");
            }
            throw new IllegalArgumentException("String is shorter than 9");
        }
        throw new IllegalArgumentException("Value is null");
    }

    private T0 d(c c8) {
        T0 t02 = new T0();
        t02.a = c8;
        return t02;
    }

    private T0 e(c c8, String string) {
        T0 t02 = new T0();
        t02.a = c8;
        t02.b = string;
        return t02;
    }

    public c b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof T0) {
            Object object2 = (T0)object;
            object = this.a;
            if (object != ((T0)object2).a) {
                return false;
            }
            int n8 = ax.G4.T0$a.a[((Enum)object).ordinal()];
            if (n8 != 1 && n8 != 2) {
                if (n8 != 3) {
                    return false;
                }
                object = this.b;
                object2 = ((T0)object2).b;
                if (object != object2 && !((String)object).equals(object2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return ax.G4.T0$b.b.j(this, false);
    }

    static class b
    extends f<T0> {
        public static final b b = new b();

        b() {
        }

        public T0 s(j j8) throws IOException, i {
            block6: {
                Object object;
                block10: {
                    boolean bl;
                    block8: {
                        block9: {
                            block7: {
                                if (j8.j() == m.r0) {
                                    object = ax.v4.c.i(j8);
                                    j8.H();
                                    bl = true;
                                } else {
                                    ax.v4.c.h(j8);
                                    object = ax.v4.a.q(j8);
                                    bl = false;
                                }
                                if (object == null) break block6;
                                if (!"add".equals(object)) break block7;
                                object = c;
                                break block8;
                            }
                            if (!"overwrite".equals(object)) break block9;
                            object = d;
                            break block8;
                        }
                        if (!"update".equals(object)) break block10;
                        ax.v4.c.f("update", j8);
                        object = T0.c(ax.v4.d.f().a(j8));
                    }
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

        public void t(T0 t02, g object) throws IOException, ax.T4.f {
            int n8 = ax.G4.T0$a.a[t02.b().ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        ((g)object).o0();
                        this.r("update", (g)object);
                        ((g)object).o("update");
                        ax.v4.d.f().k(t02.b, (g)object);
                        ((g)object).m();
                        return;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unrecognized tag: ");
                    ((StringBuilder)object).append((Object)t02.b());
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                ((g)object).s0("overwrite");
                return;
            }
            ((g)object).s0("add");
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        private static final c[] e0;
        public static final /* enum */ c q;

        static {
            c c8;
            c c9;
            c c10;
            q = c10 = new c();
            c0 = c9 = new c();
            d0 = c8 = new c();
            e0 = new c[]{c10, c9, c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])e0.clone();
        }
    }
}

