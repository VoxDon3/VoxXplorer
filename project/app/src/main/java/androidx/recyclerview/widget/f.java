/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class f
extends RecyclerView.o {
    private static final int[] d = new int[]{16843284};
    private Drawable a;
    private int b;
    private final Rect c = new Rect();

    @SuppressLint(value={"UnknownNullness"})
    public f(Context context, int n8) {
        TypedArray typedArray = context.obtainStyledAttributes(d);
        context = typedArray.getDrawable(0);
        this.a = context;
        if (context == null) {
            Log.w((String)"DividerItem", (String)"@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArray.recycle();
        this.n(n8);
    }

    private void l(Canvas canvas, RecyclerView recyclerView) {
        int n8;
        int n9;
        canvas.save();
        boolean bl = recyclerView.getClipToPadding();
        int n10 = 0;
        if (bl) {
            n9 = recyclerView.getPaddingTop();
            n8 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), n9, recyclerView.getWidth() - recyclerView.getPaddingRight(), n8);
        } else {
            n8 = recyclerView.getHeight();
            n9 = 0;
        }
        int n11 = recyclerView.getChildCount();
        while (n10 < n11) {
            View view = recyclerView.getChildAt(n10);
            recyclerView.getLayoutManager().V(view, this.c);
            int n12 = this.c.right + Math.round(view.getTranslationX());
            int n13 = this.a.getIntrinsicWidth();
            this.a.setBounds(n12 - n13, n9, n12, n8);
            this.a.draw(canvas);
            ++n10;
        }
        canvas.restore();
    }

    private void m(Canvas canvas, RecyclerView recyclerView) {
        int n8;
        int n9;
        canvas.save();
        boolean bl = recyclerView.getClipToPadding();
        int n10 = 0;
        if (bl) {
            n9 = recyclerView.getPaddingLeft();
            n8 = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(n9, recyclerView.getPaddingTop(), n8, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            n8 = recyclerView.getWidth();
            n9 = 0;
        }
        int n11 = recyclerView.getChildCount();
        while (n10 < n11) {
            View view = recyclerView.getChildAt(n10);
            recyclerView.o0(view, this.c);
            int n12 = this.c.bottom + Math.round(view.getTranslationY());
            int n13 = this.a.getIntrinsicHeight();
            this.a.setBounds(n9, n12 - n13, n8, n12);
            this.a.draw(canvas);
            ++n10;
        }
        canvas.restore();
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b8) {
        view = this.a;
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (this.b == 1) {
            rect.set(0, 0, 0, view.getIntrinsicHeight());
            return;
        }
        rect.set(0, 0, view.getIntrinsicWidth(), 0);
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b8) {
        if (recyclerView.getLayoutManager() != null && this.a != null) {
            if (this.b == 1) {
                this.m(canvas, recyclerView);
                return;
            }
            this.l(canvas, recyclerView);
        }
    }

    public void n(int n8) {
        if (n8 != 0 && n8 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.b = n8;
    }
}

