package ax.R3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: classes.dex */
public final class i {
    private final int a;
    private final int b;
    private final Context c;
    private final int d;

    public static final class a {
        static final int i;
        private final Context a;
        private ActivityManager b;
        private c c;
        private float e;
        private float d = 2.0f;
        private float f = 0.4f;
        private float g = 0.33f;
        private int h = 4194304;

        static {
            i = Build.VERSION.SDK_INT > 26 ? 4 : 1;
        }

        public a(Context context) {
            this.e = i;
            this.a = context;
            this.b = (ActivityManager) context.getSystemService("activity");
            this.c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.f(this.b)) {
                return;
            }
            this.e = 0.0f;
        }

        public i i() {
            return new i(this);
        }
    }

    private static final class b implements c {
        private final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        @Override // ax.R3.i.c
        public int a() {
            return this.a.heightPixels;
        }

        @Override // ax.R3.i.c
        public int b() {
            return this.a.widthPixels;
        }
    }

    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.c = aVar.a;
        int i = f(aVar.b) ? aVar.h / 2 : aVar.h;
        this.d = i;
        int d = d(aVar.b, aVar.f, aVar.g);
        float b2 = aVar.c.b() * aVar.c.a() * 4;
        int round = Math.round(aVar.e * b2);
        int round2 = Math.round(b2 * aVar.d);
        int i2 = d - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.b = round2;
            this.a = round;
        } else {
            float f = i2 / (aVar.e + aVar.d);
            this.b = Math.round(aVar.d * f);
            this.a = Math.round(f * aVar.e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(g(this.b));
            sb.append(", pool size: ");
            sb.append(g(this.a));
            sb.append(", byte array size: ");
            sb.append(g(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > d);
            sb.append(", max size: ");
            sb.append(g(d));
            sb.append(", memoryClass: ");
            sb.append(aVar.b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(f(aVar.b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    private static int d(ActivityManager activityManager, float f, float f2) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (f(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String g(int i) {
        return Formatter.formatFileSize(this.c, i);
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
}
