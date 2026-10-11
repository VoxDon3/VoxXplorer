/*
 * Decompiled with CFR 0.152.
 */
package ax.Zd;

import java.io.PrintStream;

public class l {
    private static final String[] a = new String[]{"System.out", "stdout", "sysout"};
    private static final b b = l.e();
    private static final a c = l.f();

    public static final void a(String string) {
        PrintStream printStream = l.c();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SLF4J(E): ");
        stringBuilder.append(string);
        printStream.println(stringBuilder.toString());
    }

    public static final void b(String string, Throwable throwable) {
        PrintStream printStream = l.c();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SLF4J(E): ");
        stringBuilder.append(string);
        printStream.println(stringBuilder.toString());
        l.c().println("SLF4J(E): Reported exception:");
        throwable.printStackTrace(l.c());
    }

    private static PrintStream c() {
        if (b.ordinal() != 1) {
            return System.err;
        }
        return System.out;
    }

    public static void d(String string) {
        if (l.g(ax.Zd.l$a.c0)) {
            PrintStream printStream = l.c();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SLF4J(I): ");
            stringBuilder.append(string);
            printStream.println(stringBuilder.toString());
        }
    }

    private static b e() {
        String string = System.getProperty("slf4j.internal.report.stream");
        if (string != null && !string.isEmpty()) {
            String[] stringArray = a;
            int n8 = stringArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!stringArray[i8].equalsIgnoreCase(string)) continue;
                return ax.Zd.l$b.c0;
            }
            return ax.Zd.l$b.q;
        }
        return ax.Zd.l$b.q;
    }

    private static a f() {
        String string = System.getProperty("slf4j.internal.verbosity");
        if (string != null && !string.isEmpty()) {
            if (string.equalsIgnoreCase("ERROR")) {
                return ax.Zd.l$a.e0;
            }
            if (string.equalsIgnoreCase("WARN")) {
                return ax.Zd.l$a.d0;
            }
            return ax.Zd.l$a.c0;
        }
        return ax.Zd.l$a.c0;
    }

    static boolean g(a a8) {
        return a8.q >= l.c.q;
    }

    public static final void h(String string) {
        if (l.g(ax.Zd.l$a.d0)) {
            PrintStream printStream = l.c();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SLF4J(W): ");
            stringBuilder.append(string);
            printStream.println(stringBuilder.toString());
        }
    }

    private static final class a
    extends Enum<a> {
        public static final /* enum */ a c0 = new a(1);
        public static final /* enum */ a d0 = new a(2);
        public static final /* enum */ a e0 = new a(3);
        private static final a[] f0 = ax.Zd.l$a.d();
        int q;

        private a(int n9) {
            this.q = n9;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{c0, d0, e0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])f0.clone();
        }
    }

    private static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        private static final b[] d0;
        public static final /* enum */ b q;

        static {
            q = new b();
            c0 = new b();
            d0 = ax.Zd.l$b.d();
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q, c0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])d0.clone();
        }
    }
}

