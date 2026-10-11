package androidx.media3.exoplayer;

import ax.Z0.I1;
import ax.i1.InterfaceC2209F;
import ax.l1.InterfaceC2445D;

/* renamed from: androidx.media3.exoplayer.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0616o0 {

    /* renamed from: androidx.media3.exoplayer.o0$a */
    public static final class a {
        public final I1 a;
        public final ax.P0.N b;
        public final InterfaceC2209F.b c;
        public final long d;
        public final long e;
        public final float f;
        public final boolean g;
        public final boolean h;
        public final long i;
        public final long j;

        public a(I1 i1, ax.P0.N n, InterfaceC2209F.b bVar, long j, long j2, float f, boolean z, boolean z2, long j3, long j4) {
            this.a = i1;
            this.b = n;
            this.c = bVar;
            this.d = j;
            this.e = j2;
            this.f = f;
            this.g = z;
            this.h = z2;
            this.i = j3;
            this.j = j4;
        }
    }

    boolean a(a aVar);

    boolean b(a aVar);

    boolean c(I1 i1);

    void d(a aVar, ax.i1.q0 q0Var, InterfaceC2445D[] interfaceC2445DArr);

    boolean e(ax.P0.N n, InterfaceC2209F.b bVar, long j);

    void f(I1 i1);

    void g(I1 i1);

    ax.m1.b h();

    void i(I1 i1);

    long j(I1 i1);
}
