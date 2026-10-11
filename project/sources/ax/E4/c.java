package ax.E4;

import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.C3277d;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {
    public static final c c = new c().d(EnumC0074c.NOT_FOUND);
    public static final c d = new c().d(EnumC0074c.NOT_FILE);
    public static final c e = new c().d(EnumC0074c.NOT_FOLDER);
    public static final c f = new c().d(EnumC0074c.RESTRICTED_CONTENT);
    public static final c g = new c().d(EnumC0074c.OTHER);
    private EnumC0074c a;
    private String b;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0074c.values().length];
            a = iArr;
            try {
                iArr[EnumC0074c.MALFORMED_PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0074c.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC0074c.NOT_FILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[EnumC0074c.NOT_FOLDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[EnumC0074c.RESTRICTED_CONTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[EnumC0074c.OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static class b extends ax.v4.f<c> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public c a(j jVar) throws IOException, i {
            String q;
            boolean z;
            c cVar;
            if (jVar.j() == m.VALUE_STRING) {
                q = AbstractC3276c.i(jVar);
                jVar.H();
                z = true;
            } else {
                AbstractC3276c.h(jVar);
                q = AbstractC3274a.q(jVar);
                z = false;
            }
            if (q == null) {
                throw new i(jVar, "Required field missing: .tag");
            }
            if ("malformed_path".equals(q)) {
                AbstractC3276c.f("malformed_path", jVar);
                cVar = c.b(C3277d.f().a(jVar));
            } else {
                cVar = "not_found".equals(q) ? c.c : "not_file".equals(q) ? c.d : "not_folder".equals(q) ? c.e : "restricted_content".equals(q) ? c.f : c.g;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return cVar;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(c cVar, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[cVar.c().ordinal()];
            if (i == 1) {
                gVar.o0();
                r("malformed_path", gVar);
                gVar.o("malformed_path");
                C3277d.f().k(cVar.b, gVar);
                gVar.m();
                return;
            }
            if (i == 2) {
                gVar.s0("not_found");
                return;
            }
            if (i == 3) {
                gVar.s0("not_file");
                return;
            }
            if (i == 4) {
                gVar.s0("not_folder");
            } else if (i != 5) {
                gVar.s0("other");
            } else {
                gVar.s0("restricted_content");
            }
        }
    }

    /* renamed from: ax.E4.c$c, reason: collision with other inner class name */
    public enum EnumC0074c {
        MALFORMED_PATH,
        NOT_FOUND,
        NOT_FILE,
        NOT_FOLDER,
        RESTRICTED_CONTENT,
        OTHER
    }

    private c() {
    }

    public static c b(String str) {
        if (str != null) {
            return new c().e(EnumC0074c.MALFORMED_PATH, str);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private c d(EnumC0074c enumC0074c) {
        c cVar = new c();
        cVar.a = enumC0074c;
        return cVar;
    }

    private c e(EnumC0074c enumC0074c, String str) {
        c cVar = new c();
        cVar.a = enumC0074c;
        cVar.b = str;
        return cVar;
    }

    public EnumC0074c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        EnumC0074c enumC0074c = this.a;
        if (enumC0074c != cVar.a) {
            return false;
        }
        switch (a.a[enumC0074c.ordinal()]) {
            case 1:
                String str = this.b;
                String str2 = cVar.b;
                return str == str2 || str.equals(str2);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public String toString() {
        return b.b.j(this, false);
    }
}
