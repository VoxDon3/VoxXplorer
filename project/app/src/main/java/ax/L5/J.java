/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import ax.B.a;
import ax.L5.I;
import ax.L5.f;
import ax.Z5.e;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class J
extends Fragment
implements f {
    private static final WeakHashMap g0 = new WeakHashMap();
    private final Map d0 = java.util.DesugarCollections.synchronizedMap(new a());
    private int e0 = 0;
    private Bundle f0;

    static /* bridge */ /* synthetic */ int K2(J j8) {
        return j8.e0;
    }

    static /* bridge */ /* synthetic */ Bundle L2(J j8) {
        return j8.f0;
    }

    public static J M2(androidx.fragment.app.f f8) {
        Object object;
        WeakHashMap weakHashMap;
        block7: {
            block6: {
                J j8;
                weakHashMap = g0;
                object = (WeakReference)weakHashMap.get(f8);
                if (object != null && (object = (J)((Reference)object).get()) != null) {
                    return object;
                }
                try {
                    j8 = (J)f8.getSupportFragmentManager().k0("SupportLifecycleFragmentImpl");
                    if (j8 == null) break block6;
                    object = j8;
                }
                catch (ClassCastException classCastException) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", classCastException);
                }
                if (!j8.d1()) break block7;
            }
            object = new J();
            f8.getSupportFragmentManager().o().e((Fragment)object, "SupportLifecycleFragmentImpl").j();
        }
        weakHashMap.put(f8, new WeakReference<Object>(object));
        return object;
    }

    @Override
    public final void H1() {
        super.H1();
        this.e0 = 3;
        Iterator iterator = this.d0.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).h();
        }
    }

    @Override
    public final void I1(Bundle bundle) {
        super.I1(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.d0.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback)entry.getValue()).i(bundle2);
                bundle.putBundle((String)entry.getKey(), bundle2);
            }
        }
    }

    @Override
    public final void J1() {
        super.J1();
        this.e0 = 2;
        Iterator iterator = this.d0.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).j();
        }
    }

    @Override
    public final void K1() {
        super.K1();
        this.e0 = 4;
        Iterator iterator = this.d0.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).k();
        }
    }

    @Override
    public final void c0(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        super.c0(string, fileDescriptor, printWriter, stringArray);
        Iterator iterator = this.d0.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).a(string, fileDescriptor, printWriter, stringArray);
        }
    }

    @Override
    public final void i1(int n8, int n9, Intent intent) {
        super.i1(n8, n9, intent);
        Iterator iterator = this.d0.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).e(n8, n9, intent);
        }
    }

    @Override
    public final void m(String string, LifecycleCallback object) {
        if (!this.d0.containsKey(string)) {
            this.d0.put(string, object);
            if (this.e0 > 0) {
                new e(Looper.getMainLooper()).post(new I(this, (LifecycleCallback)object, string));
            }
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("LifecycleCallback with tag ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" already added to this fragment.");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void n1(Bundle bundle) {
        super.n1(bundle);
        this.e0 = 1;
        this.f0 = bundle;
        for (Map.Entry entry : this.d0.entrySet()) {
            void object;
            LifecycleCallback lifecycleCallback = (LifecycleCallback)entry.getValue();
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle((String)entry.getKey());
            } else {
                Object var2_6 = null;
            }
            lifecycleCallback.f((Bundle)object);
        }
    }

    @Override
    public final void s1() {
        super.s1();
        this.e0 = 5;
        Iterator iterator = this.d0.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).g();
        }
    }

    @Override
    public final <T extends LifecycleCallback> T y(String string, Class<T> clazz) {
        return (T)((LifecycleCallback)clazz.cast(this.d0.get(string)));
    }

    @Override
    public final /* synthetic */ Activity z() {
        return this.f0();
    }
}

