/*
 * Decompiled with CFR 0.152.
 */
package ax.a0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import ax.a0.c;
import ax.a0.d;
import ax.a0.e;
import ax.a0.f;
import ax.a0.g;
import ax.a0.h;
import ax.a0.i;
import ax.a0.j;
import ax.a0.k;
import ax.a0.l;
import ax.a0.m;
import ax.a0.n;
import ax.a0.o;
import ax.a0.p;
import ax.a0.q;
import ax.a0.r;
import ax.b0.b;

public class s
implements Spannable {
    private static final Object e0 = new Object();
    private final a c0;
    private final PrecomputedText d0;
    private final Spannable q;

    public a a() {
        return this.c0;
    }

    public PrecomputedText b() {
        if (c.a(this.q)) {
            return d.a(this.q);
        }
        return null;
    }

    public char charAt(int n8) {
        return this.q.charAt(n8);
    }

    public int getSpanEnd(Object object) {
        return this.q.getSpanEnd(object);
    }

    public int getSpanFlags(Object object) {
        return this.q.getSpanFlags(object);
    }

    public int getSpanStart(Object object) {
        return this.q.getSpanStart(object);
    }

    public <T> T[] getSpans(int n8, int n9, Class<T> clazz) {
        if (Build.VERSION.SDK_INT >= 29) {
            return e.a(this.d0, n8, n9, clazz);
        }
        return this.q.getSpans(n8, n9, clazz);
    }

    public int length() {
        return this.q.length();
    }

    public int nextSpanTransition(int n8, int n9, Class clazz) {
        return this.q.nextSpanTransition(n8, n9, clazz);
    }

    public void removeSpan(Object object) {
        if (!(object instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                f.a(this.d0, object);
                return;
            }
            this.q.removeSpan(object);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public void setSpan(Object object, int n8, int n9, int n10) {
        if (!(object instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                g.a(this.d0, object, n8, n9, n10);
                return;
            }
            this.q.setSpan(object, n8, n9, n10);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int n8, int n9) {
        return this.q.subSequence(n8, n9);
    }

    public String toString() {
        return this.q.toString();
    }

    public static final class ax.a0.s$a {
        private final TextPaint a;
        private final TextDirectionHeuristic b;
        private final int c;
        private final int d;
        final PrecomputedText.Params e;

        public ax.a0.s$a(PrecomputedText.Params params) {
            this.a = k.a(params);
            this.b = l.a(params);
            this.c = m.a(params);
            this.d = n.a(params);
            if (Build.VERSION.SDK_INT < 29) {
                params = null;
            }
            this.e = params;
        }

        ax.a0.s$a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int n8, int n9) {
            this.e = Build.VERSION.SDK_INT >= 29 ? r.a(ax.a0.q.a(p.a(o.a(i.a(textPaint), n8), n9), textDirectionHeuristic)) : null;
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = n8;
            this.d = n9;
        }

        public boolean a(ax.a0.s$a a8) {
            int n8 = Build.VERSION.SDK_INT;
            if (n8 >= 23) {
                if (this.c != a8.b()) {
                    return false;
                }
                if (this.d != a8.c()) {
                    return false;
                }
            }
            if (this.a.getTextSize() != a8.e().getTextSize()) {
                return false;
            }
            if (this.a.getTextScaleX() != a8.e().getTextScaleX()) {
                return false;
            }
            if (this.a.getTextSkewX() != a8.e().getTextSkewX()) {
                return false;
            }
            if (this.a.getLetterSpacing() != a8.e().getLetterSpacing()) {
                return false;
            }
            if (!TextUtils.equals((CharSequence)this.a.getFontFeatureSettings(), (CharSequence)a8.e().getFontFeatureSettings())) {
                return false;
            }
            if (this.a.getFlags() != a8.e().getFlags()) {
                return false;
            }
            if (n8 >= 24 ? !ax.n.j.a(h.a(this.a), h.a(a8.e())) : !this.a.getTextLocale().equals(a8.e().getTextLocale())) {
                return false;
            }
            return !(this.a.getTypeface() == null ? a8.e().getTypeface() != null : !this.a.getTypeface().equals((Object)a8.e().getTypeface()));
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.a;
        }

        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof ax.a0.s$a)) {
                return false;
            }
            if (!this.a((ax.a0.s$a)(object = (ax.a0.s$a)object))) {
                return false;
            }
            return this.b == ((ax.a0.s$a)object).d();
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return ax.b0.b.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), this.a.getFlags(), h.a(this.a), this.a.getTypeface(), this.a.isElegantTextHeight(), this.b, this.c, this.d);
            }
            return ax.b0.b.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), this.a.getFlags(), this.a.getTextLocale(), this.a.getTypeface(), this.a.isElegantTextHeight(), this.b, this.c, this.d);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("textSize=");
            stringBuilder2.append(this.a.getTextSize());
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", textScaleX=");
            stringBuilder2.append(this.a.getTextScaleX());
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", textSkewX=");
            stringBuilder2.append(this.a.getTextSkewX());
            stringBuilder.append(stringBuilder2.toString());
            int n8 = Build.VERSION.SDK_INT;
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", letterSpacing=");
            stringBuilder2.append(this.a.getLetterSpacing());
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", elegantTextHeight=");
            stringBuilder2.append(this.a.isElegantTextHeight());
            stringBuilder.append(stringBuilder2.toString());
            if (n8 >= 24) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(", textLocale=");
                stringBuilder2.append(h.a(this.a));
                stringBuilder.append(stringBuilder2.toString());
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(", textLocale=");
                stringBuilder2.append(this.a.getTextLocale());
                stringBuilder.append(stringBuilder2.toString());
            }
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", typeface=");
            stringBuilder2.append(this.a.getTypeface());
            stringBuilder.append(stringBuilder2.toString());
            if (n8 >= 26) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(", variationSettings=");
                stringBuilder2.append(j.a(this.a));
                stringBuilder.append(stringBuilder2.toString());
            }
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", textDir=");
            stringBuilder2.append(this.b);
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", breakStrategy=");
            stringBuilder2.append(this.c);
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(", hyphenationFrequency=");
            stringBuilder2.append(this.d);
            stringBuilder.append(stringBuilder2.toString());
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public static class a {
            private final TextPaint a;
            private TextDirectionHeuristic b;
            private int c;
            private int d;

            public a(TextPaint textPaint) {
                this.a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.c = 1;
                    this.d = 1;
                } else {
                    this.d = 0;
                    this.c = 0;
                }
                this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public ax.a0.s$a a() {
                return new ax.a0.s$a(this.a, this.b, this.c, this.d);
            }

            public a b(int n8) {
                this.c = n8;
                return this;
            }

            public a c(int n8) {
                this.d = n8;
                return this;
            }

            public a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }
    }
}

