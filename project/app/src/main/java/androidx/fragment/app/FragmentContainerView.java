/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ax.Gb.g;
import ax.Gb.l;
import ax.c0.F0;
import ax.c0.d0;
import ax.z0.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class FragmentContainerView
extends FrameLayout {
    private final List<View> a;
    private final List<View> b;
    private View.OnApplyWindowInsetsListener c;
    private boolean d;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        l.f(context, "context");
        this(context, attributeSet, 0, 4, null);
    }

    public FragmentContainerView(Context object, AttributeSet object2, int n8) {
        l.f(object, "context");
        super(object, object2, n8);
        this.a = new ArrayList<View>();
        this.b = new ArrayList<View>();
        this.d = true;
        if (object2 != null) {
            CharSequence charSequence = object2.getClassAttribute();
            Object object3 = ax.z0.c.e;
            l.e(object3, "FragmentContainerView");
            object3 = object.obtainStyledAttributes(object2, object3, 0, 0);
            if (charSequence == null) {
                object2 = object3.getString(ax.z0.c.f);
                object = "android:name";
            } else {
                object = "class";
                object2 = charSequence;
            }
            object3.recycle();
            if (object2 != null && !this.isInEditMode()) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("FragmentContainerView must be within a FragmentActivity to use ");
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append("=\"");
                ((StringBuilder)charSequence).append((String)object2);
                ((StringBuilder)charSequence).append('\"');
                throw new UnsupportedOperationException(((StringBuilder)charSequence).toString());
            }
        }
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int n8, int n9, g g8) {
        if ((n9 & 4) != 0) {
            n8 = 0;
        }
        this(context, attributeSet, n8);
    }

    public FragmentContainerView(Context object, AttributeSet object2, FragmentManager fragmentManager) {
        l.f(object, "context");
        l.f(object2, "attrs");
        l.f(fragmentManager, "fm");
        super((Context)object, (AttributeSet)object2);
        this.a = new ArrayList<View>();
        this.b = new ArrayList<View>();
        this.d = true;
        String string = object2.getClassAttribute();
        Object object3 = ax.z0.c.e;
        l.e(object3, "FragmentContainerView");
        Object object4 = object.obtainStyledAttributes((AttributeSet)object2, (int[])object3, 0, 0);
        object3 = string;
        if (string == null) {
            object3 = object4.getString(ax.z0.c.f);
        }
        string = object4.getString(ax.z0.c.g);
        object4.recycle();
        int n8 = this.getId();
        object4 = fragmentManager.j0(n8);
        if (object3 != null && object4 == null) {
            if (n8 == -1) {
                if (string != null) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(" with tag ");
                    ((StringBuilder)object).append(string);
                    object = ((StringBuilder)object).toString();
                } else {
                    object = "";
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("FragmentContainerView must have an android:id to add Fragment ");
                ((StringBuilder)object2).append((String)object3);
                ((StringBuilder)object2).append((String)object);
                throw new IllegalStateException(((StringBuilder)object2).toString());
            }
            object3 = fragmentManager.u0().a(object.getClassLoader(), (String)object3);
            l.e(object3, "fm.fragmentFactory.insta\u2026ontext.classLoader, name)");
            ((Fragment)object3).z1((Context)object, (AttributeSet)object2, null);
            fragmentManager.o().u(true).d((ViewGroup)this, (Fragment)object3, string).l();
        }
        fragmentManager.W0(this);
    }

    private final void a(View view) {
        if (this.b.contains(view)) {
            this.a.add(view);
        }
    }

    public void addView(View view, int n8, ViewGroup.LayoutParams object) {
        l.f(view, "child");
        if (FragmentManager.D0(view) != null) {
            super.addView(view, n8, (ViewGroup.LayoutParams)object);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        ((StringBuilder)object).append(view);
        ((StringBuilder)object).append(" is not associated with a Fragment.");
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        l.f(windowInsets, "insets");
        Object object = F0.v(windowInsets);
        l.e(object, "toWindowInsetsCompat(insets)");
        Object object2 = this.c;
        if (object2 != null) {
            object = androidx.fragment.app.FragmentContainerView$a.a;
            l.c(object2);
            object2 = F0.v(((a)object).a((View.OnApplyWindowInsetsListener)object2, (View)this, windowInsets));
        } else {
            object2 = d0.X((View)this, (F0)object);
        }
        l.e(object2, "if (applyWindowInsetsLis\u2026, insetsCompat)\n        }");
        if (!((F0)object2).o()) {
            int n8 = this.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                d0.i(this.getChildAt(i8), (F0)object2);
            }
        }
        return windowInsets;
    }

    protected void dispatchDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        if (this.d) {
            Iterator iterator = ((Iterable)this.a).iterator();
            while (iterator.hasNext()) {
                super.drawChild(canvas, (View)iterator.next(), this.getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    protected boolean drawChild(Canvas canvas, View view, long l8) {
        l.f(canvas, "canvas");
        l.f(view, "child");
        if (this.d && !((Collection)this.a).isEmpty() && this.a.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, l8);
    }

    public void endViewTransition(View view) {
        l.f(view, "view");
        this.b.remove(view);
        if (this.a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F)FragmentManager.m0((View)this).j0(this.getId());
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        l.f(windowInsets, "insets");
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int i8 = this.getChildCount() - 1; -1 < i8; --i8) {
            View view = this.getChildAt(i8);
            l.e(view, "view");
            this.a(view);
        }
        super.removeAllViewsInLayout();
    }

    public void removeView(View view) {
        l.f(view, "view");
        this.a(view);
        super.removeView(view);
    }

    public void removeViewAt(int n8) {
        View view = this.getChildAt(n8);
        l.e(view, "view");
        this.a(view);
        super.removeViewAt(n8);
    }

    public void removeViewInLayout(View view) {
        l.f(view, "view");
        this.a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int n8, int n9) {
        for (int i8 = n8; i8 < n8 + n9; ++i8) {
            View view = this.getChildAt(i8);
            l.e(view, "view");
            this.a(view);
        }
        super.removeViews(n8, n9);
    }

    public void removeViewsInLayout(int n8, int n9) {
        for (int i8 = n8; i8 < n8 + n9; ++i8) {
            View view = this.getChildAt(i8);
            l.e(view, "view");
            this.a(view);
        }
        super.removeViewsInLayout(n8, n9);
    }

    public final void setDrawDisappearingViewsLast(boolean bl) {
        this.d = bl;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        l.f(onApplyWindowInsetsListener, "listener");
        this.c = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        l.f(view, "view");
        if (view.getParent() == this) {
            this.b.add(view);
        }
        super.startViewTransition(view);
    }

    public static final class a {
        public static final a a = new a();

        private a() {
        }

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            l.f(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            l.f(view, "v");
            l.f(windowInsets, "insets");
            onApplyWindowInsetsListener = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            l.e(onApplyWindowInsetsListener, "onApplyWindowInsetsListe\u2026lyWindowInsets(v, insets)");
            return onApplyWindowInsetsListener;
        }
    }
}

