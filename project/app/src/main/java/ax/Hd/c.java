/*
 * Decompiled with CFR 0.152.
 */
package ax.Hd;

import ax.Wc.v;
import ax.od.a;
import java.util.HashMap;
import java.util.Map;

public class c {
    private static Map<v, String> a;

    static {
        HashMap<v, String> hashMap = new HashMap<v, String>();
        a = hashMap;
        hashMap.put(ax.md.a.H, "MD2");
        a.put(ax.md.a.I, "MD4");
        a.put(ax.md.a.J, "MD5");
        a.put(ax.ld.a.i, "SHA-1");
        a.put(ax.jd.a.f, "SHA-224");
        a.put(ax.jd.a.c, "SHA-256");
        a.put(ax.jd.a.d, "SHA-384");
        a.put(ax.jd.a.e, "SHA-512");
        a.put(ax.jd.a.g, "SHA-512(224)");
        a.put(ax.jd.a.h, "SHA-512(256)");
        a.put(ax.od.a.c, "RIPEMD-128");
        a.put(ax.od.a.b, "RIPEMD-160");
        a.put(ax.od.a.d, "RIPEMD-128");
        a.put(ax.gd.a.d, "RIPEMD-128");
        a.put(ax.gd.a.c, "RIPEMD-160");
        a.put(ax.ad.a.b, "GOST3411");
        a.put(ax.ed.a.g, "Tiger");
        a.put(ax.gd.a.e, "Whirlpool");
        a.put(ax.jd.a.i, "SHA3-224");
        a.put(ax.jd.a.j, "SHA3-256");
        a.put(ax.jd.a.k, "SHA3-384");
        a.put(ax.jd.a.l, "SHA3-512");
        a.put(ax.jd.a.m, "SHAKE128");
        a.put(ax.jd.a.n, "SHAKE256");
        a.put(ax.dd.a.b0, "SM3");
    }

    public static String a(v v8) {
        String string = a.get(v8);
        if (string != null) {
            return string;
        }
        return v8.I();
    }
}

