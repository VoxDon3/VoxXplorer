/*
 * Decompiled with CFR 0.152.
 */
package ax.qb;

import java.io.PrintStream;

public class e
extends PrintStream {
    public static int c0 = 1;
    private static e q;

    public e(PrintStream printStream) {
        super(printStream);
    }

    public static e a() {
        if (q == null) {
            e.b(System.err);
        }
        return q;
    }

    public static void b(PrintStream printStream) {
        q = new e(printStream);
    }

    public static void c(int n8) {
        c0 = n8;
    }
}

