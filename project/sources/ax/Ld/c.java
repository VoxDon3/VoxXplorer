package ax.Ld;

import ax.Wc.C1123r0;
import ax.Wc.C1130v;
import ax.Wc.InterfaceC1101g;
import ax.ad.InterfaceC1438a;
import ax.bd.InterfaceC1732a;
import ax.cd.InterfaceC1859a;
import ax.fd.InterfaceC2094a;
import ax.jd.InterfaceC2349a;
import ax.ld.InterfaceC2505a;
import ax.md.InterfaceC2554a;
import ax.nd.InterfaceC2652a;
import ax.od.InterfaceC2744a;
import ax.rd.C3031a;
import ax.sd.InterfaceC3088a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class c {
    private static final Map a;
    private static final Map b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap.put(InterfaceC2554a.k, "RSASSA-PSS");
        hashMap.put(InterfaceC1859a.d, "ED25519");
        hashMap.put(InterfaceC1859a.e, "ED448");
        hashMap.put(new C1130v("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        hashMap.put(InterfaceC2554a.o, "SHA224WITHRSA");
        hashMap.put(InterfaceC2554a.l, "SHA256WITHRSA");
        hashMap.put(InterfaceC2554a.m, "SHA384WITHRSA");
        hashMap.put(InterfaceC2554a.n, "SHA512WITHRSA");
        hashMap.put(ax.Zc.a.o, "SHAKE128WITHRSAPSS");
        hashMap.put(ax.Zc.a.p, "SHAKE256WITHRSAPSS");
        hashMap.put(InterfaceC1438a.n, "GOST3411WITHGOST3410");
        hashMap.put(InterfaceC1438a.o, "GOST3411WITHECGOST3410");
        hashMap.put(InterfaceC2652a.i, "GOST3411-2012-256WITHECGOST3410-2012-256");
        hashMap.put(InterfaceC2652a.j, "GOST3411-2012-512WITHECGOST3410-2012-512");
        hashMap.put(ax.Yc.a.d, "SHA1WITHPLAIN-ECDSA");
        hashMap.put(ax.Yc.a.e, "SHA224WITHPLAIN-ECDSA");
        hashMap.put(ax.Yc.a.f, "SHA256WITHPLAIN-ECDSA");
        hashMap.put(ax.Yc.a.g, "SHA384WITHPLAIN-ECDSA");
        hashMap.put(ax.Yc.a.h, "SHA512WITHPLAIN-ECDSA");
        hashMap.put(ax.Yc.a.j, "SHA3-224WITHPLAIN-ECDSA");
        hashMap.put(ax.Yc.a.k, "SHA3-256WITHPLAIN-ECDSA");
        hashMap.put(ax.Yc.a.l, "SHA3-384WITHPLAIN-ECDSA");
        hashMap.put(ax.Yc.a.m, "SHA3-512WITHPLAIN-ECDSA");
        hashMap.put(ax.Yc.a.i, "RIPEMD160WITHPLAIN-ECDSA");
        hashMap.put(InterfaceC1732a.s, "SHA1WITHCVC-ECDSA");
        hashMap.put(InterfaceC1732a.t, "SHA224WITHCVC-ECDSA");
        hashMap.put(InterfaceC1732a.u, "SHA256WITHCVC-ECDSA");
        hashMap.put(InterfaceC1732a.v, "SHA384WITHCVC-ECDSA");
        hashMap.put(InterfaceC1732a.w, "SHA512WITHCVC-ECDSA");
        hashMap.put(InterfaceC2094a.a, "XMSS");
        hashMap.put(InterfaceC2094a.b, "XMSSMT");
        hashMap.put(InterfaceC2744a.g, "RIPEMD128WITHRSA");
        hashMap.put(InterfaceC2744a.f, "RIPEMD160WITHRSA");
        hashMap.put(InterfaceC2744a.h, "RIPEMD256WITHRSA");
        hashMap.put(new C1130v("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        hashMap.put(new C1130v("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        hashMap.put(new C1130v("1.2.840.10040.4.3"), "SHA1WITHDSA");
        hashMap.put(InterfaceC3088a.i, "SHA1WITHECDSA");
        hashMap.put(InterfaceC3088a.m, "SHA224WITHECDSA");
        hashMap.put(InterfaceC3088a.n, "SHA256WITHECDSA");
        hashMap.put(InterfaceC3088a.o, "SHA384WITHECDSA");
        hashMap.put(InterfaceC3088a.p, "SHA512WITHECDSA");
        hashMap.put(ax.Zc.a.q, "SHAKE128WITHECDSA");
        hashMap.put(ax.Zc.a.r, "SHAKE256WITHECDSA");
        hashMap.put(InterfaceC2505a.k, "SHA1WITHRSA");
        hashMap.put(InterfaceC2505a.j, "SHA1WITHDSA");
        hashMap.put(InterfaceC2349a.X, "SHA224WITHDSA");
        hashMap.put(InterfaceC2349a.Y, "SHA256WITHDSA");
        hashMap2.put(InterfaceC2505a.i, "SHA1");
        hashMap2.put(InterfaceC2349a.f, "SHA224");
        hashMap2.put(InterfaceC2349a.c, "SHA256");
        hashMap2.put(InterfaceC2349a.d, "SHA384");
        hashMap2.put(InterfaceC2349a.e, "SHA512");
        hashMap2.put(InterfaceC2349a.i, "SHA3-224");
        hashMap2.put(InterfaceC2349a.j, "SHA3-256");
        hashMap2.put(InterfaceC2349a.k, "SHA3-384");
        hashMap2.put(InterfaceC2349a.l, "SHA3-512");
        hashMap2.put(InterfaceC2744a.c, "RIPEMD128");
        hashMap2.put(InterfaceC2744a.b, "RIPEMD160");
        hashMap2.put(InterfaceC2744a.d, "RIPEMD256");
    }

    private static String b(C1130v c1130v) {
        String str = (String) b.get(c1130v);
        return str != null ? str : c1130v.I();
    }

    public String a(C3031a c3031a) {
        InterfaceC1101g u = c3031a.u();
        if (u == null || C1123r0.c0.x(u) || !c3031a.r().y(InterfaceC2554a.k)) {
            Map map = a;
            boolean containsKey = map.containsKey(c3031a.r());
            C1130v r = c3031a.r();
            return containsKey ? (String) map.get(r) : r.I();
        }
        ax.md.c s = ax.md.c.s(u);
        C3031a t = s.t();
        if (!t.r().y(InterfaceC2554a.i)) {
            return b(s.r().r()) + "WITHRSAAND" + t.r().I();
        }
        C3031a r2 = s.r();
        C1130v r3 = C3031a.t(t.u()).r();
        if (r3.y(r2.r())) {
            return b(r2.r()) + "WITHRSAANDMGF1";
        }
        return b(r2.r()) + "WITHRSAANDMGF1USING" + b(r3);
    }
}
