package ax.r5;

/* renamed from: ax.r5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2959c<T> implements InterfaceC2958b<T> {
    private static final C2959c<Object> b = new C2959c<>(null);
    private final T a;

    private C2959c(T t) {
        this.a = t;
    }

    public static <T> InterfaceC2958b<T> a(T t) {
        return new C2959c(C2960d.c(t, "instance cannot be null"));
    }

    @Override // ax.ib.InterfaceC2296a
    public T get() {
        return this.a;
    }
}
