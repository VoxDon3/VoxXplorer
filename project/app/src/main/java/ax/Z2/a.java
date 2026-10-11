/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import android.content.Context;
import ax.Q2.e;
import ax.Q2.f;
import ax.X2.L;
import ax.X2.Q;
import ax.X2.v;
import ax.Z2.j;
import ax.c3.d0;
import ax.u3.q;
import com.alphainventor.filemanager.file.n;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;

public class a {
    private static void b(Context object) {
        long l8 = System.currentTimeMillis();
        File file = a.n((Context)object);
        if (file != null) {
            a.e(file, l8 - 3600000L);
        }
        if (Q.L() && (file = e.t((Context)object)) != null && file.exists()) {
            a.g(file, l8, true);
            file.delete();
        }
        if ((file = a.k((Context)object)) != null && file.exists()) {
            a.g(file, l8 - 691200000L, false);
        }
        if ((object = a.h((Context)object)) != null && ((File)object).exists()) {
            a.c((File)object, l8 - 1209600000L);
        }
    }

    private static void c(File fileArray, long l8) {
        if ((fileArray = fileArray.listFiles()) != null) {
            for (File file : fileArray) {
                if ("temp".equals(file.getName()) || "localcache".equals(file.getName())) continue;
                a.e(file, l8);
            }
        }
    }

    private static void d(File file, long l8, L l9) {
        block3: {
            try {
                v.l(file.getAbsolutePath(), l9);
                if (l9.d < l8) {
                    file.delete();
                    return;
                }
            }
            catch (Exception exception) {
                if (file.lastModified() >= l8) break block3;
                file.delete();
            }
        }
    }

    private static void e(File file, long l8) {
        String[] stringArray = new L();
        if (file.isDirectory()) {
            File[] fileArray = file.listFiles();
            if (fileArray != null) {
                for (File file2 : fileArray) {
                    if (file2.isDirectory()) {
                        a.e(file2, l8);
                        continue;
                    }
                    a.d(file2, l8, (L)stringArray);
                }
                stringArray = file.list();
                if (stringArray != null && stringArray.length == 0 && file.lastModified() < l8) {
                    file.delete();
                }
            }
            return;
        }
        a.d(file, l8, (L)stringArray);
    }

    public static boolean f(File file, boolean bl) {
        if (!file.exists()) {
            return false;
        }
        File[] fileArray = file.listFiles();
        if (fileArray == null) {
            return false;
        }
        int n8 = fileArray.length;
        boolean bl2 = true;
        for (int i8 = 0; i8 < n8; ++i8) {
            File file2 = fileArray[i8];
            if (file2.isDirectory()) {
                a.f(file2, false);
            }
            if (file2.delete()) continue;
            bl2 = false;
        }
        if (bl && !file.delete()) {
            return false;
        }
        return bl2;
    }

    private static void g(File stringArray, long l8, boolean bl) {
        File[] fileArray = stringArray.listFiles();
        if (fileArray != null) {
            int n8 = fileArray.length;
            File file = null;
            for (int i8 = 0; i8 < n8; ++i8) {
                File file2 = fileArray[i8];
                if (!".nomedia".equals(file2.getName())) {
                    a.e(file2, l8);
                    continue;
                }
                file = file2;
            }
            if (bl && file != null && (stringArray = stringArray.list()) != null && stringArray.length == 1) {
                file.delete();
            }
        }
    }

    public static File h(Context context) {
        return e.k(context);
    }

    public static File i(Context object, f f8, int n8) {
        if (!((File)(object = new File(d0.Q(d0.Q(a.k((Context)object).getAbsolutePath(), f8.I()), String.valueOf(n8))))).exists()) {
            ((File)object).mkdirs();
        }
        return object;
    }

    public static File j(Context object, n n8) {
        if (!((File)(object = new File(a.i((Context)object, n8.P(), n8.L()), String.valueOf(n8.T().hashCode())))).exists()) {
            ((File)object).mkdirs();
        }
        return object;
    }

    public static File k(Context context) {
        if (Q.L()) {
            return e.o(context);
        }
        return new File(a.h(context), "localcache");
    }

    public static File l(Context object, n n8) {
        object = d0.Q(a.n((Context)object).getAbsolutePath(), n8.P().I());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(n8.L()));
        stringBuilder.append("/");
        stringBuilder.append(n8.T().hashCode());
        object = new File(d0.Q((String)object, stringBuilder.toString()));
        if (!((File)object).exists()) {
            ((File)object).mkdirs();
        }
        return object;
    }

    public static File m(Context object, String string) {
        if (!((File)(object = new File(a.n((Context)object), string))).exists()) {
            ((File)object).mkdirs();
        }
        return object;
    }

    public static File n(Context context) {
        return new File(a.h(context), "temp");
    }

    public static ArrayList<File> o(Context object) {
        File[] fileArray = e.C(object);
        object = new ArrayList();
        if (fileArray != null && (fileArray = fileArray.listFiles(new FilenameFilter(){

            @Override
            public boolean accept(File file, String string) {
                return string.contains("thumbnail");
            }
        })) != null) {
            Collections.addAll(object, fileArray);
        }
        return object;
    }

    public static boolean p(Context context, String string) {
        return d0.I(a.k(context).getAbsolutePath(), string);
    }

    public static class b
    extends q<Void, Void, Void> {
        Context h;

        public b(Context context) {
            super(q.e.g0);
            this.h = context.getApplicationContext();
        }

        protected Void w(Void ... voidArray) {
            a.b(this.h);
            j.F().w();
            return null;
        }
    }
}

