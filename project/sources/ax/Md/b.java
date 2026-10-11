package ax.Md;

import ax.Ld.c;
import ax.Nd.d;
import ax.Wc.C1121q;
import ax.Wc.C1130v;
import ax.Wc.D;
import ax.ad.InterfaceC1438a;
import ax.hd.InterfaceC2184a;
import ax.jd.InterfaceC2349a;
import ax.kd.InterfaceC2428a;
import ax.ld.InterfaceC2505a;
import ax.md.InterfaceC2554a;
import ax.od.InterfaceC2744a;
import ax.rd.C3031a;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
class b {
    private static final Map b;
    private static final Map c;
    private static final Map d;
    private static final Map e;
    private static final Map f;
    private static c g;
    private ax.Hd.b a;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        HashMap hashMap2 = new HashMap();
        c = hashMap2;
        HashMap hashMap3 = new HashMap();
        d = hashMap3;
        HashMap hashMap4 = new HashMap();
        e = hashMap4;
        HashMap hashMap5 = new HashMap();
        f = hashMap5;
        g = new c();
        hashMap.put(InterfaceC2505a.i, "SHA1");
        hashMap.put(InterfaceC2349a.f, "SHA224");
        hashMap.put(InterfaceC2349a.c, "SHA256");
        hashMap.put(InterfaceC2349a.d, "SHA384");
        hashMap.put(InterfaceC2349a.e, "SHA512");
        hashMap.put(InterfaceC2744a.c, "RIPEMD128");
        hashMap.put(InterfaceC2744a.b, "RIPEMD160");
        hashMap.put(InterfaceC2744a.d, "RIPEMD256");
        hashMap2.put(InterfaceC2554a.b, "RSA/ECB/PKCS1Padding");
        hashMap2.put(InterfaceC1438a.m, "ECGOST3410");
        C1130v c1130v = InterfaceC2554a.S1;
        hashMap3.put(c1130v, "DESEDEWrap");
        hashMap3.put(InterfaceC2554a.T1, "RC2Wrap");
        C1130v c1130v2 = InterfaceC2349a.B;
        hashMap3.put(c1130v2, "AESWrap");
        C1130v c1130v3 = InterfaceC2349a.J;
        hashMap3.put(c1130v3, "AESWrap");
        C1130v c1130v4 = InterfaceC2349a.R;
        hashMap3.put(c1130v4, "AESWrap");
        C1130v c1130v5 = InterfaceC2428a.d;
        hashMap3.put(c1130v5, "CamelliaWrap");
        C1130v c1130v6 = InterfaceC2428a.e;
        hashMap3.put(c1130v6, "CamelliaWrap");
        C1130v c1130v7 = InterfaceC2428a.f;
        hashMap3.put(c1130v7, "CamelliaWrap");
        C1130v c1130v8 = InterfaceC2184a.d;
        hashMap3.put(c1130v8, "SEEDWrap");
        C1130v c1130v9 = InterfaceC2554a.D;
        hashMap3.put(c1130v9, "DESede");
        hashMap5.put(c1130v, d.d(192));
        hashMap5.put(c1130v2, d.d(128));
        hashMap5.put(c1130v3, d.d(192));
        hashMap5.put(c1130v4, d.d(256));
        hashMap5.put(c1130v5, d.d(128));
        hashMap5.put(c1130v6, d.d(192));
        hashMap5.put(c1130v7, d.d(256));
        hashMap5.put(c1130v8, d.d(128));
        hashMap5.put(c1130v9, d.d(192));
        hashMap4.put(InterfaceC2349a.w, "AES");
        hashMap4.put(InterfaceC2349a.y, "AES");
        hashMap4.put(InterfaceC2349a.G, "AES");
        hashMap4.put(InterfaceC2349a.O, "AES");
        hashMap4.put(c1130v9, "DESede");
        hashMap4.put(InterfaceC2554a.E, "RC2");
    }

    b(ax.Hd.b bVar) {
        this.a = bVar;
    }

    private static String c(C3031a c3031a) {
        return g.a(c3031a);
    }

    private boolean d(D d2) throws GeneralSecurityException {
        if (d2 != null && d2.size() != 0) {
            ax.md.c s = ax.md.c.s(d2);
            if (!s.t().r().y(InterfaceC2554a.i) || !s.r().equals(C3031a.t(s.t().u()))) {
                return true;
            }
            if (s.u().intValue() != a(s.r()).getDigestLength()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.security.MessageDigest] */
    MessageDigest a(C3031a c3031a) throws GeneralSecurityException {
        ax.Hd.b bVar;
        String a;
        try {
            if (c3031a.r().y(InterfaceC2349a.t)) {
                bVar = this.a;
                a = "SHAKE256-" + C1121q.E(c3031a.u()).G();
            } else if (c3031a.r().y(InterfaceC2349a.s)) {
                bVar = this.a;
                a = "SHAKE128-" + C1121q.E(c3031a.u()).G();
            } else {
                bVar = this.a;
                a = ax.Hd.c.a(c3031a.r());
            }
            c3031a = bVar.a(a);
            return c3031a;
        } catch (NoSuchAlgorithmException e2) {
            Map map = b;
            if (map.get(c3031a.r()) == null) {
                throw e2;
            }
            return this.a.a((String) map.get(c3031a.r()));
        }
    }

    Signature b(C3031a c3031a) throws GeneralSecurityException {
        Signature c2;
        String c3 = c(c3031a);
        try {
            c2 = this.a.c(c3);
        } catch (NoSuchAlgorithmException e2) {
            if (!c3.endsWith("WITHRSAANDMGF1")) {
                throw e2;
            }
            c2 = this.a.c(c3.substring(0, c3.indexOf(87)) + "WITHRSASSA-PSS");
        }
        if (c3031a.r().y(InterfaceC2554a.k)) {
            D G = D.G(c3031a.u());
            if (d(G)) {
                try {
                    AlgorithmParameters b2 = this.a.b("PSS");
                    b2.init(G.p());
                    c2.setParameter(b2.getParameterSpec(PSSParameterSpec.class));
                } catch (IOException e3) {
                    throw new GeneralSecurityException("unable to process PSS parameters: " + e3.getMessage());
                }
            }
        }
        return c2;
    }
}
