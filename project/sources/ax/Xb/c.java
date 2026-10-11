package ax.Xb;

/* loaded from: classes3.dex */
public final class c extends f {
    public static final c j0 = new c();

    private c() {
        super(l.c, l.d, l.e, l.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // ax.Qb.G
    public String toString() {
        return "Dispatchers.Default";
    }
}
