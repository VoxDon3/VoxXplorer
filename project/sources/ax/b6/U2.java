package ax.b6;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import ax.q7.AbstractC2884k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class U2 {

    public static class a {
        private static volatile AbstractC2884k<S2> a;

        private a() {
        }

        public static AbstractC2884k<S2> a(Context context) {
            AbstractC2884k<S2> abstractC2884k;
            AbstractC2884k<S2> b;
            boolean isDeviceProtectedStorage;
            AbstractC2884k<S2> abstractC2884k2 = a;
            if (abstractC2884k2 != null) {
                return abstractC2884k2;
            }
            synchronized (a.class) {
                try {
                    abstractC2884k = a;
                    if (abstractC2884k == null) {
                        new U2();
                        if (V2.c(Build.TYPE, Build.TAGS)) {
                            if (H2.a()) {
                                isDeviceProtectedStorage = context.isDeviceProtectedStorage();
                                if (!isDeviceProtectedStorage) {
                                    context = context.createDeviceProtectedStorageContext();
                                }
                            }
                            b = U2.b(context);
                        } else {
                            b = AbstractC2884k.a();
                        }
                        abstractC2884k = b;
                        a = abstractC2884k;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return abstractC2884k;
        }
    }

    private static S2 a(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                ax.B.k kVar = new ax.B.k();
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        N2 n2 = new N2(kVar);
                        bufferedReader.close();
                        return n2;
                    }
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                    } else {
                        String c = c(split[0]);
                        String decode = Uri.decode(c(split[1]));
                        String str = (String) hashMap.get(split[2]);
                        if (str == null) {
                            String c2 = c(split[2]);
                            str = Uri.decode(c2);
                            if (str.length() < 1024 || str == c2) {
                                hashMap.put(c2, str);
                            }
                        }
                        ax.B.k kVar2 = (ax.B.k) kVar.get(c);
                        if (kVar2 == null) {
                            kVar2 = new ax.B.k();
                            kVar.put(c, kVar2);
                        }
                        kVar2.put(decode, str);
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static AbstractC2884k<S2> b(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            AbstractC2884k<File> d = d(context);
            AbstractC2884k<S2> d2 = d.c() ? AbstractC2884k.d(a(context, d.b())) : AbstractC2884k.a();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static final String c(String str) {
        return new String(str);
    }

    private static AbstractC2884k<File> d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? AbstractC2884k.d(file) : AbstractC2884k.a();
        } catch (RuntimeException e) {
            Log.e("HermeticFileOverrides", "no data dir", e);
            return AbstractC2884k.a();
        }
    }
}
