/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.a;
import androidx.appcompat.widget.c;
import ax.c0.d0;
import ax.m.f;
import ax.m.g;
import ax.m.j;

public class ActionBarContextView
extends a {
    private CharSequence i;
    private CharSequence j;
    private View k;
    private View l;
    private View m;
    private LinearLayout n;
    private TextView o;
    private TextView p;
    private int q;
    private int r;
    private boolean s;
    private int t;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.j);
    }

    public ActionBarContextView(Context object, AttributeSet attributeSet, int n8) {
        super((Context)object, attributeSet, n8);
        object = L.v((Context)object, attributeSet, ax.m.j.y, n8, 0);
        this.setBackground(((L)object).g(ax.m.j.z));
        this.q = ((L)object).n(ax.m.j.D, 0);
        this.r = ((L)object).n(ax.m.j.C, 0);
        this.e = ((L)object).m(ax.m.j.B, 0);
        this.t = ((L)object).n(ax.m.j.A, g.d);
        ((L)object).x();
    }

    private void i() {
        int n8;
        LinearLayout linearLayout;
        block8: {
            block7: {
                if (this.n == null) {
                    LayoutInflater.from((Context)this.getContext()).inflate(g.a, (ViewGroup)this);
                    this.n = linearLayout = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
                    this.o = (TextView)linearLayout.findViewById(ax.m.f.e);
                    this.p = (TextView)this.n.findViewById(ax.m.f.d);
                    if (this.q != 0) {
                        this.o.setTextAppearance(this.getContext(), this.q);
                    }
                    if (this.r != 0) {
                        this.p.setTextAppearance(this.getContext(), this.r);
                    }
                }
                this.o.setText(this.i);
                this.p.setText(this.j);
                boolean bl = TextUtils.isEmpty((CharSequence)this.i);
                boolean bl2 = TextUtils.isEmpty((CharSequence)this.j);
                linearLayout = this.p;
                int n9 = 8;
                n8 = !bl2 ? 0 : 8;
                linearLayout.setVisibility(n8);
                linearLayout = this.n;
                if (!bl) break block7;
                n8 = n9;
                if (bl2) break block8;
            }
            n8 = 0;
        }
        linearLayout.setVisibility(n8);
        if (this.n.getParent() == null) {
            this.addView((View)this.n);
        }
    }

    public void g() {
        if (this.k == null) {
            this.k();
        }
    }

    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(this.getContext(), attributeSet);
    }

    public CharSequence getSubtitle() {
        return this.j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    public void h(androidx.appcompat.view.a object) {
        Object object2 = this.k;
        if (object2 == null) {
            object2 = LayoutInflater.from((Context)this.getContext()).inflate(this.t, (ViewGroup)this, false);
            this.k = object2;
            this.addView((View)object2);
        } else if (object2.getParent() == null) {
            this.addView(this.k);
        }
        object2 = this.k.findViewById(ax.m.f.i);
        this.l = object2;
        object2.setOnClickListener(new View.OnClickListener(){
            final androidx.appcompat.view.a a;
            final ActionBarContextView b;
            {
                this.b = actionBarContextView;
                this.a = a8;
            }

            public void onClick(View view) {
                this.a.c();
            }
        });
        object = (e)((androidx.appcompat.view.a)object).e();
        object2 = this.d;
        if (object2 != null) {
            ((c)object2).y();
        }
        this.d = object2 = new c(this.getContext());
        ((c)object2).J(true);
        object2 = new ViewGroup.LayoutParams(-2, -1);
        ((e)object).c(this.d, this.b);
        this.c = object = (ActionMenuView)this.d.o(this);
        object.setBackground(null);
        this.addView((View)this.c, (ViewGroup.LayoutParams)object2);
    }

    public boolean j() {
        return this.s;
    }

    public void k() {
        this.removeAllViews();
        this.m = null;
        this.c = null;
        this.d = null;
        View view = this.l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c c8 = this.d;
        if (c8 != null) {
            return c8.K();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c c8 = this.d;
        if (c8 != null) {
            c8.B();
            this.d.C();
        }
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        bl = O.b((View)this);
        int n12 = bl ? n10 - n8 - this.getPaddingRight() : this.getPaddingLeft();
        int n13 = this.getPaddingTop();
        int n14 = n11 - n9 - this.getPaddingTop() - this.getPaddingBottom();
        Object object = this.k;
        n9 = n12;
        if (object != null) {
            n9 = n12;
            if (object.getVisibility() != 8) {
                object = (ViewGroup.MarginLayoutParams)this.k.getLayoutParams();
                n9 = bl ? object.rightMargin : object.leftMargin;
                n11 = bl ? object.leftMargin : object.rightMargin;
                n9 = androidx.appcompat.widget.a.d(n12, n9, bl);
                n9 = androidx.appcompat.widget.a.d(n9 + this.e(this.k, n9, n13, n14, bl), n11, bl);
            }
        }
        n11 = n9;
        object = this.n;
        n9 = n11;
        if (object != null) {
            n9 = n11;
            if (this.m == null) {
                n9 = n11;
                if (object.getVisibility() != 8) {
                    n9 = n11 + this.e((View)this.n, n11, n13, n14, bl);
                }
            }
        }
        if ((object = this.m) != null) {
            this.e((View)object, n9, n13, n14, bl);
        }
        n8 = bl ? this.getPaddingLeft() : n10 - n8 - this.getPaddingRight();
        object = this.c;
        if (object != null) {
            this.e((View)object, n8, n13, n14, bl ^ true);
        }
    }

    protected void onMeasure(int n8, int n9) {
        int n10 = View.MeasureSpec.getMode((int)n8);
        int n11 = 0x40000000;
        if (n10 == 0x40000000) {
            if (View.MeasureSpec.getMode((int)n9) != 0) {
                int n12;
                int n13 = View.MeasureSpec.getSize((int)n8);
                n10 = this.e;
                if (n10 <= 0) {
                    n10 = View.MeasureSpec.getSize((int)n9);
                }
                int n14 = this.getPaddingTop() + this.getPaddingBottom();
                n8 = n13 - this.getPaddingLeft() - this.getPaddingRight();
                int n15 = n10 - n14;
                int n16 = View.MeasureSpec.makeMeasureSpec((int)n15, (int)Integer.MIN_VALUE);
                Object object = this.k;
                int n17 = 0;
                n9 = n8;
                if (object != null) {
                    n8 = this.c((View)object, n8, n16, 0);
                    object = (ViewGroup.MarginLayoutParams)this.k.getLayoutParams();
                    n9 = n8 - (object.leftMargin + object.rightMargin);
                }
                object = this.c;
                n8 = n9;
                if (object != null) {
                    n8 = n9;
                    if (object.getParent() == this) {
                        n8 = this.c((View)this.c, n9, n16, 0);
                    }
                }
                object = this.n;
                n9 = n8;
                if (object != null) {
                    n9 = n8;
                    if (this.m == null) {
                        if (this.s) {
                            n9 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                            this.n.measure(n9, n16);
                            n12 = this.n.getMeasuredWidth();
                            n16 = n12 <= n8 ? 1 : 0;
                            n9 = n8;
                            if (n16 != 0) {
                                n9 = n8 - n12;
                            }
                            object = this.n;
                            n8 = n16 != 0 ? 0 : 8;
                            object.setVisibility(n8);
                        } else {
                            n9 = this.c((View)object, n8, n16, 0);
                        }
                    }
                }
                if ((object = this.m) != null) {
                    object = object.getLayoutParams();
                    n12 = object.width;
                    n8 = n12 != -2 ? 0x40000000 : Integer.MIN_VALUE;
                    n16 = n9;
                    if (n12 >= 0) {
                        n16 = Math.min(n12, n9);
                    }
                    n9 = (n12 = object.height) != -2 ? n11 : Integer.MIN_VALUE;
                    n11 = n15;
                    if (n12 >= 0) {
                        n11 = Math.min(n12, n15);
                    }
                    this.m.measure(View.MeasureSpec.makeMeasureSpec((int)n16, (int)n8), View.MeasureSpec.makeMeasureSpec((int)n11, (int)n9));
                }
                if (this.e <= 0) {
                    n11 = this.getChildCount();
                    n9 = 0;
                    for (n8 = n17; n8 < n11; ++n8) {
                        n16 = this.getChildAt(n8).getMeasuredHeight() + n14;
                        n10 = n9;
                        if (n16 > n9) {
                            n10 = n16;
                        }
                        n9 = n10;
                    }
                    this.setMeasuredDimension(n13, n9);
                    return;
                }
                this.setMeasuredDimension(n13, n10);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(((Object)((Object)this)).getClass().getSimpleName());
            stringBuilder.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(((Object)((Object)this)).getClass().getSimpleName());
        stringBuilder.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public void setContentHeight(int n8) {
        this.e = n8;
    }

    public void setCustomView(View view) {
        View view2 = this.m;
        if (view2 != null) {
            this.removeView(view2);
        }
        this.m = view;
        if (view != null && (view2 = this.n) != null) {
            this.removeView(view2);
            this.n = null;
        }
        if (view != null) {
            this.addView(view);
        }
        this.requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.j = charSequence;
        this.i();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        this.i();
        d0.n0((View)this, charSequence);
    }

    public void setTitleOptional(boolean bl) {
        if (bl != this.s) {
            this.requestLayout();
        }
        this.s = bl;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

