package ax.Y8;

/* loaded from: classes3.dex */
public class e {
    private static final ax.Xd.d a = ax.Xd.f.k(e.class);

    public static void a(AutoCloseable... autoCloseableArr) {
        for (AutoCloseable autoCloseable : autoCloseableArr) {
            if (autoCloseable != null) {
                try {
                    ax.Z.f.a(autoCloseable);
                } catch (Exception unused) {
                }
            }
        }
    }
}
