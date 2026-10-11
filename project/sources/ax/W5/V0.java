package ax.W5;

/* loaded from: classes3.dex */
final class V0 extends X0 {
    /* synthetic */ V0(U0 u0) {
        super(null);
    }

    @Override // ax.W5.X0
    final void a(Object obj, long j) {
        ((M0) X1.f(obj, j)).b();
    }

    @Override // ax.W5.X0
    final void b(Object obj, Object obj2, long j) {
        M0 m0 = (M0) X1.f(obj, j);
        M0 m02 = (M0) X1.f(obj2, j);
        int size = m0.size();
        int size2 = m02.size();
        if (size > 0 && size2 > 0) {
            if (!m0.c()) {
                m0 = m0.v(size2 + size);
            }
            m0.addAll(m02);
        }
        if (size > 0) {
            m02 = m0;
        }
        X1.p(obj, j, m02);
    }
}
