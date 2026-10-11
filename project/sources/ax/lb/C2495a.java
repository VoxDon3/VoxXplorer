package ax.lb;

import ax.lb.C2498d;
import ax.mb.C2549c;
import ax.pb.InterfaceC2807h;
import ax.pb.j0;
import okhttp3.internal.http2.Settings;

/* renamed from: ax.lb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2495a extends C2498d.f {
    public C2495a(String str) {
        super(str, 200, Settings.DEFAULT_INITIAL_WINDOW_SIZE, new C2498d.c(), new C2549c(0));
        C2498d.c cVar = this.l;
        cVar.b = this.j;
        cVar.c = new C2498d.b();
        this.b = 0;
        this.c = 3;
    }

    public InterfaceC2807h[] j() {
        C2498d.b bVar = (C2498d.b) this.l.c;
        j0[] j0VarArr = new j0[bVar.b];
        for (int i = 0; i < bVar.b; i++) {
            j0VarArr[i] = new j0(bVar.c[i].b, 0, null);
        }
        return j0VarArr;
    }
}
