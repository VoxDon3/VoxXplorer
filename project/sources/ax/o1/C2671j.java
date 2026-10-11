package ax.o1;

import android.view.Surface;
import ax.f1.C2004B;
import ax.f1.C2006D;

/* renamed from: ax.o1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2671j extends C2004B {
    public final int e0;
    public final boolean f0;

    public C2671j(Throwable th, C2006D c2006d, Surface surface) {
        super(th, c2006d);
        this.e0 = System.identityHashCode(surface);
        this.f0 = surface == null || surface.isValid();
    }
}
