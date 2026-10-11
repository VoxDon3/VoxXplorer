package ax.lb;

import ax.lb.C2500f;
import ax.pb.InterfaceC2807h;
import ax.pb.j0;

/* renamed from: ax.lb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2496b extends C2500f.a {

    /* renamed from: ax.lb.b$a */
    class a extends j0 {
        a(C2500f.c cVar) {
            this.a = cVar.b;
            this.b = cVar.c;
            this.c = cVar.d;
        }
    }

    public C2496b(String str) {
        super("\\\\" + str, 1, new C2500f.e(), -1, 0, 0);
        this.b = 0;
        this.c = 3;
    }

    public InterfaceC2807h[] j() {
        C2500f.e eVar = (C2500f.e) this.k;
        a[] aVarArr = new a[eVar.b];
        for (int i = 0; i < eVar.b; i++) {
            aVarArr[i] = new a(eVar.c[i]);
        }
        return aVarArr;
    }
}
