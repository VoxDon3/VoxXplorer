package com.google.android.material.button;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import ax.c0.C1753a;
import ax.c0.C1760d0;
import ax.d0.H;
import ax.k6.C2402c;
import ax.k6.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends com.google.android.material.button.a {
    private static final int r = l.B;
    private final LinkedHashSet<b> l;
    private boolean m;
    private boolean n;
    private boolean o;
    private final int p;
    private Set<Integer> q;

    class a extends C1753a {
        a() {
        }

        @Override // ax.c0.C1753a
        public void g(View view, H h) {
            super.g(view, h);
            h.p0(H.f.a(0, 1, MaterialButtonToggleGroup.this.u(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public interface b {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2402c.u);
    }

    private String getChildrenA11yClassName() {
        return (this.n ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && j(i2)) {
                i++;
            }
        }
        return i;
    }

    private boolean j(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    private void r(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.q);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.n && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.o || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        y(hashSet);
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    private void t(int i, boolean z) {
        Iterator<b> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().a(this, i, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int u(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && j(i2)) {
                i++;
            }
        }
        return -1;
    }

    private void x(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.m = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.m = false;
        }
    }

    private void y(Set<Integer> set) {
        Set<Integer> set2 = this.q;
        this.q = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = f(i).getId();
            x(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                t(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void z() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            f(i).setA11yClassName(childrenA11yClassName);
        }
    }

    @Override // com.google.android.material.button.a, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        r(materialButton.getId(), materialButton.isChecked());
        C1760d0.l0(materialButton, new a());
    }

    public int getCheckedButtonId() {
        if (!this.n || this.q.isEmpty()) {
            return -1;
        }
        return this.q.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = f(i).getId();
            if (this.q.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.p;
        if (i != -1) {
            y(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        H.Q0(accessibilityNodeInfo).o0(H.e.a(1, getVisibleButtonCount(), false, v() ? 1 : 2));
    }

    public void q(b bVar) {
        this.l.add(bVar);
    }

    public void s() {
        y(new HashSet());
    }

    public void setSelectionRequired(boolean z) {
        this.o = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.n != z) {
            this.n = z;
            s();
        }
        z();
    }

    public boolean v() {
        return this.n;
    }

    void w(MaterialButton materialButton, boolean z) {
        if (this.m) {
            return;
        }
        r(materialButton.getId(), z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.r
            android.content.Context r7 = ax.V6.a.d(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.l = r7
            r7 = 0
            r6.m = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.q = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = ax.k6.m.Y2
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = ax.F6.w.i(r0, r1, r2, r3, r4, r5)
            int r9 = ax.k6.m.c3
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = ax.k6.m.a3
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.p = r9
            int r9 = ax.k6.m.b3
            boolean r7 = r8.getBoolean(r9, r7)
            r6.o = r7
            ax.O6.p r7 = r6.f
            if (r7 != 0) goto L52
            ax.O6.a r7 = new ax.O6.a
            r9 = 0
            r7.<init>(r9)
            ax.O6.p r7 = ax.O6.p.c(r7)
            r6.f = r7
        L52:
            int r7 = ax.k6.m.Z2
            r9 = 1
            boolean r7 = r8.getBoolean(r7, r9)
            r6.setEnabled(r7)
            r8.recycle()
            r6.setImportantForAccessibility(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
