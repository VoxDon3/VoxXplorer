/*
 * Decompiled with CFR 0.152.
 */
package ax.k4;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

public final class i {
    private static final char[] a = "0123456789abcdef".toCharArray();
    private static final char[] b = new char[64];

    public static void a() {
        if (i.o()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on a background thread");
    }

    public static void b() {
        if (i.p()) {
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    public static boolean c(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }

    private static String d(byte[] byArray, char[] cArray) {
        for (int i8 = 0; i8 < byArray.length; ++i8) {
            byte by = byArray[i8];
            int n8 = i8 * 2;
            char[] cArray2 = a;
            cArray[n8] = cArray2[(by & 0xFF) >>> 4];
            cArray[n8 + 1] = cArray2[by & 0xF];
        }
        return new String(cArray);
    }

    public static <T> Queue<T> e(int n8) {
        return new ArrayDeque(n8);
    }

    public static int f(int n8, int n9, Bitmap.Config config) {
        return n8 * n9 * i.h(config);
    }

    @TargetApi(value=19)
    public static int g(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                int n8 = bitmap.getAllocationByteCount();
                return n8;
            }
            catch (NullPointerException nullPointerException) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot obtain size for recycled Bitmap: ");
        stringBuilder.append(bitmap);
        stringBuilder.append("[");
        stringBuilder.append(bitmap.getWidth());
        stringBuilder.append("x");
        stringBuilder.append(bitmap.getHeight());
        stringBuilder.append("] ");
        stringBuilder.append(bitmap.getConfig());
        throw new IllegalStateException(stringBuilder.toString());
    }

    private static int h(Bitmap.Config config) {
        Bitmap.Config config2 = config;
        if (config == null) {
            config2 = Bitmap.Config.ARGB_8888;
        }
        int n8 = ax.k4.i$a.a[config2.ordinal()];
        int n9 = 1;
        if (n8 != 1) {
            int n10;
            n9 = n10 = 2;
            if (n8 != 2) {
                n9 = n10;
                if (n8 != 3) {
                    return 4;
                }
            }
        }
        return n9;
    }

    public static <T> List<T> i(Collection<T> object) {
        ArrayList arrayList = new ArrayList(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(object.next());
        }
        return arrayList;
    }

    public static int j(float f8) {
        return i.k(f8, 17);
    }

    public static int k(float f8, int n8) {
        return i.l(Float.floatToIntBits(f8), n8);
    }

    public static int l(int n8, int n9) {
        return n9 * 31 + n8;
    }

    public static int m(Object object, int n8) {
        int n9 = object == null ? 0 : object.hashCode();
        return i.l(n9, n8);
    }

    public static int n(boolean bl, int n8) {
        return i.l(bl ? 1 : 0, n8);
    }

    public static boolean o() {
        return i.p() ^ true;
    }

    public static boolean p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static boolean q(int n8) {
        return n8 > 0 || n8 == Integer.MIN_VALUE;
        {
        }
    }

    public static boolean r(int n8, int n9) {
        return i.q(n8) && i.q(n9);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String s(byte[] object) {
        char[] cArray = b;
        synchronized (cArray) {
            return i.d(object, cArray);
        }
    }
}

