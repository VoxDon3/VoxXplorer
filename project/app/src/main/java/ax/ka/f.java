/*
 * Decompiled with CFR 0.152.
 */
package ax.ka;

import android.content.Context;
import android.os.Environment;
import ax.ka.d;
import java.io.File;
import java.io.IOException;

public final class f {
    public static File a(Context context) {
        return f.b(context, true);
    }

    public static File b(Context object, boolean bl) {
        Object object2;
        Object object3 = "";
        try {
            object3 = object2 = Environment.getExternalStorageState();
        }
        catch (IncompatibleClassChangeError | NullPointerException throwable) {
            // empty catch block
        }
        object2 = bl && "mounted".equals(object3) && f.f(object) ? f.c(object) : null;
        object3 = object2;
        if (object2 == null) {
            object3 = object.getCacheDir();
        }
        object2 = object3;
        if (object3 == null) {
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("/data/data/");
            ((StringBuilder)object3).append(object.getPackageName());
            ((StringBuilder)object3).append("/cache/");
            object = ((StringBuilder)object3).toString();
            d.f("Can't define system cache directory! '%s' will be used.", object);
            object2 = new File((String)object);
        }
        return object2;
    }

    private static File c(Context object) {
        object = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), object.getPackageName()), "cache");
        if (!((File)object).exists()) {
            if (!((File)object).mkdirs()) {
                d.f("Unable to create external cache directory", new Object[0]);
                return null;
            }
            try {
                File file = new File((File)object, ".nomedia");
                file.createNewFile();
                return object;
            }
            catch (IOException iOException) {
                d.d("Can't create \".nomedia\" file in application external cache directory", new Object[0]);
            }
        }
        return object;
    }

    public static File d(Context context) {
        return f.e(context, "uil-images");
    }

    public static File e(Context object, String object2) {
        object2 = new File((File)(object = f.a(object)), (String)object2);
        if (!((File)object2).exists() && !((File)object2).mkdir()) {
            return object;
        }
        return object2;
    }

    private static boolean f(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}

