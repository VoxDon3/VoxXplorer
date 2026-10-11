package ax.v0;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.emoji2.text.o;
import ax.b0.C1446g;

/* renamed from: ax.v0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3246c extends ReplacementSpan {
    private final o b;
    private final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    private short c = -1;
    private short d = -1;
    private float e = 1.0f;

    AbstractC3246c(o oVar) {
        C1446g.h(oVar, "rasterizer cannot be null");
        this.b = oVar;
    }

    public final o a() {
        return this.b;
    }

    final int b() {
        return this.c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.a);
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        this.e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.b.e();
        this.d = (short) (this.b.e() * this.e);
        short i3 = (short) (this.b.i() * this.e);
        this.c = i3;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i3;
    }
}
