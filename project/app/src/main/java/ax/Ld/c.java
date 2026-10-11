/*
 * Decompiled with CFR 0.152.
 */
package ax.Ld;

import ax.Wc.A;
import ax.Wc.g;
import ax.Wc.r0;
import ax.Wc.t;
import ax.Wc.v;
import ax.od.a;
import java.util.HashMap;
import java.util.Map;

public class c {
    private static final Map a;
    private static final Map b;

    static {
        HashMap<v, String> hashMap;
        HashMap<v, String> hashMap2;
        a = hashMap2 = new HashMap<v, String>();
        b = hashMap = new HashMap<v, String>();
        hashMap2.put(ax.md.a.k, "RSASSA-PSS");
        hashMap2.put(ax.cd.a.d, "ED25519");
        hashMap2.put(ax.cd.a.e, "ED448");
        hashMap2.put(new v("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        hashMap2.put(ax.md.a.o, "SHA224WITHRSA");
        hashMap2.put(ax.md.a.l, "SHA256WITHRSA");
        hashMap2.put(ax.md.a.m, "SHA384WITHRSA");
        hashMap2.put(ax.md.a.n, "SHA512WITHRSA");
        hashMap2.put(ax.Zc.a.o, "SHAKE128WITHRSAPSS");
        hashMap2.put(ax.Zc.a.p, "SHAKE256WITHRSAPSS");
        hashMap2.put(ax.ad.a.n, "GOST3411WITHGOST3410");
        hashMap2.put(ax.ad.a.o, "GOST3411WITHECGOST3410");
        hashMap2.put(ax.nd.a.i, "GOST3411-2012-256WITHECGOST3410-2012-256");
        hashMap2.put(ax.nd.a.j, "GOST3411-2012-512WITHECGOST3410-2012-512");
        hashMap2.put(ax.Yc.a.d, "SHA1WITHPLAIN-ECDSA");
        hashMap2.put(ax.Yc.a.e, "SHA224WITHPLAIN-ECDSA");
        hashMap2.put(ax.Yc.a.f, "SHA256WITHPLAIN-ECDSA");
        hashMap2.put(ax.Yc.a.g, "SHA384WITHPLAIN-ECDSA");
        hashMap2.put(ax.Yc.a.h, "SHA512WITHPLAIN-ECDSA");
        hashMap2.put(ax.Yc.a.j, "SHA3-224WITHPLAIN-ECDSA");
        hashMap2.put(ax.Yc.a.k, "SHA3-256WITHPLAIN-ECDSA");
        hashMap2.put(ax.Yc.a.l, "SHA3-384WITHPLAIN-ECDSA");
        hashMap2.put(ax.Yc.a.m, "SHA3-512WITHPLAIN-ECDSA");
        hashMap2.put(ax.Yc.a.i, "RIPEMD160WITHPLAIN-ECDSA");
        hashMap2.put(ax.bd.a.s, "SHA1WITHCVC-ECDSA");
        hashMap2.put(ax.bd.a.t, "SHA224WITHCVC-ECDSA");
        hashMap2.put(ax.bd.a.u, "SHA256WITHCVC-ECDSA");
        hashMap2.put(ax.bd.a.v, "SHA384WITHCVC-ECDSA");
        hashMap2.put(ax.bd.a.w, "SHA512WITHCVC-ECDSA");
        hashMap2.put(ax.fd.a.a, "XMSS");
        hashMap2.put(ax.fd.a.b, "XMSSMT");
        hashMap2.put(ax.od.a.g, "RIPEMD128WITHRSA");
        hashMap2.put(ax.od.a.f, "RIPEMD160WITHRSA");
        hashMap2.put(ax.od.a.h, "RIPEMD256WITHRSA");
        hashMap2.put(new v("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        hashMap2.put(new v("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        hashMap2.put(new v("1.2.840.10040.4.3"), "SHA1WITHDSA");
        hashMap2.put(ax.sd.a.i, "SHA1WITHECDSA");
        hashMap2.put(ax.sd.a.m, "SHA224WITHECDSA");
        hashMap2.put(ax.sd.a.n, "SHA256WITHECDSA");
        hashMap2.put(ax.sd.a.o, "SHA384WITHECDSA");
        hashMap2.put(ax.sd.a.p, "SHA512WITHECDSA");
        hashMap2.put(ax.Zc.a.q, "SHAKE128WITHECDSA");
        hashMap2.put(ax.Zc.a.r, "SHAKE256WITHECDSA");
        hashMap2.put(ax.ld.a.k, "SHA1WITHRSA");
        hashMap2.put(ax.ld.a.j, "SHA1WITHDSA");
        hashMap2.put(ax.jd.a.X, "SHA224WITHDSA");
        hashMap2.put(ax.jd.a.Y, "SHA256WITHDSA");
        hashMap.put(ax.ld.a.i, "SHA1");
        hashMap.put(ax.jd.a.f, "SHA224");
        hashMap.put(ax.jd.a.c, "SHA256");
        hashMap.put(ax.jd.a.d, "SHA384");
        hashMap.put(ax.jd.a.e, "SHA512");
        hashMap.put(ax.jd.a.i, "SHA3-224");
        hashMap.put(ax.jd.a.j, "SHA3-256");
        hashMap.put(ax.jd.a.k, "SHA3-384");
        hashMap.put(ax.jd.a.l, "SHA3-512");
        hashMap.put(ax.od.a.c, "RIPEMD128");
        hashMap.put(ax.od.a.b, "RIPEMD160");
        hashMap.put(ax.od.a.d, "RIPEMD256");
    }

    private static String b(v v8) {
        String string = (String)b.get(v8);
        if (string != null) {
            return string;
        }
        return v8.I();
    }

    public String a(ax.rd.a object) {
        Object object2 = ((ax.rd.a)object).u();
        if (object2 != null && !r0.c0.x((g)object2) && ((ax.rd.a)object).r().y(ax.md.a.k)) {
            t t8 = ax.md.c.s(object2);
            if (((ax.rd.a)(object2 = ((ax.md.c)t8).t())).r().y(ax.md.a.i)) {
                object = ((ax.md.c)t8).r();
                t8 = ax.rd.a.t(((ax.rd.a)object2).u()).r();
                if (((A)t8).y(((ax.rd.a)object).r())) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(c.b(((ax.rd.a)object).r()));
                    ((StringBuilder)object2).append("WITHRSAANDMGF1");
                    return ((StringBuilder)object2).toString();
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(c.b(((ax.rd.a)object).r()));
                ((StringBuilder)object2).append("WITHRSAANDMGF1USING");
                ((StringBuilder)object2).append(c.b((v)t8));
                return ((StringBuilder)object2).toString();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(c.b(((ax.md.c)t8).r().r()));
            ((StringBuilder)object).append("WITHRSAAND");
            ((StringBuilder)object).append(((ax.rd.a)object2).r().I());
            return ((StringBuilder)object).toString();
        }
        object2 = a;
        boolean bl = object2.containsKey(((ax.rd.a)object).r());
        object = ((ax.rd.a)object).r();
        if (bl) {
            return (String)object2.get(object);
        }
        return ((v)object).I();
    }
}

