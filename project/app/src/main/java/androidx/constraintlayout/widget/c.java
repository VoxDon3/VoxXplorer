/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import ax.H.e;
import ax.H.i;
import ax.L.b;
import java.util.Arrays;
import java.util.HashMap;

public abstract class c
extends View {
    protected int[] a = new int[32];
    protected int b;
    protected Context c;
    protected i d;
    protected boolean e = false;
    protected String f;
    protected String g;
    private View[] h = null;
    protected HashMap<Integer, String> i = new HashMap();

    public c(Context context) {
        super(context);
        this.c = context;
        this.m(null);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
        this.m(attributeSet);
    }

    private void d(String string) {
        if (string != null && string.length() != 0 && this.c != null) {
            int n8;
            Object object;
            string = string.trim();
            if (this.getParent() instanceof ConstraintLayout) {
                object = (ConstraintLayout)this.getParent();
            }
            if ((n8 = this.k(string)) != 0) {
                this.i.put(n8, string);
                this.e(n8);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Could not find id of \"");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("\"");
            Log.w((String)"ConstraintHelper", (String)((StringBuilder)object).toString());
        }
    }

    private void e(int n8) {
        if (n8 == this.getId()) {
            return;
        }
        int n9 = this.b;
        int[] nArray = this.a;
        if (n9 + 1 > nArray.length) {
            this.a = Arrays.copyOf(nArray, nArray.length * 2);
        }
        nArray = this.a;
        n9 = this.b;
        nArray[n9] = n8;
        this.b = n9 + 1;
    }

    private void f(String object) {
        if (object != null && object.length() != 0 && this.c != null) {
            String string = object.trim();
            object = this.getParent() instanceof ConstraintLayout ? (ConstraintLayout)this.getParent() : null;
            if (object == null) {
                Log.w((String)"ConstraintHelper", (String)"Parent not a ConstraintLayout");
                return;
            }
            int n8 = object.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                View view = object.getChildAt(i8);
                Object object2 = view.getLayoutParams();
                if (!(object2 instanceof ConstraintLayout.b) || !string.equals(((ConstraintLayout.b)((Object)object2)).c0)) continue;
                if (view.getId() == -1) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("to use ConstraintTag view ");
                    ((StringBuilder)object2).append(view.getClass().getSimpleName());
                    ((StringBuilder)object2).append(" must have an ID");
                    Log.w((String)"ConstraintHelper", (String)((StringBuilder)object2).toString());
                    continue;
                }
                this.e(view.getId());
            }
        }
    }

    private int j(ConstraintLayout constraintLayout, String string) {
        if (string != null && constraintLayout != null) {
            Resources resources = this.c.getResources();
            if (resources == null) {
                return 0;
            }
            int n8 = constraintLayout.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                String string2;
                View view = constraintLayout.getChildAt(i8);
                if (view.getId() == -1) continue;
                try {
                    string2 = resources.getResourceEntryName(view.getId());
                }
                catch (Resources.NotFoundException notFoundException) {
                    string2 = null;
                }
                if (!string.equals(string2)) continue;
                return view.getId();
            }
        }
        return 0;
    }

    private int k(String string) {
        int n8;
        ConstraintLayout constraintLayout = this.getParent() instanceof ConstraintLayout ? (ConstraintLayout)this.getParent() : null;
        boolean bl = this.isInEditMode();
        int n9 = n8 = 0;
        if (bl) {
            n9 = n8;
            if (constraintLayout != null) {
                Object object = constraintLayout.k(0, string);
                n9 = n8;
                if (object instanceof Integer) {
                    n9 = (Integer)object;
                }
            }
        }
        n8 = n9;
        if (n9 == 0) {
            n8 = n9;
            if (constraintLayout != null) {
                n8 = this.j(constraintLayout, string);
            }
        }
        n9 = n8;
        if (n8 == 0) {
            try {
                n9 = b.class.getField(string).getInt(null);
            }
            catch (Exception exception) {
                n9 = n8;
            }
        }
        n8 = n9;
        if (n9 == 0) {
            n8 = this.c.getResources().getIdentifier(string, "id", this.c.getPackageName());
        }
        return n8;
    }

    protected void g() {
        ViewParent viewParent = this.getParent();
        if (viewParent != null && viewParent instanceof ConstraintLayout) {
            this.h((ConstraintLayout)viewParent);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.b);
    }

    protected void h(ConstraintLayout constraintLayout) {
        int n8 = this.getVisibility();
        float f8 = this.getElevation();
        for (int i8 = 0; i8 < this.b; ++i8) {
            View view = constraintLayout.m(this.a[i8]);
            if (view == null) continue;
            view.setVisibility(n8);
            if (!(f8 > 0.0f)) continue;
            view.setTranslationZ(view.getTranslationZ() + f8);
        }
    }

    protected void i(ConstraintLayout constraintLayout) {
    }

    protected View[] l(ConstraintLayout constraintLayout) {
        View[] viewArray = this.h;
        if (viewArray == null || viewArray.length != this.b) {
            this.h = new View[this.b];
        }
        for (int i8 = 0; i8 < this.b; ++i8) {
            int n8 = this.a[i8];
            this.h[i8] = constraintLayout.m(n8);
        }
        return this.h;
    }

    protected void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            attributeSet = this.getContext().obtainStyledAttributes(attributeSet, ax.L.c.n1);
            int n8 = attributeSet.getIndexCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                String string;
                int n9 = attributeSet.getIndex(i8);
                if (n9 == ax.L.c.G1) {
                    this.f = string = attributeSet.getString(n9);
                    this.setIds(string);
                    continue;
                }
                if (n9 != ax.L.c.H1) continue;
                this.g = string = attributeSet.getString(n9);
                this.setReferenceTags(string);
            }
            attributeSet.recycle();
        }
    }

    public void n(e e8, boolean bl) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String string = this.f;
        if (string != null) {
            this.setIds(string);
        }
        if ((string = this.g) != null) {
            this.setReferenceTags(string);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    protected void onMeasure(int n8, int n9) {
        if (this.e) {
            super.onMeasure(n8, n9);
            return;
        }
        this.setMeasuredDimension(0, 0);
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    public void r(ConstraintLayout constraintLayout) {
        i i8;
        if (this.isInEditMode()) {
            this.setIds(this.f);
        }
        if ((i8 = this.d) == null) {
            return;
        }
        i8.b();
        for (int i9 = 0; i9 < this.b; ++i9) {
            int n8 = this.a[i9];
            View view = constraintLayout.m(n8);
            i8 = view;
            if (view == null) {
                String string = this.i.get(n8);
                n8 = this.j(constraintLayout, string);
                i8 = view;
                if (n8 != 0) {
                    this.a[i9] = n8;
                    this.i.put(n8, string);
                    i8 = constraintLayout.m(n8);
                }
            }
            if (i8 == null) continue;
            this.d.c(constraintLayout.n((View)i8));
        }
        this.d.a(constraintLayout.c);
    }

    public void s() {
        ViewGroup.LayoutParams layoutParams;
        if (this.d != null && (layoutParams = this.getLayoutParams()) instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b)layoutParams).v0 = (e)((Object)this.d);
        }
    }

    protected void setIds(String string) {
        this.f = string;
        if (string == null) {
            return;
        }
        int n8 = 0;
        this.b = 0;
        while (true) {
            int n9;
            if ((n9 = string.indexOf(44, n8)) == -1) {
                this.d(string.substring(n8));
                return;
            }
            this.d(string.substring(n8, n9));
            n8 = n9 + 1;
        }
    }

    protected void setReferenceTags(String string) {
        this.g = string;
        if (string == null) {
            return;
        }
        int n8 = 0;
        this.b = 0;
        while (true) {
            int n9;
            if ((n9 = string.indexOf(44, n8)) == -1) {
                this.f(string.substring(n8));
                return;
            }
            this.f(string.substring(n8, n9));
            n8 = n9 + 1;
        }
    }

    public void setReferencedIds(int[] nArray) {
        this.f = null;
        this.b = 0;
        for (int i8 = 0; i8 < nArray.length; ++i8) {
            this.e(nArray[i8]);
        }
    }

    public void setTag(int n8, Object object) {
        super.setTag(n8, object);
        if (object == null && this.f == null) {
            this.e(n8);
        }
    }
}

