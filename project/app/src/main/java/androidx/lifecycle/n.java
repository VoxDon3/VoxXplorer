/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.d;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.savedstate.a;
import ax.G0.s;
import ax.Gb.l;
import java.lang.reflect.Constructor;

public final class n
extends q.d
implements q.b {
    private Application a;
    private final q.b b;
    private Bundle c;
    private d d;
    private a e;

    @SuppressLint(value={"LambdaLast"})
    public n(Application object, ax.n2.d d8, Bundle bundle) {
        l.f(d8, "owner");
        this.e = d8.getSavedStateRegistry();
        this.d = d8.getLifecycle();
        this.c = bundle;
        this.a = object;
        object = object != null ? q.a.e.a((Application)object) : new q.a();
        this.b = object;
    }

    @Override
    public <T extends p> T a(Class<T> clazz) {
        l.f(clazz, "modelClass");
        String string = clazz.getCanonicalName();
        if (string != null) {
            return this.d(string, clazz);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override
    public <T extends p> T b(Class<T> clazz, ax.I0.a a8) {
        l.f(clazz, "modelClass");
        l.f(a8, "extras");
        Constructor<T> constructor = a8.a(q.c.c);
        if (constructor != null) {
            if (a8.a(m.a) != null && a8.a(m.b) != null) {
                Application application = a8.a(q.a.g);
                boolean bl = ax.G0.a.class.isAssignableFrom(clazz);
                constructor = bl && application != null ? s.c(clazz, s.a()) : s.c(clazz, s.b());
                if (constructor == null) {
                    return this.b.b(clazz, a8);
                }
                if (bl && application != null) {
                    return s.d(clazz, constructor, application, m.a(a8));
                }
                return s.d(clazz, constructor, m.a(a8));
            }
            if (this.d != null) {
                return this.d((String)((Object)constructor), clazz);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override
    public void c(p p8) {
        l.f(p8, "viewModel");
        if (this.d != null) {
            a a8 = this.e;
            l.c(a8);
            d d8 = this.d;
            l.c(d8);
            LegacySavedStateHandleController.a(p8, a8, d8);
        }
    }

    public final <T extends p> T d(String string, Class<T> clazz) {
        l.f(string, "key");
        l.f(clazz, "modelClass");
        Object object = this.d;
        if (object != null) {
            boolean bl = ax.G0.a.class.isAssignableFrom(clazz);
            Constructor<T> constructor = bl && this.a != null ? s.c(clazz, s.a()) : s.c(clazz, s.b());
            if (constructor == null) {
                if (this.a != null) {
                    return this.b.a(clazz);
                }
                return q.c.a.a().a(clazz);
            }
            a a8 = this.e;
            l.c(a8);
            object = LegacySavedStateHandleController.b(a8, (d)object, string, this.c);
            if (bl && (string = this.a) != null) {
                l.c(string);
                string = s.d(clazz, constructor, string, ((SavedStateHandleController)object).i());
            } else {
                string = s.d(clazz, constructor, ((SavedStateHandleController)object).i());
            }
            ((p)((Object)string)).e("androidx.lifecycle.savedstate.vm.tag", object);
            return (T)string;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}

