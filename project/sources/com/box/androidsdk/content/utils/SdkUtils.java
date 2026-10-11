package com.box.androidsdk.content.utils;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import android.widget.Toast;
import ax.H3.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class SdkUtils {
    protected static final int[] a = {-4056997, -1231017, -103524, -680300, -551424, -675045, -4733409, -14237055, -15359317, -11221777, -15620865, -9467905, -12627501, -10011977, -5552196};
    private static final char[] b = "0123456789abcdef".toCharArray();
    private static HashMap<Integer, Long> c = new HashMap<Integer, Long>(10) { // from class: com.box.androidsdk.content.utils.SdkUtils.3
        private void b() {
            long currentTimeMillis = System.currentTimeMillis() - SdkUtils.d;
            for (Map.Entry<Integer, Long> entry : entrySet()) {
                if (entry.getValue().longValue() < currentTimeMillis) {
                    SdkUtils.c.remove(entry);
                }
            }
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long put(Integer num, Long l) {
            Long l2 = (Long) super.put(num, l);
            if (size() > 9) {
                b();
            }
            return l2;
        }
    };
    public static long d = 3000;
    private static String e = "%4.0f B";
    private static String f = "%4.1f KB";
    private static String g = "%4.1f MB";
    private static String h = "%4.1f GB";
    private static String i = "%4.1f TB";
    private static String j = HttpUrl.FRAGMENT_ENCODE_SET;

    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable);
        }
    }

    class b implements Runnable {
        final /* synthetic */ Context c0;
        final /* synthetic */ int d0;
        final /* synthetic */ int q;

        b(int i, Context context, int i2) {
            this.q = i;
            this.c0 = context;
            this.d0 = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            SdkUtils.c.put(Integer.valueOf(this.q), Long.valueOf(System.currentTimeMillis()));
            Toast.makeText(this.c0, this.q, this.d0).show();
        }
    }

    public static String b(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i2 >= i3) {
                sb.append(strArr[i3]);
                return sb.toString();
            }
            sb.append(strArr[i2]);
            sb.append(str);
            i2++;
        }
    }

    public static void c(InputStream inputStream, OutputStream outputStream) throws IOException, InterruptedException {
        d(inputStream, outputStream, null);
    }

    private static void d(InputStream inputStream, OutputStream outputStream, MessageDigest messageDigest) throws IOException, InterruptedException {
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        outputStream.flush();
                        return;
                    } else {
                        if (Thread.currentThread().isInterrupted()) {
                            throw new InterruptedException();
                        }
                        outputStream.write(bArr, 0, read);
                        if (messageDigest != null) {
                            messageDigest.update(bArr, 0, read);
                        }
                    }
                } catch (Exception e2) {
                    if (e2 instanceof IOException) {
                        throw ((IOException) e2);
                    }
                    if (e2 instanceof InterruptedException) {
                        throw ((InterruptedException) e2);
                    }
                    return;
                }
            } catch (Throwable th) {
                if (0 == 0) {
                    outputStream.flush();
                }
                throw th;
            }
        }
    }

    public static String e(InputStream inputStream, OutputStream outputStream) throws NoSuchAlgorithmException, IOException, InterruptedException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        d(inputStream, outputStream, messageDigest);
        return new String(h(messageDigest.digest()));
    }

    public static ThreadPoolExecutor f(int i2, int i3, long j2, TimeUnit timeUnit) {
        return new g(i2, i3, j2, timeUnit, new LinkedBlockingQueue(), new a());
    }

    public static boolean g(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            for (File file2 : listFiles) {
                g(file2);
            }
        }
        return file.delete();
    }

    private static char[] h(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = b;
            cArr[i2] = cArr2[(b2 & 240) >>> 4];
            i2 += 2;
            cArr[i3] = cArr2[b2 & 15];
        }
        return cArr;
    }

    public static String i() {
        return UUID.randomUUID().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String j(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "getAssetFile"
            android.content.res.AssetManager r6 = r6.getAssets()
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            r2.<init>()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            java.io.InputStream r6 = r6.open(r7)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            r6 = 1
        L1b:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            if (r4 == 0) goto L33
            if (r6 == 0) goto L25
            r6 = 0
            goto L2a
        L25:
            r5 = 10
            r2.append(r5)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
        L2a:
            r2.append(r4)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            goto L1b
        L2e:
            r6 = move-exception
            r1 = r3
            goto L52
        L31:
            r6 = move-exception
            goto L44
        L33:
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            r3.close()     // Catch: java.lang.Exception -> L3b
            return r6
        L3b:
            r1 = move-exception
            ax.H3.b.b(r0, r7, r1)
            return r6
        L40:
            r6 = move-exception
            goto L52
        L42:
            r6 = move-exception
            r3 = r1
        L44:
            ax.H3.b.b(r0, r7, r6)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L51
            r3.close()     // Catch: java.lang.Exception -> L4d
            goto L51
        L4d:
            r6 = move-exception
            ax.H3.b.b(r0, r7, r6)
        L51:
            return r1
        L52:
            if (r1 == 0) goto L5c
            r1.close()     // Catch: java.lang.Exception -> L58
            goto L5c
        L58:
            r1 = move-exception
            ax.H3.b.b(r0, r7, r1)
        L5c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.box.androidsdk.content.utils.SdkUtils.j(android.content.Context, java.lang.String):java.lang.String");
    }

    public static boolean k(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean l(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean m(Context context) {
        return n((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity"));
    }

    private static boolean n(ConnectivityManager connectivityManager) {
        Network[] allNetworks = connectivityManager.getAllNetworks();
        if (allNetworks != null) {
            for (Network network : allNetworks) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                if (networkInfo != null && networkInfo.isConnected() && (networkInfo.getType() == 1 || networkInfo.getType() == 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void o(Context context, TextView textView, int i2) {
        String str;
        if (i2 >= 100) {
            str = "+99";
        } else {
            str = "+" + Integer.toString(i2);
        }
        p(textView);
        textView.setTextColor(-1);
        textView.setText(str);
    }

    public static void p(TextView textView) {
        r(textView, -14997455, -1);
    }

    public static void q(TextView textView, int i2) {
        int[] iArr = a;
        r(textView, iArr[i2 % iArr.length], -1);
    }

    public static void r(TextView textView, int i2, int i3) {
        GradientDrawable gradientDrawable = (GradientDrawable) textView.getResources().getDrawable(ax.I3.a.b);
        gradientDrawable.setColorFilter(i2, PorterDuff.Mode.MULTIPLY);
        gradientDrawable.setStroke(3, i3);
        textView.setBackground(gradientDrawable);
    }

    public static void s(Context context, TextView textView, String str) {
        char c2;
        char c3 = 0;
        if (str != null) {
            String[] split = str.split(" ");
            char charAt = split[0].length() > 0 ? split[0].charAt(0) : (char) 0;
            if (split.length > 1) {
                c2 = split[split.length - 1].charAt(0);
                c3 = charAt;
                q(textView, c3 + c2);
                textView.setText(c3 + HttpUrl.FRAGMENT_ENCODE_SET + c2);
                textView.setTextColor(-1);
            }
            c3 = charAt;
        }
        c2 = 0;
        q(textView, c3 + c2);
        textView.setText(c3 + HttpUrl.FRAGMENT_ENCODE_SET + c2);
        textView.setTextColor(-1);
    }

    public static void t(Context context, int i2, int i3) {
        Long l = c.get(Integer.valueOf(i2));
        if (l == null || l.longValue() + d <= System.currentTimeMillis()) {
            Looper mainLooper = Looper.getMainLooper();
            if (!Thread.currentThread().equals(mainLooper.getThread())) {
                new Handler(mainLooper).post(new b(i2, context, i3));
            } else {
                c.put(Integer.valueOf(i2), Long.valueOf(System.currentTimeMillis()));
                Toast.makeText(context, i2, i3).show();
            }
        }
    }
}
