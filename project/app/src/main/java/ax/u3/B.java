/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.util.AndroidRuntimeException;
import android.util.Base64;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.fragment.app.t;
import ax.Ha.c;
import ax.Q.b;
import ax.X2.Q;
import ax.X2.v;
import ax.b3.j;
import ax.c3.G;
import ax.c3.u;
import ax.c3.x;
import ax.g6.a;
import ax.u3.A;
import com.voxdon.xplorer.activity.RestartActivity;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.y;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class B {
    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private static Thread A(String var0) {
        var5_2 = Thread.currentThread().getThreadGroup();
        while ((var6_3 = var5_2.getParent()) != null) {
            var5_2 = var6_3;
        }
        var1_4 = var5_2.activeCount();
        while (true) {
            var2_5 = var1_4 * 2;
            var6_3 = new Thread[var2_5];
            var3_6 = var5_2.enumerate((Thread[])var6_3, true);
            var1_4 = var2_5;
            if (var3_6 == var2_5) continue;
            break;
        }
        ** try [egrp 3[TRYBLOCK] [4 : 59->74)] { 
lbl16:
        // 2 sources

        for (Object var6_3 : Arrays.copyOf(var6_3, var3_6)) {
            var4_7 = var6_3.getName().equals(var0);
            if (!var4_7) continue;
            return var6_3;
        }
lbl21:
        // 2 sources

        return null;
lbl23:
        // 5 sources

        catch (Exception var0_1) {
            ** continue;
        }
    }

    /*
     * Exception decompiling
     */
    private static Bitmap B(MediaMetadataRetriever var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [12 : 194->211)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static Intent C(String string) {
        return new Intent("android.intent.action.VIEW", Uri.parse((String)string)).setFlags(0x10000000);
    }

    public static boolean D(String object) {
        if ((object = B.A((String)object)) != null) {
            B.E((Thread)object);
            return true;
        }
        return false;
    }

    private static void E(Thread thread) {
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){

            @Override
            public void uncaughtException(Thread object, Throwable serializable) {
                object = object != null ? ((Thread)object).getName() : "";
                if (serializable == null) {
                    ax.Ha.b b8 = c.h().f().b("UNHANDLED GOOGLE API THREAD 1");
                    serializable = new StringBuilder();
                    ((StringBuilder)serializable).append("thread : ");
                    ((StringBuilder)serializable).append((String)object);
                    b8.g(((StringBuilder)serializable).toString()).h();
                    return;
                }
                ax.Ha.b b9 = c.h().f().b("UNHANDLED GOOGLE API THREAD 2").l((Throwable)serializable);
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("thread : ");
                ((StringBuilder)serializable).append((String)object);
                b9.g(((StringBuilder)serializable).toString()).h();
            }
        });
    }

    public static boolean F(Fragment fragment, boolean bl) {
        boolean bl2 = !bl || fragment.R0() != null;
        return !fragment.f1() && fragment.f0() != null && bl2;
    }

    public static boolean G(String string) {
        for (int i8 = 0; i8 < string.length(); ++i8) {
            if (string.charAt(i8) <= '\u007f') continue;
            return false;
        }
        return true;
    }

    public static boolean H() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean I(String object) {
        if (Character.isDigit(((String)object).charAt(0))) {
            int n8 = ((String)object).length();
            object = ((String)object).toCharArray();
            int n9 = 0;
            int n10 = 0;
            while (n9 < n8) {
                int n11 = n9 + 1;
                if (!Character.isDigit((char)object[n9])) break;
                if (n11 == n8 && n10 == 3) {
                    return true;
                }
                if (n11 < n8 && object[n11] == 46) {
                    ++n10;
                    n9 += 2;
                    continue;
                }
                n9 = n11;
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean J(Context object) {
        try {
            for (String string : B.p(object.getPackageManager().getPackageInfo((String)object.getPackageName(), (int)64).signatures)) {
                if (string == null) continue;
            }
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
        {
            String string;
            boolean bl = string.startsWith("96SB");
            if (!bl) continue;
            return true;
        }
        return false;
    }

    public static boolean K(Context object, Intent intent) {
        return (object = object.getPackageManager().queryIntentActivities(intent, 65536)) != null && object.size() > 0;
    }

    public static boolean L(Context context, String string) {
        context = context.getPackageManager();
        try {
            context.getPackageInfo(string, 0);
            return true;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean M(int n8) {
        Exception exception2;
        block6: {
            ServerSocket serverSocket;
            if (n8 >= 65536) return false;
            if (n8 <= 1025) {
                return false;
            }
            try {
                serverSocket = new ServerSocket(n8);
            }
            catch (Exception exception2) {
                break block6;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            try {
                serverSocket.close();
                return true;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                return true;
            }
        }
        exception2.printStackTrace();
        return false;
    }

    public static boolean N(Context context) {
        return B.r(context) > 200;
    }

    public static Snackbar O(View object, CharSequence charSequence, int n8, int n9, boolean bl, View.OnClickListener onClickListener) {
        object = Snackbar.o0((View)object, charSequence, n8);
        ((Snackbar)object).u0(-1);
        ((Snackbar)object).s0(-256);
        ((Snackbar)object).q0(n9, onClickListener);
        if (bl) {
            ((BaseTransientBottomBar)object).H().setOnClickListener(new View.OnClickListener(){
                final View.OnClickListener a;
                final Snackbar b;
                {
                    this.a = onClickListener;
                    this.b = snackbar;
                }

                public void onClick(View view) {
                    this.a.onClick(view);
                    this.b.x();
                }
            });
        }
        ((BaseTransientBottomBar)object).H().setFocusable(false);
        ((BaseTransientBottomBar)object).H().setBackgroundResource(2131231456);
        B.l((Snackbar)object, 4);
        if (Q.W1()) {
            ((BaseTransientBottomBar)object).W(true);
        }
        return object;
    }

    public static String P(float f8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(B.Q(f8));
        stringBuilder.append("%");
        return stringBuilder.toString();
    }

    public static String Q(float f8) {
        if (f8 < 0.0f) {
            return "--";
        }
        if (f8 >= 1.0f) {
            return String.valueOf((int)f8);
        }
        if (f8 == 0.0f) {
            return "0";
        }
        if (f8 < 0.1f) {
            return String.format("%.2f", Float.valueOf(f8));
        }
        return String.format("%.1f", Float.valueOf(f8));
    }

    public static String R(float f8) {
        if (f8 < 0.0f) {
            return "--";
        }
        if (f8 >= 1.0f) {
            return String.valueOf((int)f8);
        }
        if (f8 == 0.0f) {
            return "0";
        }
        if (f8 < 0.1f) {
            return String.format(Locale.US, "%.2f", Float.valueOf(f8));
        }
        return String.format(Locale.US, "%.1f", Float.valueOf(f8));
    }

    public static Snackbar S(View view, int n8, int n9) {
        return B.T(view, view.getResources().getText(n8), n9);
    }

    public static Snackbar T(View view, CharSequence charSequence, int n8) {
        return B.U(view, charSequence, n8, 4);
    }

    public static Snackbar U(View object, CharSequence charSequence, int n8, int n9) {
        object = Snackbar.o0((View)object, charSequence, n8);
        ((Snackbar)object).u0(-1);
        ((BaseTransientBottomBar)object).H().setBackgroundResource(2131231456);
        B.l((Snackbar)object, n9);
        if (Q.W1()) {
            ((BaseTransientBottomBar)object).W(true);
        }
        return object;
    }

    public static boolean V(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return B.N(context);
        }
        return false;
    }

    public static int W(String string, char c8, int n8) {
        int n9 = n8;
        for (int i8 = 0; i8 < string.length(); ++i8) {
            n8 = n9--;
            if (string.charAt(i8) == c8) {
                n8 = n9;
                if (n9 == 0) {
                    return i8;
                }
            }
            n9 = n8;
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void X(ValueCallback<Boolean> valueCallback) {
        if (Q.t0()) {
            try {
                v.q(valueCallback);
                return;
            }
            catch (AndroidRuntimeException androidRuntimeException) {
                if (valueCallback == null) return;
                valueCallback.onReceiveValue(null);
                return;
            }
        }
        try {
            CookieManager.getInstance().removeAllCookie();
        }
        catch (AndroidRuntimeException androidRuntimeException) {
            // empty catch block
        }
        if (valueCallback == null) return;
        valueCallback.onReceiveValue(null);
    }

    public static void Y(Context context) {
        Intent intent = new Intent(context, RestartActivity.class);
        intent.addFlags(0x10000000);
        intent.putExtra("pid", Process.myPid());
        context.startActivity(intent);
    }

    public static void Z(Handler handler, Runnable runnable2) {
        if (B.H()) {
            runnable2.run();
            return;
        }
        handler.post(runnable2);
    }

    public static <T extends Comparable> int a(T t8, T t9) {
        if (t8 != null) {
            if (t9 != null) {
                return t8.compareTo(t9);
            }
            return 1;
        }
        if (t9 != null) {
            return -1;
        }
        return 0;
    }

    public static void a0(Runnable runnable2) {
        B.Z(new Handler(Looper.getMainLooper()), runnable2);
    }

    public static int b(int n8, int n9) {
        if (n8 < n9) {
            return -1;
        }
        if (n8 == n9) {
            return 0;
        }
        return 1;
    }

    private static Bitmap b0(Bitmap bitmap, int n8) {
        int n9 = bitmap.getWidth();
        int n10 = bitmap.getHeight();
        int n11 = Math.max(n9, n10);
        Bitmap bitmap2 = bitmap;
        if (n11 > n8) {
            float f8 = (float)n8 / (float)n11;
            bitmap2 = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)Math.round((float)n9 * f8), (int)Math.round(f8 * (float)n10), (boolean)true);
        }
        return bitmap2;
    }

    public static int c(long l8, long l9) {
        long l10 = l8 == l9 ? 0 : (l8 < l9 ? -1 : 1);
        if (l10 < 0) {
            return -1;
        }
        if (l10 == false) {
            return 0;
        }
        return 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void c0(Context context, Class<?> clazz, boolean bl) {
        int n8;
        ComponentName componentName;
        PackageManager packageManager;
        try {
            packageManager = context.getPackageManager();
            componentName = new ComponentName(context, clazz);
            n8 = bl ? 1 : 2;
        }
        catch (Exception exception) {
            return;
        }
        packageManager.setComponentEnabledSetting(componentName, n8, 1);
    }

    public static byte[] d(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        byte[] byArray4 = new byte[byArray.length + byArray2.length + byArray3.length];
        System.arraycopy(byArray, 0, byArray4, 0, byArray.length);
        System.arraycopy(byArray2, 0, byArray4, byArray.length, byArray2.length);
        System.arraycopy(byArray3, 0, byArray4, byArray.length + byArray2.length, byArray3.length);
        return byArray4;
    }

    public static void d0(FragmentManager object, e e8, String string, boolean bl) {
        if (((FragmentManager)object).Q0()) {
            return;
        }
        t t8 = ((FragmentManager)object).o();
        if (bl && (object = ((FragmentManager)object).k0(string)) != null) {
            t8.q((Fragment)object);
        }
        e8.b3(t8, string);
    }

    public static int e(Context context, int n8) {
        return (int)((float)n8 * B.s(context));
    }

    private static void e0(Context context, Intent object) {
        if (B.V(context)) {
            try {
                b.m(context, (Intent)object);
                return;
            }
            catch (IllegalStateException illegalStateException) {
                illegalStateException.printStackTrace();
                if (Q.a0()) {
                    try {
                        context.startService((Intent)object);
                        return;
                    }
                    catch (RuntimeException runtimeException) {
                        runtimeException.printStackTrace();
                        throw illegalStateException;
                    }
                }
                object = c.h().f().b("START FOREGROUND IN BACKGROUND").l(illegalStateException);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("importance:");
                stringBuilder.append(B.r(context));
                ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                throw illegalStateException;
            }
        }
        try {
            context.startService((Intent)object);
            return;
        }
        catch (RuntimeException runtimeException) {
            object = c.h().f().b("START SERVICE ERROR").l(runtimeException);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("importance:");
            stringBuilder.append(B.r(context));
            ((ax.Ha.b)object).g(stringBuilder.toString()).h();
            throw runtimeException;
        }
    }

    public static int f(Context context, int n8) {
        return (int)((float)n8 / B.s(context));
    }

    public static void f0(Context context, Intent intent, boolean bl, boolean bl2) {
        if (Q.a0()) {
            try {
                b.m(context, intent);
                return;
            }
            catch (IllegalStateException illegalStateException) {
                if (bl2) {
                    ax.Ha.b b8 = c.h().f().b("START FOREGROUND SERVICE ANDROID 12").l(illegalStateException);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("importance:");
                    stringBuilder.append(B.r(context));
                    b8.g(stringBuilder.toString()).h();
                }
                if (bl) {
                    try {
                        context.startService(intent);
                        return;
                    }
                    catch (RuntimeException runtimeException) {
                        runtimeException.printStackTrace();
                        throw illegalStateException;
                    }
                }
                throw illegalStateException;
            }
        }
        B.e0(context, intent);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Bitmap g(Context object, String string, FileDescriptor object2, Uri uri, int n8) {
        block18: {
            Throwable throwable2222;
            MediaMetadataRetriever mediaMetadataRetriever;
            block19: {
                block17: {
                    block16: {
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                        if (string != null) {
                            block15: {
                                try {
                                    object2 = new File(string);
                                    if (((File)object2).length() != 0L) break block15;
                                    object2 = x.f((File)object2);
                                    try {
                                        mediaMetadataRetriever.setDataSource(object, u.x((y)((o)object2).z(string)));
                                    }
                                    catch (j j8) {
                                        mediaMetadataRetriever.setDataSource(string);
                                    }
                                    break block16;
                                }
                                catch (Throwable throwable2222) {
                                    break block17;
                                }
                            }
                            mediaMetadataRetriever.setDataSource(string);
                        } else if (uri != null) {
                            string = uri.toString();
                            object = new HashMap();
                            mediaMetadataRetriever.setDataSource(string, (Map)object);
                        } else {
                            mediaMetadataRetriever.setDataSource((FileDescriptor)object2);
                        }
                    }
                    object = B.B(mediaMetadataRetriever);
                    try {
                        mediaMetadataRetriever.release();
                    }
                    catch (Exception exception) {}
                    break block18;
                }
                try {}
                catch (Exception exception) {
                    throw throwable2222;
                }
                break block19;
                catch (IllegalArgumentException | RuntimeException runtimeException) {
                    try {
                        mediaMetadataRetriever.release();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    object = null;
                    break block18;
                }
            }
            mediaMetadataRetriever.release();
            throw throwable2222;
        }
        if (object != null) return B.b0((Bitmap)object, n8);
        return null;
    }

    public static boolean g0(Context context) {
        try {
            a.a(context.getApplicationContext());
            return true;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Bitmap h(MediaDataSource mediaDataSource, int n8) {
        Throwable throwable2;
        block10: {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            A.a(mediaMetadataRetriever, mediaDataSource);
            mediaDataSource = mediaMetadataRetriever.getFrameAtTime(-1L);
            try {
                mediaMetadataRetriever.release();
            }
            catch (Exception exception) {}
            break block10;
            catch (Throwable throwable2) {
                mediaMetadataRetriever.release();
                throw throwable2;
            }
            catch (IllegalArgumentException | RuntimeException runtimeException) {
                try {
                    mediaMetadataRetriever.release();
                    return null;
                }
                catch (Exception exception) {
                    // empty catch block
                }
                return null;
            }
        }
        if (mediaDataSource != null) return B.b0((Bitmap)mediaDataSource, n8);
        return null;
        {
            catch (Exception exception) {
                throw throwable2;
            }
        }
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Bitmap i(G g8, int n8) {
        Throwable throwable2;
        block10: {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            AutoCloseable autoCloseable = new AutoCloseable(g8){
                InputStream c0;
                final G d0;
                long q;
                {
                    this.d0 = g8;
                    this.q = 0L;
                }

                @Override
                public void close() throws IOException {
                    InputStream inputStream = this.c0;
                    if (inputStream != null) {
                        inputStream.close();
                        this.c0 = null;
                        this.q = 0L;
                    }
                }

                public long getSize() throws IOException {
                    return this.d0.d();
                }

                public int readAt(long l8, byte[] byArray, int n8, int n9) throws IOException {
                    InputStream inputStream;
                    block8: {
                        block7: {
                            inputStream = this.c0;
                            if (inputStream == null) break block7;
                            if (this.q == l8) break block8;
                            inputStream.close();
                            this.q = 0L;
                        }
                        inputStream = null;
                    }
                    InputStream inputStream2 = inputStream;
                    if (inputStream == null) {
                        try {
                            this.c0 = inputStream2 = this.d0.c(l8);
                            this.q = l8;
                        }
                        catch (j j8) {
                            throw new IOException(j8);
                        }
                    }
                    if ((n8 = inputStream2.read(byArray, n8, n9)) > 0) {
                        this.q += (long)n8;
                    }
                    return n8;
                }
            };
            A.a(mediaMetadataRetriever, (MediaDataSource)autoCloseable);
            g8 = B.B(mediaMetadataRetriever);
            try {
                mediaMetadataRetriever.release();
            }
            catch (Exception exception) {}
            break block10;
            catch (Throwable throwable2) {
                mediaMetadataRetriever.release();
                throw throwable2;
            }
            catch (IllegalArgumentException | RuntimeException runtimeException) {
                try {
                    mediaMetadataRetriever.release();
                    return null;
                }
                catch (Exception exception) {
                    // empty catch block
                }
                return null;
            }
        }
        if (g8 != null) return B.b0((Bitmap)g8, n8);
        return null;
        {
            catch (Exception exception) {
                throw throwable2;
            }
        }
    }

    public static boolean j(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    /*
     * Exception decompiling
     */
    public static byte[] k(Context var0, String var1_6, FileDescriptor var2_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [9, 8, 7 : 59->85)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static void l(Snackbar snackbar, int n8) {
        TextView textView = (TextView)snackbar.H().findViewById(2131362849);
        if (textView != null) {
            textView.setMaxLines(n8);
        }
        if (Q.I()) {
            snackbar.U(1);
            return;
        }
        snackbar.U(0);
    }

    public static String m(long l8) {
        return String.format(Locale.US, "%d:%02d:%02d", l8 / 3600L, l8 % 3600L / 60L, l8 % 60L);
    }

    public static String n(long l8) {
        if ((l8 /= 1000L) > 3600L) {
            return String.format(Locale.US, "%d:%02d:%02d", l8 / 3600L, l8 % 3600L / 60L, l8 % 60L);
        }
        return String.format(Locale.US, "%02d:%02d", l8 / 60L, l8 % 60L);
    }

    public static String o(Signature object) {
        try {
            object = Base64.encodeToString((byte[])MessageDigest.getInstance("SHA-512").digest(object.toByteArray()), (int)10);
            return object;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new IllegalStateException("Platform does not supportSHA-512 hashing");
        }
    }

    public static Set<String> p(Signature[] signatureArray) {
        HashSet<String> hashSet = new HashSet<String>();
        int n8 = signatureArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            hashSet.add(B.o(signatureArray[i8]));
        }
        return hashSet;
    }

    public static Uri q(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("market://details?id=");
        stringBuilder.append(string);
        return Uri.parse((String)stringBuilder.toString());
    }

    public static int r(Context context) {
        try {
            context = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)context);
            int n8 = context.importance;
            return n8;
        }
        catch (SecurityException securityException) {
            c.h().f().b("current importance").l(securityException).h();
            return 300;
        }
    }

    public static float s(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int t(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static int u() {
        int n8 = B.y(1025, 8999);
        if (n8 != 0) {
            return n8;
        }
        n8 = B.y(10000, 30000);
        if (n8 != 0) {
            return n8;
        }
        ax.Ha.b b8 = c.h().f().b("NO AVAILABLE PORT");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("port=");
        stringBuilder.append(n8);
        b8.g(stringBuilder.toString()).h();
        return 33333;
    }

    public static int v() {
        int n8 = B.y(10000, 30000);
        if (n8 != 0) {
            return n8;
        }
        ax.Ha.b b8 = c.h().f().b("NO AVAILABLE PORT 2");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("port=");
        stringBuilder.append(n8);
        b8.g(stringBuilder.toString()).h();
        return 44444;
    }

    public static PackageInfo w(Context context, String string) {
        context = context.getPackageManager();
        try {
            context = context.getPackageInfo(string, 0);
            return context;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return null;
        }
    }

    public static int x(Parcelable object) {
        Parcel parcel = Parcel.obtain();
        parcel.writeValue(object);
        object = parcel.marshall();
        parcel.recycle();
        return ((Parcelable)object).length;
    }

    private static int y(int n8, int n9) {
        Random random = new Random();
        for (int i8 = 0; i8 < 1000; ++i8) {
            int n10 = random.nextInt(n9 - n8) + n8;
            if (!B.M(n10)) continue;
            return n10;
        }
        return 0;
    }

    public static int z(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp;
    }
}

