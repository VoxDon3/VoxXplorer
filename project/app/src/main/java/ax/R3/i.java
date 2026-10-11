/*
 * Decompiled with CFR 0.152.
 */
package ax.R3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class i {
    private final int a;
    private final int b;
    private final Context c;
    private final int d;

    i(a a8) {
        this.c = a8.a;
        int n8 = i.f(a8.b) ? a8.h / 2 : a8.h;
        this.d = n8;
        int n9 = i.d(a8.b, a8.f, a8.g);
        float f8 = a8.c.b() * a8.c.a() * 4;
        int n10 = Math.round(a8.e * f8);
        int n11 = Math.round(f8 * a8.d);
        int n12 = n9 - n8;
        int n13 = n11 + n10;
        if (n13 <= n12) {
            this.b = n11;
            this.a = n10;
        } else {
            f8 = (float)n12 / (a8.e + a8.d);
            this.b = Math.round(a8.d * f8);
            this.a = Math.round(f8 * a8.e);
        }
        if (Log.isLoggable((String)"MemorySizeCalculator", (int)3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Calculation complete, Calculated memory cache size: ");
            stringBuilder.append(this.g(this.b));
            stringBuilder.append(", pool size: ");
            stringBuilder.append(this.g(this.a));
            stringBuilder.append(", byte array size: ");
            stringBuilder.append(this.g(n8));
            stringBuilder.append(", memory class limited? ");
            boolean bl = n13 > n9;
            stringBuilder.append(bl);
            stringBuilder.append(", max size: ");
            stringBuilder.append(this.g(n9));
            stringBuilder.append(", memoryClass: ");
            stringBuilder.append(a8.b.getMemoryClass());
            stringBuilder.append(", isLowMemoryDevice: ");
            stringBuilder.append(i.f(a8.b));
            Log.d((String)"MemorySizeCalculator", (String)stringBuilder.toString());
        }
    }

    private static int d(ActivityManager activityManager, float f8, float f9) {
        int n8 = activityManager.getMemoryClass();
        boolean bl = i.f(activityManager);
        float f10 = n8 * 0x100000;
        if (bl) {
            f8 = f9;
        }
        return Math.round(f10 * f8);
    }

    private static boolean f(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String g(int n8) {
        return Formatter.formatFileSize((Context)this.c, (long)n8);
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.a;
    }

    public int e() {
        return this.b;
    }

    public static final class a {
        static final int i;
        private final Context a;
        private ActivityManager b;
        private c c;
        private float d = 2.0f;
        private float e = i;
        private float f = 0.4f;
        private float g = 0.33f;
        private int h = 0x400000;

        static {
            int n8 = Build.VERSION.SDK_INT > 26 ? 4 : 1;
            i = n8;
        }

        public a(Context context) {
            this.a = context;
            this.b = (ActivityManager)context.getSystemService("activity");
            this.c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && ax.R3.i.f(this.b)) {
                this.e = 0.0f;
            }
        }

        public i i() {
            return new i(this);
        }
    }

    private static final class b
    implements c {
        private final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        @Override
        public int a() {
            return this.a.heightPixels;
        }

        @Override
        public int b() {
            return this.a.widthPixels;
        }
    }

    static interface c {
        public int a();

        public int b();
    }
}

