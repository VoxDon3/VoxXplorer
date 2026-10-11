/*
 * Decompiled with CFR 0.152.
 */
package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

class a {
    static boolean a(File fileArray) {
        if (fileArray.isDirectory()) {
            if ((fileArray = fileArray.listFiles()) == null) {
                return false;
            }
            int n8 = fileArray.length;
            boolean bl = true;
            for (int i8 = 0; i8 < n8; ++i8) {
                bl = a.a(fileArray[i8]) && bl;
            }
            return bl;
        }
        fileArray.delete();
        return true;
    }

    static void b(Context object, ProfileInstallReceiver.a a8) {
        int n8 = Build.VERSION.SDK_INT;
        object = n8 >= 34 ? b.a(object).getCacheDir() : (n8 >= 24 ? a.a(b.a(object)) : (n8 == 23 ? a.a(object) : object.getCacheDir()));
        if (a.a((File)object)) {
            a8.b(14, null);
            return;
        }
        a8.b(15, null);
    }

    private static class a {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    private static class b {
        static Context a(Context context) {
            return ax.g2.a.a(context);
        }
    }
}

