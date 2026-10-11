package ax.L5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class J extends Fragment implements InterfaceC0794f {
    private static final WeakHashMap g0 = new WeakHashMap();
    private final Map d0 = DesugarCollections.synchronizedMap(new ax.B.a());
    private int e0 = 0;
    private Bundle f0;

    public static J M2(androidx.fragment.app.f fVar) {
        J j;
        WeakHashMap weakHashMap = g0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(fVar);
        if (weakReference != null && (j = (J) weakReference.get()) != null) {
            return j;
        }
        try {
            J j2 = (J) fVar.getSupportFragmentManager().k0("SupportLifecycleFragmentImpl");
            if (j2 == null || j2.d1()) {
                j2 = new J();
                fVar.getSupportFragmentManager().o().e(j2, "SupportLifecycleFragmentImpl").j();
            }
            weakHashMap.put(fVar, new WeakReference(j2));
            return j2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void H1() {
        super.H1();
        this.e0 = 3;
        Iterator it = this.d0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void I1(Bundle bundle) {
        super.I1(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.d0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void J1() {
        super.J1();
        this.e0 = 2;
        Iterator it = this.d0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void K1() {
        super.K1();
        this.e0 = 4;
        Iterator it = this.d0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void c0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.c0(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.d0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void i1(int i, int i2, Intent intent) {
        super.i1(i, i2, intent);
        Iterator it = this.d0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i, i2, intent);
        }
    }

    @Override // ax.L5.InterfaceC0794f
    public final void m(String str, LifecycleCallback lifecycleCallback) {
        if (this.d0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.d0.put(str, lifecycleCallback);
        if (this.e0 > 0) {
            new ax.Z5.e(Looper.getMainLooper()).post(new I(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void n1(Bundle bundle) {
        super.n1(bundle);
        this.e0 = 1;
        this.f0 = bundle;
        for (Map.Entry entry : this.d0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void s1() {
        super.s1();
        this.e0 = 5;
        Iterator it = this.d0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // ax.L5.InterfaceC0794f
    public final <T extends LifecycleCallback> T y(String str, Class<T> cls) {
        return cls.cast(this.d0.get(str));
    }

    @Override // ax.L5.InterfaceC0794f
    public final /* synthetic */ Activity z() {
        return f0();
    }
}
