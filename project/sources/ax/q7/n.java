package ax.q7;

/* loaded from: classes3.dex */
public final class n {
    private static String a(int i, int i2, String str) {
        if (i < 0) {
            return t.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return t.b("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    private static String b(int i, int i2, String str) {
        if (i < 0) {
            return t.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return t.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    private static String c(int i, int i2, int i3) {
        return (i < 0 || i > i3) ? b(i, i3, "start index") : (i2 < 0 || i2 > i3) ? b(i2, i3, "end index") : t.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static void d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(t.b(str, Character.valueOf(c)));
        }
    }

    public static void g(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(t.b(str, Integer.valueOf(i)));
        }
    }

    public static void h(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(t.b(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void i(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(t.b(str, Long.valueOf(j)));
        }
    }

    public static void j(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(t.b(str, obj));
        }
    }

    public static void k(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(t.b(str, objArr));
        }
    }

    public static int l(int i, int i2) {
        return m(i, i2, "index");
    }

    public static int m(int i, int i2, String str) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(a(i, i2, str));
        }
        return i;
    }

    public static <T> T n(T t) {
        t.getClass();
        return t;
    }

    public static <T> T o(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T p(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(t.b(str, objArr));
    }

    public static int q(int i, int i2) {
        return r(i, i2, "index");
    }

    public static int r(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(b(i, i2, str));
        }
        return i;
    }

    public static void s(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(c(i, i2, i3));
        }
    }

    public static void t(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void u(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void v(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(t.b(str, obj));
        }
    }

    public static void w(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(t.b(str, objArr));
        }
    }
}
