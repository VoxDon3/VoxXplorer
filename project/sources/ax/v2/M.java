package ax.v2;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
class M extends L {
    M() {
    }

    @Override // ax.v2.C3255D
    public float c(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // ax.v2.J, ax.v2.C3255D
    public void e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // ax.v2.C3255D
    public void f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // ax.v2.L, ax.v2.C3255D
    public void g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // ax.v2.H, ax.v2.C3255D
    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // ax.v2.H, ax.v2.C3255D
    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
