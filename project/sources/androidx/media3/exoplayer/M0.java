package androidx.media3.exoplayer;

import androidx.media3.exoplayer.K0;
import ax.P0.C0912v;
import ax.S0.InterfaceC0975h;
import ax.Z0.I1;
import ax.i1.InterfaceC2209F;
import java.io.IOException;

/* loaded from: classes.dex */
public interface M0 extends K0.b {

    public interface a {
        void a();

        void b();
    }

    void C() throws IOException;

    long D();

    void F(long j) throws C0622s;

    boolean G();

    ax.Y0.S H();

    void a();

    boolean c();

    void d();

    void f();

    String getName();

    int getState();

    void i(long j, long j2) throws C0622s;

    boolean isReady();

    ax.i1.e0 j();

    int k();

    void m(int i, I1 i1, InterfaceC0975h interfaceC0975h);

    boolean n();

    long o(long j, long j2);

    void p();

    void q();

    void r(ax.P0.N n);

    void s(ax.Y0.W w, C0912v[] c0912vArr, ax.i1.e0 e0Var, long j, boolean z, boolean z2, long j2, long j3, InterfaceC2209F.b bVar) throws C0622s;

    void start() throws C0622s;

    void stop();

    void t(C0912v[] c0912vArr, ax.i1.e0 e0Var, long j, long j2, InterfaceC2209F.b bVar) throws C0622s;

    N0 u();

    void x(float f, float f2) throws C0622s;
}
