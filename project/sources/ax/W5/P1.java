package ax.W5;

/* loaded from: classes3.dex */
final class P1 extends M1 {
    P1() {
    }

    @Override // ax.W5.M1
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        J0 j0 = (J0) obj;
        O1 o1 = j0.zzc;
        if (o1 != O1.a()) {
            return o1;
        }
        O1 d = O1.d();
        j0.zzc = d;
        return d;
    }

    @Override // ax.W5.M1
    final /* synthetic */ Object b(Object obj) {
        return ((J0) obj).zzc;
    }

    @Override // ax.W5.M1
    final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2) {
        if (!O1.a().equals(obj2)) {
            if (O1.a().equals(obj)) {
                return O1.c((O1) obj, (O1) obj2);
            }
            ((O1) obj).b((O1) obj2);
        }
        return obj;
    }

    @Override // ax.W5.M1
    final /* bridge */ /* synthetic */ void d(Object obj, int i, long j) {
        ((O1) obj).h(i << 3, Long.valueOf(j));
    }

    @Override // ax.W5.M1
    final void e(Object obj) {
        ((J0) obj).zzc.f();
    }

    @Override // ax.W5.M1
    final /* synthetic */ void f(Object obj, Object obj2) {
        ((J0) obj).zzc = (O1) obj2;
    }
}
