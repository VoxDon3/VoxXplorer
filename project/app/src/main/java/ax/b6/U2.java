/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import ax.B.k;
import ax.C2.C;
import ax.b6.H2;
import ax.b6.N2;
import ax.b6.S2;
import ax.b6.V2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

public final class U2 {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static S2 a(Context object, File object2) {
        Object object3 = new FileInputStream((File)object2);
        Object object4 = new InputStreamReader((InputStream)object3);
        BufferedReader bufferedReader = new BufferedReader((Reader)object4);
        k<String, k<String, String>> k8 = new k<String, k<String, String>>();
        HashMap<String[], Object> hashMap = new HashMap<String[], Object>();
        while ((object3 = bufferedReader.readLine()) != null) {
            String string;
            String string2;
            Object object5;
            block15: {
                block16: {
                    object5 = ((String)object3).split(" ", 3);
                    if (((String[])object5).length != 3) {
                        object4 = new StringBuilder("Invalid: ");
                        ((StringBuilder)object4).append((String)object3);
                        Log.e((String)"HermeticFileOverrides", (String)((StringBuilder)object4).toString());
                        continue;
                    }
                    string2 = U2.c(object5[0]);
                    string = Uri.decode((String)U2.c(object5[1]));
                    object3 = object4 = (String)hashMap.get(object5[2]);
                    if (object4 != null) break block15;
                    object4 = Uri.decode((String)(object5 = U2.c(object5[2])));
                    if (((String)object4).length() < 1024) break block16;
                    object3 = object4;
                    if (object4 != object5) break block15;
                }
                hashMap.put((String[])object5, object4);
                object3 = object4;
            }
            object5 = k8.get(string2);
            object4 = object5;
            if (object5 == null) {
                object4 = new k();
                k8.put(string2, (k<String, String>)object4);
            }
            ((k)object4).put(string, object3);
        }
        object2 = String.valueOf(object2);
        object = object.getPackageName();
        object3 = new StringBuilder("Parsed ");
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(" for Android package ");
        ((StringBuilder)object3).append((String)object);
        Log.w((String)"HermeticFileOverrides", (String)((StringBuilder)object3).toString());
        object = new N2(k8);
        bufferedReader.close();
        return object;
        {
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        catch (Throwable throwable) {}
        try {
            bufferedReader.close();
            throw throwable;
        }
        catch (Throwable throwable) {
            throwable.addSuppressed(throwable);
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static ax.q7.k<S2> b(Context object) {
        Throwable throwable2;
        StrictMode.ThreadPolicy threadPolicy;
        block2: {
            threadPolicy = StrictMode.allowThreadDiskReads();
            try {
                StrictMode.allowThreadDiskWrites();
                ax.q7.k<File> k8 = U2.d(object);
                object = k8.c() ? ax.q7.k.d(U2.a(object, k8.b())) : ax.q7.k.a();
            }
            catch (Throwable throwable2) {
                break block2;
            }
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return object;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw throwable2;
    }

    private static final String c(String string) {
        return new String(string);
    }

    private static ax.q7.k<File> d(Context object) {
        try {
            object = new File(object.getDir("phenotype_hermetic", 0), "overrides.txt");
        }
        catch (RuntimeException runtimeException) {
            Log.e((String)"HermeticFileOverrides", (String)"no data dir", (Throwable)runtimeException);
            return ax.q7.k.a();
        }
        if (((File)object).exists()) {
            return ax.q7.k.d(object);
        }
        return ax.q7.k.a();
    }

    public static class a {
        private static volatile ax.q7.k<S2> a;

        private a() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static ax.q7.k<S2> a(Context object) {
            Object object2 = a;
            if (object2 != null) {
                return object2;
            }
            synchronized (a.class) {
                Throwable throwable2;
                block7: {
                    block6: {
                        block5: {
                            try {
                                ax.q7.k<S2> k8 = a;
                                object2 = k8;
                                if (k8 != null) return object2;
                                new U2();
                                if (V2.c(Build.TYPE, Build.TAGS)) break block5;
                                object = ax.q7.k.a();
                                break block6;
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                        }
                        object2 = object;
                        if (H2.a()) {
                            object2 = C.a((Context)object) ? object : ax.g2.a.a((Context)object);
                        }
                        object = U2.b(object2);
                    }
                    a = object;
                    return object;
                }
                throw throwable2;
            }
        }
    }
}

