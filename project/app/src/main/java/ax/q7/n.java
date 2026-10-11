/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

import ax.q7.t;

public final class n {
    private static String a(int n8, int n9, String charSequence) {
        if (n8 < 0) {
            return t.b("%s (%s) must not be negative", charSequence, n8);
        }
        if (n9 >= 0) {
            return t.b("%s (%s) must be less than size (%s)", charSequence, n8, n9);
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("negative size: ");
        ((StringBuilder)charSequence).append(n9);
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
    }

    private static String b(int n8, int n9, String charSequence) {
        if (n8 < 0) {
            return t.b("%s (%s) must not be negative", charSequence, n8);
        }
        if (n9 >= 0) {
            return t.b("%s (%s) must not be greater than size (%s)", charSequence, n8, n9);
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("negative size: ");
        ((StringBuilder)charSequence).append(n9);
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
    }

    private static String c(int n8, int n9, int n10) {
        if (n8 >= 0 && n8 <= n10) {
            if (n9 >= 0 && n9 <= n10) {
                return t.b("end index (%s) must not be less than start index (%s)", n9, n8);
            }
            return n.b(n9, n10, "end index");
        }
        return n.b(n8, n10, "start index");
    }

    public static void d(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void e(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(object));
    }

    public static void f(boolean bl, String string, char c8) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(t.b(string, Character.valueOf(c8)));
    }

    public static void g(boolean bl, String string, int n8) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(t.b(string, n8));
    }

    public static void h(boolean bl, String string, int n8, int n9) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(t.b(string, n8, n9));
    }

    public static void i(boolean bl, String string, long l8) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(t.b(string, l8));
    }

    public static void j(boolean bl, String string, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(t.b(string, object));
    }

    public static void k(boolean bl, String string, Object ... objectArray) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(t.b(string, objectArray));
    }

    public static int l(int n8, int n9) {
        return n.m(n8, n9, "index");
    }

    public static int m(int n8, int n9, String string) {
        if (n8 >= 0 && n8 < n9) {
            return n8;
        }
        throw new IndexOutOfBoundsException(n.a(n8, n9, string));
    }

    public static <T> T n(T t8) {
        t8.getClass();
        return t8;
    }

    public static <T> T o(T t8, Object object) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(String.valueOf(object));
    }

    public static <T> T p(T t8, String string, Object ... objectArray) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(t.b(string, objectArray));
    }

    public static int q(int n8, int n9) {
        return n.r(n8, n9, "index");
    }

    public static int r(int n8, int n9, String string) {
        if (n8 >= 0 && n8 <= n9) {
            return n8;
        }
        throw new IndexOutOfBoundsException(n.b(n8, n9, string));
    }

    public static void s(int n8, int n9, int n10) {
        if (n8 >= 0 && n9 >= n8 && n9 <= n10) {
            return;
        }
        throw new IndexOutOfBoundsException(n.c(n8, n9, n10));
    }

    public static void t(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void u(boolean bl, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(String.valueOf(object));
    }

    public static void v(boolean bl, String string, Object object) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(t.b(string, object));
    }

    public static void w(boolean bl, String string, Object ... objectArray) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(t.b(string, objectArray));
    }
}

