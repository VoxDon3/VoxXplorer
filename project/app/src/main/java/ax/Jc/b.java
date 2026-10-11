/*
 * Decompiled with CFR 0.152.
 */
package ax.Jc;

import ax.Ec.c;
import ax.Kc.q;
import java.util.HashMap;

public class b {
    private static final c a;
    private static final byte[] b;
    private static volatile a c;

    static {
        b = new byte[]{-3, 55, 122, 88, 90, 0};
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(".txz", ".tar");
        hashMap.put(".xz", "");
        hashMap.put("-xz", "");
        a = new c(hashMap, ".xz");
        c = ax.Jc.b$a.q;
        ax.Jc.b.c(q.b() ^ true);
    }

    public static String a(String string) {
        return a.a(string);
    }

    private static boolean b() {
        try {
            ax.Jc.a.d(null, 0);
            return true;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            return false;
        }
    }

    public static void c(boolean bl) {
        if (!bl) {
            c = ax.Jc.b$a.q;
            return;
        }
        if (c == ax.Jc.b$a.q) {
            a a8 = ax.Jc.b.b() ? ax.Jc.b$a.c0 : ax.Jc.b$a.d0;
            c = a8;
        }
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        private static final a[] e0;
        public static final /* enum */ a q;

        static {
            a a8;
            a a9;
            a a10;
            q = a10 = new a();
            c0 = a9 = new a();
            d0 = a8 = new a();
            e0 = new a[]{a10, a9, a8};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }
    }
}

