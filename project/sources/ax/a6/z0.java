package ax.a6;

/* loaded from: classes3.dex */
public final class z0 implements y0 {
    private final Object a;

    private z0(Object obj) {
        this.a = obj;
    }

    public static y0 b(Object obj) {
        if (obj != null) {
            return new z0(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // ax.a6.C0
    public final Object a() {
        return this.a;
    }
}
