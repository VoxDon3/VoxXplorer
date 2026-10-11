package ax.Z2;

import ax.c3.K;

/* loaded from: classes.dex */
public class s {
    K a;
    String b;
    String c;
    String d;
    long e;
    long f;
    String g;

    public s(ax.Q2.f fVar, int i, String str, String str2, String str3, String str4, long j, long j2) {
        this.a = K.a(fVar, i);
        this.c = str;
        this.b = str2;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str3;
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
        return (this.a.d().ordinal() << 32) + this.a.b();
    }
}
