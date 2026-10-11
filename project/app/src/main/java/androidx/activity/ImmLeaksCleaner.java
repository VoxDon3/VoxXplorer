/*
 * Decompiled with CFR 0.152.
 */
package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.Gb.g;
import ax.Gb.l;
import ax.sb.h;
import ax.sb.i;
import java.lang.reflect.Field;

public final class ImmLeaksCleaner
implements f {
    public static final c c0 = new c(null);
    private static final h<a> d0 = i.a(b.q);
    private final Activity q;

    public ImmLeaksCleaner(Activity activity) {
        l.f(activity, "activity");
        this.q = activity;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b(ax.G0.h object, d.a object2) {
        boolean bl;
        l.f(object, "source");
        l.f(object2, "event");
        if (object2 != d.a.ON_DESTROY) {
            return;
        }
        object = this.q.getSystemService("input_method");
        l.d(object, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager)object;
        object2 = c0.a();
        object = ((a)object2).b(inputMethodManager);
        if (object == null) {
            return;
        }
        synchronized (object) {
            View view = ((a)object2).c(inputMethodManager);
            if (view == null) {
                return;
            }
            bl = view.isAttachedToWindow();
            if (bl) {
                return;
            }
            bl = ((a)object2).a(inputMethodManager);
        }
        if (!bl) return;
        inputMethodManager.isActive();
    }

    public static abstract class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public abstract boolean a(InputMethodManager var1);

        public abstract Object b(InputMethodManager var1);

        public abstract View c(InputMethodManager var1);
    }

    @SuppressLint(value={"SoonBlockedPrivateApi"})
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(g g8) {
            this();
        }

        public final a a() {
            return (a)d0.getValue();
        }
    }

    public static final class d
    extends a {
        public static final d a = new d();

        private d() {
            super(null);
        }

        @Override
        public boolean a(InputMethodManager inputMethodManager) {
            l.f(inputMethodManager, "<this>");
            return false;
        }

        @Override
        public Object b(InputMethodManager inputMethodManager) {
            l.f(inputMethodManager, "<this>");
            return null;
        }

        @Override
        public View c(InputMethodManager inputMethodManager) {
            l.f(inputMethodManager, "<this>");
            return null;
        }
    }

    public static final class e
    extends a {
        private final Field a;
        private final Field b;
        private final Field c;

        public e(Field field, Field field2, Field field3) {
            l.f(field, "hField");
            l.f(field2, "servedViewField");
            l.f(field3, "nextServedViewField");
            super(null);
            this.a = field;
            this.b = field2;
            this.c = field3;
        }

        @Override
        public boolean a(InputMethodManager inputMethodManager) {
            l.f(inputMethodManager, "<this>");
            try {
                this.c.set(inputMethodManager, null);
                return true;
            }
            catch (IllegalAccessException illegalAccessException) {
                return false;
            }
        }

        @Override
        public Object b(InputMethodManager object) {
            l.f(object, "<this>");
            try {
                object = this.a.get(object);
                return object;
            }
            catch (IllegalAccessException illegalAccessException) {
                return null;
            }
        }

        @Override
        public View c(InputMethodManager inputMethodManager) {
            l.f(inputMethodManager, "<this>");
            try {
                inputMethodManager = (View)this.b.get(inputMethodManager);
                return inputMethodManager;
            }
            catch (ClassCastException | IllegalAccessException exception) {
                return null;
            }
        }
    }
}

