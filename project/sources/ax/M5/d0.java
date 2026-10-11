package ax.M5;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class d0 {
    private Object a;
    private boolean b = false;
    final /* synthetic */ AbstractC0808c c;

    public d0(AbstractC0808c abstractC0808c, Object obj) {
        this.c = abstractC0808c;
        this.a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.a;
                if (this.b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.c.s0;
        synchronized (arrayList) {
            arrayList2 = this.c.s0;
            arrayList2.remove(this);
        }
    }
}
