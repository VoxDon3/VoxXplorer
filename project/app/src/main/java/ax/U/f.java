/*
 * Decompiled with CFR 0.152.
 */
package ax.U;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import ax.U.d;
import ax.U.e;

final class f
extends Drawable.ConstantState {
    int a;
    Drawable.ConstantState b;
    ColorStateList c = null;
    PorterDuff.Mode d = ax.U.d.g;

    f(f f8) {
        if (f8 != null) {
            this.a = f8.a;
            this.b = f8.b;
            this.c = f8.c;
            this.d = f8.d;
        }
    }

    boolean a() {
        return this.b != null;
    }

    public int getChangingConfigurations() {
        int n8 = this.a;
        Drawable.ConstantState constantState = this.b;
        int n9 = constantState != null ? constantState.getChangingConfigurations() : 0;
        return n8 | n9;
    }

    public Drawable newDrawable() {
        return this.newDrawable(null);
    }

    public Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}

