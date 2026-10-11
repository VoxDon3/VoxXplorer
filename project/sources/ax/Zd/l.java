package ax.Zd;

import java.io.PrintStream;

/* loaded from: classes3.dex */
public class l {
    private static final String[] a = {"System.out", "stdout", "sysout"};
    private static final b b = e();
    private static final a c = f();

    private enum a {
        INFO(1),
        WARN(2),
        ERROR(3);

        int q;

        a(int i) {
            this.q = i;
        }
    }

    private enum b {
        Stderr,
        Stdout
    }

    public static final void a(String str) {
        c().println("SLF4J(E): " + str);
    }

    public static final void b(String str, Throwable th) {
        c().println("SLF4J(E): " + str);
        c().println("SLF4J(E): Reported exception:");
        th.printStackTrace(c());
    }

    private static PrintStream c() {
        return b.ordinal() != 1 ? System.err : System.out;
    }

    public static void d(String str) {
        if (g(a.INFO)) {
            c().println("SLF4J(I): " + str);
        }
    }

    private static b e() {
        String property = System.getProperty("slf4j.internal.report.stream");
        if (property == null || property.isEmpty()) {
            return b.Stderr;
        }
        for (String str : a) {
            if (str.equalsIgnoreCase(property)) {
                return b.Stdout;
            }
        }
        return b.Stderr;
    }

    private static a f() {
        String property = System.getProperty("slf4j.internal.verbosity");
        return (property == null || property.isEmpty()) ? a.INFO : property.equalsIgnoreCase("ERROR") ? a.ERROR : property.equalsIgnoreCase("WARN") ? a.WARN : a.INFO;
    }

    static boolean g(a aVar) {
        return aVar.q >= c.q;
    }

    public static final void h(String str) {
        if (g(a.WARN)) {
            c().println("SLF4J(W): " + str);
        }
    }
}
