package ax.qb;

import java.io.PrintStream;

/* renamed from: ax.qb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2897e extends PrintStream {
    public static int c0 = 1;
    private static C2897e q;

    public C2897e(PrintStream printStream) {
        super(printStream);
    }

    public static C2897e a() {
        if (q == null) {
            b(System.err);
        }
        return q;
    }

    public static void b(PrintStream printStream) {
        q = new C2897e(printStream);
    }

    public static void c(int i) {
        c0 = i;
    }
}
