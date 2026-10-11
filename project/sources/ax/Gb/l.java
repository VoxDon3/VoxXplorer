package ax.Gb;

import ax.sb.C3073e;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class l {
    private l() {
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) k(new IllegalStateException(str + " must not be null")));
    }

    public static void c(Object obj) {
        if (obj == null) {
            n();
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            o(str);
        }
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) k(new NullPointerException(str + " must not be null")));
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            r(str);
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            q(str);
        }
    }

    public static int h(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int i(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    private static String j(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = l.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    private static <T extends Throwable> T k(T t) {
        return (T) l(t, l.class.getName());
    }

    static <T extends Throwable> T l(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static String m(String str, Object obj) {
        return str + obj;
    }

    public static void n() {
        throw ((NullPointerException) k(new NullPointerException()));
    }

    public static void o(String str) {
        throw ((NullPointerException) k(new NullPointerException(str)));
    }

    public static void p() {
        throw ((C3073e) k(new C3073e()));
    }

    private static void q(String str) {
        throw ((IllegalArgumentException) k(new IllegalArgumentException(j(str))));
    }

    private static void r(String str) {
        throw ((NullPointerException) k(new NullPointerException(j(str))));
    }

    public static void s(String str) {
        throw ((ax.sb.s) k(new ax.sb.s(str)));
    }

    public static void t(String str) {
        s("lateinit property " + str + " has not been initialized");
    }
}
