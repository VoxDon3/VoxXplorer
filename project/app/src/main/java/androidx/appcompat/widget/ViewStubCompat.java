/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ax.m.j;
import java.lang.ref.WeakReference;

public final class ViewStubCompat
extends View {
    private int a = 0;
    private int b;
    private WeakReference<View> c;
    private LayoutInflater d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        context = context.obtainStyledAttributes(attributeSet, j.D3, n8, 0);
        this.b = context.getResourceId(j.G3, -1);
        this.a = context.getResourceId(j.F3, 0);
        this.setId(context.getResourceId(j.E3, -1));
        context.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }

    public View a() {
        ViewParent viewParent = this.getParent();
        if (viewParent instanceof ViewGroup) {
            if (this.a != 0) {
                ViewGroup viewGroup = (ViewGroup)viewParent;
                viewParent = this.d;
                if (viewParent == null) {
                    viewParent = LayoutInflater.from((Context)this.getContext());
                }
                viewParent = viewParent.inflate(this.a, viewGroup, false);
                int n8 = this.b;
                if (n8 != -1) {
                    viewParent.setId(n8);
                }
                n8 = viewGroup.indexOfChild((View)this);
                viewGroup.removeViewInLayout((View)this);
                ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView((View)viewParent, n8, layoutParams);
                } else {
                    viewGroup.addView((View)viewParent, n8);
                }
                this.c = new WeakReference<ViewParent>(viewParent);
                return viewParent;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    protected void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint(value={"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.d;
    }

    public int getLayoutResource() {
        return this.a;
    }

    protected void onMeasure(int n8, int n9) {
        this.setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int n8) {
        this.b = n8;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.d = layoutInflater;
    }

    public void setLayoutResource(int n8) {
        this.a = n8;
    }

    public void setOnInflateListener(a a8) {
    }

    public void setVisibility(int n8) {
        View view = this.c;
        if (view != null) {
            if ((view = (View)view.get()) != null) {
                view.setVisibility(n8);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(n8);
        if (n8 != 0 && n8 != 4) {
            return;
        }
        this.a();
    }

    public static interface a {
    }
}

