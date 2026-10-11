/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ax.a2.F;

public final class AspectRatioFrameLayout
extends FrameLayout {
    private final c a;
    private float b;
    private int c = 0;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            context = context.getTheme().obtainStyledAttributes(attributeSet, F.a, 0, 0);
            try {
                this.c = context.getInt(F.b, 0);
            }
            finally {
                context.recycle();
            }
        }
        this.a = new c(this);
    }

    static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        ((Object)((Object)aspectRatioFrameLayout)).getClass();
        return null;
    }

    public int getResizeMode() {
        return this.c;
    }

    /*
     * Unable to fully structure code
     */
    protected void onMeasure(int var1_1, int var2_2) {
        block7: {
            block8: {
                block9: {
                    block10: {
                        super.onMeasure(var1_1, var2_2);
                        if (this.b <= 0.0f) {
                            return;
                        }
                        var2_2 = this.getMeasuredWidth();
                        var5_3 = var2_2;
                        var4_5 = var5_3 / (var6_4 = (float)(var1_1 = this.getMeasuredHeight()));
                        var3_6 = this.b / var4_5 - 1.0f;
                        if (Math.abs(var3_6) <= 0.01f) {
                            this.a.a(this.b, var4_5, false);
                            return;
                        }
                        var7_7 = this.c;
                        if (var7_7 == 0) break block8;
                        if (var7_7 == 1) break block9;
                        if (var7_7 == 2) break block10;
                        if (var7_7 == 4) {
                            if (var3_6 > 0.0f) {
                                var3_6 = this.b;
lbl18:
                                // 3 sources

                                while (true) {
                                    var2_2 = (int)(var6_4 * var3_6);
                                    break block7;
                                    break;
                                }
                            }
                            var3_6 = this.b;
lbl22:
                            // 3 sources

                            while (true) {
                                var1_1 = (int)(var5_3 / var3_6);
                                break block7;
                                break;
                            }
                        }
                        break block7;
                    }
                    var3_6 = this.b;
                    ** GOTO lbl18
                }
                var3_6 = this.b;
                ** GOTO lbl22
            }
            if (var3_6 > 0.0f) {
                var3_6 = this.b;
                ** continue;
            }
            var3_6 = this.b;
            ** while (true)
        }
        this.a.a(this.b, var4_5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)var2_2, (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)var1_1, (int)0x40000000));
    }

    public void setAspectRatio(float f8) {
        if (this.b != f8) {
            this.b = f8;
            this.requestLayout();
        }
    }

    public void setAspectRatioListener(b b8) {
    }

    public void setResizeMode(int n8) {
        if (this.c != n8) {
            this.c = n8;
            this.requestLayout();
        }
    }

    public static interface b {
    }

    private final class c
    implements Runnable {
        private float c0;
        private boolean d0;
        private boolean e0;
        final AspectRatioFrameLayout f0;
        private float q;

        private c(AspectRatioFrameLayout aspectRatioFrameLayout) {
            this.f0 = aspectRatioFrameLayout;
        }

        public void a(float f8, float f9, boolean bl) {
            this.q = f8;
            this.c0 = f9;
            this.d0 = bl;
            if (!this.e0) {
                this.e0 = true;
                this.f0.post(this);
            }
        }

        @Override
        public void run() {
            this.e0 = false;
            AspectRatioFrameLayout.a(this.f0);
        }
    }
}

