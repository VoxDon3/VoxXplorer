package ax.p;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import ax.p.C2746b;

/* renamed from: ax.p.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2749e extends C2746b {
    private a m;
    private boolean n;

    /* renamed from: ax.p.e$a */
    static class a extends C2746b.d {
        int[][] J;

        a(a aVar, C2749e c2749e, Resources resources) {
            super(aVar, c2749e, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[f()][];
            }
        }

        int A(int[] iArr) {
            int[][] iArr2 = this.J;
            int h = h();
            for (int i = 0; i < h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C2749e(this, null);
        }

        @Override // ax.p.C2746b.d
        public void o(int i, int i2) {
            super.o(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.J, 0, iArr, 0, i);
            this.J = iArr;
        }

        @Override // ax.p.C2746b.d
        void r() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.J[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.J = iArr2;
        }

        int z(int[] iArr, Drawable drawable) {
            int a = a(drawable);
            this.J[a] = iArr;
            return a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C2749e(this, resources);
        }
    }

    C2749e(a aVar, Resources resources) {
        h(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // ax.p.C2746b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // ax.p.C2746b
    void h(C2746b.d dVar) {
        super.h(dVar);
        if (dVar instanceof a) {
            this.m = (a) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ax.p.C2746b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a b() {
        return new a(this.m, this, null);
    }

    int[] k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // ax.p.C2746b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.n && super.mutate() == this) {
            this.m.r();
            this.n = true;
        }
        return this;
    }

    @Override // ax.p.C2746b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.m.A(iArr);
        if (A < 0) {
            A = this.m.A(StateSet.WILD_CARD);
        }
        return g(A) || onStateChange;
    }

    C2749e(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }
}
