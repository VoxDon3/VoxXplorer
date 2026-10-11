package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.G0.h;
import ax.Gb.g;
import ax.Gb.l;
import ax.Gb.m;
import ax.sb.C3077i;
import ax.sb.InterfaceC3076h;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements f {
    public static final c c0 = new c(null);
    private static final InterfaceC3076h<a> d0 = C3077i.a(b.q);
    private final Activity q;

    public static abstract class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public abstract boolean a(InputMethodManager inputMethodManager);

        public abstract Object b(InputMethodManager inputMethodManager);

        public abstract View c(InputMethodManager inputMethodManager);

        private a() {
        }
    }

    static final class b extends m implements ax.Fb.a<a> {
        public static final b q = new b();

        b() {
            super(0);
        }

        @Override // ax.Fb.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                declaredField3.setAccessible(true);
                l.e(declaredField3, "hField");
                l.e(declaredField, "servedViewField");
                l.e(declaredField2, "nextServedViewField");
                return new e(declaredField3, declaredField, declaredField2);
            } catch (NoSuchFieldException unused) {
                return d.a;
            }
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static final class c {
        public /* synthetic */ c(g gVar) {
            this();
        }

        public final a a() {
            return (a) ImmLeaksCleaner.d0.getValue();
        }

        private c() {
        }
    }

    public static final class d extends a {
        public static final d a = new d();

        private d() {
            super(null);
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public boolean a(InputMethodManager inputMethodManager) {
            l.f(inputMethodManager, "<this>");
            return false;
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public Object b(InputMethodManager inputMethodManager) {
            l.f(inputMethodManager, "<this>");
            return null;
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public View c(InputMethodManager inputMethodManager) {
            l.f(inputMethodManager, "<this>");
            return null;
        }
    }

    public static final class e extends a {
        private final Field a;
        private final Field b;
        private final Field c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Field field, Field field2, Field field3) {
            super(null);
            l.f(field, "hField");
            l.f(field2, "servedViewField");
            l.f(field3, "nextServedViewField");
            this.a = field;
            this.b = field2;
            this.c = field3;
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public boolean a(InputMethodManager inputMethodManager) {
            l.f(inputMethodManager, "<this>");
            try {
                this.c.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public Object b(InputMethodManager inputMethodManager) {
            l.f(inputMethodManager, "<this>");
            try {
                return this.a.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public View c(InputMethodManager inputMethodManager) {
            l.f(inputMethodManager, "<this>");
            try {
                return (View) this.b.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public ImmLeaksCleaner(Activity activity) {
        l.f(activity, "activity");
        this.q = activity;
    }

    @Override // androidx.lifecycle.f
    public void b(h hVar, d.a aVar) {
        l.f(hVar, "source");
        l.f(aVar, "event");
        if (aVar != d.a.ON_DESTROY) {
            return;
        }
        Object systemService = this.q.getSystemService("input_method");
        l.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        a a2 = c0.a();
        Object b2 = a2.b(inputMethodManager);
        if (b2 == null) {
            return;
        }
        synchronized (b2) {
            View c2 = a2.c(inputMethodManager);
            if (c2 == null) {
                return;
            }
            if (c2.isAttachedToWindow()) {
                return;
            }
            boolean a3 = a2.a(inputMethodManager);
            if (a3) {
                inputMethodManager.isActive();
            }
        }
    }
}
