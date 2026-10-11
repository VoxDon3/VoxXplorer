/*
 * Decompiled with CFR 0.152.
 */
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
import ax.F6.w;
import ax.O6.p;
import ax.c0.d0;
import ax.d0.H;
import ax.k6.c;
import ax.k6.l;
import ax.k6.m;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MaterialButtonToggleGroup
extends a {
    private static final int r = ax.k6.l.B;
    private final LinkedHashSet<b> l;
    private boolean m;
    private boolean n;
    private boolean o;
    private final int p;
    private Set<Integer> q;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.u);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int n8) {
        int n9 = r;
        super(ax.V6.a.d(context, attributeSet, n8, n9), attributeSet, n8);
        this.l = new LinkedHashSet();
        this.m = false;
        this.q = new HashSet<Integer>();
        context = w.i(this.getContext(), attributeSet, ax.k6.m.Y2, n8, n9, new int[0]);
        this.setSingleSelection(context.getBoolean(ax.k6.m.c3, false));
        this.p = context.getResourceId(ax.k6.m.a3, -1);
        this.o = context.getBoolean(ax.k6.m.b3, false);
        if (this.f == null) {
            this.f = ax.O6.p.c(new ax.O6.a(0.0f));
        }
        this.setEnabled(context.getBoolean(ax.k6.m.Z2, true));
        context.recycle();
        this.setImportantForAccessibility(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String getChildrenA11yClassName() {
        Class<RadioButton> clazz;
        if (this.n) {
            clazz = RadioButton.class;
            return clazz.getName();
        }
        clazz = ToggleButton.class;
        return clazz.getName();
    }

    private int getVisibleButtonCount() {
        int n8 = 0;
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            int n9 = n8;
            if (this.getChildAt(i8) instanceof MaterialButton) {
                n9 = n8;
                if (this.j(i8)) {
                    n9 = n8 + 1;
                }
            }
            n8 = n9;
        }
        return n8;
    }

    private boolean j(int n8) {
        return this.getChildAt(n8).getVisibility() != 8;
    }

    private void r(int n8, boolean bl) {
        block8: {
            HashSet<Integer> hashSet;
            block7: {
                block6: {
                    if (n8 == -1) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Button ID is not valid: ");
                        stringBuilder.append(n8);
                        Log.e((String)"MButtonToggleGroup", (String)stringBuilder.toString());
                        return;
                    }
                    hashSet = new HashSet<Integer>(this.q);
                    if (!bl || hashSet.contains(n8)) break block6;
                    if (this.n && !hashSet.isEmpty()) {
                        hashSet.clear();
                    }
                    hashSet.add(n8);
                    break block7;
                }
                if (bl || !hashSet.contains(n8)) break block8;
                if (!this.o || hashSet.size() > 1) {
                    hashSet.remove(n8);
                }
            }
            this.y(hashSet);
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(this.getChildrenA11yClassName());
    }

    private void t(int n8, boolean bl) {
        Iterator iterator = ((AbstractCollection)this.l).iterator();
        while (iterator.hasNext()) {
            ((b)iterator.next()).a(this, n8, bl);
        }
    }

    private int u(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int n8 = 0;
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            if (this.getChildAt(i8) == view) {
                return n8;
            }
            int n9 = n8;
            if (this.getChildAt(i8) instanceof MaterialButton) {
                n9 = n8;
                if (this.j(i8)) {
                    n9 = n8 + 1;
                }
            }
            n8 = n9;
        }
        return -1;
    }

    private void x(int n8, boolean bl) {
        View view = this.findViewById(n8);
        if (view instanceof MaterialButton) {
            this.m = true;
            ((MaterialButton)view).setChecked(bl);
            this.m = false;
        }
    }

    private void y(Set<Integer> set) {
        Set<Integer> set2 = this.q;
        this.q = new HashSet<Integer>(set);
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            int n8 = this.f(i8).getId();
            this.x(n8, set.contains(n8));
            if (set2.contains(n8) == set.contains(n8)) continue;
            this.t(n8, set.contains(n8));
        }
        this.invalidate();
    }

    private void z() {
        String string = this.getChildrenA11yClassName();
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            this.f(i8).setA11yClassName(string);
        }
    }

    @Override
    public void addView(View object, int n8, ViewGroup.LayoutParams layoutParams) {
        if (!(object instanceof MaterialButton)) {
            Log.e((String)"MButtonToggleGroup", (String)"Child views must be of type MaterialButton.");
            return;
        }
        super.addView((View)object, n8, layoutParams);
        object = (MaterialButton)object;
        this.setupButtonChild((MaterialButton)object);
        this.r(object.getId(), ((MaterialButton)object).isChecked());
        d0.l0((View)object, new ax.c0.a(this){
            final MaterialButtonToggleGroup d;
            {
                this.d = materialButtonToggleGroup;
            }

            @Override
            public void g(View view, H h8) {
                super.g(view, h8);
                h8.p0(H.f.a(0, 1, this.d.u(view), 1, false, ((MaterialButton)view).isChecked()));
            }
        });
    }

    public int getCheckedButtonId() {
        if (this.n && !this.q.isEmpty()) {
            return this.q.iterator().next();
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            int n8 = this.f(i8).getId();
            if (!this.q.contains(n8)) continue;
            arrayList.add(n8);
        }
        return arrayList;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        int n8 = this.p;
        if (n8 != -1) {
            this.y(Collections.singleton(n8));
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo object) {
        super.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo)object);
        object = H.Q0((AccessibilityNodeInfo)object);
        int n8 = this.getVisibleButtonCount();
        int n9 = this.v() ? 1 : 2;
        ((H)object).o0(H.e.a(1, n8, false, n9));
    }

    public void q(b b8) {
        ((AbstractCollection)this.l).add(b8);
    }

    public void s() {
        this.y(new HashSet<Integer>());
    }

    public void setSelectionRequired(boolean bl) {
        this.o = bl;
    }

    public void setSingleSelection(int n8) {
        this.setSingleSelection(this.getResources().getBoolean(n8));
    }

    public void setSingleSelection(boolean bl) {
        if (this.n != bl) {
            this.n = bl;
            this.s();
        }
        this.z();
    }

    public boolean v() {
        return this.n;
    }

    void w(MaterialButton materialButton, boolean bl) {
        if (this.m) {
            return;
        }
        this.r(materialButton.getId(), bl);
    }

    public static interface b {
        public void a(MaterialButtonToggleGroup var1, int var2, boolean var3);
    }
}

