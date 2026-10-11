package androidx.media3.ui;

import android.graphics.Color;
import ax.S0.d0;

/* renamed from: androidx.media3.ui.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0640c {
    public static String a(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String b(int i) {
        return d0.G("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d));
    }
}
