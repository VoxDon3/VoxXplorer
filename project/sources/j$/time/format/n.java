package j$.time.format;

import j$.time.chrono.InterfaceC3795b;
import j$.time.temporal.u;
import j$.time.v;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class n implements j$.time.temporal.n {
    public final /* synthetic */ InterfaceC3795b a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ j$.time.chrono.m c;
    public final /* synthetic */ v d;

    @Override // j$.time.temporal.n
    public final /* synthetic */ int l(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.a(this, qVar);
    }

    public n(InterfaceC3795b interfaceC3795b, j$.time.temporal.n nVar, j$.time.chrono.m mVar, v vVar) {
        this.a = interfaceC3795b;
        this.b = nVar;
        this.c = mVar;
        this.d = vVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.n, java.lang.Object] */
    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        InterfaceC3795b interfaceC3795b = this.a;
        if (interfaceC3795b != null && qVar.B()) {
            return interfaceC3795b.f(qVar);
        }
        return this.b.f(qVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.n, java.lang.Object] */
    @Override // j$.time.temporal.n
    public final u q(j$.time.temporal.q qVar) {
        InterfaceC3795b interfaceC3795b = this.a;
        if (interfaceC3795b != null && qVar.B()) {
            return interfaceC3795b.q(qVar);
        }
        return this.b.q(qVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.n, java.lang.Object] */
    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        InterfaceC3795b interfaceC3795b = this.a;
        if (interfaceC3795b != null && qVar.B()) {
            return interfaceC3795b.w(qVar);
        }
        return this.b.w(qVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.n, java.lang.Object] */
    @Override // j$.time.temporal.n
    public final Object J(j$.desugar.sun.nio.fs.m mVar) {
        if (mVar == j$.time.temporal.r.b) {
            return this.c;
        }
        if (mVar == j$.time.temporal.r.a) {
            return this.d;
        }
        if (mVar == j$.time.temporal.r.c) {
            return this.b.J(mVar);
        }
        return mVar.a(this);
    }

    public final String toString() {
        String str;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        j$.time.chrono.m mVar = this.c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        v vVar = this.d;
        if (vVar != null) {
            str2 = " with zone " + vVar;
        }
        return this.b + str + str2;
    }
}
