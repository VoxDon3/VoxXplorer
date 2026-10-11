package ax.v2;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: ax.v2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3266i implements TypeEvaluator<Rect> {
    private Rect a;

    C3266i() {
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = rect.left + ((int) ((rect2.left - r0) * f));
        int i2 = rect.top + ((int) ((rect2.top - r1) * f));
        int i3 = rect.right + ((int) ((rect2.right - r2) * f));
        int i4 = rect.bottom + ((int) ((rect2.bottom - r6) * f));
        Rect rect3 = this.a;
        if (rect3 == null) {
            return new Rect(i, i2, i3, i4);
        }
        rect3.set(i, i2, i3, i4);
        return this.a;
    }
}
