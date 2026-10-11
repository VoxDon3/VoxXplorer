/*
 * Decompiled with CFR 0.152.
 */
package ax.s5;

import ax.s5.c;
import java.util.ArrayList;
import java.util.List;

public final class d {
    private static final d c = new a().a();
    private final String a;
    private final List<c> b;

    d(String string, List<c> list) {
        this.a = string;
        this.b = list;
    }

    public static a c() {
        return new a();
    }

    @ax.X7.d(tag=2)
    public List<c> a() {
        return this.b;
    }

    @ax.X7.d(tag=1)
    public String b() {
        return this.a;
    }

    public static final class a {
        private String a = "";
        private List<c> b = new ArrayList<c>();

        a() {
        }

        public d a() {
            return new d(this.a, java.util.DesugarCollections.unmodifiableList(this.b));
        }

        public a b(List<c> list) {
            this.b = list;
            return this;
        }

        public a c(String string) {
            this.a = string;
            return this;
        }
    }
}

