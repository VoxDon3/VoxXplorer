package ax.K5;

import android.os.Looper;
import ax.K5.a;
import ax.L5.InterfaceC0791c;
import ax.L5.InterfaceC0797i;
import com.google.android.gms.common.api.internal.AbstractC3608b;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes3.dex */
public abstract class g {
    private static final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface a extends InterfaceC0791c {
    }

    @Deprecated
    public interface b extends InterfaceC0797i {
    }

    public static Set<g> b() {
        Set<g> set = a;
        synchronized (set) {
        }
        return set;
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b, T extends AbstractC3608b<? extends l, A>> T a(T t) {
        throw new UnsupportedOperationException();
    }

    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public boolean d(ax.L5.k kVar) {
        throw new UnsupportedOperationException();
    }

    public void e() {
        throw new UnsupportedOperationException();
    }
}
