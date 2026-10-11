package ax.Yb;

import ax.Fb.l;
import ax.Fb.q;
import ax.Gb.m;
import ax.Qb.InterfaceC0945l;
import ax.Vb.F;
import ax.sb.t;

/* loaded from: classes3.dex */
public final class c {
    private static final q<Object, Object, Object, Object> a = a.q;
    private static final F b = new F("STATE_REG");
    private static final F c = new F("STATE_COMPLETED");
    private static final F d = new F("STATE_CANCELLED");
    private static final F e = new F("NO_RESULT");
    private static final F f = new F("PARAM_CLAUSE_0");

    static final class a extends m implements q {
        public static final a q = new a();

        a() {
            super(3);
        }

        @Override // ax.Fb.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void c(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d a(int i) {
        if (i == 0) {
            return d.SUCCESSFUL;
        }
        if (i == 1) {
            return d.REREGISTER;
        }
        if (i == 2) {
            return d.CANCELLED;
        }
        if (i == 3) {
            return d.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(InterfaceC0945l<? super t> interfaceC0945l, l<? super Throwable, t> lVar) {
        Object l = interfaceC0945l.l(t.a, null, lVar);
        if (l == null) {
            return false;
        }
        interfaceC0945l.s(l);
        return true;
    }
}
