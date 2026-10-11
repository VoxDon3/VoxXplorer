package ax.G4;

import ax.G4.M;
import ax.G4.S;
import ax.G4.S0;
import ax.G4.T;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class W {
    public static final W g = new W().q(c.CANT_COPY_SHARED_FOLDER);
    public static final W h = new W().q(c.CANT_NEST_SHARED_FOLDER);
    public static final W i = new W().q(c.CANT_MOVE_FOLDER_INTO_ITSELF);
    public static final W j = new W().q(c.TOO_MANY_FILES);
    public static final W k = new W().q(c.DUPLICATED_OR_NESTED_PATHS);
    public static final W l = new W().q(c.CANT_TRANSFER_OWNERSHIP);
    public static final W m = new W().q(c.INSUFFICIENT_QUOTA);
    public static final W n = new W().q(c.INTERNAL_ERROR);
    public static final W o = new W().q(c.CANT_MOVE_SHARED_FOLDER);
    public static final W p = new W().q(c.OTHER);
    private c a;
    private M b;
    private S0 c;
    private S0 d;
    private T e;
    private S f;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.FROM_LOOKUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.FROM_WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.TO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.CANT_COPY_SHARED_FOLDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.CANT_NEST_SHARED_FOLDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.CANT_MOVE_FOLDER_INTO_ITSELF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[c.TOO_MANY_FILES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[c.DUPLICATED_OR_NESTED_PATHS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[c.CANT_TRANSFER_OWNERSHIP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[c.INSUFFICIENT_QUOTA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[c.INTERNAL_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[c.CANT_MOVE_SHARED_FOLDER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[c.CANT_MOVE_INTO_VAULT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[c.CANT_MOVE_INTO_FAMILY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[c.OTHER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    static class b extends ax.v4.f<W> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public W a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            W w;
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
            if ("from_lookup".equals(q)) {
                AbstractC3276c.f("from_lookup", jVar);
                w = W.h(M.b.b.a(jVar));
            } else if ("from_write".equals(q)) {
                AbstractC3276c.f("from_write", jVar);
                w = W.i(S0.b.b.a(jVar));
            } else if ("to".equals(q)) {
                AbstractC3276c.f("to", jVar);
                w = W.p(S0.b.b.a(jVar));
            } else if ("cant_copy_shared_folder".equals(q)) {
                w = W.g;
            } else if ("cant_nest_shared_folder".equals(q)) {
                w = W.h;
            } else if ("cant_move_folder_into_itself".equals(q)) {
                w = W.i;
            } else if ("too_many_files".equals(q)) {
                w = W.j;
            } else if ("duplicated_or_nested_paths".equals(q)) {
                w = W.k;
            } else if ("cant_transfer_ownership".equals(q)) {
                w = W.l;
            } else if ("insufficient_quota".equals(q)) {
                w = W.m;
            } else if ("internal_error".equals(q)) {
                w = W.n;
            } else if ("cant_move_shared_folder".equals(q)) {
                w = W.o;
            } else if ("cant_move_into_vault".equals(q)) {
                AbstractC3276c.f("cant_move_into_vault", jVar);
                w = W.g(T.b.b.a(jVar));
            } else if ("cant_move_into_family".equals(q)) {
                AbstractC3276c.f("cant_move_into_family", jVar);
                w = W.f(S.b.b.a(jVar));
            } else {
                w = W.p;
            }
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return w;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(W w, ax.T4.g gVar) throws IOException, ax.T4.f {
            switch (a.a[w.o().ordinal()]) {
                case 1:
                    gVar.o0();
                    r("from_lookup", gVar);
                    gVar.o("from_lookup");
                    M.b.b.k(w.b, gVar);
                    gVar.m();
                    break;
                case 2:
                    gVar.o0();
                    r("from_write", gVar);
                    gVar.o("from_write");
                    S0.b.b.k(w.c, gVar);
                    gVar.m();
                    break;
                case 3:
                    gVar.o0();
                    r("to", gVar);
                    gVar.o("to");
                    S0.b.b.k(w.d, gVar);
                    gVar.m();
                    break;
                case 4:
                    gVar.s0("cant_copy_shared_folder");
                    break;
                case 5:
                    gVar.s0("cant_nest_shared_folder");
                    break;
                case 6:
                    gVar.s0("cant_move_folder_into_itself");
                    break;
                case 7:
                    gVar.s0("too_many_files");
                    break;
                case 8:
                    gVar.s0("duplicated_or_nested_paths");
                    break;
                case 9:
                    gVar.s0("cant_transfer_ownership");
                    break;
                case 10:
                    gVar.s0("insufficient_quota");
                    break;
                case 11:
                    gVar.s0("internal_error");
                    break;
                case 12:
                    gVar.s0("cant_move_shared_folder");
                    break;
                case 13:
                    gVar.o0();
                    r("cant_move_into_vault", gVar);
                    gVar.o("cant_move_into_vault");
                    T.b.b.k(w.e, gVar);
                    gVar.m();
                    break;
                case 14:
                    gVar.o0();
                    r("cant_move_into_family", gVar);
                    gVar.o("cant_move_into_family");
                    S.b.b.k(w.f, gVar);
                    gVar.m();
                    break;
                default:
                    gVar.s0("other");
                    break;
            }
        }
    }

    public enum c {
        FROM_LOOKUP,
        FROM_WRITE,
        TO,
        CANT_COPY_SHARED_FOLDER,
        CANT_NEST_SHARED_FOLDER,
        CANT_MOVE_FOLDER_INTO_ITSELF,
        TOO_MANY_FILES,
        DUPLICATED_OR_NESTED_PATHS,
        CANT_TRANSFER_OWNERSHIP,
        INSUFFICIENT_QUOTA,
        INTERNAL_ERROR,
        CANT_MOVE_SHARED_FOLDER,
        CANT_MOVE_INTO_VAULT,
        CANT_MOVE_INTO_FAMILY,
        OTHER
    }

    private W() {
    }

    public static W f(S s) {
        if (s != null) {
            return new W().r(c.CANT_MOVE_INTO_FAMILY, s);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static W g(T t) {
        if (t != null) {
            return new W().s(c.CANT_MOVE_INTO_VAULT, t);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static W h(M m2) {
        if (m2 != null) {
            return new W().t(c.FROM_LOOKUP, m2);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static W i(S0 s0) {
        if (s0 != null) {
            return new W().u(c.FROM_WRITE, s0);
        }
        throw new IllegalArgumentException("Value is null");
    }

    public static W p(S0 s0) {
        if (s0 != null) {
            return new W().v(c.TO, s0);
        }
        throw new IllegalArgumentException("Value is null");
    }

    private W q(c cVar) {
        W w = new W();
        w.a = cVar;
        return w;
    }

    private W r(c cVar, S s) {
        W w = new W();
        w.a = cVar;
        w.f = s;
        return w;
    }

    private W s(c cVar, T t) {
        W w = new W();
        w.a = cVar;
        w.e = t;
        return w;
    }

    private W t(c cVar, M m2) {
        W w = new W();
        w.a = cVar;
        w.b = m2;
        return w;
    }

    private W u(c cVar, S0 s0) {
        W w = new W();
        w.a = cVar;
        w.c = s0;
        return w;
    }

    private W v(c cVar, S0 s0) {
        W w = new W();
        w.a = cVar;
        w.d = s0;
        return w;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof W)) {
            return false;
        }
        W w = (W) obj;
        c cVar = this.a;
        if (cVar != w.a) {
            return false;
        }
        switch (a.a[cVar.ordinal()]) {
            case 1:
                M m2 = this.b;
                M m3 = w.b;
                return m2 == m3 || m2.equals(m3);
            case 2:
                S0 s0 = this.c;
                S0 s02 = w.c;
                return s0 == s02 || s0.equals(s02);
            case 3:
                S0 s03 = this.d;
                S0 s04 = w.d;
                return s03 == s04 || s03.equals(s04);
            case 13:
                T t = this.e;
                T t2 = w.e;
                if (t != t2 && !t.equals(t2)) {
                    return false;
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return true;
            case 14:
                S s = this.f;
                S s2 = w.f;
                return s == s2 || s.equals(s2);
            case 15:
                return true;
            default:
                return false;
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public M j() {
        if (this.a == c.FROM_LOOKUP) {
            return this.b;
        }
        throw new IllegalStateException("Invalid tag: required Tag.FROM_LOOKUP, but was Tag." + this.a.name());
    }

    public S0 k() {
        if (this.a == c.FROM_WRITE) {
            return this.c;
        }
        throw new IllegalStateException("Invalid tag: required Tag.FROM_WRITE, but was Tag." + this.a.name());
    }

    public boolean l() {
        return this.a == c.FROM_LOOKUP;
    }

    public boolean m() {
        return this.a == c.FROM_WRITE;
    }

    public boolean n() {
        return this.a == c.INSUFFICIENT_QUOTA;
    }

    public c o() {
        return this.a;
    }

    public String toString() {
        return b.b.j(this, false);
    }
}
