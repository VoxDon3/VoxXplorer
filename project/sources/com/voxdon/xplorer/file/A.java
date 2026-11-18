package com.voxdon.xplorer.file;

import ax.c3.d0;
import ax.u3.C3180B;
import ax.u3.C3183a;
import ax.u3.C3187e;
import java.text.Collator;
import java.util.Comparator;

/* loaded from: classes.dex */
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

    public static class a implements Comparator<A> {
        String c0;
        b q = new b();

        public a(String str) {
            this.c0 = str;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(A a, A a2) {
            if (a.a().length() != a2.a().length()) {
                if (a.a().length() == 0) {
                    return -1;
                }
                if (a2.a().length() == 0) {
                    return 1;
                }
            }
            if (a.b().length() != a2.b().length() && C3187e.c(a.b(), a2.b(), this.c0)) {
                return C3180B.b(a.b().length(), a2.b().length());
            }
            long j = a.c;
            long j2 = a2.c;
            if (j != j2) {
                return C3180B.c(j, j2);
            }
            long j3 = a.e;
            long j4 = a2.e;
            return j3 != j4 ? C3180B.c(j3, j4) : a.b().length() != a2.b().length() ? C3180B.b(a.b().length(), a2.b().length()) : this.q.compare(a, a2);
        }
    }

    public static class b implements Comparator<A> {
        Collator c0;
        C3183a q;

        public b() {
            Collator collator = Collator.getInstance();
            this.c0 = collator;
            try {
                collator.setDecomposition(1);
            } catch (IllegalArgumentException unused) {
            }
            this.c0.setStrength(3);
            this.q = new C3183a(this.c0);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(A a, A a2) {
            return b(a.b(), a2.b());
        }

        public int b(String str, String str2) {
            try {
                return this.q.compare(str, str2);
            } catch (Exception unused) {
                return this.c0.compare(str, str2);
            }
        }
    }

    public static class c implements Comparator<A> {
        b q = new b();

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(A a, A a2) {
            return a.b().length() != a2.b().length() ? C3180B.b(a.b().length(), a2.b().length()) : this.q.compare(a, a2);
        }
    }

    A(String str, boolean z, long j, Long l, long j2, long j3) {
        this.a = str;
        this.b = z;
        this.c = j;
        this.f = l;
        this.d = j3;
        this.e = j2;
    }

    public String a() {
        if (this.i == null) {
            this.i = d0.f(b());
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
}
