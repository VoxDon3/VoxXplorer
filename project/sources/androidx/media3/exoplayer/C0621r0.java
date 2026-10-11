package androidx.media3.exoplayer;

import ax.S0.C0968a;
import ax.i1.InterfaceC2209F;
import j$.util.Objects;

/* renamed from: androidx.media3.exoplayer.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0621r0 {
    public final InterfaceC2209F.b a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    C0621r0(InterfaceC2209F.b bVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        C0968a.a(!z5 || z3);
        C0968a.a(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        C0968a.a(z6);
        this.a = bVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public C0621r0 a(long j) {
        return j == this.c ? this : new C0621r0(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public C0621r0 b(long j) {
        return j == this.b ? this : new C0621r0(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0621r0.class == obj.getClass()) {
            C0621r0 c0621r0 = (C0621r0) obj;
            if (this.b == c0621r0.b && this.c == c0621r0.c && this.d == c0621r0.d && this.e == c0621r0.e && this.f == c0621r0.f && this.g == c0621r0.g && this.h == c0621r0.h && this.i == c0621r0.i && this.j == c0621r0.j && Objects.equals(this.a, c0621r0.a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.a.hashCode()) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
