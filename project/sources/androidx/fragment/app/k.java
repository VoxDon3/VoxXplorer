package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ax.z0.C3537c;

/* loaded from: classes.dex */
class k implements LayoutInflater.Factory2 {
    final FragmentManager a;

    class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ r a;

        a(r rVar) {
            this.a = rVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k = this.a.k();
            this.a.m();
            z.n((ViewGroup) k.I.getParent(), k.this.a).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    k(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        r x;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3537c.a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C3537c.b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C3537c.c, -1);
        String string = obtainStyledAttributes.getString(C3537c.d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !i.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment j0 = resourceId != -1 ? this.a.j0(resourceId) : null;
        if (j0 == null && string != null) {
            j0 = this.a.k0(string);
        }
        if (j0 == null && id != -1) {
            j0 = this.a.j0(id);
        }
        if (j0 == null) {
            j0 = this.a.u0().a(context.getClassLoader(), attributeValue);
            j0.o = true;
            j0.x = resourceId != 0 ? resourceId : id;
            j0.y = id;
            j0.z = string;
            j0.p = true;
            FragmentManager fragmentManager = this.a;
            j0.t = fragmentManager;
            j0.u = fragmentManager.w0();
            j0.z1(this.a.w0().f(), attributeSet, j0.b);
            x = this.a.j(j0);
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Fragment " + j0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (j0.p) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            j0.p = true;
            FragmentManager fragmentManager2 = this.a;
            j0.t = fragmentManager2;
            j0.u = fragmentManager2.w0();
            j0.z1(this.a.w0().f(), attributeSet, j0.b);
            x = this.a.x(j0);
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + j0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        ax.B0.c.g(j0, viewGroup);
        j0.H = viewGroup;
        x.m();
        x.j();
        View view2 = j0.I;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (j0.I.getTag() == null) {
            j0.I.setTag(string);
        }
        j0.I.addOnAttachStateChangeListener(new a(x));
        return j0.I;
    }
}
