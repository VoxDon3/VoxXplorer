package ax.b6;

/* loaded from: classes3.dex */
final class D4 implements E4 {
    D4() {
    }

    private static <E> InterfaceC1671t4<E> c(Object obj, long j) {
        return (InterfaceC1671t4) H5.B(obj, j);
    }

    @Override // ax.b6.E4
    public final void a(Object obj, long j) {
        c(obj, j).b();
    }

    @Override // ax.b6.E4
    public final <E> void b(Object obj, Object obj2, long j) {
        InterfaceC1671t4 c = c(obj, j);
        InterfaceC1671t4 c2 = c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.c()) {
                c = c.d(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        H5.j(obj, j, c2);
    }
}
