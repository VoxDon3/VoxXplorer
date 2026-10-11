package ax.c3;

import java.io.File;

/* loaded from: classes.dex */
public class I {
    private static Boolean a;
    private static Boolean b;

    public static boolean a(K k) {
        if (b == null) {
            b(k);
        }
        return b.booleanValue();
    }

    public static boolean b(K k) {
        if (a == null) {
            File file = new File(d0.Q(k.e(), "\u2066Android"));
            if (file.exists()) {
                File file2 = new File(file, "data");
                if (file2.canRead()) {
                    b = Boolean.TRUE;
                    File file3 = new File(file2, "com.android.vending");
                    if (file3.exists()) {
                        a = Boolean.valueOf(file3.canRead());
                    } else {
                        String[] list = file2.list();
                        if (list != null && list.length > 0) {
                            a = Boolean.valueOf(new File(file2, list[0]).canRead());
                        }
                    }
                }
            }
            if (a == null) {
                a = Boolean.FALSE;
            }
            if (b == null) {
                b = Boolean.FALSE;
            }
        }
        return a.booleanValue();
    }

    public static File c(K k, String str) {
        if (b(k) || (e(str) && a(k))) {
            return new File(d(str));
        }
        return null;
    }

    public static String d(String str) {
        return str.replaceFirst("/Android/", "/\u2066Android/");
    }

    private static boolean e(String str) {
        return str.endsWith("/Android/data") || str.endsWith("/Android/obb");
    }

    public static String f(String str) {
        return str.replaceFirst("/\u2066Android/", "/Android/");
    }
}
