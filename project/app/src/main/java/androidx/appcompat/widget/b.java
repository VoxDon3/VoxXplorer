/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

class b
extends Drawable {
    final ActionBarContainer a;

    public b(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.h) {
            actionBarContainer = actionBarContainer.g;
            if (actionBarContainer != null) {
                actionBarContainer.draw(canvas);
                return;
            }
        } else {
            actionBarContainer = actionBarContainer.e;
            if (actionBarContainer != null) {
                actionBarContainer.draw(canvas);
            }
            actionBarContainer = this.a;
            Drawable drawable = actionBarContainer.f;
            if (drawable != null && actionBarContainer.i) {
                drawable.draw(canvas);
            }
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.h) {
            if (actionBarContainer.g != null) {
                androidx.appcompat.widget.b$a.a(actionBarContainer.e, outline);
                return;
            }
        } else {
            actionBarContainer = actionBarContainer.e;
            if (actionBarContainer != null) {
                androidx.appcompat.widget.b$a.a((Drawable)actionBarContainer, outline);
            }
        }
    }

    public void setAlpha(int n8) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    private static class a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }
}

