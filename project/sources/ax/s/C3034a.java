package ax.s;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import ax.m.C2506a;
import ax.m.C2507b;
import ax.m.j;

/* renamed from: ax.s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3034a {
    private Context a;

    private C3034a(Context context) {
        this.a = context;
    }

    public static C3034a b(Context context) {
        return new C3034a(context);
    }

    public boolean a() {
        return this.a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.a.getResources().getDimensionPixelSize(ax.m.d.b);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, j.a, C2506a.c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.j, 0);
        Resources resources = this.a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(ax.m.d.a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.a.getResources().getBoolean(C2507b.a);
    }

    public boolean h() {
        return true;
    }
}
