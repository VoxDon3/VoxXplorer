package ax.i1;

import androidx.media3.exoplayer.C0618p0;
import ax.i1.f0;
import ax.l1.InterfaceC2445D;
import java.io.IOException;

/* renamed from: ax.i1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2206C extends f0 {

    /* renamed from: ax.i1.C$a */
    public interface a extends f0.a<InterfaceC2206C> {
        void f(InterfaceC2206C interfaceC2206C);
    }

    @Override // ax.i1.f0
    boolean a(C0618p0 c0618p0);

    @Override // ax.i1.f0
    long b();

    @Override // ax.i1.f0
    boolean c();

    @Override // ax.i1.f0
    long d();

    @Override // ax.i1.f0
    void e(long j);

    long g(InterfaceC2445D[] interfaceC2445DArr, boolean[] zArr, e0[] e0VarArr, boolean[] zArr2, long j);

    void l() throws IOException;

    long m(long j);

    void n(a aVar, long j);

    long q(long j, ax.Y0.Z z);

    long s();

    q0 t();

    void v(long j, boolean z);
}
