package ax.n;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.C0573d;
import androidx.appcompat.widget.C0575f;
import androidx.appcompat.widget.C0576g;
import androidx.appcompat.widget.C0577h;
import androidx.appcompat.widget.C0581l;
import androidx.appcompat.widget.I;
import ax.c0.C1760d0;
import ax.s.C3036c;
import ax.u.C3158c;
import ax.u.C3159d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class z {
    private static final Class<?>[] b = {Context.class, AttributeSet.class};
    private static final int[] c = {R.attr.onClick};
    private static final int[] d = {R.attr.accessibilityHeading};
    private static final int[] e = {R.attr.accessibilityPaneTitle};
    private static final int[] f = {R.attr.screenReaderFocusable};
    private static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    private static final ax.B.k<String, Constructor<? extends View>> h = new ax.B.k<>();
    private final Object[] a = new Object[2];

    private static class a implements View.OnClickListener {
        private final View a;
        private final String b;
        private Method c;
        private Context d;

        public a(View view, String str) {
            this.a = view;
            this.b = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.b, View.class)) != null) {
                        this.c = method;
                        this.d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.a.getId();
            if (id == -1) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str = " with id '" + this.a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.c == null) {
                a(this.a.getContext());
            }
            try {
                this.c.invoke(this.d, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d);
        if (obtainStyledAttributes.hasValue(0)) {
            C1760d0.m0(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, e);
        if (obtainStyledAttributes2.hasValue(0)) {
            C1760d0.n0(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f);
        if (obtainStyledAttributes3.hasValue(0)) {
            C1760d0.x0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        ax.B.k<String, Constructor<? extends View>> kVar = h;
        Constructor<? extends View> constructor = kVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = g;
                if (i >= strArr.length) {
                    return null;
                }
                View s = s(context, str, strArr[i]);
                if (s != null) {
                    return s;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.m.j.w3, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(ax.m.j.x3, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(ax.m.j.y3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof C3036c) && ((C3036c) context).c() == resourceId)) ? context : new C3036c(context, resourceId);
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected C0573d c(Context context, AttributeSet attributeSet) {
        return new C0573d(context, attributeSet);
    }

    protected C0575f d(Context context, AttributeSet attributeSet) {
        return new C0575f(context, attributeSet);
    }

    protected C0576g e(Context context, AttributeSet attributeSet) {
        return new C0576g(context, attributeSet);
    }

    protected C0577h f(Context context, AttributeSet attributeSet) {
        return new C0577h(context, attributeSet);
    }

    protected C0581l g(Context context, AttributeSet attributeSet) {
        return new C0581l(context, attributeSet);
    }

    protected androidx.appcompat.widget.p h(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.p(context, attributeSet);
    }

    protected AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    protected androidx.appcompat.widget.r j(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    protected androidx.appcompat.widget.s k(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.s(context, attributeSet);
    }

    protected C3158c l(Context context, AttributeSet attributeSet) {
        return new C3158c(context, attributeSet);
    }

    protected C3159d m(Context context, AttributeSet attributeSet) {
        return new C3159d(context, attributeSet);
    }

    protected androidx.appcompat.widget.u n(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.u(context, attributeSet);
    }

    protected androidx.appcompat.widget.x o(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.x(context, attributeSet);
    }

    protected androidx.appcompat.widget.z p(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.z(context, attributeSet);
    }

    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View l;
        context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = I.b(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                l = l(context2, attributeSet);
                v(l, str);
                break;
            case "CheckedTextView":
                l = f(context2, attributeSet);
                v(l, str);
                break;
            case "MultiAutoCompleteTextView":
                l = j(context2, attributeSet);
                v(l, str);
                break;
            case "TextView":
                l = o(context2, attributeSet);
                v(l, str);
                break;
            case "ImageButton":
                l = h(context2, attributeSet);
                v(l, str);
                break;
            case "SeekBar":
                l = m(context2, attributeSet);
                v(l, str);
                break;
            case "Spinner":
                l = n(context2, attributeSet);
                v(l, str);
                break;
            case "RadioButton":
                l = k(context2, attributeSet);
                v(l, str);
                break;
            case "ToggleButton":
                l = p(context2, attributeSet);
                v(l, str);
                break;
            case "ImageView":
                l = i(context2, attributeSet);
                v(l, str);
                break;
            case "AutoCompleteTextView":
                l = c(context2, attributeSet);
                v(l, str);
                break;
            case "CheckBox":
                l = e(context2, attributeSet);
                v(l, str);
                break;
            case "EditText":
                l = g(context2, attributeSet);
                v(l, str);
                break;
            case "Button":
                l = d(context2, attributeSet);
                v(l, str);
                break;
            default:
                l = q(context2, str, attributeSet);
                break;
        }
        if (l == null && context != context2) {
            l = t(context2, str, attributeSet);
        }
        if (l != null) {
            b(l, attributeSet);
            a(context2, l, attributeSet);
        }
        return l;
    }
}
