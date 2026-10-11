/*
 * Decompiled with CFR 0.152.
 */
package ax.O3;

import android.net.Uri;

public final class b {
    public static boolean a(Uri uri) {
        return b.b(uri) && !b.e(uri);
    }

    public static boolean b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean c(Uri uri) {
        return b.b(uri) && b.e(uri);
    }

    public static boolean d(int n8, int n9) {
        return n8 <= 512 && n9 <= 384;
    }

    private static boolean e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}

