/*
 * Decompiled with CFR 0.152.
 */
package ax.v0;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.emoji2.text.o;
import ax.b0.g;

public abstract class c
extends ReplacementSpan {
    private final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    private final o b;
    private short c = (short)-1;
    private short d = (short)-1;
    private float e = 1.0f;

    c(o o8) {
        g.h(o8, "rasterizer cannot be null");
        this.b = o8;
    }

    public final o a() {
        return this.b;
    }

    final int b() {
        return this.c;
    }

    public int getSize(Paint paint, @SuppressLint(value={"UnknownNullness"}) CharSequence charSequence, int n8, int n9, Paint.FontMetricsInt fontMetricsInt) {
        short s8;
        paint.getFontMetricsInt(this.a);
        paint = this.a;
        this.e = (float)Math.abs(paint.descent - paint.ascent) * 1.0f / (float)this.b.e();
        this.d = (short)((float)this.b.e() * this.e);
        this.c = s8 = (short)((float)this.b.i() * this.e);
        if (fontMetricsInt != null) {
            paint = this.a;
            fontMetricsInt.ascent = paint.ascent;
            fontMetricsInt.descent = paint.descent;
            fontMetricsInt.top = paint.top;
            fontMetricsInt.bottom = paint.bottom;
        }
        return s8;
    }
}

