/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import ax.S0.a;
import ax.S0.u;

final class C {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final TextPaint f;
    private final Paint g;
    private final Paint h;
    private CharSequence i;
    private Layout.Alignment j;
    private Bitmap k;
    private float l;
    private int m;
    private int n;
    private float o;
    private int p;
    private float q;
    private float r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private float x;
    private float y;
    private float z;

    public C(Context context) {
        float f8;
        TypedArray typedArray = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.e = typedArray.getDimensionPixelSize(0, 0);
        this.d = typedArray.getFloat(1, 1.0f);
        typedArray.recycle();
        this.a = f8 = (float)Math.round((float)context.getResources().getDisplayMetrics().densityDpi * 2.0f / 160.0f);
        this.b = f8;
        this.c = f8;
        context = new TextPaint();
        this.f = context;
        context.setAntiAlias(true);
        context.setSubpixelText(true);
        context = new Paint();
        this.g = context;
        context.setAntiAlias(true);
        context.setStyle(Paint.Style.FILL);
        context = new Paint();
        this.h = context;
        context.setAntiAlias(true);
        context.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || charSequence != null && charSequence.equals(charSequence2);
        {
        }
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.k, null, this.J, this.h);
    }

    private void d(Canvas canvas, boolean bl) {
        if (bl) {
            this.e(canvas);
            return;
        }
        ax.S0.a.e(this.J);
        ax.S0.a.e(this.k);
        this.c(canvas);
    }

    private void e(Canvas canvas) {
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout != null && staticLayout2 != null) {
            int n8 = canvas.save();
            canvas.translate((float)this.G, (float)this.H);
            if (Color.alpha((int)this.u) > 0) {
                this.g.setColor(this.u);
                canvas.drawRect((float)(-this.I), 0.0f, (float)(staticLayout.getWidth() + this.I), (float)staticLayout.getHeight(), this.g);
            }
            int n9 = this.w;
            boolean bl = true;
            if (n9 == 1) {
                this.f.setStrokeJoin(Paint.Join.ROUND);
                this.f.setStrokeWidth(this.a);
                this.f.setColor(this.v);
                this.f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas);
            } else if (n9 == 2) {
                TextPaint textPaint = this.f;
                float f8 = this.b;
                float f9 = this.c;
                textPaint.setShadowLayer(f8, f9, f9, this.v);
            } else if (n9 == 3 || n9 == 4) {
                if (n9 != 3) {
                    bl = false;
                }
                int n10 = -1;
                n9 = bl ? -1 : this.v;
                if (bl) {
                    n10 = this.v;
                }
                float f10 = this.b / 2.0f;
                this.f.setColor(this.s);
                this.f.setStyle(Paint.Style.FILL);
                TextPaint textPaint = this.f;
                float f11 = this.b;
                float f12 = -f10;
                textPaint.setShadowLayer(f11, f12, f12, n9);
                staticLayout2.draw(canvas);
                this.f.setShadowLayer(this.b, f10, f10, n10);
            }
            this.f.setColor(this.s);
            this.f.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(n8);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void f() {
        float f8;
        int n8;
        int n9;
        int n10;
        int n11;
        block9: {
            float f9;
            block8: {
                block7: {
                    block6: {
                        float f10;
                        block5: {
                            block4: {
                                Bitmap bitmap = this.k;
                                n11 = this.C;
                                n10 = this.A;
                                n9 = this.D;
                                n8 = this.B;
                                f8 = n10;
                                float f11 = n11 - n10;
                                f10 = f8 + this.o * f11;
                                f9 = n8;
                                f8 = n9 - n8;
                                f9 += this.l * f8;
                                n9 = Math.round(f11 * this.q);
                                f11 = this.r;
                                n8 = f11 != -3.4028235E38f ? Math.round(f8 * f11) : Math.round((float)n9 * ((float)bitmap.getHeight() / (float)bitmap.getWidth()));
                                n10 = this.p;
                                if (n10 != 2) break block4;
                                f8 = n9;
                                break block5;
                            }
                            f8 = f10;
                            if (n10 != 1) break block6;
                            f8 = n9 / 2;
                        }
                        f8 = f10 - f8;
                    }
                    n10 = Math.round(f8);
                    n11 = this.n;
                    if (n11 != 2) break block7;
                    f8 = n8;
                    break block8;
                }
                f8 = f9;
                if (n11 != 1) break block9;
                f8 = n8 / 2;
            }
            f8 = f9 - f8;
        }
        n11 = Math.round(f8);
        this.J = new Rect(n10, n11, n9 + n10, n8 + n11);
    }

    /*
     * Unable to fully structure code
     */
    private void g() {
        block26: {
            block23: {
                block25: {
                    block24: {
                        var11_1 = this.i;
                        var11_1 = var11_1 instanceof SpannableStringBuilder ? (SpannableStringBuilder)var11_1 : new SpannableStringBuilder(this.i);
                        var8_2 = this.C - this.A;
                        var7_3 = this.D - this.B;
                        this.f.setTextSize(this.x);
                        var6_4 = (int)(this.x * 0.125f + 0.5f);
                        var9_5 = var6_4 * 2;
                        var3_6 = var8_2 - var9_5;
                        var1_7 = this.q;
                        var2_8 = var3_6;
                        if (var1_7 != -3.4028235E38f) {
                            var2_8 = (int)((float)var3_6 * var1_7);
                        }
                        var3_6 = var2_8;
                        var13_9 = "SubtitlePainter";
                        if (var3_6 <= 0) {
                            ax.S0.u.h("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                            return;
                        }
                        if (this.y > 0.0f) {
                            var11_1.setSpan(new AbsoluteSizeSpan((int)this.y), 0, var11_1.length(), 0xFF0000);
                        }
                        var15_10 = new SpannableStringBuilder(var11_1);
                        if (this.w == 1) {
                            var12_11 = (Layout.Alignment)var15_10.getSpans(0, var15_10.length(), ForegroundColorSpan.class);
                            var4_12 = ((Layout.Alignment)var12_11).length;
                            for (var2_8 = 0; var2_8 < var4_12; ++var2_8) {
                                var15_10.removeSpan((Object)var12_11[var2_8]);
                            }
                        }
                        if (Color.alpha((int)this.t) > 0) {
                            var2_8 = this.w;
                            if (var2_8 != 0 && var2_8 != 2) {
                                var15_10.setSpan((Object)new BackgroundColorSpan(this.t), 0, var15_10.length(), 0xFF0000);
                            } else {
                                var11_1.setSpan(new BackgroundColorSpan(this.t), 0, var11_1.length(), 0xFF0000);
                            }
                        }
                        var12_11 = var14_13 = this.j;
                        if (var14_13 == null) {
                            var12_11 = Layout.Alignment.ALIGN_CENTER;
                        }
                        var14_13 = new StaticLayout(var11_1, this.f, var3_6, var12_11, this.d, this.e, true);
                        this.E = var14_13;
                        var5_14 = var14_13.getHeight();
                        var10_15 = this.E.getLineCount();
                        var2_8 = 0;
                        for (var4_12 = 0; var4_12 < var10_15; ++var4_12) {
                            var2_8 = Math.max((int)Math.ceil(this.E.getLineWidth(var4_12)), var2_8);
                        }
                        if (this.q == -3.4028235E38f || var2_8 >= var3_6) {
                            var3_6 = var2_8;
                        }
                        var3_6 += var9_5;
                        var1_7 = this.o;
                        if (var1_7 != -3.4028235E38f) {
                            var2_8 = Math.round((float)var8_2 * var1_7);
                            var4_12 = this.A;
                            var2_8 += var4_12;
                            var8_2 = this.p;
                            if (var8_2 != 1) {
                                if (var8_2 == 2) {
                                    var2_8 -= var3_6;
                                }
                            } else {
                                var2_8 = (var2_8 * 2 - var3_6) / 2;
                            }
                            var4_12 = Math.max(var2_8, var4_12);
                            var2_8 = Math.min(var3_6 + var4_12, this.C);
                        } else {
                            var4_12 = (var8_2 - var3_6) / 2 + this.A;
                            var2_8 = var4_12 + var3_6;
                        }
                        var8_2 = var2_8 - var4_12;
                        if (var8_2 <= 0) {
                            ax.S0.u.h(var13_9, "Skipped drawing subtitle cue (invalid horizontal positioning)");
                            return;
                        }
                        var1_7 = this.l;
                        if (var1_7 == -3.4028235E38f) break block23;
                        if (this.m != 0) break block24;
                        var3_6 = Math.round((float)var7_3 * var1_7) + this.B;
                        var7_3 = this.n;
                        if (var7_3 == 2) ** GOTO lbl84
                        var2_8 = var3_6;
                        if (var7_3 == 1) {
                            var2_8 = (var3_6 * 2 - var5_14) / 2;
                        }
                        break block25;
                    }
                    var2_8 = this.E.getLineBottom(0) - this.E.getLineTop(0);
                    var1_7 = this.l;
                    if (var1_7 >= 0.0f) {
                        var2_8 = Math.round(var1_7 * (float)var2_8) + this.B;
                    } else {
                        var3_6 = Math.round((var1_7 + 1.0f) * (float)var2_8) + this.D;
lbl84:
                        // 2 sources

                        var2_8 = var3_6 - var5_14;
                    }
                }
                if (var2_8 + var5_14 > (var3_6 = this.D)) {
                    var3_6 -= var5_14;
                } else {
                    var5_14 = this.B;
                    var3_6 = var2_8;
                    if (var2_8 < var5_14) {
                        var3_6 = var5_14;
                    }
                }
                break block26;
            }
            var3_6 = this.D - var5_14 - (int)((float)var7_3 * this.z);
        }
        this.E = new StaticLayout(var11_1, this.f, var8_2, var12_11, this.d, this.e, true);
        this.F = new StaticLayout((CharSequence)var15_10, this.f, var8_2, var12_11, this.d, this.e, true);
        this.G = var4_12;
        this.H = var3_6;
        this.I = var6_4;
    }

    public void b(ax.R0.a a8, ax.a2.a a9, float f8, float f9, float f10, Canvas canvas, int n8, int n9, int n10, int n11) {
        int n12;
        boolean bl = a8.d == null;
        if (bl) {
            if (TextUtils.isEmpty((CharSequence)a8.a)) {
                return;
            }
            n12 = a8.l ? a8.m : a9.c;
        } else {
            n12 = -16777216;
        }
        if (androidx.media3.ui.C.a(this.i, a8.a) && j.Objects.equals((Object)this.j, (Object)a8.b) && this.k == a8.d && this.l == a8.e && this.m == a8.f && ((Object)this.n).equals(a8.g) && this.o == a8.h && ((Object)this.p).equals(a8.i) && this.q == a8.j && this.r == a8.k && this.s == a9.a && this.t == a9.b && this.u == n12 && this.w == a9.d && this.v == a9.e && j.Objects.equals((Object)this.f.getTypeface(), (Object)a9.f) && this.x == f8 && this.y == f9 && this.z == f10 && this.A == n8 && this.B == n9 && this.C == n10 && this.D == n11) {
            this.d(canvas, bl);
            return;
        }
        this.i = a8.a;
        this.j = a8.b;
        this.k = a8.d;
        this.l = a8.e;
        this.m = a8.f;
        this.n = a8.g;
        this.o = a8.h;
        this.p = a8.i;
        this.q = a8.j;
        this.r = a8.k;
        this.s = a9.a;
        this.t = a9.b;
        this.u = n12;
        this.w = a9.d;
        this.v = a9.e;
        this.f.setTypeface(a9.f);
        this.x = f8;
        this.y = f9;
        this.z = f10;
        this.A = n8;
        this.B = n9;
        this.C = n10;
        this.D = n11;
        if (bl) {
            ax.S0.a.e(this.i);
            this.g();
        } else {
            ax.S0.a.e(this.k);
            this.f();
        }
        this.d(canvas, bl);
    }
}

