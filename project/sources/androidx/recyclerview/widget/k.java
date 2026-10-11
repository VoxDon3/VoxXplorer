package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class k {
    int b;
    int c;
    int d;
    int e;
    boolean h;
    boolean i;
    boolean a = true;
    int f = 0;
    int g = 0;

    k() {
    }

    boolean a(RecyclerView.B b) {
        int i = this.c;
        return i >= 0 && i < b.b();
    }

    View b(RecyclerView.w wVar) {
        View o = wVar.o(this.c);
        this.c += this.d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
    }
}
