/*
 * Decompiled with CFR 0.152.
 */
package ax.s;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import ax.m.b;
import ax.m.d;
import ax.m.j;

public class a {
    private Context a;

    private a(Context context) {
        this.a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int n8 = configuration.screenWidthDp;
        int n9 = configuration.screenHeightDp;
        if (!(configuration.smallestScreenWidthDp > 600 || n8 > 600 || n8 > 960 && n9 > 720 || n8 > 720 && n9 > 960)) {
            if (!(n8 >= 500 || n8 > 640 && n9 > 480 || n8 > 480 && n9 > 640)) {
                if (n8 >= 360) {
                    return 3;
                }
                return 2;
            }
            return 4;
        }
        return 5;
    }

    public int e() {
        return this.a.getResources().getDimensionPixelSize(d.b);
    }

    public int f() {
        TypedArray typedArray = this.a.obtainStyledAttributes(null, j.a, ax.m.a.c, 0);
        int n8 = typedArray.getLayoutDimension(j.j, 0);
        Resources resources = this.a.getResources();
        int n9 = n8;
        if (!this.g()) {
            n9 = Math.min(n8, resources.getDimensionPixelSize(d.a));
        }
        typedArray.recycle();
        return n9;
    }

    public boolean g() {
        return this.a.getResources().getBoolean(b.a);
    }

    public boolean h() {
        return true;
    }
}

