/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.L;
import ax.m.a;
import ax.m.f;
import ax.m.j;

public class ListMenuItemView
extends LinearLayout
implements k.a,
AbsListView.SelectionBoundsAdjuster {
    private g a;
    private ImageView b;
    private RadioButton c;
    private TextView d;
    private CheckBox e;
    private TextView f;
    private ImageView g;
    private ImageView h;
    private LinearLayout i;
    private Drawable j;
    private int k;
    private Context l;
    private boolean m;
    private Drawable n;
    private boolean o;
    private LayoutInflater p;
    private boolean q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.F);
    }

    public ListMenuItemView(Context context, AttributeSet object, int n8) {
        super(context, (AttributeSet)object);
        object = L.v(this.getContext(), (AttributeSet)object, ax.m.j.T1, n8, 0);
        this.j = ((L)object).g(ax.m.j.V1);
        this.k = ((L)object).n(ax.m.j.U1, -1);
        this.m = ((L)object).a(ax.m.j.W1, false);
        this.l = context;
        this.n = ((L)object).g(ax.m.j.X1);
        context = context.getTheme();
        n8 = ax.m.a.C;
        context = context.obtainStyledAttributes(null, new int[]{16843049}, n8, 0);
        this.o = context.hasValue(0);
        ((L)object).x();
        context.recycle();
    }

    private void a(View view) {
        this.b(view, -1);
    }

    private void b(View view, int n8) {
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            linearLayout.addView(view, n8);
            return;
        }
        this.addView(view, n8);
    }

    private void c() {
        CheckBox checkBox;
        this.e = checkBox = (CheckBox)this.getInflater().inflate(ax.m.g.h, (ViewGroup)this, false);
        this.a((View)checkBox);
    }

    private void f() {
        ImageView imageView;
        this.b = imageView = (ImageView)this.getInflater().inflate(ax.m.g.i, (ViewGroup)this, false);
        this.b((View)imageView, 0);
    }

    private void g() {
        RadioButton radioButton;
        this.c = radioButton = (RadioButton)this.getInflater().inflate(ax.m.g.k, (ViewGroup)this, false);
        this.a((View)radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.p == null) {
            this.p = LayoutInflater.from((Context)this.getContext());
        }
        return this.p;
    }

    private void setSubMenuArrowVisible(boolean bl) {
        ImageView imageView = this.g;
        if (imageView != null) {
            int n8 = bl ? 0 : 8;
            imageView.setVisibility(n8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.h;
        if (imageView != null && imageView.getVisibility() == 0) {
            imageView = (LinearLayout.LayoutParams)this.h.getLayoutParams();
            rect.top += this.h.getHeight() + imageView.topMargin + imageView.bottomMargin;
        }
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void e(g g8, int n8) {
        this.a = g8;
        n8 = g8.isVisible() ? 0 : 8;
        this.setVisibility(n8);
        this.setTitle(g8.i(this));
        this.setCheckable(g8.isCheckable());
        this.h(g8.A(), g8.g());
        this.setIcon(g8.getIcon());
        this.setEnabled(g8.isEnabled());
        this.setSubMenuArrowVisible(g8.hasSubMenu());
        this.setContentDescription(g8.getContentDescription());
    }

    @Override
    public g getItemData() {
        return this.a;
    }

    public void h(boolean bl, char c8) {
        c8 = bl && this.a.A() ? (char)'\u0000' : (char)8;
        if (c8 == '\u0000') {
            this.f.setText((CharSequence)this.a.h());
        }
        if (this.f.getVisibility() != c8) {
            this.f.setVisibility((int)c8);
        }
    }

    protected void onFinishInflate() {
        TextView textView;
        super.onFinishInflate();
        this.setBackground(this.j);
        this.d = textView = (TextView)this.findViewById(ax.m.f.D);
        int n8 = this.k;
        if (n8 != -1) {
            textView.setTextAppearance(this.l, n8);
        }
        this.f = (TextView)this.findViewById(ax.m.f.x);
        textView = (ImageView)this.findViewById(ax.m.f.A);
        this.g = textView;
        if (textView != null) {
            textView.setImageDrawable(this.n);
        }
        this.h = (ImageView)this.findViewById(ax.m.f.r);
        this.i = (LinearLayout)this.findViewById(ax.m.f.l);
    }

    protected void onMeasure(int n8, int n9) {
        if (this.b != null && this.m) {
            ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams)this.b.getLayoutParams();
            int n10 = layoutParams.height;
            if (n10 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = n10;
            }
        }
        super.onMeasure(n8, n9);
    }

    public void setCheckable(boolean bl) {
        if (bl || this.c != null || this.e != null) {
            CheckBox checkBox;
            RadioButton radioButton;
            if (this.a.m()) {
                if (this.c == null) {
                    this.g();
                }
                radioButton = this.c;
                checkBox = this.e;
            } else {
                if (this.e == null) {
                    this.c();
                }
                radioButton = this.e;
                checkBox = this.c;
            }
            if (bl) {
                radioButton.setChecked(this.a.isChecked());
                if (radioButton.getVisibility() != 0) {
                    radioButton.setVisibility(0);
                }
                if (checkBox != null && checkBox.getVisibility() != 8) {
                    checkBox.setVisibility(8);
                    return;
                }
            } else {
                checkBox = this.e;
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                if ((checkBox = this.c) != null) {
                    checkBox.setVisibility(8);
                }
            }
        }
    }

    public void setChecked(boolean bl) {
        RadioButton radioButton;
        if (this.a.m()) {
            if (this.c == null) {
                this.g();
            }
            radioButton = this.c;
        } else {
            if (this.e == null) {
                this.c();
            }
            radioButton = this.e;
        }
        radioButton.setChecked(bl);
    }

    public void setForceShowIcon(boolean bl) {
        this.q = bl;
        this.m = bl;
    }

    public void setGroupDividerEnabled(boolean bl) {
        ImageView imageView = this.h;
        if (imageView != null) {
            int n8 = !this.o && bl ? 0 : 8;
            imageView.setVisibility(n8);
        }
    }

    public void setIcon(Drawable drawable) {
        ImageView imageView;
        boolean bl = this.a.z() || this.q;
        if ((bl || this.m) && ((imageView = this.b) != null || drawable != null || this.m)) {
            if (imageView == null) {
                this.f();
            }
            if (drawable == null && !this.m) {
                this.b.setVisibility(8);
                return;
            }
            imageView = this.b;
            if (!bl) {
                drawable = null;
            }
            imageView.setImageDrawable(drawable);
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.d.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
                return;
            }
        } else if (this.d.getVisibility() != 8) {
            this.d.setVisibility(8);
        }
    }
}

