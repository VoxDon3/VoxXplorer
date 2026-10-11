/*
 * Decompiled with CFR 0.152.
 */
package ax.Md;

import ax.Hd.c;
import ax.Nd.d;
import ax.Wc.D;
import ax.Wc.q;
import ax.Wc.v;
import ax.od.a;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;

class b {
    private static final Map b;
    private static final Map c;
    private static final Map d;
    private static final Map e;
    private static final Map f;
    private static ax.Ld.c g;
    private ax.Hd.b a;

    static {
        HashMap<Object, Integer> hashMap;
        HashMap<v, String> hashMap2;
        HashMap<Object, String> hashMap3;
        Object object = new HashMap<v, String>();
        b = object;
        Object object2 = new HashMap<v, String>();
        c = object2;
        d = hashMap3 = new HashMap<Object, String>();
        e = hashMap2 = new HashMap<v, String>();
        f = hashMap = new HashMap<Object, Integer>();
        g = new ax.Ld.c();
        object.put(ax.ld.a.i, "SHA1");
        object.put(ax.jd.a.f, "SHA224");
        object.put(ax.jd.a.c, "SHA256");
        object.put(ax.jd.a.d, "SHA384");
        object.put(ax.jd.a.e, "SHA512");
        object.put(ax.od.a.c, "RIPEMD128");
        object.put(ax.od.a.b, "RIPEMD160");
        object.put(ax.od.a.d, "RIPEMD256");
        object2.put(ax.md.a.b, "RSA/ECB/PKCS1Padding");
        object2.put(ax.ad.a.m, "ECGOST3410");
        v v8 = ax.md.a.S1;
        hashMap3.put(v8, "DESEDEWrap");
        hashMap3.put(ax.md.a.T1, "RC2Wrap");
        v v9 = ax.jd.a.B;
        hashMap3.put(v9, "AESWrap");
        v v10 = ax.jd.a.J;
        hashMap3.put(v10, "AESWrap");
        object = ax.jd.a.R;
        hashMap3.put(object, "AESWrap");
        v v11 = ax.kd.a.d;
        hashMap3.put(v11, "CamelliaWrap");
        v v12 = ax.kd.a.e;
        hashMap3.put(v12, "CamelliaWrap");
        object2 = ax.kd.a.f;
        hashMap3.put(object2, "CamelliaWrap");
        v v13 = ax.hd.a.d;
        hashMap3.put(v13, "SEEDWrap");
        v v14 = ax.md.a.D;
        hashMap3.put(v14, "DESede");
        hashMap.put(v8, ax.Nd.d.d(192));
        hashMap.put(v9, ax.Nd.d.d(128));
        hashMap.put(v10, ax.Nd.d.d(192));
        hashMap.put(object, ax.Nd.d.d(256));
        hashMap.put(v11, ax.Nd.d.d(128));
        hashMap.put(v12, ax.Nd.d.d(192));
        hashMap.put(object2, ax.Nd.d.d(256));
        hashMap.put(v13, ax.Nd.d.d(128));
        hashMap.put(v14, ax.Nd.d.d(192));
        hashMap2.put(ax.jd.a.w, "AES");
        hashMap2.put(ax.jd.a.y, "AES");
        hashMap2.put(ax.jd.a.G, "AES");
        hashMap2.put(ax.jd.a.O, "AES");
        hashMap2.put(v14, "DESede");
        hashMap2.put(ax.md.a.E, "RC2");
    }

    b(ax.Hd.b b8) {
        this.a = b8;
    }

    private static String c(ax.rd.a a8) {
        return g.a(a8);
    }

    private boolean d(D object) throws GeneralSecurityException {
        if (object != null && ((D)object).size() != 0) {
            ax.md.c c8 = ax.md.c.s(object);
            if (!c8.t().r().y(ax.md.a.i)) {
                return true;
            }
            if (!c8.r().equals(ax.rd.a.t(c8.t().u()))) {
                return true;
            }
            object = this.a(c8.r());
            if (c8.u().intValue() != ((MessageDigest)object).getDigestLength()) {
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    MessageDigest a(ax.rd.a object) throws GeneralSecurityException {
        NoSuchAlgorithmException noSuchAlgorithmException2;
        block4: {
            CharSequence charSequence;
            ax.Hd.b b8;
            try {
                if (((ax.rd.a)object).r().y(ax.jd.a.t)) {
                    b8 = this.a;
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("SHAKE256-");
                    ((StringBuilder)charSequence).append(q.E(((ax.rd.a)object).u()).G());
                    charSequence = ((StringBuilder)charSequence).toString();
                    return b8.a((String)charSequence);
                }
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException2) {
                break block4;
            }
            if (((ax.rd.a)object).r().y(ax.jd.a.s)) {
                b8 = this.a;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("SHAKE128-");
                ((StringBuilder)charSequence).append(q.E(((ax.rd.a)object).u()).G());
                charSequence = ((StringBuilder)charSequence).toString();
                return b8.a((String)charSequence);
            }
            b8 = this.a;
            charSequence = ax.Hd.c.a(((ax.rd.a)object).r());
            return b8.a((String)charSequence);
        }
        Map map = b;
        if (map.get(((ax.rd.a)object).r()) == null) throw noSuchAlgorithmException2;
        object = (String)map.get(((ax.rd.a)object).r());
        return this.a.a((String)object);
    }

    Signature b(ax.rd.a t8) throws GeneralSecurityException {
        NoSuchAlgorithmException noSuchAlgorithmException2;
        block5: {
            Object object;
            Object object2 = ax.Md.b.c((ax.rd.a)t8);
            try {
                object = this.a.c((String)object2);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException2) {
                if (!((String)object2).endsWith("WITHRSAANDMGF1")) break block5;
                object = new StringBuilder();
                ((StringBuilder)object).append(((String)object2).substring(0, ((String)object2).indexOf(87)));
                ((StringBuilder)object).append("WITHRSASSA-PSS");
                object = ((StringBuilder)object).toString();
                object = this.a.c((String)object);
            }
            if (((ax.rd.a)t8).r().y(ax.md.a.k) && this.d((D)(t8 = D.G(((ax.rd.a)t8).u())))) {
                try {
                    object2 = this.a.b("PSS");
                    ((AlgorithmParameters)object2).init(t8.p());
                    ((Signature)object).setParameter(((AlgorithmParameters)object2).getParameterSpec(PSSParameterSpec.class));
                }
                catch (IOException iOException) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("unable to process PSS parameters: ");
                    ((StringBuilder)object).append(iOException.getMessage());
                    throw new GeneralSecurityException(((StringBuilder)object).toString());
                }
            }
            return object;
        }
        throw noSuchAlgorithmException2;
    }
}

