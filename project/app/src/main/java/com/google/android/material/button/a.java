/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ax.F6.w;
import ax.F6.z;
import ax.O6.d;
import ax.O6.l;
import ax.O6.p;
import ax.O6.q;
import ax.O6.r;
import ax.k6.m;
import ax.r6.c;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class a
extends LinearLayout {
    private static final int k = ax.k6.l.m;
    private final List<l> a;
    private final List<q> b;
    private final b c;
    private final Comparator<MaterialButton> d;
    private Integer[] e;
    p f;
    private q g;
    private int h;
    private r i;
    private boolean j;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.k6.c.s);
    }

    public a(Context context, AttributeSet object, int n8) {
        int n9 = k;
        super(ax.V6.a.d(context, object, n8, n9), object, n8);
        this.a = new ArrayList<l>();
        this.b = new ArrayList<q>();
        this.c = new b(this);
        this.d = new c(this);
        this.j = true;
        context = this.getContext();
        TypedArray typedArray = w.i(context, object, m.R2, n8, n9, new int[0]);
        n8 = m.U2;
        if (typedArray.hasValue(n8)) {
            this.i = r.b(context, typedArray, n8);
        }
        if (typedArray.hasValue(n8 = m.W2)) {
            object = q.b(context, typedArray, n8);
            this.g = object;
            if (object == null) {
                this.g = new q.b(l.b(context, typedArray.getResourceId(n8, 0), typedArray.getResourceId(m.X2, 0)).m()).j();
            }
        }
        if (typedArray.hasValue(n8 = m.V2)) {
            this.f = p.b(context, typedArray, n8, new ax.O6.a(0.0f));
        }
        this.h = typedArray.getDimensionPixelSize(m.T2, 0);
        this.setChildrenDrawingOrderEnabled(true);
        this.setEnabled(typedArray.getBoolean(m.S2, true));
        typedArray.recycle();
    }

    public static /* synthetic */ int a(a a8, MaterialButton materialButton, MaterialButton materialButton2) {
        ((Object)((Object)a8)).getClass();
        int n8 = Boolean.valueOf(materialButton.isChecked()).compareTo(materialButton2.isChecked());
        if (n8 != 0) {
            return n8;
        }
        n8 = Boolean.valueOf(materialButton.isPressed()).compareTo(materialButton2.isPressed());
        if (n8 != 0) {
            return n8;
        }
        return Integer.compare(a8.indexOfChild((View)materialButton), a8.indexOfChild((View)materialButton2));
    }

    private void b() {
        int n8 = this.getFirstVisibleChildIndex();
        if (n8 == -1) {
            return;
        }
        for (int i8 = n8 + 1; i8 < this.getChildCount(); ++i8) {
            int n9;
            MaterialButton materialButton = this.f(i8);
            MaterialButton materialButton2 = this.f(i8 - 1);
            if (this.h <= 0) {
                n9 = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                n9 = 0;
            }
            materialButton2 = this.d((View)materialButton);
            if (this.getOrientation() == 0) {
                materialButton2.setMarginEnd(0);
                materialButton2.setMarginStart(this.h - n9);
                ((LinearLayout.LayoutParams)materialButton2).topMargin = 0;
            } else {
                ((LinearLayout.LayoutParams)materialButton2).bottomMargin = 0;
                ((LinearLayout.LayoutParams)materialButton2).topMargin = this.h - n9;
                materialButton2.setMarginStart(0);
            }
            materialButton.setLayoutParams((ViewGroup.LayoutParams)materialButton2);
        }
        this.m(n8);
    }

    private void c() {
        if (this.i != null && this.getChildCount() != 0) {
            int n8;
            int n9;
            int n10 = this.getFirstVisibleChildIndex();
            int n11 = this.getLastVisibleChildIndex();
            int n12 = Integer.MAX_VALUE;
            for (n9 = n10; n9 <= n11; ++n9) {
                int n13;
                if (!this.j(n9)) continue;
                n8 = n13 = this.e(n9);
                if (n9 != n10) {
                    n8 = n13;
                    if (n9 != n11) {
                        n8 = n13 / 2;
                    }
                }
                n12 = Math.min(n12, n8);
            }
            for (n9 = n10; n9 <= n11; ++n9) {
                if (!this.j(n9)) continue;
                this.f(n9).setSizeChange(this.i);
                MaterialButton materialButton = this.f(n9);
                n8 = n9 != n10 && n9 != n11 ? n12 * 2 : n12;
                materialButton.setWidthChangeMax(n8);
            }
        }
    }

    private int e(int n8) {
        boolean bl = this.j(n8);
        int n9 = 0;
        if (bl && this.i != null) {
            MaterialButton materialButton = this.f(n8);
            int n10 = Math.max(0, this.i.c(materialButton.getWidth()));
            materialButton = this.i(n8);
            int n11 = materialButton == null ? 0 : materialButton.getAllowedWidthDecrease();
            materialButton = this.g(n8);
            n8 = materialButton == null ? n9 : materialButton.getAllowedWidthDecrease();
            return Math.min(n10, n11 + n8);
        }
        return 0;
    }

    private MaterialButton g(int n8) {
        int n9;
        int n10 = this.getChildCount();
        while ((n9 = n8 + 1) < n10) {
            n8 = n9;
            if (!this.j(n9)) continue;
            return this.f(n9);
        }
        return null;
    }

    private int getFirstVisibleChildIndex() {
        int n8 = this.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!this.j(i8)) continue;
            return i8;
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int i8 = this.getChildCount() - 1; i8 >= 0; --i8) {
            if (!this.j(i8)) continue;
            return i8;
        }
        return -1;
    }

    /*
     * Exception decompiling
     */
    private q.b h(boolean var1_1, boolean var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private MaterialButton i(int n8) {
        --n8;
        while (n8 >= 0) {
            if (this.j(n8)) {
                return this.f(n8);
            }
            --n8;
        }
        return null;
    }

    private boolean j(int n8) {
        return this.getChildAt(n8).getVisibility() != 8;
    }

    private void l() {
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            this.f(i8).o();
        }
    }

    private void m(int n8) {
        if (this.getChildCount() != 0 && n8 != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.f(n8).getLayoutParams();
            if (this.getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void n() {
        TreeMap<MaterialButton, Integer> treeMap = new TreeMap<MaterialButton, Integer>(this.d);
        int n8 = this.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            treeMap.put(this.f(i8), i8);
        }
        this.e = treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public void addView(View object, int n8, ViewGroup.LayoutParams layoutParams) {
        if (!(object instanceof MaterialButton)) {
            Log.e((String)"MButtonGroup", (String)"Child views must be of type MaterialButton.");
            return;
        }
        this.l();
        this.j = true;
        super.addView((View)object, n8, layoutParams);
        object = (MaterialButton)object;
        this.setGeneratedIdIfNeeded((MaterialButton)object);
        ((MaterialButton)object).setOnPressedChangeListenerInternal(this.c);
        this.a.add(((MaterialButton)object).getShapeAppearanceModel());
        this.b.add(((MaterialButton)object).getStateListShapeAppearanceModel());
        object.setEnabled(this.isEnabled());
    }

    LinearLayout.LayoutParams d(View view) {
        if ((view = view.getLayoutParams()) instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams)view;
        }
        return new LinearLayout.LayoutParams(view.width, view.height);
    }

    protected void dispatchDraw(Canvas canvas) {
        this.n();
        super.dispatchDraw(canvas);
    }

    MaterialButton f(int n8) {
        return (MaterialButton)this.getChildAt(n8);
    }

    public r getButtonSizeChange() {
        return this.i;
    }

    protected int getChildDrawingOrder(int n8, int n9) {
        Integer[] integerArray = this.e;
        if (integerArray != null && n9 < integerArray.length) {
            return integerArray[n9];
        }
        Log.w((String)"MButtonGroup", (String)"Child order wasn't updated");
        return n9;
    }

    public d getInnerCornerSize() {
        return this.f.e();
    }

    public p getInnerCornerSizeStateList() {
        return this.f;
    }

    public l getShapeAppearance() {
        q q8 = this.g;
        if (q8 == null) {
            return null;
        }
        return q8.c(true);
    }

    public int getSpacing() {
        return this.h;
    }

    public q getStateListShapeAppearance() {
        return this.g;
    }

    void k(MaterialButton materialButton, int n8) {
        int n9 = this.indexOfChild((View)materialButton);
        if (n9 >= 0) {
            MaterialButton materialButton2 = this.i(n9);
            materialButton = this.g(n9);
            if (materialButton2 != null || materialButton != null) {
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(n8);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(n8);
                }
                if (materialButton2 != null && materialButton != null) {
                    materialButton2.setDisplayedWidthDecrease(n8 / 2);
                    materialButton.setDisplayedWidthDecrease((n8 + 1) / 2);
                }
            }
        }
    }

    void o() {
        if ((this.f != null || this.g != null) && this.j) {
            this.j = false;
            int n8 = this.getChildCount();
            int n9 = this.getFirstVisibleChildIndex();
            int n10 = this.getLastVisibleChildIndex();
            for (int i8 = 0; i8 < n8; ++i8) {
                int n11;
                MaterialButton materialButton = this.f(i8);
                if (materialButton.getVisibility() == 8) continue;
                boolean bl = i8 == n9;
                boolean bl2 = i8 == n10;
                Object object = this.h(bl, bl2, i8);
                int n12 = this.getOrientation() == 0 ? 1 : 0;
                boolean bl3 = z.h((View)this);
                if (n12 != 0) {
                    n12 = bl ? 5 : 0;
                    n11 = n12;
                    if (bl2) {
                        n11 = n12 | 0xA;
                    }
                    n12 = n11;
                    if (bl3) {
                        n12 = q.h(n11);
                    }
                } else {
                    n11 = bl ? 3 : 0;
                    n12 = n11;
                    if (bl2) {
                        n12 = n11 | 0xC;
                    }
                }
                if (((q)(object = ((q.b)object).n(this.f, ~n12).j())).f()) {
                    materialButton.setStateListShapeAppearanceModel((q)object);
                    continue;
                }
                materialButton.setShapeAppearanceModel(((q)object).c(true));
            }
        }
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        if (bl) {
            this.l();
            this.c();
        }
    }

    protected void onMeasure(int n8, int n9) {
        this.o();
        this.b();
        super.onMeasure(n8, n9);
    }

    public void onViewRemoved(View view) {
        int n8;
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton)view).setOnPressedChangeListenerInternal(null);
        }
        if ((n8 = this.indexOfChild(view)) >= 0) {
            this.a.remove(n8);
            this.b.remove(n8);
        }
        this.j = true;
        this.o();
        this.l();
        this.b();
    }

    public void setButtonSizeChange(r r8) {
        if (this.i != r8) {
            this.i = r8;
            this.c();
            this.requestLayout();
            this.invalidate();
        }
    }

    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            this.f(i8).setEnabled(bl);
        }
    }

    public void setInnerCornerSize(d d8) {
        this.f = p.c(d8);
        this.j = true;
        this.o();
        this.invalidate();
    }

    public void setInnerCornerSizeStateList(p p8) {
        this.f = p8;
        this.j = true;
        this.o();
        this.invalidate();
    }

    public void setOrientation(int n8) {
        if (this.getOrientation() != n8) {
            this.j = true;
        }
        super.setOrientation(n8);
    }

    public void setShapeAppearance(l l8) {
        this.g = new q.b(l8).j();
        this.j = true;
        this.o();
        this.invalidate();
    }

    public void setSpacing(int n8) {
        this.h = n8;
        this.invalidate();
        this.requestLayout();
    }

    public void setStateListShapeAppearance(q q8) {
        this.g = q8;
        this.j = true;
        this.o();
        this.invalidate();
    }

    private class b
    implements MaterialButton.c {
        final a a;

        private b(a a8) {
            this.a = a8;
        }

        @Override
        public void a(MaterialButton materialButton, boolean bl) {
            this.a.invalidate();
        }
    }
}

