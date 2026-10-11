/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.graphics.Color;
import ax.S0.d0;

final class c {
    public static String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".");
        stringBuilder.append(string);
        stringBuilder.append(",.");
        stringBuilder.append(string);
        stringBuilder.append(" *");
        return stringBuilder.toString();
    }

    public static String b(int n8) {
        return d0.G("rgba(%d,%d,%d,%.3f)", Color.red((int)n8), Color.green((int)n8), Color.blue((int)n8), (double)Color.alpha((int)n8) / 255.0);
    }
}

