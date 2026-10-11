package ax.Hd;

import ax.Wc.C1130v;
import ax.ad.InterfaceC1438a;
import ax.dd.InterfaceC1965a;
import ax.ed.InterfaceC1999a;
import ax.gd.InterfaceC2138a;
import ax.jd.InterfaceC2349a;
import ax.ld.InterfaceC2505a;
import ax.md.InterfaceC2554a;
import ax.od.InterfaceC2744a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class c {
    private static Map<C1130v, String> a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(InterfaceC2554a.H, "MD2");
        a.put(InterfaceC2554a.I, "MD4");
        a.put(InterfaceC2554a.J, "MD5");
        a.put(InterfaceC2505a.i, "SHA-1");
        a.put(InterfaceC2349a.f, "SHA-224");
        a.put(InterfaceC2349a.c, "SHA-256");
        a.put(InterfaceC2349a.d, "SHA-384");
        a.put(InterfaceC2349a.e, "SHA-512");
        a.put(InterfaceC2349a.g, "SHA-512(224)");
        a.put(InterfaceC2349a.h, "SHA-512(256)");
        a.put(InterfaceC2744a.c, "RIPEMD-128");
        a.put(InterfaceC2744a.b, "RIPEMD-160");
        a.put(InterfaceC2744a.d, "RIPEMD-128");
        a.put(InterfaceC2138a.d, "RIPEMD-128");
        a.put(InterfaceC2138a.c, "RIPEMD-160");
        a.put(InterfaceC1438a.b, "GOST3411");
        a.put(InterfaceC1999a.g, "Tiger");
        a.put(InterfaceC2138a.e, "Whirlpool");
        a.put(InterfaceC2349a.i, "SHA3-224");
        a.put(InterfaceC2349a.j, "SHA3-256");
        a.put(InterfaceC2349a.k, "SHA3-384");
        a.put(InterfaceC2349a.l, "SHA3-512");
        a.put(InterfaceC2349a.m, "SHAKE128");
        a.put(InterfaceC2349a.n, "SHAKE256");
        a.put(InterfaceC1965a.b0, "SM3");
    }

    public static String a(C1130v c1130v) {
        String str = a.get(c1130v);
        return str != null ? str : c1130v.I();
    }
}
