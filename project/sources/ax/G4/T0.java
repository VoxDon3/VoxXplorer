package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class T0 {
    public static final T0 c = new T0().d(c.ADD);
    public static final T0 d = new T0().d(c.OVERWRITE);
    private c a;
    private String b;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.OVERWRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class b extends ax.v4.f<T0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public T0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            T0 c;
            if (jVar.j() == ax.T4.m.VALUE_STRING) {
                q = AbstractC3276c.i(jVar);
                jVar.H();
                z = true;
            } else {
                AbstractC3276c.h(jVar);
                q = AbstractC3274a.q(jVar);
                z = false;
            }
            if (q == null) {
                throw new ax.T4.i(jVar, "Required field missing: .tag");
            }
            if ("add".equals(q)) {
                c = T0.c;
            } else if ("overwrite".equals(q)) {
                c = T0.d;
            } else {
                if (!"update".equals(q)) {
                    throw new ax.T4.i(jVar, "Unknown tag: " + q);
                }
                AbstractC3276c.f("update", jVar);
                c = T0.c(C3277d.f().a(jVar));
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return c;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(T0 t0, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[t0.b().ordinal()];
            if (i == 1) {
                gVar.s0("add");
                return;
            }
            if (i == 2) {
                gVar.s0("overwrite");
                return;
            }
            if (i != 3) {
                throw new IllegalArgumentException("Unrecognized tag: " + t0.b());
            }
            gVar.o0();
            r("update", gVar);
            gVar.o("update");
            C3277d.f().k(t0.b, gVar);
            gVar.m();
        }
    }

    public enum c {
        ADD,
        OVERWRITE,
        UPDATE
    }

    private T0() {
    }

    public static T0 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Value is null");
        }
        if (str.length() < 9) {
            throw new IllegalArgumentException("String is shorter than 9");
        }
        if (Pattern.matches("[0-9a-f]+", str)) {
            return new T0().e(c.UPDATE, str);
        }
        throw new IllegalArgumentException("String does not match pattern");
    }

    private T0 d(c cVar) {
        T0 t0 = new T0();
        t0.a = cVar;
        return t0;
    }

    private T0 e(c cVar, String str) {
        T0 t0 = new T0();
        t0.a = cVar;
        t0.b = str;
        return t0;
    }

    public c b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof T0)) {
            return false;
        }
        T0 t0 = (T0) obj;
        c cVar = this.a;
        if (cVar != t0.a) {
            return false;
        }
        int i = a.a[cVar.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                return false;
            }
            String str = this.b;
            String str2 = t0.b;
            if (str != str2 && !str.equals(str2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}
