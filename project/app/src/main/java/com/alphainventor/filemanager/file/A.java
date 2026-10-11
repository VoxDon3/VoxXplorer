/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import ax.c3.d0;
import ax.u3.B;
import ax.u3.e;
import java.text.Collator;
import java.util.Comparator;

public class A {
    public String a;
    public boolean b;
    public long c;
    public long d;
    public long e;
    public Long f;
    private String g;
    private String h;
    private String i;

    A(String string, boolean bl, long l8, Long l9, long l10, long l11) {
        this.a = string;
        this.b = bl;
        this.c = l8;
        this.f = l9;
        this.d = l11;
        this.e = l10;
    }

    public String a() {
        if (this.i == null) {
            this.i = d0.f(this.b());
        }
        return this.i;
    }

    public String b() {
        if (this.g == null) {
            this.g = d0.h(this.a);
        }
        return this.g;
    }

    public String c() {
        if (this.h == null) {
            this.h = d0.r(this.a);
        }
        return this.h;
    }

    public static class a
    implements Comparator<A> {
        String c0;
        b q = new b();

        public a(String string) {
            this.c0 = string;
        }

        public int a(A a8, A a9) {
            if (a8.a().length() != a9.a().length()) {
                if (a8.a().length() == 0) {
                    return -1;
                }
                if (a9.a().length() == 0) {
                    return 1;
                }
            }
            if (a8.b().length() != a9.b().length() && ax.u3.e.c(a8.b(), a9.b(), this.c0)) {
                return B.b(a8.b().length(), a9.b().length());
            }
            long l8 = a8.c;
            long l9 = a9.c;
            if (l8 != l9) {
                return B.c(l8, l9);
            }
            l9 = a8.e;
            l8 = a9.e;
            if (l9 != l8) {
                return B.c(l9, l8);
            }
            if (a8.b().length() != a9.b().length()) {
                return B.b(a8.b().length(), a9.b().length());
            }
            return this.q.a(a8, a9);
        }
    }

    public static class b
    implements Comparator<A> {
        Collator c0;
        ax.u3.a q;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public b() {
            Collator collator;
            this.c0 = collator = Collator.getInstance();
            try {
                collator.setDecomposition(1);
            }
            catch (IllegalArgumentException illegalArgumentException) {}
            this.c0.setStrength(3);
            this.q = new ax.u3.a(this.c0);
        }

        public int a(A a8, A a9) {
            return this.b(a8.b(), a9.b());
        }

        public int b(String string, String string2) {
            try {
                int n8 = this.q.a(string, string2);
                return n8;
            }
            catch (Exception exception) {
                return this.c0.compare(string, string2);
            }
        }
    }

    public static class c
    implements Comparator<A> {
        b q = new b();

        public int a(A a8, A a9) {
            if (a8.b().length() != a9.b().length()) {
                return B.b(a8.b().length(), a9.b().length());
            }
            return this.q.a(a8, a9);
        }
    }
}

