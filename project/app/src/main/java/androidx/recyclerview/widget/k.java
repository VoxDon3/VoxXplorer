/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class k {
    boolean a = true;
    int b;
    int c;
    int d;
    int e;
    int f = 0;
    int g = 0;
    boolean h;
    boolean i;

    k() {
    }

    boolean a(RecyclerView.B b8) {
        int n8 = this.c;
        return n8 >= 0 && n8 < b8.b();
    }

    View b(RecyclerView.w w8) {
        w8 = w8.o(this.c);
        this.c += this.d;
        return w8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LayoutState{mAvailable=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mCurrentPosition=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mItemDirection=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mLayoutDirection=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mStartLine=");
        stringBuilder.append(this.f);
        stringBuilder.append(", mEndLine=");
        stringBuilder.append(this.g);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

