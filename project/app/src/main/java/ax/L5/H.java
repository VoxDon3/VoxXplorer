/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import ax.B.a;
import ax.L5.G;
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

public final class H
extends Fragment
implements f {
    private static final WeakHashMap d = new WeakHashMap();
    private final Map a = java.util.DesugarCollections.synchronizedMap(new a());
    private int b = 0;
    private Bundle c;

    static /* bridge */ /* synthetic */ int a(H h8) {
        return h8.b;
    }

    static /* bridge */ /* synthetic */ Bundle b(H h8) {
        return h8.c;
    }

    public static H c(Activity activity) {
        Object object;
        WeakHashMap weakHashMap;
        block7: {
            block6: {
                H h8;
                weakHashMap = d;
                object = (WeakReference)weakHashMap.get(activity);
                if (object != null && (object = (H)((Reference)object).get()) != null) {
                    return object;
                }
                try {
                    h8 = (H)activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (h8 == null) break block6;
                    object = h8;
                }
                catch (ClassCastException classCastException) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", classCastException);
                }
                if (!h8.isRemoving()) break block7;
            }
            object = new H();
            activity.getFragmentManager().beginTransaction().add((Fragment)object, "LifecycleFragmentImpl").commitAllowingStateLoss();
        }
        weakHashMap.put(activity, new WeakReference<Object>(object));
        return object;
    }

    public final void dump(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        super.dump(string, fileDescriptor, printWriter, stringArray);
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).a(string, fileDescriptor, printWriter, stringArray);
        }
    }

    @Override
    public final void m(String string, LifecycleCallback object) {
        if (!this.a.containsKey(string)) {
            this.a.put(string, object);
            if (this.b > 0) {
                new e(Looper.getMainLooper()).post(new G(this, (LifecycleCallback)object, string));
            }
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("LifecycleCallback with tag ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" already added to this fragment.");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public final void onActivityResult(int n8, int n9, Intent intent) {
        super.onActivityResult(n8, n9, intent);
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).e(n8, n9, intent);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.a.entrySet()) {
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

    public final void onDestroy() {
        super.onDestroy();
        this.b = 5;
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.b = 3;
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback)entry.getValue()).i(bundle2);
                bundle.putBundle((String)entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.b = 2;
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.b = 4;
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((LifecycleCallback)iterator.next()).k();
        }
    }

    @Override
    public final <T extends LifecycleCallback> T y(String string, Class<T> clazz) {
        return (T)((LifecycleCallback)clazz.cast(this.a.get(string)));
    }

    @Override
    public final Activity z() {
        return this.getActivity();
    }
}

