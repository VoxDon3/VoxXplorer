/*
 * Decompiled with CFR 0.152.
 */
package ax.Gb;

import ax.sb.e;
import ax.sb.s;
import java.util.Arrays;

public class l {
    private l() {
    }

    public static boolean a(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }

    public static void b(Object object, String string) {
        if (object != null) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" must not be null");
        throw l.k(new IllegalStateException(((StringBuilder)object).toString()));
    }

    public static void c(Object object) {
        if (object == null) {
            l.n();
        }
    }

    public static void d(Object object, String string) {
        if (object == null) {
            l.o(string);
        }
    }

    public static void e(Object object, String string) {
        if (object != null) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" must not be null");
        throw l.k(new NullPointerException(((StringBuilder)object).toString()));
    }

    public static void f(Object object, String string) {
        if (object == null) {
            l.r(string);
        }
    }

    public static void g(Object object, String string) {
        if (object == null) {
            l.q(string);
        }
    }

    public static int h(int n8, int n9) {
        if (n8 < n9) {
            return -1;
        }
        if (n8 == n9) {
            return 0;
        }
        return 1;
    }

    public static int i(long l8, long l9) {
        long l10 = l8 == l9 ? 0 : (l8 < l9 ? -1 : 1);
        if (l10 < 0) {
            return -1;
        }
        if (l10 == false) {
            return 0;
        }
        return 1;
    }

    private static String j(String string) {
        int n8;
        Object object = Thread.currentThread().getStackTrace();
        String string2 = l.class.getName();
        int n9 = 0;
        do {
            n8 = ++n9;
        } while (!object[n9].getClassName().equals(string2));
        while (object[n8].getClassName().equals(string2)) {
            ++n8;
        }
        object = object[n8];
        string2 = ((StackTraceElement)object).getClassName();
        object = ((StackTraceElement)object).getMethodName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Parameter specified as non-null is null: method ");
        stringBuilder.append(string2);
        stringBuilder.append(".");
        stringBuilder.append((String)object);
        stringBuilder.append(", parameter ");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    private static <T extends Throwable> T k(T t8) {
        return l.l(t8, l.class.getName());
    }

    static <T extends Throwable> T l(T t8, String string) {
        StackTraceElement[] stackTraceElementArray = t8.getStackTrace();
        int n8 = stackTraceElementArray.length;
        int n9 = -1;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!string.equals(stackTraceElementArray[i8].getClassName())) continue;
            n9 = i8;
        }
        t8.setStackTrace(Arrays.copyOfRange(stackTraceElementArray, n9 + 1, n8));
        return t8;
    }

    public static String m(String string, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(object);
        return stringBuilder.toString();
    }

    public static void n() {
        throw l.k(new NullPointerException());
    }

    public static void o(String string) {
        throw l.k(new NullPointerException(string));
    }

    public static void p() {
        throw l.k(new e());
    }

    private static void q(String string) {
        throw l.k(new IllegalArgumentException(l.j(string)));
    }

    private static void r(String string) {
        throw l.k(new NullPointerException(l.j(string)));
    }

    public static void s(String string) {
        throw l.k(new s(string));
    }

    public static void t(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lateinit property ");
        stringBuilder.append(string);
        stringBuilder.append(" has not been initialized");
        l.s(stringBuilder.toString());
    }
}

