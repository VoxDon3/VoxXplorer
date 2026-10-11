package ax.O9;

import ax.N9.C0845g;
import ax.N9.C0863p;
import ax.N9.M;
import ax.N9.U;
import java.util.List;

/* renamed from: ax.O9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0884a extends ax.P9.c implements s {
    public C0884a(String str, ax.M9.f fVar, List<ax.S9.c> list) {
        super(str, fVar, list);
    }

    @Override // ax.O9.s
    public M a() {
        return q(o());
    }

    @Override // ax.O9.s
    public U e(String str) {
        return new C0863p(p(str), i(), o());
    }

    public M q(List<ax.S9.c> list) {
        return new C0845g(d(), i(), list);
    }
}
