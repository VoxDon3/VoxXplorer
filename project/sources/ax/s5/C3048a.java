package ax.s5;

import ax.p5.m;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: ax.s5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3048a {
    private static final C3048a e = new C0450a().b();
    private final f a;
    private final List<C3051d> b;
    private final C3049b c;
    private final String d;

    /* renamed from: ax.s5.a$a, reason: collision with other inner class name */
    public static final class C0450a {
        private f a = null;
        private List<C3051d> b = new ArrayList();
        private C3049b c = null;
        private String d = HttpUrl.FRAGMENT_ENCODE_SET;

        C0450a() {
        }

        public C0450a a(C3051d c3051d) {
            this.b.add(c3051d);
            return this;
        }

        public C3048a b() {
            return new C3048a(this.a, DesugarCollections.unmodifiableList(this.b), this.c, this.d);
        }

        public C0450a c(String str) {
            this.d = str;
            return this;
        }

        public C0450a d(C3049b c3049b) {
            this.c = c3049b;
            return this;
        }

        public C0450a e(f fVar) {
            this.a = fVar;
            return this;
        }
    }

    C3048a(f fVar, List<C3051d> list, C3049b c3049b, String str) {
        this.a = fVar;
        this.b = list;
        this.c = c3049b;
        this.d = str;
    }

    public static C0450a e() {
        return new C0450a();
    }

    @ax.X7.d(tag = 4)
    public String a() {
        return this.d;
    }

    @ax.X7.d(tag = 3)
    public C3049b b() {
        return this.c;
    }

    @ax.X7.d(tag = 2)
    public List<C3051d> c() {
        return this.b;
    }

    @ax.X7.d(tag = 1)
    public f d() {
        return this.a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
