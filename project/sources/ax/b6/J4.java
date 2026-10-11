package ax.b6;

/* loaded from: classes3.dex */
final class J4 implements R4 {
    private R4[] a;

    J4(R4... r4Arr) {
        this.a = r4Arr;
    }

    @Override // ax.b6.R4
    public final S4 a(Class<?> cls) {
        for (R4 r4 : this.a) {
            if (r4.b(cls)) {
                return r4.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // ax.b6.R4
    public final boolean b(Class<?> cls) {
        for (R4 r4 : this.a) {
            if (r4.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
