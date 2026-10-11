/*
 * Decompiled with CFR 0.152.
 */
package ax.n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.l;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.r;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.u;
import androidx.appcompat.widget.x;
import ax.B.k;
import ax.c0.d0;
import ax.m.j;
import ax.u.c;
import ax.u.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class z {
    private static final Class<?>[] b = new Class[]{Context.class, AttributeSet.class};
    private static final int[] c = new int[]{16843375};
    private static final int[] d = new int[]{16844160};
    private static final int[] e = new int[]{16844156};
    private static final int[] f = new int[]{16844148};
    private static final String[] g = new String[]{"android.widget.", "android.view.", "android.webkit."};
    private static final k<String, Constructor<? extends View>> h = new k();
    private final Object[] a = new Object[2];

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, d);
        if (typedArray.hasValue(0)) {
            d0.m0(view, typedArray.getBoolean(0, false));
        }
        typedArray.recycle();
        typedArray = context.obtainStyledAttributes(attributeSet, e);
        if (typedArray.hasValue(0)) {
            d0.n0(view, typedArray.getString(0));
        }
        typedArray.recycle();
        context = context.obtainStyledAttributes(attributeSet, f);
        if (context.hasValue(0)) {
            d0.x0(view, context.getBoolean(0, false));
        }
        context.recycle();
    }

    private void b(View view, AttributeSet object) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper && view.hasOnClickListeners()) {
            if ((object = (context = context.obtainStyledAttributes(object, c)).getString(0)) != null) {
                view.setOnClickListener((View.OnClickListener)new a(view, (String)object));
            }
            context.recycle();
        }
    }

    /*
     * Unable to fully structure code
     */
    private View s(Context var1_1, String var2_3, String var3_4) throws ClassNotFoundException, InflateException {
        var6_5 = z.h;
        var5_6 = var6_5.get(var2_3);
        var4_7 = var5_6;
        if (var5_6 != null) ** GOTO lbl19
        if (var3_4 != null) {
            var4_7 = new Constructor<View>();
            var4_7.append(var3_4);
            var4_7.append(var2_3);
            var3_4 = var4_7.toString();
        } else {
            var3_4 = var2_3;
        }
        try {
            var4_7 = Class.forName(var3_4, false, var1_1.getClassLoader()).asSubclass(View.class).getConstructor(z.b);
            var6_5.put(var2_3, var4_7);
lbl19:
            // 2 sources

            var4_7.setAccessible(true);
            var1_1 = var4_7.newInstance(this.a);
            return var1_1;
        }
        catch (Exception var1_2) {
            return null;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private View t(Context objectArray, String view, AttributeSet attributeSet) {
        Object object = view;
        if (view.equals("view")) {
            object = attributeSet.getAttributeValue(null, "class");
        }
        try {
            view = this.a;
            view[0] = objectArray;
            view[1] = attributeSet;
            if (-1 == ((String)object).indexOf(46)) {
                for (int i8 = 0; i8 < ((Object[])(view = g)).length; ++i8) {
                    if ((view = this.s((Context)objectArray, (String)object, (String)view[i8])) == null) continue;
                    objectArray = this.a;
                    objectArray[0] = null;
                    objectArray[1] = null;
                    return view;
                }
                objectArray = this.a;
                objectArray[0] = null;
                objectArray[1] = null;
                return null;
            }
            view = this.s((Context)objectArray, (String)object, null);
            objectArray = this.a;
            objectArray[0] = null;
            objectArray[1] = null;
            return view;
        }
        catch (Throwable throwable) {}
        view = this.a;
        view[0] = null;
        view[1] = null;
        throw throwable;
        catch (Exception exception) {
            Object[] objectArray2 = this.a;
            objectArray2[0] = null;
            objectArray2[1] = null;
            return null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean bl, boolean bl2) {
        attributeSet = context.obtainStyledAttributes(attributeSet, j.w3, 0, 0);
        int n8 = bl ? attributeSet.getResourceId(j.x3, 0) : 0;
        int n9 = n8;
        if (bl2) {
            n9 = n8;
            if (n8 == 0) {
                n9 = n8 = attributeSet.getResourceId(j.y3, 0);
                if (n8 != 0) {
                    Log.i((String)"AppCompatViewInflater", (String)"app:theme is now deprecated. Please move to using android:theme instead.");
                    n9 = n8;
                }
            }
        }
        attributeSet.recycle();
        if (!(n9 == 0 || context instanceof ax.s.c && ((ax.s.c)context).c() == n9)) {
            return new ax.s.c(context, n9);
        }
        return context;
    }

    private void v(View object, String string) {
        if (object != null) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(this.getClass().getName());
        ((StringBuilder)object).append(" asked to inflate view for <");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(">, but returned null");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    protected androidx.appcompat.widget.d c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    protected f d(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    protected g e(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    protected h f(Context context, AttributeSet attributeSet) {
        return new h(context, attributeSet);
    }

    protected l g(Context context, AttributeSet attributeSet) {
        return new l(context, attributeSet);
    }

    protected p h(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    protected AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    protected r j(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    protected s k(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    protected c l(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    protected d m(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    protected u n(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    protected x o(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    protected androidx.appcompat.widget.z p(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.z(context, attributeSet);
    }

    protected View q(Context context, String string, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View object, String string, Context context, AttributeSet attributeSet, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        Context context2;
        block40: {
            block39: {
                context2 = bl && object != null ? object.getContext() : context;
                if (bl2) break block39;
                object = context2;
                if (!bl3) break block40;
            }
            object = z.u(context2, attributeSet, bl2, bl3);
        }
        context2 = object;
        if (bl4) {
            context2 = I.b((Context)object);
        }
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 2001146706: {
                if (!string.equals("Button")) break;
                n8 = 13;
                break;
            }
            case 1666676343: {
                if (!string.equals("EditText")) break;
                n8 = 12;
                break;
            }
            case 1601505219: {
                if (!string.equals("CheckBox")) break;
                n8 = 11;
                break;
            }
            case 1413872058: {
                if (!string.equals("AutoCompleteTextView")) break;
                n8 = 10;
                break;
            }
            case 1125864064: {
                if (!string.equals("ImageView")) break;
                n8 = 9;
                break;
            }
            case 799298502: {
                if (!string.equals("ToggleButton")) break;
                n8 = 8;
                break;
            }
            case 776382189: {
                if (!string.equals("RadioButton")) break;
                n8 = 7;
                break;
            }
            case -339785223: {
                if (!string.equals("Spinner")) break;
                n8 = 6;
                break;
            }
            case -658531749: {
                if (!string.equals("SeekBar")) break;
                n8 = 5;
                break;
            }
            case -937446323: {
                if (!string.equals("ImageButton")) break;
                n8 = 4;
                break;
            }
            case -938935918: {
                if (!string.equals("TextView")) break;
                n8 = 3;
                break;
            }
            case -1346021293: {
                if (!string.equals("MultiAutoCompleteTextView")) break;
                n8 = 2;
                break;
            }
            case -1455429095: {
                if (!string.equals("CheckedTextView")) break;
                n8 = 1;
                break;
            }
            case -1946472170: {
                if (!string.equals("RatingBar")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                object = this.q(context2, string, attributeSet);
                break;
            }
            case 13: {
                object = this.d(context2, attributeSet);
                this.v((View)object, string);
                break;
            }
            case 12: {
                object = this.g(context2, attributeSet);
                this.v((View)object, string);
                break;
            }
            case 11: {
                object = this.e(context2, attributeSet);
                this.v((View)object, string);
                break;
            }
            case 10: {
                object = this.c(context2, attributeSet);
                this.v((View)object, string);
                break;
            }
            case 9: {
                object = this.i(context2, attributeSet);
                this.v((View)object, string);
                break;
            }
            case 8: {
                object = this.p(context2, attributeSet);
                this.v((View)object, string);
                break;
            }
            case 7: {
                object = this.k(context2, attributeSet);
                this.v((View)object, string);
                break;
            }
            case 6: {
                object = this.n(context2, attributeSet);
                this.v((View)object, string);
                break;
            }
            case 5: {
                object = this.m(context2, attributeSet);
                this.v((View)object, string);
                break;
            }
            case 4: {
                object = this.h(context2, attributeSet);
                this.v((View)object, string);
                break;
            }
            case 3: {
                object = this.o(context2, attributeSet);
                this.v((View)object, string);
                break;
            }
            case 2: {
                object = this.j(context2, attributeSet);
                this.v((View)object, string);
                break;
            }
            case 1: {
                object = this.f(context2, attributeSet);
                this.v((View)object, string);
                break;
            }
            case 0: {
                object = this.l(context2, attributeSet);
                this.v((View)object, string);
            }
        }
        Object object2 = object;
        if (object == null) {
            object2 = object;
            if (context != context2) {
                object2 = this.t(context2, string, attributeSet);
            }
        }
        if (object2 != null) {
            this.b((View)object2, attributeSet);
            this.a(context2, (View)object2, attributeSet);
        }
        return object2;
    }

    private static class a
    implements View.OnClickListener {
        private final View a;
        private final String b;
        private Method c;
        private Context d;

        public a(View view, String string) {
            this.a = view;
            this.b = string;
        }

        private void a(Context object) {
            Object object2;
            while (object != null) {
                block7: {
                    if (object.isRestricted() || (object2 = object.getClass().getMethod(this.b, View.class)) == null) break block7;
                    try {
                        this.c = object2;
                        this.d = object;
                        return;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                        // empty catch block
                    }
                }
                if (object instanceof ContextWrapper) {
                    object = ((ContextWrapper)object).getBaseContext();
                    continue;
                }
                object = null;
            }
            int n8 = this.a.getId();
            if (n8 == -1) {
                object = "";
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append(" with id '");
                ((StringBuilder)object).append(this.a.getContext().getResources().getResourceEntryName(n8));
                ((StringBuilder)object).append("'");
                object = ((StringBuilder)object).toString();
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Could not find method ");
            ((StringBuilder)object2).append(this.b);
            ((StringBuilder)object2).append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            ((StringBuilder)object2).append(this.a.getClass());
            ((StringBuilder)object2).append((String)object);
            throw new IllegalStateException(((StringBuilder)object2).toString());
        }

        public void onClick(View view) {
            IllegalAccessException illegalAccessException2;
            block4: {
                if (this.c == null) {
                    this.a(this.a.getContext());
                }
                try {
                    this.c.invoke(this.d, view);
                    return;
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block4;
                }
                throw new IllegalStateException("Could not execute method for android:onClick", invocationTargetException);
            }
            throw new IllegalStateException("Could not execute non-public method for android:onClick", illegalAccessException2);
        }
    }
}

