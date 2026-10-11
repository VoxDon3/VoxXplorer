/*
 * Decompiled with CFR 0.152.
 */
package ax.v0;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.emoji2.text.o;
import ax.v0.c;

public final class e
extends c {
    private static Paint g;
    private TextPaint f;

    public e(o o8) {
        super(o8);
    }

    private TextPaint c(CharSequence charSequence, int n8, int n9, Paint paint) {
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArray = (CharacterStyle[])((Spanned)charSequence).getSpans(n8, n9, CharacterStyle.class);
            if (characterStyleArray.length != 0) {
                n9 = characterStyleArray.length;
                n8 = 0;
                if (n9 != 1 || characterStyleArray[0] != this) {
                    TextPaint textPaint = this.f;
                    charSequence = textPaint;
                    if (textPaint == null) {
                        charSequence = new TextPaint();
                        this.f = charSequence;
                    }
                    charSequence.set(paint);
                    while (n8 < characterStyleArray.length) {
                        paint = characterStyleArray[n8];
                        if (!(paint instanceof MetricAffectingSpan)) {
                            paint.updateDrawState((TextPaint)charSequence);
                        }
                        ++n8;
                    }
                    return charSequence;
                }
            }
            if (paint instanceof TextPaint) {
                return (TextPaint)paint;
            }
            return null;
        }
        if (paint instanceof TextPaint) {
            return (TextPaint)paint;
        }
        return null;
    }

    private static Paint e() {
        if (g == null) {
            TextPaint textPaint = new TextPaint();
            g = textPaint;
            textPaint.setColor(androidx.emoji2.text.e.c().d());
            g.setStyle(Paint.Style.FILL);
        }
        return g;
    }

    void d(Canvas canvas, TextPaint textPaint, float f8, float f9, float f10, float f11) {
        int n8 = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f8, f10, f9, f11, (Paint)textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(n8);
    }

    public void draw(Canvas canvas, @SuppressLint(value={"UnknownNullness"}) CharSequence charSequence, int n8, int n9, float f8, int n10, int n11, int n12, Paint paint) {
        if ((charSequence = this.c(charSequence, n8, n9, paint)) != null && ((TextPaint)charSequence).bgColor != 0) {
            this.d(canvas, (TextPaint)charSequence, f8, f8 + (float)this.b(), n10, n12);
        }
        if (androidx.emoji2.text.e.c().j()) {
            canvas.drawRect(f8, (float)n10, f8 + (float)this.b(), (float)n12, e.e());
        }
        o o8 = this.a();
        float f9 = n11;
        if (charSequence == null) {
            charSequence = paint;
        }
        o8.a(canvas, f8, f9, (Paint)charSequence);
    }
}

