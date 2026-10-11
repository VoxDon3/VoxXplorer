/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import ax.Q2.f;
import ax.c3.K;

public class s {
    K a;
    String b;
    String c;
    String d;
    long e;
    long f;
    String g;

    public s(f f8, int n8, String string, String string2, String string3, String string4, long l8, long l9) {
        this.a = K.a(f8, n8);
        this.c = string;
        this.b = string2;
        this.d = string4;
        this.e = l8;
        this.f = l9;
        this.g = string3;
    }

    public long a() {
        return this.e;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.g;
    }

    public String d() {
        return this.d;
    }

    public K e() {
        return this.a;
    }

    public String f() {
        return this.c;
    }

    public long g() {
        return this.f;
    }

    public long h() {
        return ((long)this.a.d().ordinal() << 32) + (long)this.a.b();
    }
}

