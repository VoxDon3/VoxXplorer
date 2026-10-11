/*
 * Decompiled with CFR 0.152.
 */
package ax.C6;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import ax.p.c;

public class h
extends c {
    private a b;
    private boolean c;

    public h(Drawable drawable, int n8, int n9) {
        super(drawable);
        this.b = new a(this.c(drawable), n8, n9);
    }

    private Drawable.ConstantState c(Drawable drawable) {
        if (drawable != null) {
            return drawable.getConstantState();
        }
        return null;
    }

    @Override
    public void b(Drawable drawable) {
        super.b(drawable);
        a a8 = this.b;
        if (a8 != null) {
            a.c(a8, this.c(drawable));
            this.c = false;
        }
    }

    public Drawable.ConstantState getConstantState() {
        if (this.b.d()) {
            return this.b;
        }
        return null;
    }

    @Override
    public int getIntrinsicHeight() {
        return this.b.c;
    }

    @Override
    public int getIntrinsicWidth() {
        return this.b.b;
    }

    public Drawable mutate() {
        if (!this.c && super.mutate() == this) {
            Drawable drawable = this.a();
            if (drawable != null) {
                drawable.mutate();
            }
            this.b = new a(this.c(drawable), this.b.b, this.b.c);
            this.c = true;
        }
        return this;
    }

    private static final class a
    extends Drawable.ConstantState {
        private Drawable.ConstantState a;
        private final int b;
        private final int c;

        a(Drawable.ConstantState constantState, int n8, int n9) {
            this.a = constantState;
            this.b = n8;
            this.c = n9;
        }

        static /* synthetic */ Drawable.ConstantState c(a a8, Drawable.ConstantState constantState) {
            a8.a = constantState;
            return constantState;
        }

        boolean d() {
            return this.a != null;
        }

        public int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.a;
            if (constantState != null) {
                return constantState.getChangingConfigurations();
            }
            return 0;
        }

        public Drawable newDrawable() {
            return new h(this.a.newDrawable(), this.b, this.c);
        }

        public Drawable newDrawable(Resources resources) {
            return new h(this.a.newDrawable(resources), this.b, this.c);
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            return new h(this.a.newDrawable(resources, theme), this.b, this.c);
        }
    }
}

