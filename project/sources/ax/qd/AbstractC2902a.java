package ax.qd;

import ax.Wc.C0;
import ax.Wc.C1130v;
import ax.Wc.C1138z;
import ax.Wc.InterfaceC1101g;
import ax.pd.C2827a;
import ax.pd.C2828b;
import ax.pd.e;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: ax.qd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2902a implements e {
    private int g(InterfaceC1101g interfaceC1101g) {
        return c.d(interfaceC1101g).hashCode();
    }

    public static Hashtable h(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    private boolean j(boolean z, C2828b c2828b, C2828b[] c2828bArr) {
        if (z) {
            for (int length = c2828bArr.length - 1; length >= 0; length--) {
                C2828b c2828b2 = c2828bArr[length];
                if (c2828b2 != null && k(c2828b, c2828b2)) {
                    c2828bArr[length] = null;
                    return true;
                }
            }
        } else {
            for (int i = 0; i != c2828bArr.length; i++) {
                C2828b c2828b3 = c2828bArr[i];
                if (c2828b3 != null && k(c2828b, c2828b3)) {
                    c2828bArr[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ax.pd.e
    public InterfaceC1101g a(C1130v c1130v, String str) {
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0 && str.charAt(0) == '\\') {
                str = str.substring(1);
            }
            return i(c1130v, str);
        }
        try {
            return c.p(str, 1);
        } catch (IOException unused) {
            throw new C1138z("can't recode value for oid " + c1130v.I());
        }
    }

    @Override // ax.pd.e
    public int b(ax.pd.c cVar) {
        C2828b[] s = cVar.s();
        int i = 0;
        for (int i2 = 0; i2 != s.length; i2++) {
            if (s[i2].u()) {
                C2827a[] t = s[i2].t();
                for (int i3 = 0; i3 != t.length; i3++) {
                    i = (i ^ t[i3].s().hashCode()) ^ g(t[i3].t());
                }
            } else {
                i = (i ^ s[i2].r().s().hashCode()) ^ g(s[i2].r().t());
            }
        }
        return i;
    }

    @Override // ax.pd.e
    public boolean e(ax.pd.c cVar, ax.pd.c cVar2) {
        C2828b[] s = cVar.s();
        C2828b[] s2 = cVar2.s();
        if (s.length != s2.length) {
            return false;
        }
        boolean z = (s[0].r() == null || s2[0].r() == null) ? false : !s[0].r().s().y(s2[0].r().s());
        for (int i = 0; i != s.length; i++) {
            if (!j(z, s[i], s2)) {
                return false;
            }
        }
        return true;
    }

    protected InterfaceC1101g i(C1130v c1130v, String str) {
        return new C0(str);
    }

    protected boolean k(C2828b c2828b, C2828b c2828b2) {
        return c.j(c2828b, c2828b2);
    }
}
