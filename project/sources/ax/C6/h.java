package ax.C6;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import ax.p.C2747c;

/* loaded from: classes3.dex */
public class h extends C2747c {
    private a b;
    private boolean c;

    public h(Drawable drawable, int i, int i2) {
        super(drawable);
        this.b = new a(c(drawable), i, i2);
    }

    private Drawable.ConstantState c(Drawable drawable) {
        if (drawable != null) {
            return drawable.getConstantState();
        }
        return null;
    }

    @Override // ax.p.C2747c
    public void b(Drawable drawable) {
        super.b(drawable);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a = c(drawable);
            this.c = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.b.d()) {
            return this.b;
        }
        return null;
    }

    @Override // ax.p.C2747c, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.b.c;
    }

    @Override // ax.p.C2747c, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.b.b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.c && super.mutate() == this) {
            Drawable a2 = a();
            if (a2 != null) {
                a2.mutate();
            }
            this.b = new a(c(a2), this.b.b, this.b.c);
            this.c = true;
        }
        return this;
    }

    private static final class a extends Drawable.ConstantState {
        private Drawable.ConstantState a;
        private final int b;
        private final int c;

        a(Drawable.ConstantState constantState, int i, int i2) {
            this.a = constantState;
            this.b = i;
            this.c = i2;
        }

        boolean d() {
            return this.a != null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.a;
            if (constantState != null) {
                return constantState.getChangingConfigurations();
            }
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this.a.newDrawable(), this.b, this.c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this.a.newDrawable(resources), this.b, this.c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            return new h(this.a.newDrawable(resources, theme), this.b, this.c);
        }
    }
}
