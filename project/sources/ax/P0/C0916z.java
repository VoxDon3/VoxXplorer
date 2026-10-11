package ax.P0;

import java.util.HashSet;

/* renamed from: ax.P0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0916z {
    private static final HashSet<String> a = new HashSet<>();
    private static String b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (C0916z.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (C0916z.class) {
            str = b;
        }
        return str;
    }
}
