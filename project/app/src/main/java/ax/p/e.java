/*
 * Decompiled with CFR 0.152.
 */
package ax.p;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import ax.p.b;

public class e
extends b {
    private a m;
    private boolean n;

    e(a a8) {
        if (a8 != null) {
            this.h(a8);
        }
    }

    e(a a8, Resources resources) {
        this.h(new a(a8, this, resources));
        this.onStateChange(this.getState());
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        this.onStateChange(this.getState());
    }

    @Override
    void h(b.d d8) {
        super.h(d8);
        if (d8 instanceof a) {
            this.m = (a)d8;
        }
    }

    public boolean isStateful() {
        return true;
    }

    a j() {
        return new a(this.m, this, null);
    }

    int[] k(AttributeSet attributeSet) {
        int n8 = attributeSet.getAttributeCount();
        int[] nArray = new int[n8];
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n10 = attributeSet.getAttributeNameResource(i8);
            int n11 = n9;
            if (n10 != 0) {
                n11 = n9;
                if (n10 != 0x10100D0) {
                    n11 = n9;
                    if (n10 != 0x1010199) {
                        n11 = attributeSet.getAttributeBooleanValue(i8, false) ? n10 : -n10;
                        nArray[n9] = n11;
                        n11 = n9 + 1;
                    }
                }
            }
            n9 = n11;
        }
        return StateSet.trimStateSet((int[])nArray, (int)n9);
    }

    @Override
    public Drawable mutate() {
        if (!this.n && super.mutate() == this) {
            this.m.r();
            this.n = true;
        }
        return this;
    }

    @Override
    protected boolean onStateChange(int[] nArray) {
        int n8;
        boolean bl = super.onStateChange(nArray);
        int n9 = n8 = this.m.A(nArray);
        if (n8 < 0) {
            n9 = this.m.A(StateSet.WILD_CARD);
        }
        return this.g(n9) || bl;
        {
        }
    }

    static class a
    extends b.d {
        int[][] J;

        a(a a8, e e8, Resources resources) {
            super(a8, e8, resources);
            if (a8 != null) {
                this.J = a8.J;
                return;
            }
            this.J = new int[this.f()][];
        }

        int A(int[] nArray) {
            int[][] nArray2 = this.J;
            int n8 = this.h();
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!StateSet.stateSetMatches((int[])nArray2[i8], (int[])nArray)) continue;
                return i8;
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new e(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }

        @Override
        public void o(int n8, int n9) {
            super.o(n8, n9);
            int[][] nArrayArray = new int[n9][];
            System.arraycopy(this.J, 0, nArrayArray, 0, n8);
            this.J = nArrayArray;
        }

        @Override
        void r() {
            Object object = this.J;
            int[][] nArrayArray = new int[((int[][])object).length][];
            for (int i8 = ((int[][])object).length - 1; i8 >= 0; --i8) {
                object = this.J[i8];
                object = object != null ? (Object)((int[])object.clone()) : null;
                nArrayArray[i8] = (int[])object;
            }
            this.J = nArrayArray;
        }

        int z(int[] nArray, Drawable drawable) {
            int n8 = this.a(drawable);
            this.J[n8] = nArray;
            return n8;
        }
    }
}

