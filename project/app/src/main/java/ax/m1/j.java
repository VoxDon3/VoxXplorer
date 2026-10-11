/*
 * Decompiled with CFR 0.152.
 */
package ax.m1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.h;
import ax.U0.g;
import ax.U0.k;
import ax.U0.z;
import ax.m1.c;
import ax.m1.e;
import ax.m1.i;
import ax.m1.s;
import ax.q7.t;
import ax.r7.A;
import java.util.HashMap;
import java.util.Map;

public final class j
implements e,
z {
    public static final ax.r7.z<Long> r;
    public static final ax.r7.z<Long> s;
    public static final ax.r7.z<Long> t;
    public static final ax.r7.z<Long> u;
    public static final ax.r7.z<Long> v;
    public static final ax.r7.z<Long> w;
    @SuppressLint(value={"NonFinalStaticField", "StaticFieldLeak"})
    private static j x;
    private final Context a;
    private final A<Integer, Long> b;
    private final e.a.a c;
    private final h d;
    private final boolean e;
    private final s f;
    private int g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private int n;
    private boolean o;
    private int p;
    private String q;

    static {
        Long l8 = 1700000L;
        Long l9 = 860000L;
        r = ax.r7.z.D(4300000L, 3200000L, 2400000L, l8, l9);
        Long l10 = 980000L;
        s = ax.r7.z.D(1500000L, l10, 750000L, 520000L, 290000L);
        Long l11 = 2000000L;
        Long l12 = 1300000L;
        Long l13 = 1000000L;
        t = ax.r7.z.D(l11, l12, l13, l9, 610000L);
        u = ax.r7.z.D(2500000L, l8, 1200000L, 970000L, 680000L);
        v = ax.r7.z.D(4700000L, 2800000L, 0x200B20L, l8, l10);
        w = ax.r7.z.D(2700000L, l11, 1600000L, l12, l13);
    }

    private j(Context object, Map<Integer, Long> map, int n8, h h8, boolean bl) {
        Context context = object == null ? null : object.getApplicationContext();
        this.a = context;
        this.b = A.c(map);
        this.c = new e.a.a();
        this.f = new s(n8);
        this.d = h8;
        this.e = bl;
        if (object != null) {
            object = ax.S0.z.e((Context)object);
            this.n = n8 = ((ax.S0.z)object).g();
            this.l = this.l(n8);
            ((ax.S0.z)object).k(new i(this), ax.S0.b.a());
            return;
        }
        this.n = 0;
        this.l = 1000000L;
    }

    public static /* synthetic */ void j(j j8, int n8) {
        j8.q(n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int[] k(String string) {
        int n8 = 4;
        string.getClass();
        int n9 = -1;
        switch (string.hashCode()) {
            case 2877: {
                if (!string.equals("ZW")) break;
                n9 = 1;
                break;
            }
            case 2867: {
                if (!string.equals("ZM")) break;
                n9 = 2;
                break;
            }
            case 2855: {
                if (!string.equals("ZA")) break;
                n9 = 3;
                break;
            }
            case 2843: {
                if (!string.equals("YT")) break;
                n9 = 4;
                break;
            }
            case 2828: {
                if (!string.equals("YE")) break;
                n9 = 5;
                break;
            }
            case 2803: {
                if (!string.equals("XK")) break;
                n9 = 6;
                break;
            }
            case 2780: {
                if (!string.equals("WS")) break;
                n9 = 7;
                break;
            }
            case 2767: {
                if (!string.equals("WF")) break;
                n9 = 8;
                break;
            }
            case 2751: {
                if (!string.equals("VU")) break;
                n9 = 9;
                break;
            }
            case 2744: {
                if (!string.equals("VN")) break;
                n9 = 10;
                break;
            }
            case 2739: {
                if (!string.equals("VI")) break;
                n9 = 11;
                break;
            }
            case 2737: {
                if (!string.equals("VG")) break;
                n9 = 12;
                break;
            }
            case 2735: {
                if (!string.equals("VE")) break;
                n9 = 13;
                break;
            }
            case 2733: {
                if (!string.equals("VC")) break;
                n9 = 14;
                break;
            }
            case 2731: {
                if (!string.equals("VA")) break;
                n9 = 15;
                break;
            }
            case 2725: {
                if (!string.equals("UZ")) break;
                n9 = 16;
                break;
            }
            case 2724: {
                if (!string.equals("UY")) break;
                n9 = 17;
                break;
            }
            case 2718: {
                if (!string.equals("US")) break;
                n9 = 18;
                break;
            }
            case 2706: {
                if (!string.equals("UG")) break;
                n9 = 19;
                break;
            }
            case 2700: {
                if (!string.equals("UA")) break;
                n9 = 20;
                break;
            }
            case 2694: {
                if (!string.equals("TZ")) break;
                n9 = 21;
                break;
            }
            case 2691: {
                if (!string.equals("TW")) break;
                n9 = 22;
                break;
            }
            case 2690: {
                if (!string.equals("TV")) break;
                n9 = 23;
                break;
            }
            case 2688: {
                if (!string.equals("TT")) break;
                n9 = 24;
                break;
            }
            case 2686: {
                if (!string.equals("TR")) break;
                n9 = 25;
                break;
            }
            case 2683: {
                if (!string.equals("TO")) break;
                n9 = 26;
                break;
            }
            case 2682: {
                if (!string.equals("TN")) break;
                n9 = 27;
                break;
            }
            case 2681: {
                if (!string.equals("TM")) break;
                n9 = 28;
                break;
            }
            case 2680: {
                if (!string.equals("TL")) break;
                n9 = 29;
                break;
            }
            case 2678: {
                if (!string.equals("TJ")) break;
                n9 = 30;
                break;
            }
            case 2676: {
                if (!string.equals("TH")) break;
                n9 = 31;
                break;
            }
            case 2675: {
                if (!string.equals("TG")) break;
                n9 = 32;
                break;
            }
            case 2672: {
                if (!string.equals("TD")) break;
                n9 = 33;
                break;
            }
            case 2671: {
                if (!string.equals("TC")) break;
                n9 = 34;
                break;
            }
            case 2663: {
                if (!string.equals("SZ")) break;
                n9 = 35;
                break;
            }
            case 2662: {
                if (!string.equals("SY")) break;
                n9 = 36;
                break;
            }
            case 2661: {
                if (!string.equals("SX")) break;
                n9 = 37;
                break;
            }
            case 2659: {
                if (!string.equals("SV")) break;
                n9 = 38;
                break;
            }
            case 2657: {
                if (!string.equals("ST")) break;
                n9 = 39;
                break;
            }
            case 2656: {
                if (!string.equals("SS")) break;
                n9 = 40;
                break;
            }
            case 2655: {
                if (!string.equals("SR")) break;
                n9 = 41;
                break;
            }
            case 2652: {
                if (!string.equals("SO")) break;
                n9 = 42;
                break;
            }
            case 2651: {
                if (!string.equals("SN")) break;
                n9 = 43;
                break;
            }
            case 2650: {
                if (!string.equals("SM")) break;
                n9 = 44;
                break;
            }
            case 2649: {
                if (!string.equals("SL")) break;
                n9 = 45;
                break;
            }
            case 2648: {
                if (!string.equals("SK")) break;
                n9 = 46;
                break;
            }
            case 2647: {
                if (!string.equals("SJ")) break;
                n9 = 47;
                break;
            }
            case 2646: {
                if (!string.equals("SI")) break;
                n9 = 48;
                break;
            }
            case 2645: {
                if (!string.equals("SH")) break;
                n9 = 49;
                break;
            }
            case 2644: {
                if (!string.equals("SG")) break;
                n9 = 50;
                break;
            }
            case 2642: {
                if (!string.equals("SE")) break;
                n9 = 51;
                break;
            }
            case 2641: {
                if (!string.equals("SD")) break;
                n9 = 52;
                break;
            }
            case 2640: {
                if (!string.equals("SC")) break;
                n9 = 53;
                break;
            }
            case 2639: {
                if (!string.equals("SB")) break;
                n9 = 54;
                break;
            }
            case 2638: {
                if (!string.equals("SA")) break;
                n9 = 55;
                break;
            }
            case 2629: {
                if (!string.equals("RW")) break;
                n9 = 56;
                break;
            }
            case 2627: {
                if (!string.equals("RU")) break;
                n9 = 57;
                break;
            }
            case 2625: {
                if (!string.equals("RS")) break;
                n9 = 58;
                break;
            }
            case 2621: {
                if (!string.equals("RO")) break;
                n9 = 59;
                break;
            }
            case 2611: {
                if (!string.equals("RE")) break;
                n9 = 60;
                break;
            }
            case 2576: {
                if (!string.equals("QA")) break;
                n9 = 61;
                break;
            }
            case 2569: {
                if (!string.equals("PY")) break;
                n9 = 62;
                break;
            }
            case 2567: {
                if (!string.equals("PW")) break;
                n9 = 63;
                break;
            }
            case 2564: {
                if (!string.equals("PT")) break;
                n9 = 64;
                break;
            }
            case 2563: {
                if (!string.equals("PS")) break;
                n9 = 65;
                break;
            }
            case 2562: {
                if (!string.equals("PR")) break;
                n9 = 66;
                break;
            }
            case 2557: {
                if (!string.equals("PM")) break;
                n9 = 67;
                break;
            }
            case 2556: {
                if (!string.equals("PL")) break;
                n9 = 68;
                break;
            }
            case 2555: {
                if (!string.equals("PK")) break;
                n9 = 69;
                break;
            }
            case 2552: {
                if (!string.equals("PH")) break;
                n9 = 70;
                break;
            }
            case 2551: {
                if (!string.equals("PG")) break;
                n9 = 71;
                break;
            }
            case 2550: {
                if (!string.equals("PF")) break;
                n9 = 72;
                break;
            }
            case 2549: {
                if (!string.equals("PE")) break;
                n9 = 73;
                break;
            }
            case 2545: {
                if (!string.equals("PA")) break;
                n9 = 74;
                break;
            }
            case 2526: {
                if (!string.equals("OM")) break;
                n9 = 75;
                break;
            }
            case 2508: {
                if (!string.equals("NZ")) break;
                n9 = 76;
                break;
            }
            case 2503: {
                if (!string.equals("NU")) break;
                n9 = 77;
                break;
            }
            case 2500: {
                if (!string.equals("NR")) break;
                n9 = 78;
                break;
            }
            case 2498: {
                if (!string.equals("NP")) break;
                n9 = 79;
                break;
            }
            case 2497: {
                if (!string.equals("NO")) break;
                n9 = 80;
                break;
            }
            case 2494: {
                if (!string.equals("NL")) break;
                n9 = 81;
                break;
            }
            case 2491: {
                if (!string.equals("NI")) break;
                n9 = 82;
                break;
            }
            case 2489: {
                if (!string.equals("NG")) break;
                n9 = 83;
                break;
            }
            case 2488: {
                if (!string.equals("NF")) break;
                n9 = 84;
                break;
            }
            case 2487: {
                if (!string.equals("NE")) break;
                n9 = 85;
                break;
            }
            case 2485: {
                if (!string.equals("NC")) break;
                n9 = 86;
                break;
            }
            case 2483: {
                if (!string.equals("NA")) break;
                n9 = 87;
                break;
            }
            case 2477: {
                if (!string.equals("MZ")) break;
                n9 = 88;
                break;
            }
            case 2476: {
                if (!string.equals("MY")) break;
                n9 = 89;
                break;
            }
            case 2475: {
                if (!string.equals("MX")) break;
                n9 = 90;
                break;
            }
            case 2474: {
                if (!string.equals("MW")) break;
                n9 = 91;
                break;
            }
            case 2473: {
                if (!string.equals("MV")) break;
                n9 = 92;
                break;
            }
            case 2472: {
                if (!string.equals("MU")) break;
                n9 = 93;
                break;
            }
            case 2471: {
                if (!string.equals("MT")) break;
                n9 = 94;
                break;
            }
            case 2470: {
                if (!string.equals("MS")) break;
                n9 = 95;
                break;
            }
            case 2469: {
                if (!string.equals("MR")) break;
                n9 = 96;
                break;
            }
            case 2468: {
                if (!string.equals("MQ")) break;
                n9 = 97;
                break;
            }
            case 2467: {
                if (!string.equals("MP")) break;
                n9 = 98;
                break;
            }
            case 2466: {
                if (!string.equals("MO")) break;
                n9 = 99;
                break;
            }
            case 2465: {
                if (!string.equals("MN")) break;
                n9 = 100;
                break;
            }
            case 2464: {
                if (!string.equals("MM")) break;
                n9 = 101;
                break;
            }
            case 2463: {
                if (!string.equals("ML")) break;
                n9 = 102;
                break;
            }
            case 2462: {
                if (!string.equals("MK")) break;
                n9 = 103;
                break;
            }
            case 2459: {
                if (!string.equals("MH")) break;
                n9 = 104;
                break;
            }
            case 2458: {
                if (!string.equals("MG")) break;
                n9 = 105;
                break;
            }
            case 2457: {
                if (!string.equals("MF")) break;
                n9 = 106;
                break;
            }
            case 2456: {
                if (!string.equals("ME")) break;
                n9 = 107;
                break;
            }
            case 2455: {
                if (!string.equals("MD")) break;
                n9 = 108;
                break;
            }
            case 2454: {
                if (!string.equals("MC")) break;
                n9 = 109;
                break;
            }
            case 2452: {
                if (!string.equals("MA")) break;
                n9 = 110;
                break;
            }
            case 2445: {
                if (!string.equals("LY")) break;
                n9 = 111;
                break;
            }
            case 2442: {
                if (!string.equals("LV")) break;
                n9 = 112;
                break;
            }
            case 2441: {
                if (!string.equals("LU")) break;
                n9 = 113;
                break;
            }
            case 2440: {
                if (!string.equals("LT")) break;
                n9 = 114;
                break;
            }
            case 2439: {
                if (!string.equals("LS")) break;
                n9 = 115;
                break;
            }
            case 2438: {
                if (!string.equals("LR")) break;
                n9 = 116;
                break;
            }
            case 2431: {
                if (!string.equals("LK")) break;
                n9 = 117;
                break;
            }
            case 2429: {
                if (!string.equals("LI")) break;
                n9 = 118;
                break;
            }
            case 2423: {
                if (!string.equals("LC")) break;
                n9 = 119;
                break;
            }
            case 2422: {
                if (!string.equals("LB")) break;
                n9 = 120;
                break;
            }
            case 2421: {
                if (!string.equals("LA")) break;
                n9 = 121;
                break;
            }
            case 2415: {
                if (!string.equals("KZ")) break;
                n9 = 122;
                break;
            }
            case 2414: {
                if (!string.equals("KY")) break;
                n9 = 123;
                break;
            }
            case 2412: {
                if (!string.equals("KW")) break;
                n9 = 124;
                break;
            }
            case 2407: {
                if (!string.equals("KR")) break;
                n9 = 125;
                break;
            }
            case 2403: {
                if (!string.equals("KN")) break;
                n9 = 126;
                break;
            }
            case 2402: {
                if (!string.equals("KM")) break;
                n9 = 127;
                break;
            }
            case 2398: {
                if (!string.equals("KI")) break;
                n9 = 128;
                break;
            }
            case 2397: {
                if (!string.equals("KH")) break;
                n9 = 129;
                break;
            }
            case 2396: {
                if (!string.equals("KG")) break;
                n9 = 130;
                break;
            }
            case 2394: {
                if (!string.equals("KE")) break;
                n9 = 131;
                break;
            }
            case 2374: {
                if (!string.equals("JP")) break;
                n9 = 132;
                break;
            }
            case 2373: {
                if (!string.equals("JO")) break;
                n9 = 133;
                break;
            }
            case 2371: {
                if (!string.equals("JM")) break;
                n9 = 134;
                break;
            }
            case 2363: {
                if (!string.equals("JE")) break;
                n9 = 135;
                break;
            }
            case 2347: {
                if (!string.equals("IT")) break;
                n9 = 136;
                break;
            }
            case 2346: {
                if (!string.equals("IS")) break;
                n9 = 137;
                break;
            }
            case 2345: {
                if (!string.equals("IR")) break;
                n9 = 138;
                break;
            }
            case 2344: {
                if (!string.equals("IQ")) break;
                n9 = 139;
                break;
            }
            case 2342: {
                if (!string.equals("IO")) break;
                n9 = 140;
                break;
            }
            case 2341: {
                if (!string.equals("IN")) break;
                n9 = 141;
                break;
            }
            case 2340: {
                if (!string.equals("IM")) break;
                n9 = 142;
                break;
            }
            case 2339: {
                if (!string.equals("IL")) break;
                n9 = 143;
                break;
            }
            case 2332: {
                if (!string.equals("IE")) break;
                n9 = 144;
                break;
            }
            case 2331: {
                if (!string.equals("ID")) break;
                n9 = 145;
                break;
            }
            case 2317: {
                if (!string.equals("HU")) break;
                n9 = 146;
                break;
            }
            case 2316: {
                if (!string.equals("HT")) break;
                n9 = 147;
                break;
            }
            case 2314: {
                if (!string.equals("HR")) break;
                n9 = 148;
                break;
            }
            case 2307: {
                if (!string.equals("HK")) break;
                n9 = 149;
                break;
            }
            case 2290: {
                if (!string.equals("GY")) break;
                n9 = 150;
                break;
            }
            case 2288: {
                if (!string.equals("GW")) break;
                n9 = 151;
                break;
            }
            case 2286: {
                if (!string.equals("GU")) break;
                n9 = 152;
                break;
            }
            case 2285: {
                if (!string.equals("GT")) break;
                n9 = 153;
                break;
            }
            case 2283: {
                if (!string.equals("GR")) break;
                n9 = 154;
                break;
            }
            case 2282: {
                if (!string.equals("GQ")) break;
                n9 = 155;
                break;
            }
            case 2281: {
                if (!string.equals("GP")) break;
                n9 = 156;
                break;
            }
            case 2279: {
                if (!string.equals("GN")) break;
                n9 = 157;
                break;
            }
            case 2278: {
                if (!string.equals("GM")) break;
                n9 = 158;
                break;
            }
            case 2277: {
                if (!string.equals("GL")) break;
                n9 = 159;
                break;
            }
            case 2274: {
                if (!string.equals("GI")) break;
                n9 = 160;
                break;
            }
            case 2273: {
                if (!string.equals("GH")) break;
                n9 = 161;
                break;
            }
            case 2272: {
                if (!string.equals("GG")) break;
                n9 = 162;
                break;
            }
            case 2271: {
                if (!string.equals("GF")) break;
                n9 = 163;
                break;
            }
            case 2270: {
                if (!string.equals("GE")) break;
                n9 = 164;
                break;
            }
            case 2269: {
                if (!string.equals("GD")) break;
                n9 = 165;
                break;
            }
            case 2267: {
                if (!string.equals("GB")) break;
                n9 = 166;
                break;
            }
            case 2266: {
                if (!string.equals("GA")) break;
                n9 = 167;
                break;
            }
            case 2252: {
                if (!string.equals("FR")) break;
                n9 = 168;
                break;
            }
            case 2249: {
                if (!string.equals("FO")) break;
                n9 = 169;
                break;
            }
            case 2247: {
                if (!string.equals("FM")) break;
                n9 = 170;
                break;
            }
            case 2245: {
                if (!string.equals("FK")) break;
                n9 = 171;
                break;
            }
            case 2244: {
                if (!string.equals("FJ")) break;
                n9 = 172;
                break;
            }
            case 2243: {
                if (!string.equals("FI")) break;
                n9 = 173;
                break;
            }
            case 2223: {
                if (!string.equals("ET")) break;
                n9 = 174;
                break;
            }
            case 2222: {
                if (!string.equals("ES")) break;
                n9 = 175;
                break;
            }
            case 2221: {
                if (!string.equals("ER")) break;
                n9 = 176;
                break;
            }
            case 2210: {
                if (!string.equals("EG")) break;
                n9 = 177;
                break;
            }
            case 2208: {
                if (!string.equals("EE")) break;
                n9 = 178;
                break;
            }
            case 2206: {
                if (!string.equals("EC")) break;
                n9 = 179;
                break;
            }
            case 2198: {
                if (!string.equals("DZ")) break;
                n9 = 180;
                break;
            }
            case 2187: {
                if (!string.equals("DO")) break;
                n9 = 181;
                break;
            }
            case 2185: {
                if (!string.equals("DM")) break;
                n9 = 182;
                break;
            }
            case 2183: {
                if (!string.equals("DK")) break;
                n9 = 183;
                break;
            }
            case 2182: {
                if (!string.equals("DJ")) break;
                n9 = 184;
                break;
            }
            case 2177: {
                if (!string.equals("DE")) break;
                n9 = 185;
                break;
            }
            case 2167: {
                if (!string.equals("CZ")) break;
                n9 = 186;
                break;
            }
            case 2166: {
                if (!string.equals("CY")) break;
                n9 = 187;
                break;
            }
            case 2165: {
                if (!string.equals("CX")) break;
                n9 = 188;
                break;
            }
            case 2164: {
                if (!string.equals("CW")) break;
                n9 = 189;
                break;
            }
            case 2163: {
                if (!string.equals("CV")) break;
                n9 = 190;
                break;
            }
            case 2162: {
                if (!string.equals("CU")) break;
                n9 = 191;
                break;
            }
            case 2159: {
                if (!string.equals("CR")) break;
                n9 = 192;
                break;
            }
            case 2156: {
                if (!string.equals("CO")) break;
                n9 = 193;
                break;
            }
            case 2155: {
                if (!string.equals("CN")) break;
                n9 = 194;
                break;
            }
            case 2154: {
                if (!string.equals("CM")) break;
                n9 = 195;
                break;
            }
            case 2153: {
                if (!string.equals("CL")) break;
                n9 = 196;
                break;
            }
            case 2152: {
                if (!string.equals("CK")) break;
                n9 = 197;
                break;
            }
            case 2150: {
                if (!string.equals("CI")) break;
                n9 = 198;
                break;
            }
            case 2149: {
                if (!string.equals("CH")) break;
                n9 = 199;
                break;
            }
            case 2148: {
                if (!string.equals("CG")) break;
                n9 = 200;
                break;
            }
            case 2147: {
                if (!string.equals("CF")) break;
                n9 = 201;
                break;
            }
            case 2145: {
                if (!string.equals("CD")) break;
                n9 = 202;
                break;
            }
            case 2142: {
                if (!string.equals("CA")) break;
                n9 = 203;
                break;
            }
            case 2136: {
                if (!string.equals("BZ")) break;
                n9 = 204;
                break;
            }
            case 2135: {
                if (!string.equals("BY")) break;
                n9 = 205;
                break;
            }
            case 2133: {
                if (!string.equals("BW")) break;
                n9 = 206;
                break;
            }
            case 2130: {
                if (!string.equals("BT")) break;
                n9 = 207;
                break;
            }
            case 2129: {
                if (!string.equals("BS")) break;
                n9 = 208;
                break;
            }
            case 2128: {
                if (!string.equals("BR")) break;
                n9 = 209;
                break;
            }
            case 2127: {
                if (!string.equals("BQ")) break;
                n9 = 210;
                break;
            }
            case 2125: {
                if (!string.equals("BO")) break;
                n9 = 211;
                break;
            }
            case 2124: {
                if (!string.equals("BN")) break;
                n9 = 212;
                break;
            }
            case 2123: {
                if (!string.equals("BM")) break;
                n9 = 213;
                break;
            }
            case 2122: {
                if (!string.equals("BL")) break;
                n9 = 214;
                break;
            }
            case 2120: {
                if (!string.equals("BJ")) break;
                n9 = 215;
                break;
            }
            case 2119: {
                if (!string.equals("BI")) break;
                n9 = 216;
                break;
            }
            case 2118: {
                if (!string.equals("BH")) break;
                n9 = 217;
                break;
            }
            case 2117: {
                if (!string.equals("BG")) break;
                n9 = 218;
                break;
            }
            case 2116: {
                if (!string.equals("BF")) break;
                n9 = 219;
                break;
            }
            case 2115: {
                if (!string.equals("BE")) break;
                n9 = 220;
                break;
            }
            case 2114: {
                if (!string.equals("BD")) break;
                n9 = 221;
                break;
            }
            case 2112: {
                if (!string.equals("BB")) break;
                n9 = 222;
                break;
            }
            case 2111: {
                if (!string.equals("BA")) break;
                n9 = 223;
                break;
            }
            case 2105: {
                if (!string.equals("AZ")) break;
                n9 = 224;
                break;
            }
            case 2103: {
                if (!string.equals("AX")) break;
                n9 = 225;
                break;
            }
            case 2102: {
                if (!string.equals("AW")) break;
                n9 = 226;
                break;
            }
            case 2100: {
                if (!string.equals("AU")) break;
                n9 = 227;
                break;
            }
            case 2099: {
                if (!string.equals("AT")) break;
                n9 = 228;
                break;
            }
            case 2098: {
                if (!string.equals("AS")) break;
                n9 = 229;
                break;
            }
            case 2097: {
                if (!string.equals("AR")) break;
                n9 = 230;
                break;
            }
            case 2096: {
                if (!string.equals("AQ")) break;
                n9 = 231;
                break;
            }
            case 2094: {
                if (!string.equals("AO")) break;
                n9 = 232;
                break;
            }
            case 2092: {
                if (!string.equals("AM")) break;
                n9 = 233;
                break;
            }
            case 2091: {
                if (!string.equals("AL")) break;
                n9 = 234;
                break;
            }
            case 2088: {
                if (!string.equals("AI")) break;
                n9 = 235;
                break;
            }
            case 2086: {
                if (!string.equals("AG")) break;
                n9 = 236;
                break;
            }
            case 2085: {
                if (!string.equals("AF")) break;
                n9 = 237;
                break;
            }
            case 2084: {
                if (!string.equals("AE")) break;
                n9 = 238;
                break;
            }
            case 2083: {
                if (!string.equals("AD")) break;
                n9 = 239;
                break;
            }
        }
        switch (n9) {
            default: {
                n8 = -1;
                break;
            }
            case 1: {
                n8 = 238;
                break;
            }
            case 2: {
                n8 = 237;
                break;
            }
            case 3: {
                n8 = 236;
                break;
            }
            case 4: {
                n8 = 235;
                break;
            }
            case 5: {
                n8 = 234;
                break;
            }
            case 6: {
                n8 = 233;
                break;
            }
            case 7: {
                n8 = 232;
                break;
            }
            case 8: {
                n8 = 231;
                break;
            }
            case 9: {
                n8 = 230;
                break;
            }
            case 10: {
                n8 = 229;
                break;
            }
            case 11: {
                n8 = 228;
                break;
            }
            case 12: {
                n8 = 227;
                break;
            }
            case 13: {
                n8 = 226;
                break;
            }
            case 14: {
                n8 = 225;
                break;
            }
            case 15: {
                n8 = 224;
                break;
            }
            case 16: {
                n8 = 223;
                break;
            }
            case 17: {
                n8 = 222;
                break;
            }
            case 18: {
                n8 = 221;
                break;
            }
            case 19: {
                n8 = 220;
                break;
            }
            case 20: {
                n8 = 219;
                break;
            }
            case 21: {
                n8 = 218;
                break;
            }
            case 22: {
                n8 = 217;
                break;
            }
            case 23: {
                n8 = 216;
                break;
            }
            case 24: {
                n8 = 215;
                break;
            }
            case 25: {
                n8 = 214;
                break;
            }
            case 26: {
                n8 = 213;
                break;
            }
            case 27: {
                n8 = 212;
                break;
            }
            case 28: {
                n8 = 211;
                break;
            }
            case 29: {
                n8 = 210;
                break;
            }
            case 30: {
                n8 = 209;
                break;
            }
            case 31: {
                n8 = 208;
                break;
            }
            case 32: {
                n8 = 207;
                break;
            }
            case 33: {
                n8 = 206;
                break;
            }
            case 34: {
                n8 = 205;
                break;
            }
            case 35: {
                n8 = 204;
                break;
            }
            case 36: {
                n8 = 203;
                break;
            }
            case 37: {
                n8 = 202;
                break;
            }
            case 38: {
                n8 = 201;
                break;
            }
            case 39: {
                n8 = 200;
                break;
            }
            case 40: {
                n8 = 199;
                break;
            }
            case 41: {
                n8 = 198;
                break;
            }
            case 42: {
                n8 = 197;
                break;
            }
            case 43: {
                n8 = 196;
                break;
            }
            case 44: {
                n8 = 195;
                break;
            }
            case 45: {
                n8 = 194;
                break;
            }
            case 46: {
                n8 = 193;
                break;
            }
            case 47: {
                n8 = 192;
                break;
            }
            case 48: {
                n8 = 191;
                break;
            }
            case 49: {
                n8 = 190;
                break;
            }
            case 50: {
                n8 = 189;
                break;
            }
            case 51: {
                n8 = 188;
                break;
            }
            case 52: {
                n8 = 187;
                break;
            }
            case 53: {
                n8 = 186;
                break;
            }
            case 54: {
                n8 = 185;
                break;
            }
            case 55: {
                n8 = 184;
                break;
            }
            case 56: {
                n8 = 183;
                break;
            }
            case 57: {
                n8 = 182;
                break;
            }
            case 58: {
                n8 = 181;
                break;
            }
            case 59: {
                n8 = 180;
                break;
            }
            case 60: {
                n8 = 179;
                break;
            }
            case 61: {
                n8 = 178;
                break;
            }
            case 62: {
                n8 = 177;
                break;
            }
            case 63: {
                n8 = 176;
                break;
            }
            case 64: {
                n8 = 175;
                break;
            }
            case 65: {
                n8 = 174;
                break;
            }
            case 66: {
                n8 = 173;
                break;
            }
            case 67: {
                n8 = 172;
                break;
            }
            case 68: {
                n8 = 171;
                break;
            }
            case 69: {
                n8 = 170;
                break;
            }
            case 70: {
                n8 = 169;
                break;
            }
            case 71: {
                n8 = 168;
                break;
            }
            case 72: {
                n8 = 167;
                break;
            }
            case 73: {
                n8 = 166;
                break;
            }
            case 74: {
                n8 = 165;
                break;
            }
            case 75: {
                n8 = 164;
                break;
            }
            case 76: {
                n8 = 163;
                break;
            }
            case 77: {
                n8 = 162;
                break;
            }
            case 78: {
                n8 = 161;
                break;
            }
            case 79: {
                n8 = 160;
                break;
            }
            case 80: {
                n8 = 159;
                break;
            }
            case 81: {
                n8 = 158;
                break;
            }
            case 82: {
                n8 = 157;
                break;
            }
            case 83: {
                n8 = 156;
                break;
            }
            case 84: {
                n8 = 155;
                break;
            }
            case 85: {
                n8 = 154;
                break;
            }
            case 86: {
                n8 = 153;
                break;
            }
            case 87: {
                n8 = 152;
                break;
            }
            case 88: {
                n8 = 151;
                break;
            }
            case 89: {
                n8 = 150;
                break;
            }
            case 90: {
                n8 = 149;
                break;
            }
            case 91: {
                n8 = 148;
                break;
            }
            case 92: {
                n8 = 147;
                break;
            }
            case 93: {
                n8 = 146;
                break;
            }
            case 94: {
                n8 = 145;
                break;
            }
            case 95: {
                n8 = 144;
                break;
            }
            case 96: {
                n8 = 143;
                break;
            }
            case 97: {
                n8 = 142;
                break;
            }
            case 98: {
                n8 = 141;
                break;
            }
            case 99: {
                n8 = 140;
                break;
            }
            case 100: {
                n8 = 139;
                break;
            }
            case 101: {
                n8 = 138;
                break;
            }
            case 102: {
                n8 = 137;
                break;
            }
            case 103: {
                n8 = 136;
                break;
            }
            case 104: {
                n8 = 135;
                break;
            }
            case 105: {
                n8 = 134;
                break;
            }
            case 106: {
                n8 = 133;
                break;
            }
            case 107: {
                n8 = 132;
                break;
            }
            case 108: {
                n8 = 131;
                break;
            }
            case 109: {
                n8 = 130;
                break;
            }
            case 110: {
                n8 = 129;
                break;
            }
            case 111: {
                n8 = 128;
                break;
            }
            case 112: {
                n8 = 127;
                break;
            }
            case 113: {
                n8 = 126;
                break;
            }
            case 114: {
                n8 = 125;
                break;
            }
            case 115: {
                n8 = 124;
                break;
            }
            case 116: {
                n8 = 123;
                break;
            }
            case 117: {
                n8 = 122;
                break;
            }
            case 118: {
                n8 = 121;
                break;
            }
            case 119: {
                n8 = 120;
                break;
            }
            case 120: {
                n8 = 119;
                break;
            }
            case 121: {
                n8 = 118;
                break;
            }
            case 122: {
                n8 = 117;
                break;
            }
            case 123: {
                n8 = 116;
                break;
            }
            case 124: {
                n8 = 115;
                break;
            }
            case 125: {
                n8 = 114;
                break;
            }
            case 126: {
                n8 = 113;
                break;
            }
            case 127: {
                n8 = 112;
                break;
            }
            case 128: {
                n8 = 111;
                break;
            }
            case 129: {
                n8 = 110;
                break;
            }
            case 130: {
                n8 = 109;
                break;
            }
            case 131: {
                n8 = 108;
                break;
            }
            case 132: {
                n8 = 107;
                break;
            }
            case 133: {
                n8 = 106;
                break;
            }
            case 134: {
                n8 = 105;
                break;
            }
            case 135: {
                n8 = 104;
                break;
            }
            case 136: {
                n8 = 103;
                break;
            }
            case 137: {
                n8 = 102;
                break;
            }
            case 138: {
                n8 = 101;
                break;
            }
            case 139: {
                n8 = 100;
                break;
            }
            case 140: {
                n8 = 99;
                break;
            }
            case 141: {
                n8 = 98;
                break;
            }
            case 142: {
                n8 = 97;
                break;
            }
            case 143: {
                n8 = 96;
                break;
            }
            case 144: {
                n8 = 95;
                break;
            }
            case 145: {
                n8 = 94;
                break;
            }
            case 146: {
                n8 = 93;
                break;
            }
            case 147: {
                n8 = 92;
                break;
            }
            case 148: {
                n8 = 91;
                break;
            }
            case 149: {
                n8 = 90;
                break;
            }
            case 150: {
                n8 = 89;
                break;
            }
            case 151: {
                n8 = 88;
                break;
            }
            case 152: {
                n8 = 87;
                break;
            }
            case 153: {
                n8 = 86;
                break;
            }
            case 154: {
                n8 = 85;
                break;
            }
            case 155: {
                n8 = 84;
                break;
            }
            case 156: {
                n8 = 83;
                break;
            }
            case 157: {
                n8 = 82;
                break;
            }
            case 158: {
                n8 = 81;
                break;
            }
            case 159: {
                n8 = 80;
                break;
            }
            case 160: {
                n8 = 79;
                break;
            }
            case 161: {
                n8 = 78;
                break;
            }
            case 162: {
                n8 = 77;
                break;
            }
            case 163: {
                n8 = 76;
                break;
            }
            case 164: {
                n8 = 75;
                break;
            }
            case 165: {
                n8 = 74;
                break;
            }
            case 166: {
                n8 = 73;
                break;
            }
            case 167: {
                n8 = 72;
                break;
            }
            case 168: {
                n8 = 71;
                break;
            }
            case 169: {
                n8 = 70;
                break;
            }
            case 170: {
                n8 = 69;
                break;
            }
            case 171: {
                n8 = 68;
                break;
            }
            case 172: {
                n8 = 67;
                break;
            }
            case 173: {
                n8 = 66;
                break;
            }
            case 174: {
                n8 = 65;
                break;
            }
            case 175: {
                n8 = 64;
                break;
            }
            case 176: {
                n8 = 63;
                break;
            }
            case 177: {
                n8 = 62;
                break;
            }
            case 178: {
                n8 = 61;
                break;
            }
            case 179: {
                n8 = 60;
                break;
            }
            case 180: {
                n8 = 59;
                break;
            }
            case 181: {
                n8 = 58;
                break;
            }
            case 182: {
                n8 = 57;
                break;
            }
            case 183: {
                n8 = 56;
                break;
            }
            case 184: {
                n8 = 55;
                break;
            }
            case 185: {
                n8 = 54;
                break;
            }
            case 186: {
                n8 = 53;
                break;
            }
            case 187: {
                n8 = 52;
                break;
            }
            case 188: {
                n8 = 51;
                break;
            }
            case 189: {
                n8 = 50;
                break;
            }
            case 190: {
                n8 = 49;
                break;
            }
            case 191: {
                n8 = 48;
                break;
            }
            case 192: {
                n8 = 47;
                break;
            }
            case 193: {
                n8 = 46;
                break;
            }
            case 194: {
                n8 = 45;
                break;
            }
            case 195: {
                n8 = 44;
                break;
            }
            case 196: {
                n8 = 43;
                break;
            }
            case 197: {
                n8 = 42;
                break;
            }
            case 198: {
                n8 = 41;
                break;
            }
            case 199: {
                n8 = 40;
                break;
            }
            case 200: {
                n8 = 39;
                break;
            }
            case 201: {
                n8 = 38;
                break;
            }
            case 202: {
                n8 = 37;
                break;
            }
            case 203: {
                n8 = 36;
                break;
            }
            case 204: {
                n8 = 35;
                break;
            }
            case 205: {
                n8 = 34;
                break;
            }
            case 206: {
                n8 = 33;
                break;
            }
            case 207: {
                n8 = 32;
                break;
            }
            case 208: {
                n8 = 31;
                break;
            }
            case 209: {
                n8 = 30;
                break;
            }
            case 210: {
                n8 = 29;
                break;
            }
            case 211: {
                n8 = 28;
                break;
            }
            case 212: {
                n8 = 27;
                break;
            }
            case 213: {
                n8 = 26;
                break;
            }
            case 214: {
                n8 = 25;
                break;
            }
            case 215: {
                n8 = 24;
                break;
            }
            case 216: {
                n8 = 23;
                break;
            }
            case 217: {
                n8 = 22;
                break;
            }
            case 218: {
                n8 = 21;
                break;
            }
            case 219: {
                n8 = 20;
                break;
            }
            case 220: {
                n8 = 19;
                break;
            }
            case 221: {
                n8 = 18;
                break;
            }
            case 222: {
                n8 = 17;
                break;
            }
            case 223: {
                n8 = 16;
                break;
            }
            case 224: {
                n8 = 15;
                break;
            }
            case 225: {
                n8 = 14;
                break;
            }
            case 226: {
                n8 = 13;
                break;
            }
            case 227: {
                n8 = 12;
                break;
            }
            case 228: {
                n8 = 11;
                break;
            }
            case 229: {
                n8 = 10;
                break;
            }
            case 230: {
                n8 = 9;
                break;
            }
            case 231: {
                n8 = 8;
                break;
            }
            case 232: {
                n8 = 7;
                break;
            }
            case 233: {
                n8 = 6;
                break;
            }
            case 234: {
                n8 = 5;
                break;
            }
            case 236: {
                n8 = 3;
                break;
            }
            case 237: {
                n8 = 2;
                break;
            }
            case 238: {
                n8 = 1;
                break;
            }
            case 239: {
                n8 = 0;
                break;
            }
            case 235: 
        }
        switch (n8) {
            default: {
                return new int[]{2, 2, 2, 2, 2, 2};
            }
            case 237: {
                return new int[]{4, 4, 4, 3, 2, 2};
            }
            case 236: {
                return new int[]{2, 4, 2, 1, 1, 2};
            }
            case 233: {
                return new int[]{1, 2, 1, 1, 2, 2};
            }
            case 229: {
                return new int[]{0, 0, 1, 2, 2, 2};
            }
            case 228: {
                return new int[]{0, 2, 1, 2, 2, 2};
            }
            case 227: {
                return new int[]{2, 2, 1, 1, 2, 4};
            }
            case 223: {
                return new int[]{1, 2, 3, 4, 3, 2};
            }
            case 222: {
                return new int[]{2, 1, 1, 2, 1, 2};
            }
            case 221: {
                return new int[]{2, 2, 4, 1, 3, 1};
            }
            case 220: {
                return new int[]{3, 3, 2, 3, 4, 2};
            }
            case 218: {
                return new int[]{3, 4, 2, 1, 3, 2};
            }
            case 217: {
                return new int[]{0, 0, 0, 0, 0, 0};
            }
            case 215: {
                return new int[]{2, 4, 1, 0, 2, 2};
            }
            case 213: {
                return new int[]{3, 2, 4, 3, 2, 2};
            }
            case 212: {
                return new int[]{3, 1, 1, 1, 2, 2};
            }
            case 207: {
                return new int[]{3, 4, 1, 0, 2, 2};
            }
            case 205: {
                return new int[]{3, 2, 1, 2, 2, 2};
            }
            case 201: {
                return new int[]{2, 3, 2, 1, 2, 2};
            }
            case 200: {
                return new int[]{2, 2, 1, 2, 2, 2};
            }
            case 198: {
                return new int[]{2, 4, 4, 1, 2, 2};
            }
            case 197: {
                return new int[]{2, 2, 3, 4, 4, 2};
            }
            case 196: {
                return new int[]{4, 4, 3, 2, 2, 2};
            }
            case 193: {
                return new int[]{0, 1, 1, 1, 2, 2};
            }
            case 189: {
                return new int[]{2, 3, 3, 3, 1, 1};
            }
            case 185: 
            case 238: {
                return new int[]{4, 2, 4, 3, 2, 2};
            }
            case 184: {
                return new int[]{3, 1, 1, 2, 2, 0};
            }
            case 183: {
                return new int[]{3, 3, 2, 0, 2, 2};
            }
            case 182: {
                return new int[]{1, 0, 0, 1, 3, 3};
            }
            case 181: {
                return new int[]{1, 0, 0, 1, 2, 2};
            }
            case 180: {
                return new int[]{0, 0, 1, 1, 3, 2};
            }
            case 179: {
                return new int[]{0, 3, 2, 3, 1, 2};
            }
            case 178: {
                return new int[]{1, 4, 4, 4, 4, 2};
            }
            case 176: {
                return new int[]{2, 2, 4, 1, 2, 2};
            }
            case 174: {
                return new int[]{3, 4, 1, 3, 2, 2};
            }
            case 173: {
                return new int[]{2, 0, 2, 1, 2, 0};
            }
            case 171: {
                return new int[]{1, 0, 2, 2, 4, 4};
            }
            case 170: {
                return new int[]{3, 3, 3, 3, 2, 2};
            }
            case 169: {
                return new int[]{2, 1, 2, 3, 2, 1};
            }
            case 167: {
                return new int[]{2, 2, 3, 1, 2, 2};
            }
            case 166: {
                return new int[]{1, 2, 4, 4, 3, 2};
            }
            case 164: {
                return new int[]{2, 3, 1, 2, 4, 2};
            }
            case 163: {
                return new int[]{0, 0, 1, 2, 4, 2};
            }
            case 160: {
                return new int[]{2, 2, 4, 3, 2, 2};
            }
            case 159: {
                return new int[]{0, 0, 3, 0, 0, 2};
            }
            case 158: {
                return new int[]{2, 1, 4, 3, 0, 4};
            }
            case 156: {
                return new int[]{3, 4, 2, 1, 2, 2};
            }
            case 153: 
            case 235: {
                return new int[]{2, 3, 3, 4, 2, 2};
            }
            case 152: {
                return new int[]{3, 4, 3, 2, 2, 2};
            }
            case 151: 
            case 232: {
                return new int[]{3, 1, 2, 2, 2, 2};
            }
            case 150: {
                return new int[]{1, 0, 4, 1, 1, 0};
            }
            case 149: {
                return new int[]{2, 4, 4, 4, 3, 2};
            }
            case 148: {
                return new int[]{3, 2, 2, 1, 2, 2};
            }
            case 147: {
                return new int[]{3, 2, 1, 3, 4, 2};
            }
            case 146: {
                return new int[]{3, 1, 0, 2, 2, 2};
            }
            case 142: {
                return new int[]{2, 1, 2, 3, 2, 2};
            }
            case 140: {
                return new int[]{0, 2, 4, 4, 3, 1};
            }
            case 139: {
                return new int[]{2, 0, 2, 2, 2, 2};
            }
            case 136: {
                return new int[]{1, 0, 0, 1, 3, 2};
            }
            case 135: 
            case 211: 
            case 216: 
            case 231: {
                return new int[]{4, 2, 2, 4, 2, 2};
            }
            case 133: {
                return new int[]{1, 2, 2, 3, 2, 2};
            }
            case 132: {
                return new int[]{2, 0, 0, 1, 3, 2};
            }
            case 131: {
                return new int[]{1, 0, 0, 0, 2, 2};
            }
            case 129: {
                return new int[]{3, 3, 1, 1, 2, 2};
            }
            case 126: {
                return new int[]{4, 0, 3, 2, 1, 3};
            }
            case 125: {
                return new int[]{0, 1, 0, 1, 0, 2};
            }
            case 124: 
            case 168: {
                return new int[]{4, 3, 3, 3, 2, 2};
            }
            case 122: 
            case 138: {
                return new int[]{3, 2, 3, 3, 4, 2};
            }
            case 120: {
                return new int[]{2, 2, 1, 1, 2, 2};
            }
            case 119: {
                return new int[]{3, 1, 1, 2, 2, 2};
            }
            case 118: {
                return new int[]{1, 2, 1, 3, 2, 2};
            }
            case 117: {
                return new int[]{2, 1, 2, 2, 3, 2};
            }
            case 114: {
                return new int[]{0, 2, 2, 4, 4, 4};
            }
            case 112: 
            case 230: {
                return new int[]{4, 3, 3, 2, 2, 2};
            }
            case 110: {
                return new int[]{1, 0, 4, 2, 2, 2};
            }
            case 109: {
                return new int[]{2, 1, 1, 2, 2, 2};
            }
            case 108: {
                return new int[]{3, 2, 1, 1, 1, 2};
            }
            case 107: {
                return new int[]{0, 3, 2, 3, 4, 2};
            }
            case 105: {
                return new int[]{2, 4, 3, 1, 2, 2};
            }
            case 103: {
                return new int[]{0, 1, 1, 2, 1, 2};
            }
            case 101: {
                return new int[]{4, 2, 3, 3, 4, 3};
            }
            case 100: {
                return new int[]{3, 2, 3, 2, 2, 2};
            }
            case 99: {
                return new int[]{3, 2, 2, 0, 2, 2};
            }
            case 98: {
                return new int[]{1, 1, 3, 2, 2, 3};
            }
            case 96: {
                return new int[]{1, 2, 2, 3, 4, 2};
            }
            case 95: {
                return new int[]{1, 1, 1, 1, 1, 2};
            }
            case 94: {
                return new int[]{3, 1, 3, 3, 2, 4};
            }
            case 91: 
            case 115: {
                return new int[]{1, 0, 0, 0, 0, 2};
            }
            case 90: {
                return new int[]{0, 1, 0, 1, 1, 0};
            }
            case 89: {
                return new int[]{3, 1, 1, 3, 2, 2};
            }
            case 88: {
                return new int[]{4, 4, 1, 2, 2, 2};
            }
            case 87: {
                return new int[]{2, 2, 4, 3, 3, 2};
            }
            case 86: {
                return new int[]{2, 1, 2, 1, 2, 2};
            }
            case 85: {
                return new int[]{1, 0, 0, 0, 1, 2};
            }
            case 83: {
                return new int[]{2, 1, 1, 3, 2, 2};
            }
            case 82: {
                return new int[]{3, 4, 4, 2, 2, 2};
            }
            case 81: 
            case 199: {
                return new int[]{4, 3, 2, 4, 2, 2};
            }
            case 80: 
            case 130: {
                return new int[]{1, 2, 2, 0, 2, 2};
            }
            case 79: 
            case 97: 
            case 104: {
                return new int[]{0, 2, 0, 1, 2, 2};
            }
            case 78: {
                return new int[]{3, 3, 3, 2, 2, 2};
            }
            case 77: {
                return new int[]{0, 2, 1, 1, 2, 2};
            }
            case 76: {
                return new int[]{3, 2, 3, 3, 2, 2};
            }
            case 75: {
                return new int[]{1, 1, 0, 2, 2, 2};
            }
            case 74: {
                return new int[]{2, 2, 0, 0, 2, 2};
            }
            case 73: {
                return new int[]{1, 1, 3, 2, 2, 2};
            }
            case 72: {
                return new int[]{3, 4, 0, 0, 2, 2};
            }
            case 71: {
                return new int[]{1, 1, 1, 1, 0, 2};
            }
            case 70: {
                return new int[]{0, 2, 2, 0, 2, 2};
            }
            case 69: {
                return new int[]{4, 2, 4, 0, 2, 2};
            }
            case 68: 
            case 155: 
            case 192: {
                return new int[]{3, 2, 2, 2, 2, 2};
            }
            case 67: {
                return new int[]{3, 2, 2, 3, 2, 2};
            }
            case 66: {
                return new int[]{0, 0, 0, 1, 0, 2};
            }
            case 65: {
                return new int[]{4, 3, 4, 4, 4, 2};
            }
            case 64: {
                return new int[]{0, 0, 0, 0, 1, 0};
            }
            case 60: {
                return new int[]{1, 3, 2, 1, 2, 2};
            }
            case 59: 
            case 209: {
                return new int[]{3, 3, 4, 4, 2, 2};
            }
            case 58: 
            case 123: {
                return new int[]{3, 4, 4, 4, 2, 2};
            }
            case 56: {
                return new int[]{0, 0, 2, 0, 0, 2};
            }
            case 54: {
                return new int[]{0, 1, 4, 2, 2, 1};
            }
            case 53: {
                return new int[]{0, 0, 2, 0, 1, 2};
            }
            case 52: {
                return new int[]{1, 0, 1, 0, 0, 2};
            }
            case 49: {
                return new int[]{2, 3, 0, 1, 2, 2};
            }
            case 48: 
            case 111: 
            case 161: 
            case 210: {
                return new int[]{4, 2, 4, 4, 2, 2};
            }
            case 47: 
            case 157: {
                return new int[]{2, 4, 4, 4, 2, 2};
            }
            case 46: {
                return new int[]{2, 3, 3, 2, 2, 2};
            }
            case 45: {
                return new int[]{2, 0, 1, 1, 3, 1};
            }
            case 44: 
            case 143: {
                return new int[]{4, 3, 3, 4, 2, 2};
            }
            case 43: 
            case 208: {
                return new int[]{0, 1, 2, 2, 2, 2};
            }
            case 40: {
                return new int[]{0, 1, 0, 0, 0, 2};
            }
            case 39: 
            case 62: 
            case 134: {
                return new int[]{3, 4, 3, 3, 2, 2};
            }
            case 38: {
                return new int[]{4, 2, 4, 2, 2, 2};
            }
            case 37: 
            case 137: {
                return new int[]{3, 3, 2, 2, 2, 2};
            }
            case 36: 
            case 219: {
                return new int[]{0, 2, 1, 2, 3, 3};
            }
            case 35: 
            case 42: {
                return new int[]{2, 2, 2, 1, 2, 2};
            }
            case 34: {
                return new int[]{1, 2, 3, 3, 2, 2};
            }
            case 33: {
                return new int[]{3, 2, 1, 0, 2, 2};
            }
            case 32: {
                return new int[]{3, 1, 2, 2, 3, 2};
            }
            case 31: {
                return new int[]{3, 2, 1, 1, 2, 2};
            }
            case 30: {
                return new int[]{1, 1, 1, 1, 2, 4};
            }
            case 28: {
                return new int[]{1, 2, 4, 4, 2, 2};
            }
            case 27: {
                return new int[]{3, 2, 0, 0, 2, 2};
            }
            case 26: {
                return new int[]{0, 2, 0, 0, 2, 2};
            }
            case 25: 
            case 141: 
            case 177: {
                return new int[]{1, 2, 2, 2, 2, 2};
            }
            case 24: {
                return new int[]{4, 4, 2, 3, 2, 2};
            }
            case 23: 
            case 84: 
            case 92: 
            case 154: 
            case 226: 
            case 234: {
                return new int[]{4, 4, 4, 4, 2, 2};
            }
            case 22: {
                return new int[]{1, 3, 1, 3, 4, 2};
            }
            case 21: 
            case 175: 
            case 191: {
                return new int[]{0, 0, 0, 0, 1, 2};
            }
            case 20: 
            case 187: 
            case 203: 
            case 206: {
                return new int[]{4, 3, 4, 4, 2, 2};
            }
            case 19: {
                return new int[]{0, 0, 1, 0, 1, 2};
            }
            case 18: {
                return new int[]{2, 1, 3, 2, 4, 2};
            }
            case 16: 
            case 106: 
            case 214: {
                return new int[]{1, 1, 1, 1, 2, 2};
            }
            case 15: 
            case 55: 
            case 128: 
            case 194: {
                return new int[]{4, 2, 3, 3, 2, 2};
            }
            case 14: 
            case 51: 
            case 121: 
            case 144: 
            case 172: 
            case 195: 
            case 224: {
                return new int[]{0, 2, 2, 2, 2, 2};
            }
            case 13: {
                return new int[]{2, 2, 3, 4, 2, 2};
            }
            case 12: {
                return new int[]{0, 3, 1, 1, 3, 0};
            }
            case 11: 
            case 61: 
            case 93: 
            case 102: 
            case 127: 
            case 145: 
            case 188: {
                return new int[]{0, 0, 0, 0, 0, 2};
            }
            case 10: {
                return new int[]{2, 2, 3, 3, 2, 2};
            }
            case 9: {
                return new int[]{2, 2, 2, 2, 1, 2};
            }
            case 8: 
            case 63: 
            case 162: 
            case 186: 
            case 190: {
                return new int[]{4, 2, 2, 2, 2, 2};
            }
            case 7: {
                return new int[]{3, 4, 4, 3, 2, 2};
            }
            case 6: 
            case 165: {
                return new int[]{2, 3, 2, 3, 2, 2};
            }
            case 5: {
                return new int[]{1, 1, 1, 2, 2, 2};
            }
            case 3: 
            case 41: {
                return new int[]{2, 4, 3, 4, 2, 2};
            }
            case 2: 
            case 204: {
                return new int[]{4, 4, 3, 4, 2, 2};
            }
            case 1: {
                return new int[]{1, 4, 2, 3, 4, 1};
            }
            case 0: 
            case 4: 
            case 17: 
            case 29: 
            case 50: 
            case 57: 
            case 113: 
            case 116: 
            case 202: 
            case 225: 
        }
        return new int[]{1, 2, 0, 0, 2, 2};
    }

    private long l(int n8) {
        Long l8;
        Long l9 = this.b.get(n8);
        if (l9 == null) {
            l8 = this.b.get(0);
        } else {
            l8 = l9;
            if (l9 == -9223372036854775807L) {
                l8 = ax.m1.j.m(this.q, n8);
            }
        }
        l9 = l8;
        if (l8 == null) {
            l9 = 1000000L;
        }
        return l9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static long m(String object, int n8) {
        object = ax.m1.j.k(ax.q7.t.d((String)object));
        if (n8 == 2) return (Long)r.get((int)object[0]);
        if (n8 == 3) return (Long)s.get((int)object[1]);
        if (n8 == 4) return (Long)t.get((int)object[2]);
        if (n8 == 5) return (Long)u.get((int)object[3]);
        if (n8 == 7) return (Long)r.get((int)object[0]);
        if (n8 == 9) return (Long)w.get((int)object[5]);
        if (n8 == 10) return (Long)v.get((int)object[4]);
        return 1000000L;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static j n(Context object) {
        synchronized (j.class) {
            try {
                if (x != null) return x;
                b b8 = new b((Context)object);
                x = b8.a();
                return x;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static boolean o(k k8, boolean bl) {
        return bl && !k8.d(8);
    }

    private void p(int n8, long l8, long l9) {
        if (n8 == 0 && l8 == 0L && l9 == this.m) {
            return;
        }
        this.m = l9;
        this.c.c(n8, l8, l9);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void q(int var1_1) {
        synchronized (this) {
            block20: {
                block17: {
                    block21: {
                        block19: {
                            block18: {
                                block16: {
                                    block15: {
                                        try {
                                            var2_2 = this.n;
                                            if (var2_2 == 0) break block15;
                                        }
                                        catch (Throwable var10_8) {
                                            break block20;
                                        }
                                        var9_3 = this.e;
                                        if (var9_3) break block15;
                                        return;
                                    }
                                    var9_3 = this.o;
                                    if (!var9_3) ** GOTO lbl17
                                    var1_1 = this.p;
lbl17:
                                    // 2 sources

                                    if (var2_2 != var1_1 || (var10_6 = this.q) == null) break block16;
                                    return;
                                }
                                this.n = var1_1;
                                if (var1_1 == 1 || var1_1 == 0 || var1_1 == 8) break block17;
                                var10_6 = this.q;
                                if (var10_6 != null) break block18;
                                this.q = d0.U(this.a);
                            }
                            this.l = this.l(var1_1);
                            var3_4 = this.d.b();
                            var1_1 = this.g;
                            if (var1_1 <= 0) break block19;
                            try {
                                var5_9 = this.h;
                            }
                            catch (Throwable var10_5) {
                                break block20;
                            }
                            var1_1 = (int)(var3_4 - var5_9);
                            break block21;
                        }
                        var1_1 = 0;
                    }
                    var5_9 = this.i;
                    var7_10 = this.l;
                    try {
                        this.p(var1_1, var5_9, var7_10);
                        this.h = var3_4;
                        this.i = 0L;
                        this.k = 0L;
                        this.j = 0L;
                        this.f.g();
                        return;
                    }
                    catch (Throwable var10_7) {}
                }
                return;
            }
            throw var10_6;
        }
    }

    @Override
    public /* synthetic */ long a() {
        return ax.m1.c.a(this);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b(g var1_1, k var2_6, boolean var3_7) {
        synchronized (this) {
            block12: {
                block13: {
                    var3_7 = ax.m1.j.o(var2_6, var3_7);
                    if (!var3_7) {
                    }
                    ** GOTO lbl-1000
                    {
                        catch (Throwable var1_5) {
                            break block12;
                        }
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var3_7 = this.g > 0;
                            ax.S0.a.g(var3_7);
                            var6_8 = this.d.b();
                            var5_9 = (int)(var6_8 - this.h);
                            this.j += (long)var5_9;
                            var10_10 = this.k;
                            var8_11 = this.i;
                            this.k = var10_10 + var8_11;
                            if (var5_9 <= 0) break block13;
                        }
                        var4_12 = (float)var8_11 * 8000.0f / (float)var5_9;
                        {
                            this.f.c((int)Math.sqrt(var8_11), var4_12);
                            var8_11 = this.j;
                            if (var8_11 >= 2000L) ** GOTO lbl-1000
                        }
                        try {
                            var8_11 = this.k;
                            if (var8_11 >= 524288L) {
                            }
                            ** GOTO lbl31
                        }
                        catch (Throwable var1_2) {
                            break block12;
                        }
lbl-1000:
                        // 2 sources

                        {
                            this.l = (long)this.f.f(0.5f);
lbl31:
                            // 2 sources

                            var8_11 = this.i;
                            var10_10 = this.l;
                        }
                        ** try [egrp 5[TRYBLOCK] [7 : 185->232)] { 
lbl34:
                        // 1 sources

                        this.p(var5_9, var8_11, var10_10);
                        this.h = var6_8;
                        this.i = 0L;
                    }
lbl38:
                    // 1 sources

                    catch (Throwable var1_3) {
                        break block12;
                    }
                }
                --this.g;
                return;
            }
            throw var1_4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(g g8, k k8, boolean bl) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        bl = ax.m1.j.o(k8, bl);
                        if (bl) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                if (this.g == 0) {
                    this.h = this.d.b();
                }
                ++this.g;
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public z d() {
        return this;
    }

    @Override
    public void e(Handler handler, e.a a8) {
        ax.S0.a.e(handler);
        ax.S0.a.e(a8);
        this.c.b(handler, a8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public long f() {
        synchronized (this) {
            return this.l;
        }
    }

    @Override
    public void g(e.a a8) {
        this.c.d(a8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void h(g g8, k k8, boolean bl, int n8) {
        synchronized (this) {
            bl = ax.m1.j.o(k8, bl);
            if (!bl) {
                return;
            }
            this.i += (long)n8;
            return;
        }
    }

    @Override
    public void i(g g8, k k8, boolean bl) {
    }

    public static final class b {
        private final Context a;
        private final Map<Integer, Long> b;
        private int c;
        private h d;
        private boolean e;

        public b(Context object) {
            object = object == null ? null : object.getApplicationContext();
            this.a = object;
            this.c = 2000;
            this.d = ax.S0.h.a;
            this.e = true;
            this.b = object = new HashMap(8);
            object.put(0, 1000000L);
            object.put(2, -9223372036854775807L);
            object.put(3, -9223372036854775807L);
            object.put(4, -9223372036854775807L);
            object.put(5, -9223372036854775807L);
            object.put(10, -9223372036854775807L);
            object.put(9, -9223372036854775807L);
            object.put(7, -9223372036854775807L);
        }

        public j a() {
            return new j(this.a, this.b, this.c, this.d, this.e);
        }
    }
}

