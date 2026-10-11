package ax.b6;

import java.io.IOException;

/* loaded from: classes3.dex */
final class I5 extends G5<F5, F5> {
    I5() {
    }

    private static void m(Object obj, F5 f5) {
        ((AbstractC1599k4) obj).zzb = f5;
    }

    @Override // ax.b6.G5
    final /* synthetic */ int a(F5 f5) {
        return f5.a();
    }

    @Override // ax.b6.G5
    final /* synthetic */ F5 b(F5 f5, F5 f52) {
        F5 f53 = f5;
        F5 f54 = f52;
        return F5.k().equals(f54) ? f53 : F5.k().equals(f53) ? F5.c(f53, f54) : f53.b(f54);
    }

    @Override // ax.b6.G5
    final /* synthetic */ void c(F5 f5, int i, B3 b3) {
        f5.e((i << 3) | 2, b3);
    }

    @Override // ax.b6.G5
    final /* synthetic */ void d(F5 f5, InterfaceC1529c6 interfaceC1529c6) throws IOException {
        f5.g(interfaceC1529c6);
    }

    @Override // ax.b6.G5
    final /* synthetic */ int e(F5 f5) {
        return f5.i();
    }

    @Override // ax.b6.G5
    final /* synthetic */ void f(F5 f5, int i, long j) {
        f5.e(i << 3, Long.valueOf(j));
    }

    @Override // ax.b6.G5
    final /* synthetic */ void g(F5 f5, InterfaceC1529c6 interfaceC1529c6) throws IOException {
        f5.j(interfaceC1529c6);
    }

    @Override // ax.b6.G5
    final /* synthetic */ void h(Object obj, F5 f5) {
        m(obj, f5);
    }

    @Override // ax.b6.G5
    final /* synthetic */ F5 i(Object obj) {
        F5 f5 = ((AbstractC1599k4) obj).zzb;
        if (f5 != F5.k()) {
            return f5;
        }
        F5 l = F5.l();
        m(obj, l);
        return l;
    }

    @Override // ax.b6.G5
    final /* synthetic */ void j(Object obj, F5 f5) {
        m(obj, f5);
    }

    @Override // ax.b6.G5
    final /* synthetic */ F5 k(Object obj) {
        return ((AbstractC1599k4) obj).zzb;
    }

    @Override // ax.b6.G5
    final void l(Object obj) {
        ((AbstractC1599k4) obj).zzb.m();
    }
}
