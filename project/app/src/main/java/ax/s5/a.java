/*
 * Decompiled with CFR 0.152.
 */
package ax.s5;

import ax.p5.m;
import ax.s5.b;
import ax.s5.d;
import ax.s5.f;
import java.util.ArrayList;
import java.util.List;

public final class a {
    private static final a e = new a().b();
    private final f a;
    private final List<d> b;
    private final b c;
    private final String d;

    a(f f8, List<d> list, b b8, String string) {
        this.a = f8;
        this.b = list;
        this.c = b8;
        this.d = string;
    }

    public static a e() {
        return new a();
    }

    @ax.X7.d(tag=4)
    public String a() {
        return this.d;
    }

    @ax.X7.d(tag=3)
    public b b() {
        return this.c;
    }

    @ax.X7.d(tag=2)
    public List<d> c() {
        return this.b;
    }

    @ax.X7.d(tag=1)
    public f d() {
        return this.a;
    }

    public byte[] f() {
        return m.a(this);
    }

    public static final class a {
        private f a = null;
        private List<d> b = new ArrayList<d>();
        private b c = null;
        private String d = "";

        a() {
        }

        public a a(d d8) {
            this.b.add(d8);
            return this;
        }

        public a b() {
            return new a(this.a, java.util.DesugarCollections.unmodifiableList(this.b), this.c, this.d);
        }

        public a c(String string) {
            this.d = string;
            return this;
        }

        public a d(b b8) {
            this.c = b8;
            return this;
        }

        public a e(f f8) {
            this.a = f8;
            return this;
        }
    }
}

