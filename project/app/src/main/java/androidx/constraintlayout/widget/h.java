/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ax.H.e;

public class h
extends View {
    private int a;
    private View b;
    private int c;

    public void a(ConstraintLayout object) {
        if (this.b == null) {
            return;
        }
        ConstraintLayout.b b8 = (ConstraintLayout.b)this.getLayoutParams();
        object = (ConstraintLayout.b)this.b.getLayoutParams();
        ((ConstraintLayout.b)((Object)object)).v0.j1(0);
        e.b b9 = b8.v0.A();
        e.b b10 = e.b.q;
        if (b9 != b10) {
            b8.v0.k1(((ConstraintLayout.b)((Object)object)).v0.W());
        }
        if (b8.v0.T() != b10) {
            b8.v0.L0(((ConstraintLayout.b)((Object)object)).v0.x());
        }
        ((ConstraintLayout.b)((Object)object)).v0.j1(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.a == -1 && !this.isInEditMode()) {
            this.setVisibility(this.c);
        }
        constraintLayout = constraintLayout.findViewById(this.a);
        this.b = constraintLayout;
        if (constraintLayout != null) {
            ((ConstraintLayout.b)constraintLayout.getLayoutParams()).j0 = true;
            this.b.setVisibility(0);
            this.setVisibility(0);
        }
    }

    public View getContent() {
        return this.b;
    }

    public int getEmptyVisibility() {
        return this.c;
    }

    public void onDraw(Canvas canvas) {
        if (this.isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create((Typeface)Typeface.DEFAULT, (int)0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float)rect.height());
            int n8 = rect.height();
            int n9 = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", (float)n9 / 2.0f - (float)rect.width() / 2.0f - (float)rect.left, (float)n8 / 2.0f + (float)rect.height() / 2.0f - (float)rect.bottom, paint);
        }
    }

    public void setContentId(int n8) {
        if (this.a != n8) {
            View view = this.b;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.b)this.b.getLayoutParams()).j0 = false;
                this.b = null;
            }
            this.a = n8;
            if (n8 != -1 && (view = ((View)this.getParent()).findViewById(n8)) != null) {
                view.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int n8) {
        this.c = n8;
    }
}

