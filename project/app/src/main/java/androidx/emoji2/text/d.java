/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextPaint;
import androidx.emoji2.text.e;
import ax.T.c;

class d
implements e.d {
    private static final ThreadLocal<StringBuilder> b = new ThreadLocal();
    private final TextPaint a;

    d() {
        TextPaint textPaint;
        this.a = textPaint = new TextPaint();
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override
    public boolean a(CharSequence charSequence, int n8, int n9, int n10) {
        int n11 = Build.VERSION.SDK_INT;
        if (n11 < 23 && n10 > n11) {
            return false;
        }
        StringBuilder stringBuilder = d.b();
        stringBuilder.setLength(0);
        while (n8 < n9) {
            stringBuilder.append(charSequence.charAt(n8));
            ++n8;
        }
        return c.a((Paint)this.a, stringBuilder.toString());
    }
}

