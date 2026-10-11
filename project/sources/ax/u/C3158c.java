package ax.u;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.appcompat.widget.H;
import ax.m.C2506a;

/* renamed from: ax.u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3158c extends RatingBar {
    private final C3157b a;

    public C3158c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506a.K);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.a.b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C3158c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        H.a(this, getContext());
        C3157b c3157b = new C3157b(this);
        this.a = c3157b;
        c3157b.c(attributeSet, i);
    }
}
