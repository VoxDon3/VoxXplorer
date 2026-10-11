/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i;
import androidx.fragment.app.r;
import androidx.fragment.app.z;
import ax.z0.c;

class k
implements LayoutInflater.Factory2 {
    final FragmentManager a;

    k(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public View onCreateView(View object, String object2, Context object3, AttributeSet object4) {
        block18: {
            int n8;
            String string;
            int n9;
            String string2;
            block21: {
                block20: {
                    Object object5;
                    block19: {
                        if (FragmentContainerView.class.getName().equals(object2)) {
                            return new FragmentContainerView((Context)object3, (AttributeSet)object4, this.a);
                        }
                        boolean bl = "fragment".equals(object2);
                        object2 = null;
                        if (!bl) {
                            return null;
                        }
                        object5 = object4.getAttributeValue(null, "class");
                        TypedArray typedArray = object3.obtainStyledAttributes(object4, c.a);
                        string2 = object5;
                        if (object5 == null) {
                            string2 = typedArray.getString(c.b);
                        }
                        n9 = typedArray.getResourceId(c.c, -1);
                        string = typedArray.getString(c.d);
                        typedArray.recycle();
                        if (string2 == null || !i.b(object3.getClassLoader(), string2)) break block18;
                        n8 = object != null ? object.getId() : 0;
                        if (n8 == -1 && n9 == -1 && string == null) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append(object4.getPositionDescription());
                            ((StringBuilder)object).append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                            ((StringBuilder)object).append(string2);
                            throw new IllegalArgumentException(((StringBuilder)object).toString());
                        }
                        if (n9 != -1) {
                            object2 = this.a.j0(n9);
                        }
                        object5 = object2;
                        if (object2 == null) {
                            object5 = object2;
                            if (string != null) {
                                object5 = this.a.k0(string);
                            }
                        }
                        object2 = object5;
                        if (object5 == null) {
                            object2 = object5;
                            if (n8 != -1) {
                                object2 = this.a.j0(n8);
                            }
                        }
                        if (object2 != null) break block19;
                        object2 = this.a.u0().a(object3.getClassLoader(), string2);
                        ((Fragment)object2).o = true;
                        int n10 = n9 != 0 ? n9 : n8;
                        ((Fragment)object2).x = n10;
                        ((Fragment)object2).y = n8;
                        ((Fragment)object2).z = string;
                        ((Fragment)object2).p = true;
                        ((Fragment)object2).t = object3 = this.a;
                        ((Fragment)object2).u = ((FragmentManager)object3).w0();
                        ((Fragment)object2).z1(this.a.w0().f(), (AttributeSet)object4, ((Fragment)object2).b);
                        object5 = this.a.j((Fragment)object2);
                        object4 = object2;
                        object3 = object5;
                        if (FragmentManager.J0(2)) {
                            object3 = new StringBuilder();
                            ((StringBuilder)object3).append("Fragment ");
                            ((StringBuilder)object3).append(object2);
                            ((StringBuilder)object3).append(" has been inflated via the <fragment> tag: id=0x");
                            ((StringBuilder)object3).append(Integer.toHexString(n9));
                            Log.v((String)"FragmentManager", (String)((StringBuilder)object3).toString());
                            object4 = object2;
                            object3 = object5;
                        }
                        break block20;
                    }
                    if (((Fragment)object2).p) break block21;
                    ((Fragment)object2).p = true;
                    object3 = this.a;
                    ((Fragment)object2).t = object3;
                    ((Fragment)object2).u = ((FragmentManager)object3).w0();
                    ((Fragment)object2).z1(this.a.w0().f(), (AttributeSet)object4, ((Fragment)object2).b);
                    object5 = this.a.x((Fragment)object2);
                    object4 = object2;
                    object3 = object5;
                    if (FragmentManager.J0(2)) {
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("Retained Fragment ");
                        ((StringBuilder)object3).append(object2);
                        ((StringBuilder)object3).append(" has been re-attached via the <fragment> tag: id=0x");
                        ((StringBuilder)object3).append(Integer.toHexString(n9));
                        Log.v((String)"FragmentManager", (String)((StringBuilder)object3).toString());
                        object3 = object5;
                        object4 = object2;
                    }
                }
                object = (ViewGroup)object;
                ax.B0.c.g((Fragment)object4, (ViewGroup)object);
                object4.H = object;
                ((r)object3).m();
                ((r)object3).j();
                object = object4.I;
                if (object != null) {
                    if (n9 != 0) {
                        object.setId(n9);
                    }
                    if (object4.I.getTag() == null) {
                        object4.I.setTag((Object)string);
                    }
                    object4.I.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this, (r)object3){
                        final r a;
                        final k b;
                        {
                            this.b = k8;
                            this.a = r8;
                        }

                        public void onViewAttachedToWindow(View object) {
                            object = this.a.k();
                            this.a.m();
                            z.n((ViewGroup)object.I.getParent(), this.b.a).j();
                        }

                        public void onViewDetachedFromWindow(View view) {
                        }
                    });
                    return object4.I;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Fragment ");
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(" did not create a view.");
                throw new IllegalStateException(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(object4.getPositionDescription());
            ((StringBuilder)object).append(": Duplicate id 0x");
            ((StringBuilder)object).append(Integer.toHexString(n9));
            ((StringBuilder)object).append(", tag ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(", or parent id 0x");
            ((StringBuilder)object).append(Integer.toHexString(n8));
            ((StringBuilder)object).append(" with another fragment for ");
            ((StringBuilder)object).append(string2);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        return null;
    }

    public View onCreateView(String string, Context context, AttributeSet attributeSet) {
        return this.onCreateView(null, string, context, attributeSet);
    }
}

