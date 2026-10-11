/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import ax.c3.K;
import ax.c3.d0;
import java.io.File;

public class I {
    private static Boolean a;
    private static Boolean b;

    public static boolean a(K k8) {
        if (b == null) {
            I.b(k8);
        }
        return b;
    }

    public static boolean b(K object) {
        if (a == null) {
            object = ((K)object).e();
            Comparable<StringBuilder> comparable = new StringBuilder("\u2066");
            ((StringBuilder)comparable).append("Android");
            object = new File(d0.Q((String)object, ((StringBuilder)comparable).toString()));
            if (((File)object).exists() && ((File)(object = new File((File)object, "data"))).canRead()) {
                b = Boolean.TRUE;
                comparable = new File((File)object, "com.android.vending");
                if (((File)comparable).exists()) {
                    a = ((File)comparable).canRead();
                } else {
                    comparable = ((File)object).list();
                    if (comparable != null && ((Comparable<StringBuilder>)comparable).length > 0) {
                        a = new File((File)object, (String)((Object)comparable[0])).canRead();
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
        return a;
    }

    public static File c(K k8, String string) {
        if (!(I.b(k8) || I.e(string) && I.a(k8))) {
            return null;
        }
        return new File(I.d(string));
    }

    public static String d(String string) {
        StringBuilder stringBuilder = new StringBuilder("/\u2066");
        stringBuilder.append("Android/");
        return string.replaceFirst("/Android/", stringBuilder.toString());
    }

    private static boolean e(String string) {
        return string.endsWith("/Android/data") || string.endsWith("/Android/obb");
        {
        }
    }

    public static String f(String string) {
        StringBuilder stringBuilder = new StringBuilder("/\u2066");
        stringBuilder.append("Android/");
        return string.replaceFirst(stringBuilder.toString(), "/Android/");
    }
}

