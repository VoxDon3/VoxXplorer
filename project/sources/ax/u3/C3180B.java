package ax.u3;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
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
import ax.X2.Q;
import ax.b3.C1495j;
import ax.c3.C1832u;
import ax.c3.C1835x;
import ax.c3.G;
import ax.g6.C2126a;
import com.voxdon.xplorer.FileManagerApp;
import com.voxdon.xplorer.activity.RestartActivity;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.R;
import com.google.android.material.snackbar.Snackbar;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.net.ServerSocket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import okhttp3.HttpUrl;

/* renamed from: ax.u3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3180B {

    /* renamed from: ax.u3.B$a */
    class a implements View.OnClickListener {
        final /* synthetic */ View.OnClickListener a;
        final /* synthetic */ Snackbar b;

        a(View.OnClickListener onClickListener, Snackbar snackbar) {
            this.a = onClickListener;
            this.b = snackbar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.onClick(view);
            this.b.x();
        }
    }

    /* renamed from: ax.u3.B$b */
    class b extends MediaDataSource implements AutoCloseable {
        InputStream c0;
        final /* synthetic */ G d0;
        long q = 0;

        b(G g) {
            this.d0 = g;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream inputStream = this.c0;
            if (inputStream != null) {
                inputStream.close();
                this.c0 = null;
                this.q = 0L;
            }
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return this.d0.d();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
        @Override // android.media.MediaDataSource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int readAt(long r5, byte[] r7, int r8, int r9) throws java.io.IOException {
            /*
                r4 = this;
                java.io.InputStream r0 = r4.c0
                if (r0 == 0) goto L12
                long r1 = r4.q
                int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r3 != 0) goto Lb
                goto L13
            Lb:
                r0.close()
                r0 = 0
                r4.q = r0
            L12:
                r0 = 0
            L13:
                if (r0 != 0) goto L27
                ax.c3.G r0 = r4.d0     // Catch: ax.b3.C1495j -> L20
                java.io.InputStream r0 = r0.c(r5)     // Catch: ax.b3.C1495j -> L20
                r4.c0 = r0     // Catch: ax.b3.C1495j -> L20
                r4.q = r5     // Catch: ax.b3.C1495j -> L20
                goto L27
            L20:
                r5 = move-exception
                java.io.IOException r6 = new java.io.IOException
                r6.<init>(r5)
                throw r6
            L27:
                int r5 = r0.read(r7, r8, r9)
                if (r5 <= 0) goto L33
                long r6 = r4.q
                long r8 = (long) r5
                long r6 = r6 + r8
                r4.q = r6
            L33:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.u3.C3180B.b.readAt(long, byte[], int, int):int");
        }
    }

    /* renamed from: ax.u3.B$c */
    class c implements Thread.UncaughtExceptionHandler {
        c() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            String name = thread != null ? thread.getName() : HttpUrl.FRAGMENT_ENCODE_SET;
            if (th == null) {
                ax.Ha.c.h().f().b("UNHANDLED GOOGLE API THREAD 1").g("thread : " + name).h();
                return;
            }
            ax.Ha.c.h().f().b("UNHANDLED GOOGLE API THREAD 2").l(th).g("thread : " + name).h();
        }
    }

    private static Thread A(String str) {
        Thread[] threadArr;
        int enumerate;
        try {
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            while (true) {
                ThreadGroup parent = threadGroup.getParent();
                if (parent == null) {
                    break;
                }
                threadGroup = parent;
            }
            int activeCount = threadGroup.activeCount();
            do {
                activeCount *= 2;
                threadArr = new Thread[activeCount];
                enumerate = threadGroup.enumerate(threadArr, true);
            } while (enumerate == activeCount);
            Thread[] threadArr2 = (Thread[]) Arrays.copyOf(threadArr, enumerate);
            for (Thread thread : threadArr2) {
                if (thread.getName().equals(str)) {
                    return thread;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap B(android.media.MediaMetadataRetriever r15) {
        /*
            byte[] r0 = r15.getEmbeddedPicture()
            r1 = -1
            r3 = 0
            if (r0 == 0) goto La5
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> L92 java.lang.OutOfMemoryError -> L94
            r4.<init>()     // Catch: java.lang.Exception -> L92 java.lang.OutOfMemoryError -> L94
            r5 = 1
            r4.inJustDecodeBounds = r5     // Catch: java.lang.Exception -> L92 java.lang.OutOfMemoryError -> L94
            int r6 = r0.length     // Catch: java.lang.Exception -> L92 java.lang.OutOfMemoryError -> L94
            r7 = 0
            android.graphics.BitmapFactory.decodeByteArray(r0, r7, r6, r4)     // Catch: java.lang.Exception -> L92 java.lang.OutOfMemoryError -> L94
            r4.inJustDecodeBounds = r7     // Catch: java.lang.Exception -> L92 java.lang.OutOfMemoryError -> L94
            int r6 = r4.outWidth     // Catch: java.lang.Exception -> L92 java.lang.OutOfMemoryError -> L94
            int r8 = r4.outHeight     // Catch: java.lang.Exception -> L92 java.lang.OutOfMemoryError -> L94
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Exception -> L92 java.lang.OutOfMemoryError -> L94
            r10 = 1048576(0x100000, float:1.469368E-39)
            int r6 = ax.P4.a.k(r6, r8, r9, r10)     // Catch: java.lang.Exception -> L92 java.lang.OutOfMemoryError -> L94
            r4.inSampleSize = r6     // Catch: java.lang.Exception -> L92 java.lang.OutOfMemoryError -> L94
            r4.inPreferredConfig = r9     // Catch: java.lang.Exception -> L92 java.lang.OutOfMemoryError -> L94
            int r6 = r0.length     // Catch: java.lang.Exception -> L92 java.lang.OutOfMemoryError -> L94
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r0, r7, r6, r4)     // Catch: java.lang.Exception -> L92 java.lang.OutOfMemoryError -> L94
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L4d
            r3.<init>(r0)     // Catch: java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L4d
            ax.y0.a r4 = new ax.y0.a     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
            int r6 = r4.y()     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
            java.lang.String r9 = "Orientation"
            int r0 = r4.l(r9, r5)     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
            r4 = 2
            if (r0 != r4) goto L45
            goto L46
        L45:
            r5 = 0
        L46:
            ax.c3.F.a(r3)     // Catch: java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L4d
            r7 = r5
            goto L60
        L4b:
            r3 = r8
            goto L94
        L4d:
            goto L65
        L4f:
            r0 = move-exception
            goto L8e
        L51:
            ax.c3.F.a(r3)     // Catch: java.lang.Throwable -> L4f
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L4f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L4f
            int r6 = ax.C3.a.a(r4, r1)     // Catch: java.lang.Throwable -> L8c
            ax.c3.F.a(r4)     // Catch: java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L4d
        L60:
            if (r6 != 0) goto L67
            if (r7 == 0) goto L65
            goto L67
        L65:
            r3 = r8
            goto La5
        L67:
            android.graphics.Matrix r13 = new android.graphics.Matrix     // Catch: java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L4d
            r13.<init>()     // Catch: java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L4d
            if (r7 == 0) goto L75
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            r13.postScale(r0, r3)     // Catch: java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L4d
        L75:
            if (r6 == 0) goto L7b
            float r0 = (float) r6     // Catch: java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L4d
            r13.postRotate(r0)     // Catch: java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L4d
        L7b:
            int r11 = r8.getWidth()     // Catch: java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L4d
            int r12 = r8.getHeight()     // Catch: java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L4d
            r14 = 1
            r9 = 0
            r10 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L4d
            r3 = r0
            goto La5
        L8c:
            r0 = move-exception
            r3 = r4
        L8e:
            ax.c3.F.a(r3)     // Catch: java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L4d
            throw r0     // Catch: java.lang.OutOfMemoryError -> L4b java.lang.Exception -> L4d
        L92:
            goto La5
        L94:
            ax.Ha.b r0 = ax.Ha.c.h()
            ax.Ha.b r0 = r0.f()
            java.lang.String r4 = "Embedded thumbnail oom"
            ax.Ha.b r0 = r0.b(r4)
            r0.h()
        La5:
            if (r3 != 0) goto Lab
            android.graphics.Bitmap r3 = r15.getFrameAtTime(r1)
        Lab:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.u3.C3180B.B(android.media.MediaMetadataRetriever):android.graphics.Bitmap");
    }

    public static Intent C(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str)).setFlags(268435456);
    }

    public static boolean D(String str) {
        Thread A = A(str);
        if (A == null) {
            return false;
        }
        E(A);
        return true;
    }

    private static void E(Thread thread) {
        thread.setUncaughtExceptionHandler(new c());
    }

    public static boolean F(Fragment fragment, boolean z) {
        return (fragment.f1() || fragment.f0() == null || !(!z || fragment.R0() != null)) ? false : true;
    }

    public static boolean G(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                return false;
            }
        }
        return true;
    }

    public static boolean H() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean I(String str) {
        if (Character.isDigit(str.charAt(0))) {
            int length = str.length();
            char[] charArray = str.toCharArray();
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                if (!Character.isDigit(charArray[i])) {
                    break;
                }
                if (i3 == length && i2 == 3) {
                    return true;
                }
                if (i3 >= length || charArray[i3] != '.') {
                    i = i3;
                } else {
                    i2++;
                    i += 2;
                }
            }
        }
        return false;
    }

    public static boolean J(Context context) {
        try {
            for (String str : p(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures)) {
                if (str != null && str.startsWith("96SB")) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean K(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0;
    }

    public static boolean L(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean M(int i) {
        if (i < 65536 && i > 1025) {
            try {
                try {
                    new ServerSocket(i).close();
                    return true;
                } catch (IOException e) {
                    e.printStackTrace();
                    return true;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static boolean N(Context context) {
        return r(context) > 200;
    }

    public static Snackbar O(View view, CharSequence charSequence, int i, int i2, boolean z, View.OnClickListener onClickListener) {
        Snackbar o0 = Snackbar.o0(view, charSequence, i);
        o0.u0(-1);
        o0.s0(-256);
        o0.q0(i2, onClickListener);
        if (z) {
            o0.H().setOnClickListener(new a(onClickListener, o0));
        }
        o0.H().setFocusable(false);
        o0.H().setBackgroundResource(R.drawable.snackbar_background);
        l(o0, 4);
        if (Q.W1()) {
            o0.W(true);
        }
        return o0;
    }

    public static String P(float f) {
        return Q(f) + "%";
    }

    public static String Q(float f) {
        return f < 0.0f ? "--" : f >= 1.0f ? String.valueOf((int) f) : f == 0.0f ? "0" : f < 0.1f ? String.format("%.2f", Float.valueOf(f)) : String.format("%.1f", Float.valueOf(f));
    }

    public static String R(float f) {
        return f < 0.0f ? "--" : f >= 1.0f ? String.valueOf((int) f) : f == 0.0f ? "0" : f < 0.1f ? String.format(Locale.US, "%.2f", Float.valueOf(f)) : String.format(Locale.US, "%.1f", Float.valueOf(f));
    }

    public static Snackbar S(View view, int i, int i2) {
        return T(view, view.getResources().getText(i), i2);
    }

    public static Snackbar T(View view, CharSequence charSequence, int i) {
        return U(view, charSequence, i, 4);
    }

    public static Snackbar U(View view, CharSequence charSequence, int i, int i2) {
        Snackbar o0 = Snackbar.o0(view, charSequence, i);
        o0.u0(-1);
        o0.H().setBackgroundResource(R.drawable.snackbar_background);
        l(o0, i2);
        if (Q.W1()) {
            o0.W(true);
        }
        return o0;
    }

    public static boolean V(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return N(context);
        }
        return false;
    }

    public static int W(String str, char c2, int i) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c2 && i - 1 == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static void X(ValueCallback<Boolean> valueCallback) {
        if (!Q.t0()) {
            try {
                CookieManager.getInstance().removeAllCookie();
            } catch (AndroidRuntimeException unused) {
            }
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        try {
            ax.X2.v.q(valueCallback);
        } catch (AndroidRuntimeException unused2) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        }
    }

    public static void Y(Context context) {
        Intent intent = new Intent(context, (Class<?>) RestartActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("pid", Process.myPid());
        context.startActivity(intent);
    }

    public static void Z(Handler handler, Runnable runnable) {
        if (H()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static <T extends Comparable> int a(T t, T t2) {
        if (t == null) {
            return t2 != null ? -1 : 0;
        }
        if (t2 != null) {
            return t.compareTo(t2);
        }
        return 1;
    }

    public static void a0(Runnable runnable) {
        Z(new Handler(Looper.getMainLooper()), runnable);
    }

    public static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    private static Bitmap b0(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int max = Math.max(width, height);
        if (max <= i) {
            return bitmap;
        }
        float f = i / max;
        return Bitmap.createScaledBitmap(bitmap, Math.round(width * f), Math.round(f * height), true);
    }

    public static int c(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static void c0(Context context, Class<?> cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), z ? 1 : 2, 1);
        } catch (Exception unused) {
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, bArr.length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static void d0(FragmentManager fragmentManager, androidx.fragment.app.e eVar, String str, boolean z) {
        Fragment k0;
        if (fragmentManager.Q0()) {
            return;
        }
        androidx.fragment.app.t o = fragmentManager.o();
        if (z && (k0 = fragmentManager.k0(str)) != null) {
            o.q(k0);
        }
        eVar.b3(o, str);
    }

    public static int e(Context context, int i) {
        return (int) (i * s(context));
    }

    private static void e0(Context context, Intent intent) {
        if (!V(context)) {
            try {
                context.startService(intent);
                return;
            } catch (RuntimeException e) {
                ax.Ha.c.h().f().b("START SERVICE ERROR").l(e).g("importance:" + r(context)).h();
                throw e;
            }
        }
        try {
            ax.Q.b.m(context, intent);
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            if (Q.a0()) {
                try {
                    context.startService(intent);
                    return;
                } catch (RuntimeException e3) {
                    e3.printStackTrace();
                    throw e2;
                }
            }
            ax.Ha.c.h().f().b("START FOREGROUND IN BACKGROUND").l(e2).g("importance:" + r(context)).h();
            throw e2;
        }
    }

    public static int f(Context context, int i) {
        return (int) (i / s(context));
    }

    public static void f0(Context context, Intent intent, boolean z, boolean z2) {
        if (!Q.a0()) {
            e0(context, intent);
            return;
        }
        try {
            ax.Q.b.m(context, intent);
        } catch (IllegalStateException e) {
            if (z2) {
                ax.Ha.c.h().f().b("START FOREGROUND SERVICE ANDROID 12").l(e).g("importance:" + r(context)).h();
            }
            if (!z) {
                throw e;
            }
            try {
                context.startService(intent);
            } catch (RuntimeException e2) {
                e2.printStackTrace();
                throw e;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap g(android.content.Context r6, java.lang.String r7, java.io.FileDescriptor r8, android.net.Uri r9, int r10) {
        /*
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r1 = 0
            if (r7 == 0) goto L33
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L53
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L53
            long r2 = r8.length()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L53
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L2f
            com.voxdon.xplorer.file.o r8 = ax.c3.C1835x.f(r8)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L53
            com.voxdon.xplorer.file.n r8 = r8.z(r7)     // Catch: java.lang.Throwable -> L29 ax.b3.C1495j -> L2b java.lang.Throwable -> L53 java.lang.Throwable -> L53
            com.voxdon.xplorer.file.y r8 = (com.voxdon.xplorer.file.C3605y) r8     // Catch: java.lang.Throwable -> L29 ax.b3.C1495j -> L2b java.lang.Throwable -> L53 java.lang.Throwable -> L53
            android.net.Uri r8 = ax.c3.C1832u.x(r8)     // Catch: java.lang.Throwable -> L29 ax.b3.C1495j -> L2b java.lang.Throwable -> L53 java.lang.Throwable -> L53
            r0.setDataSource(r6, r8)     // Catch: java.lang.Throwable -> L29 ax.b3.C1495j -> L2b java.lang.Throwable -> L53 java.lang.Throwable -> L53
            goto L45
        L29:
            r6 = move-exception
            goto L4f
        L2b:
            r0.setDataSource(r7)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L53 java.lang.Throwable -> L53
            goto L45
        L2f:
            r0.setDataSource(r7)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L53 java.lang.Throwable -> L53
            goto L45
        L33:
            if (r9 == 0) goto L42
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L53 java.lang.Throwable -> L53
            java.util.HashMap r7 = new java.util.HashMap     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L53 java.lang.Throwable -> L53
            r7.<init>()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L53 java.lang.Throwable -> L53
            r0.setDataSource(r6, r7)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L53 java.lang.Throwable -> L53
            goto L45
        L42:
            r0.setDataSource(r8)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L53 java.lang.Throwable -> L53
        L45:
            android.graphics.Bitmap r6 = B(r0)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L53 java.lang.Throwable -> L53
            r0.release()     // Catch: java.lang.Exception -> L4d
            goto L59
        L4d:
            goto L59
        L4f:
            r0.release()     // Catch: java.lang.Exception -> L52
        L52:
            throw r6
        L53:
            r0.release()     // Catch: java.lang.Exception -> L57
            goto L58
        L57:
        L58:
            r6 = r1
        L59:
            if (r6 != 0) goto L5c
            return r1
        L5c:
            android.graphics.Bitmap r6 = b0(r6, r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.u3.C3180B.g(android.content.Context, java.lang.String, java.io.FileDescriptor, android.net.Uri, int):android.graphics.Bitmap");
    }

    public static boolean g0(Context context) {
        try {
            C2126a.a(context.getApplicationContext());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap h(android.media.MediaDataSource r4, int r5) {
        /*
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r1 = 0
            ax.u3.C3179A.a(r0, r4)     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L1a
            r2 = -1
            android.graphics.Bitmap r4 = r0.getFrameAtTime(r2)     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L1a
            r0.release()     // Catch: java.lang.Exception -> L13
            goto L20
        L13:
            goto L20
        L15:
            r4 = move-exception
            r0.release()     // Catch: java.lang.Exception -> L19
        L19:
            throw r4
        L1a:
            r0.release()     // Catch: java.lang.Exception -> L1e
            goto L1f
        L1e:
        L1f:
            r4 = r1
        L20:
            if (r4 != 0) goto L23
            return r1
        L23:
            android.graphics.Bitmap r4 = b0(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.u3.C3180B.h(android.media.MediaDataSource, int):android.graphics.Bitmap");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap i(ax.c3.G r3, int r4) {
        /*
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r1 = 0
            ax.u3.B$b r2 = new ax.u3.B$b     // Catch: java.lang.Throwable -> L18 java.lang.Throwable -> L1d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L18 java.lang.Throwable -> L1d
            ax.u3.C3179A.a(r0, r2)     // Catch: java.lang.Throwable -> L18 java.lang.Throwable -> L1d
            android.graphics.Bitmap r3 = B(r0)     // Catch: java.lang.Throwable -> L18 java.lang.Throwable -> L1d
            r0.release()     // Catch: java.lang.Exception -> L16
            goto L23
        L16:
            goto L23
        L18:
            r3 = move-exception
            r0.release()     // Catch: java.lang.Exception -> L1c
        L1c:
            throw r3
        L1d:
            r0.release()     // Catch: java.lang.Exception -> L21
            goto L22
        L21:
        L22:
            r3 = r1
        L23:
            if (r3 != 0) goto L26
            return r1
        L26:
            android.graphics.Bitmap r3 = b0(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.u3.C3180B.i(ax.c3.G, int):android.graphics.Bitmap");
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static byte[] k(Context context, String str, FileDescriptor fileDescriptor) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                if (str != null) {
                    File file = new File(str);
                    if (file.length() == 0) {
                        try {
                            mediaMetadataRetriever.setDataSource(context, C1832u.x((C3605y) C1835x.f(file).z(str)));
                        } catch (C1495j unused) {
                            mediaMetadataRetriever.setDataSource(str);
                        }
                    } else {
                        mediaMetadataRetriever.setDataSource(str);
                    }
                } else {
                    mediaMetadataRetriever.setDataSource(fileDescriptor);
                }
                byte[] embeddedPicture = mediaMetadataRetriever.getEmbeddedPicture();
                try {
                    return embeddedPicture;
                } catch (Exception unused2) {
                    return embeddedPicture;
                }
            } catch (IllegalArgumentException unused3) {
                FileManagerApp.b("Can't retrieve metadata from audio file : " + str);
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused4) {
                }
                return null;
            } catch (RuntimeException unused5) {
                FileManagerApp.b("Can't retrieve metadata from audio file : " + str);
                mediaMetadataRetriever.release();
                return null;
            }
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused6) {
            }
        }
    }

    private static void l(Snackbar snackbar, int i) {
        TextView textView = (TextView) snackbar.H().findViewById(R.id.snackbar_text);
        if (textView != null) {
            textView.setMaxLines(i);
        }
        if (Q.I()) {
            snackbar.U(1);
        } else {
            snackbar.U(0);
        }
    }

    public static String m(long j) {
        return String.format(Locale.US, "%d:%02d:%02d", Long.valueOf(j / 3600), Long.valueOf((j % 3600) / 60), Long.valueOf(j % 60));
    }

    public static String n(long j) {
        long j2 = j / 1000;
        return j2 > 3600 ? String.format(Locale.US, "%d:%02d:%02d", Long.valueOf(j2 / 3600), Long.valueOf((j2 % 3600) / 60), Long.valueOf(j2 % 60)) : String.format(Locale.US, "%02d:%02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60));
    }

    public static String o(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Platform does not supportSHA-512 hashing");
        }
    }

    public static Set<String> p(Signature[] signatureArr) {
        HashSet hashSet = new HashSet();
        for (Signature signature : signatureArr) {
            hashSet.add(o(signature));
        }
        return hashSet;
    }

    public static Uri q(String str) {
        return Uri.parse("market://details?id=" + str);
    }

    public static int r(Context context) {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance;
        } catch (SecurityException e) {
            ax.Ha.c.h().f().b("current importance").l(e).h();
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
        int y = y(1025, 8999);
        if (y != 0) {
            return y;
        }
        int y2 = y(10000, 30000);
        if (y2 != 0) {
            return y2;
        }
        ax.Ha.c.h().f().b("NO AVAILABLE PORT").g("port=" + y2).h();
        return 33333;
    }

    public static int v() {
        int y = y(10000, 30000);
        if (y != 0) {
            return y;
        }
        ax.Ha.c.h().f().b("NO AVAILABLE PORT 2").g("port=" + y).h();
        return 44444;
    }

    public static PackageInfo w(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int x(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(parcelable);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall.length;
    }

    private static int y(int i, int i2) {
        Random random = new Random();
        for (int i3 = 0; i3 < 1000; i3++) {
            int nextInt = random.nextInt(i2 - i) + i;
            if (M(nextInt)) {
                return nextInt;
            }
        }
        return 0;
    }

    public static int z(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp;
    }
}
