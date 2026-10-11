package ax.u;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.H;
import ax.m.C2506a;

/* renamed from: ax.u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3159d extends SeekBar {
    private final C3160e a;

    public C3159d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506a.L);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.g(canvas);
    }

    public C3159d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        H.a(this, getContext());
        C3160e c3160e = new C3160e(this);
        this.a = c3160e;
        c3160e.c(attributeSet, i);
    }
}
