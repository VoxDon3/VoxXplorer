package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* loaded from: classes.dex */
class a {

    /* renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    private static class C0035a {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    private static class b {
        static Context a(Context context) {
            Context createDeviceProtectedStorageContext;
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            return createDeviceProtectedStorageContext;
        }
    }

    static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = a(file2) && z;
        }
        return z;
    }

    static void b(Context context, ProfileInstallReceiver.a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (a(i >= 34 ? b.a(context).getCacheDir() : i >= 24 ? C0035a.a(b.a(context)) : i == 23 ? C0035a.a(context) : context.getCacheDir())) {
            aVar.b(14, null);
        } else {
            aVar.b(15, null);
        }
    }
}
