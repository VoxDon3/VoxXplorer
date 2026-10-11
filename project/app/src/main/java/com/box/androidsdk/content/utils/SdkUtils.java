/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.utils;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import android.widget.Toast;
import ax.H3.b;
import ax.H3.g;
import ax.I3.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SdkUtils {
    protected static final int[] a = new int[]{-4056997, -1231017, -103524, -680300, -551424, -675045, -4733409, -14237055, -15359317, -11221777, -15620865, -9467905, -12627501, -10011977, -5552196};
    private static final char[] b = "0123456789abcdef".toCharArray();
    private static HashMap<Integer, Long> c = new HashMap<Integer, Long>(10){

        private void b() {
            long l8 = System.currentTimeMillis();
            long l9 = d;
            for (Map.Entry entry : ((AbstractMap)this).entrySet()) {
                if ((Long)entry.getValue() >= l8 - l9) continue;
                c.remove(entry);
            }
        }

        public Long c(Integer number, Long l8) {
            number = super.put(number, l8);
            if (((AbstractMap)this).size() > 9) {
                this.b();
            }
            return number;
        }
    };
    public static long d = 3000L;
    private static String e = "%4.0f B";
    private static String f = "%4.1f KB";
    private static String g = "%4.1f MB";
    private static String h = "%4.1f GB";
    private static String i = "%4.1f TB";
    private static String j = "";

    public static String b(String[] stringArray, String string) {
        int n8;
        StringBuilder stringBuilder = new StringBuilder();
        int n9 = stringArray.length;
        for (int i8 = 0; i8 < (n8 = n9 - 1); ++i8) {
            stringBuilder.append(stringArray[i8]);
            stringBuilder.append(string);
        }
        stringBuilder.append(stringArray[n8]);
        return stringBuilder.toString();
    }

    public static void c(InputStream inputStream, OutputStream outputStream) throws IOException, InterruptedException {
        SdkUtils.d(inputStream, outputStream, null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void d(InputStream object, OutputStream outputStream, MessageDigest messageDigest) throws IOException, InterruptedException {
        Throwable throwable2;
        Exception exception;
        block9: {
            Exception exception22;
            block10: {
                byte[] byArray = new byte[8192];
                while (true) {
                    Exception exception3;
                    exception = exception3 = null;
                    try {
                        int n8 = ((InputStream)object).read(byArray);
                        if (n8 <= 0) break;
                        exception = exception3;
                        if (Thread.currentThread().isInterrupted()) {
                            exception = exception3;
                            exception = exception3;
                            object = new InterruptedException();
                            exception = exception3;
                            throw object;
                        }
                        exception = exception3;
                        outputStream.write(byArray, 0, n8);
                        if (messageDigest == null) continue;
                        exception = exception3;
                        messageDigest.update(byArray, 0, n8);
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    catch (Exception exception22) {
                        break block10;
                    }
                }
                outputStream.flush();
                return;
            }
            exception = exception22;
            {
                if (exception22 instanceof IOException) {
                    exception = exception22;
                    throw (IOException)exception22;
                }
                exception = exception22;
                if (!(exception22 instanceof InterruptedException)) {
                    return;
                }
                exception = exception22;
                throw (InterruptedException)exception22;
            }
        }
        if (exception == null) {
            outputStream.flush();
        }
        throw throwable2;
    }

    public static String e(InputStream inputStream, OutputStream outputStream) throws NoSuchAlgorithmException, IOException, InterruptedException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        SdkUtils.d(inputStream, outputStream, messageDigest);
        return new String(SdkUtils.h(messageDigest.digest()));
    }

    public static ThreadPoolExecutor f(int n8, int n9, long l8, TimeUnit timeUnit) {
        return new g(n8, n9, l8, timeUnit, new LinkedBlockingQueue<Runnable>(), new ThreadFactory(){

            @Override
            public Thread newThread(Runnable runnable2) {
                return new Thread(runnable2);
            }
        });
    }

    public static boolean g(File file) {
        if (file.isDirectory()) {
            File[] fileArray = file.listFiles();
            if (fileArray == null) {
                return false;
            }
            int n8 = fileArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                SdkUtils.g(fileArray[i8]);
            }
        }
        return file.delete();
    }

    private static char[] h(byte[] byArray) {
        int n8 = byArray.length;
        char[] cArray = new char[n8 << 1];
        int n9 = 0;
        int n10 = 0;
        while (true) {
            int n11 = n10;
            if (n9 >= n8) break;
            char[] cArray2 = b;
            byte by = byArray[n9];
            cArray[n11] = cArray2[(by & 0xF0) >>> 4];
            n10 = n11 + 2;
            cArray[n11 + 1] = cArray2[by & 0xF];
            ++n9;
        }
        return cArray;
    }

    public static String i() {
        return UUID.randomUUID().toString();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String j(Context object, String string) {
        RuntimeException var3_8;
        block16: {
            Object object2;
            block17: {
                object2 = object.getAssets();
                object = null;
                CharSequence charSequence = new StringBuilder();
                InputStream inputStream = object2.open(string);
                Object object3 = new InputStreamReader(inputStream);
                object2 = new BufferedReader((Reader)object3);
                boolean bl = true;
                while (true) {
                    object = object2;
                    try {
                        object3 = ((BufferedReader)object2).readLine();
                        if (object3 == null) break;
                        if (bl) {
                            bl = false;
                        } else {
                            object = object2;
                            ((StringBuilder)charSequence).append('\n');
                        }
                        object = object2;
                        ((StringBuilder)charSequence).append((String)object3);
                    }
                    catch (Throwable throwable) {
                        break block16;
                    }
                    catch (IOException iOException) {
                        break block17;
                    }
                }
                object = object2;
                charSequence = ((StringBuilder)charSequence).toString();
                try {
                    ((BufferedReader)object2).close();
                    return charSequence;
                }
                catch (Exception exception) {
                    ax.H3.b.b("getAssetFile", string, exception);
                    return charSequence;
                }
                catch (Throwable throwable) {
                    break block16;
                }
                catch (IOException iOException) {
                    object2 = null;
                }
            }
            object = object2;
            {
                Throwable var4_12;
                ax.H3.b.b("getAssetFile", string, (Throwable)var4_12);
                if (object2 == null) return null;
            }
            try {
                ((BufferedReader)object2).close();
                return null;
            }
            catch (Exception exception) {
                ax.H3.b.b("getAssetFile", string, exception);
            }
            return null;
        }
        if (object == null) throw var3_8;
        try {
            object.close();
            throw var3_8;
        }
        catch (Exception exception) {
            ax.H3.b.b("getAssetFile", string, exception);
        }
        throw var3_8;
    }

    public static boolean k(String string) {
        return string == null || string.trim().length() == 0;
        {
        }
    }

    public static boolean l(String string) {
        return string == null || string.length() == 0;
        {
        }
    }

    public static boolean m(Context context) {
        return SdkUtils.n((ConnectivityManager)context.getApplicationContext().getSystemService("connectivity"));
    }

    private static boolean n(ConnectivityManager connectivityManager) {
        Network[] networkArray = connectivityManager.getAllNetworks();
        if (networkArray != null) {
            int n8 = networkArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(networkArray[i8]);
                if (networkInfo == null || !networkInfo.isConnected() || networkInfo.getType() != 1 && networkInfo.getType() != 0) continue;
                return true;
            }
        }
        return false;
    }

    public static void o(Context object, TextView textView, int n8) {
        if (n8 >= 100) {
            object = "+99";
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append("+");
            ((StringBuilder)object).append(Integer.toString(n8));
            object = ((StringBuilder)object).toString();
        }
        SdkUtils.p(textView);
        textView.setTextColor(-1);
        textView.setText((CharSequence)object);
    }

    public static void p(TextView textView) {
        SdkUtils.r(textView, -14997455, -1);
    }

    public static void q(TextView textView, int n8) {
        int[] nArray = a;
        SdkUtils.r(textView, nArray[n8 % nArray.length], -1);
    }

    public static void r(TextView textView, int n8, int n9) {
        GradientDrawable gradientDrawable = (GradientDrawable)textView.getResources().getDrawable(ax.I3.a.b);
        gradientDrawable.setColorFilter(n8, PorterDuff.Mode.MULTIPLY);
        gradientDrawable.setStroke(3, n9);
        textView.setBackground((Drawable)gradientDrawable);
    }

    /*
     * Unable to fully structure code
     */
    public static void s(Context var0, TextView var1_1, String var2_2) {
        var3_3 = '\u0000';
        if (var2_2 == null) ** GOTO lbl-1000
        var0 = var2_2.split(" ");
        var3_3 = var0[0].length() > 0 ? var0[0].charAt(0) : '\u0000';
        if (((String[])var0).length > 1) {
            var4_4 = var0[((Object)var0).length - 1].charAt(0);
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = '\u0000';
        }
        SdkUtils.q(var1_1, var3_3 + var4_4);
        var0 = new StringBuilder();
        var0.append(var3_3);
        var0.append("");
        var0.append(var4_4);
        var1_1.setText((CharSequence)var0.toString());
        var1_1.setTextColor(-1);
    }

    public static void t(Context context, int n8, int n9) {
        Long l8 = c.get(n8);
        if (l8 != null && l8 + d > System.currentTimeMillis()) {
            return;
        }
        l8 = Looper.getMainLooper();
        if (Thread.currentThread().equals(l8.getThread())) {
            c.put(n8, System.currentTimeMillis());
            Toast.makeText((Context)context, (int)n8, (int)n9).show();
            return;
        }
        new Handler((Looper)l8).post(new Runnable(){
            final Context c0;
            final int d0;
            final int q;
            {
                this.q = n8;
                this.c0 = context;
                this.d0 = n9;
            }

            @Override
            public void run() {
                c.put(this.q, System.currentTimeMillis());
                Toast.makeText((Context)this.c0, (int)this.q, (int)this.d0).show();
            }
        });
    }
}

