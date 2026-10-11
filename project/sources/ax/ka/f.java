package ax.ka;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class f {
    public static File a(Context context) {
        return b(context, true);
    }

    public static File b(Context context, boolean z) {
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        try {
            str = Environment.getExternalStorageState();
        } catch (IncompatibleClassChangeError | NullPointerException unused) {
        }
        File c = (z && "mounted".equals(str) && f(context)) ? c(context) : null;
        if (c == null) {
            c = context.getCacheDir();
        }
        if (c != null) {
            return c;
        }
        String str2 = "/data/data/" + context.getPackageName() + "/cache/";
        d.f("Can't define system cache directory! '%s' will be used.", str2);
        return new File(str2);
    }

    private static File c(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
        if (!file.exists()) {
            if (!file.mkdirs()) {
                d.f("Unable to create external cache directory", new Object[0]);
                return null;
            }
            try {
                new File(file, ".nomedia").createNewFile();
                return file;
            } catch (IOException unused) {
                d.d("Can't create \".nomedia\" file in application external cache directory", new Object[0]);
            }
        }
        return file;
    }

    public static File d(Context context) {
        return e(context, "uil-images");
    }

    public static File e(Context context, String str) {
        File a = a(context);
        File file = new File(a, str);
        return (file.exists() || file.mkdir()) ? file : a;
    }

    private static boolean f(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
