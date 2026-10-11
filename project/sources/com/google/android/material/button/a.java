package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ax.F6.z;
import ax.O6.d;
import ax.O6.p;
import ax.O6.q;
import ax.O6.r;
import ax.k6.C2402c;
import ax.k6.l;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.button.MaterialButton;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class a extends LinearLayout {
    private static final int k = l.m;
    private final List<ax.O6.l> a;
    private final List<q> b;
    private final b c;
    private final Comparator<MaterialButton> d;
    private Integer[] e;
    p f;
    private q g;
    private int h;
    private r i;
    private boolean j;

    private class b implements MaterialButton.c {
        private b() {
        }

        @Override // com.google.android.material.button.MaterialButton.c
        public void a(MaterialButton materialButton, boolean z) {
            a.this.invalidate();
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2402c.s);
    }

    public static /* synthetic */ int a(a aVar, MaterialButton materialButton, MaterialButton materialButton2) {
        aVar.getClass();
        int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        return compareTo2 != 0 ? compareTo2 : Integer.compare(aVar.indexOfChild(materialButton), aVar.indexOfChild(materialButton2));
    }

    private void b() {
        int i;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton f = f(i2);
            MaterialButton f2 = f(i2 - 1);
            if (this.h <= 0) {
                i = Math.min(f.getStrokeWidth(), f2.getStrokeWidth());
                f.setShouldDrawSurfaceColorStroke(true);
                f2.setShouldDrawSurfaceColorStroke(true);
            } else {
                f.setShouldDrawSurfaceColorStroke(false);
                f2.setShouldDrawSurfaceColorStroke(false);
                i = 0;
            }
            LinearLayout.LayoutParams d = d(f);
            if (getOrientation() == 0) {
                d.setMarginEnd(0);
                d.setMarginStart(this.h - i);
                d.topMargin = 0;
            } else {
                d.bottomMargin = 0;
                d.topMargin = this.h - i;
                d.setMarginStart(0);
            }
            f.setLayoutParams(d);
        }
        m(firstVisibleChildIndex);
    }

    private void c() {
        if (this.i == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int i = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        for (int i2 = firstVisibleChildIndex; i2 <= lastVisibleChildIndex; i2++) {
            if (j(i2)) {
                int e = e(i2);
                if (i2 != firstVisibleChildIndex && i2 != lastVisibleChildIndex) {
                    e /= 2;
                }
                i = Math.min(i, e);
            }
        }
        int i3 = firstVisibleChildIndex;
        while (i3 <= lastVisibleChildIndex) {
            if (j(i3)) {
                f(i3).setSizeChange(this.i);
                f(i3).setWidthChangeMax((i3 == firstVisibleChildIndex || i3 == lastVisibleChildIndex) ? i : i * 2);
            }
            i3++;
        }
    }

    private int e(int i) {
        if (!j(i) || this.i == null) {
            return 0;
        }
        int max = Math.max(0, this.i.c(f(i).getWidth()));
        MaterialButton i2 = i(i);
        int allowedWidthDecrease = i2 == null ? 0 : i2.getAllowedWidthDecrease();
        MaterialButton g = g(i);
        return Math.min(max, allowedWidthDecrease + (g != null ? g.getAllowedWidthDecrease() : 0));
    }

    private MaterialButton g(int i) {
        int childCount = getChildCount();
        do {
            i++;
            if (i >= childCount) {
                return null;
            }
        } while (!j(i));
        return f(i);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (j(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (j(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private q.b h(boolean z, boolean z2, int i) {
        q qVar = this.g;
        if (qVar == null || (!z && !z2)) {
            qVar = this.b.get(i);
        }
        return qVar == null ? new q.b(this.a.get(i)) : qVar.i();
    }

    private MaterialButton i(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (j(i2)) {
                return f(i2);
            }
        }
        return null;
    }

    private boolean j(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    private void l() {
        for (int i = 0; i < getChildCount(); i++) {
            f(i).o();
        }
    }

    private void m(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void n() {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(f(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        l();
        this.j = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.c);
        this.a.add(materialButton.getShapeAppearanceModel());
        this.b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        n();
        super.dispatchDraw(canvas);
    }

    MaterialButton f(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public r getButtonSizeChange() {
        return this.i;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public d getInnerCornerSize() {
        return this.f.e();
    }

    public p getInnerCornerSizeStateList() {
        return this.f;
    }

    public ax.O6.l getShapeAppearance() {
        q qVar = this.g;
        if (qVar == null) {
            return null;
        }
        return qVar.c(true);
    }

    public int getSpacing() {
        return this.h;
    }

    public q getStateListShapeAppearance() {
        return this.g;
    }

    void k(MaterialButton materialButton, int i) {
        int indexOfChild = indexOfChild(materialButton);
        if (indexOfChild < 0) {
            return;
        }
        MaterialButton i2 = i(indexOfChild);
        MaterialButton g = g(indexOfChild);
        if (i2 == null && g == null) {
            return;
        }
        if (i2 == null) {
            g.setDisplayedWidthDecrease(i);
        }
        if (g == null) {
            i2.setDisplayedWidthDecrease(i);
        }
        if (i2 == null || g == null) {
            return;
        }
        i2.setDisplayedWidthDecrease(i / 2);
        g.setDisplayedWidthDecrease((i + 1) / 2);
    }

    void o() {
        int i;
        if (!(this.f == null && this.g == null) && this.j) {
            this.j = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton f = f(i2);
                if (f.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    q.b h = h(z, z2, i2);
                    boolean z3 = getOrientation() == 0;
                    boolean h2 = z.h(this);
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (h2) {
                            i = q.h(i);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    q j = h.n(this.f, ~i).j();
                    if (j.f()) {
                        f.setStateListShapeAppearanceModel(j);
                    } else {
                        f.setShapeAppearanceModel(j.c(true));
                    }
                }
                i2++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            l();
            c();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        o();
        b();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.a.remove(indexOfChild);
            this.b.remove(indexOfChild);
        }
        this.j = true;
        o();
        l();
        b();
    }

    public void setButtonSizeChange(r rVar) {
        if (this.i != rVar) {
            this.i = rVar;
            c();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            f(i).setEnabled(z);
        }
    }

    public void setInnerCornerSize(d dVar) {
        this.f = p.c(dVar);
        this.j = true;
        o();
        invalidate();
    }

    public void setInnerCornerSizeStateList(p pVar) {
        this.f = pVar;
        this.j = true;
        o();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.j = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(ax.O6.l lVar) {
        this.g = new q.b(lVar).j();
        this.j = true;
        o();
        invalidate();
    }

    public void setSpacing(int i) {
        this.h = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(q qVar) {
        this.g = qVar;
        this.j = true;
        o();
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.button.a.k
            android.content.Context r8 = ax.V6.a.d(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.a = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.b = r8
            com.google.android.material.button.a$b r8 = new com.google.android.material.button.a$b
            r0 = 0
            r8.<init>()
            r7.c = r8
            ax.r6.c r8 = new ax.r6.c
            r8.<init>()
            r7.d = r8
            r8 = 1
            r7.j = r8
            android.content.Context r0 = r7.getContext()
            int[] r2 = ax.k6.m.R2
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = ax.F6.w.i(r0, r1, r2, r3, r4, r5)
            int r10 = ax.k6.m.U2
            boolean r1 = r9.hasValue(r10)
            if (r1 == 0) goto L46
            ax.O6.r r10 = ax.O6.r.b(r0, r9, r10)
            r7.i = r10
        L46:
            int r10 = ax.k6.m.W2
            boolean r1 = r9.hasValue(r10)
            if (r1 == 0) goto L73
            ax.O6.q r1 = ax.O6.q.b(r0, r9, r10)
            r7.g = r1
            if (r1 != 0) goto L73
            ax.O6.q$b r1 = new ax.O6.q$b
            int r10 = r9.getResourceId(r10, r6)
            int r2 = ax.k6.m.X2
            int r2 = r9.getResourceId(r2, r6)
            ax.O6.l$b r10 = ax.O6.l.b(r0, r10, r2)
            ax.O6.l r10 = r10.m()
            r1.<init>(r10)
            ax.O6.q r10 = r1.j()
            r7.g = r10
        L73:
            int r10 = ax.k6.m.V2
            boolean r1 = r9.hasValue(r10)
            if (r1 == 0) goto L87
            ax.O6.a r1 = new ax.O6.a
            r2 = 0
            r1.<init>(r2)
            ax.O6.p r10 = ax.O6.p.b(r0, r9, r10, r1)
            r7.f = r10
        L87:
            int r10 = ax.k6.m.T2
            int r10 = r9.getDimensionPixelSize(r10, r6)
            r7.h = r10
            r7.setChildrenDrawingOrderEnabled(r8)
            int r10 = ax.k6.m.S2
            boolean r8 = r9.getBoolean(r10, r8)
            r7.setEnabled(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
