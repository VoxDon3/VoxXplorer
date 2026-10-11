package ax.n3;

import android.content.Context;
import ax.Ha.c;
import ax.b3.C1495j;
import ax.c3.C1835x;
import ax.c3.K;
import ax.g3.h;
import ax.t3.e;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;

/* renamed from: ax.n3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2577a implements InterfaceC3185c {
    Context a;
    K b;
    boolean c;
    private h d;

    public C2577a(Context context, K k, h hVar) {
        this.a = context;
        this.b = k;
        this.d = hVar;
    }

    public synchronized boolean a() {
        this.c = true;
        return true;
    }

    public void b(String str, String str2, boolean z) {
        C3596o e = C1835x.e(this.b);
        e.n0();
        if (str == null) {
            str = this.b.e();
        }
        this.c = false;
        try {
            try {
                AbstractC3595n z2 = e.z(str);
                try {
                    if (z2 == null) {
                        throw new C1495j();
                    }
                    boolean h = e.h(this.a, this.b.d(), this.b.b(), z2.E(), false);
                    if (z2.isDirectory()) {
                        e.o(z2, str2, h, z, this.d, this);
                        if (isCancelled()) {
                            this.d.o();
                        }
                        e.k0(false);
                        return;
                    }
                    c.h().c("SEARCH NOT DIRECTORY").g(this.b.toString() + ":" + str).h();
                    throw new C1495j();
                } catch (C1495j unused) {
                    this.d.i();
                    e.k0(false);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                e.k0(false);
                throw th2;
            }
        } catch (C1495j unused2) {
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            e.k0(false);
            throw th22;
        }
    }

    @Override // ax.u3.InterfaceC3185c
    public synchronized boolean isCancelled() {
        return this.c;
    }
}
