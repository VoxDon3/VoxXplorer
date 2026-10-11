/*
 * Decompiled with CFR 0.152.
 */
package ax.s1;

import ax.P0.v;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.u;
import ax.r7.z;
import ax.s1.a;

final class g
implements a {
    public final v a;

    public g(v v8) {
        this.a = v8;
    }

    private static String b(int n8) {
        switch (n8) {
            default: {
                return null;
            }
            case 1196444237: 
            case 1735420525: {
                return "video/mjpeg";
            }
            case 859066445: {
                return "video/mp43";
            }
            case 842289229: {
                return "video/mp42";
            }
            case 826496577: 
            case 828601953: 
            case 875967048: {
                return "video/avc";
            }
            case 808802372: 
            case 877677894: 
            case 1145656883: 
            case 1145656920: 
            case 1482049860: 
            case 1684633208: 
            case 2021026148: 
        }
        return "video/mp4v-es";
    }

    private static String c(int n8) {
        if (n8 != 1) {
            if (n8 != 85) {
                if (n8 != 255) {
                    if (n8 != 8192) {
                        if (n8 != 8193) {
                            return null;
                        }
                        return "audio/vnd.dts";
                    }
                    return "audio/ac3";
                }
                return "audio/mp4a-latm";
            }
            return "audio/mpeg";
        }
        return "audio/raw";
    }

    private static a d(G object) {
        ((G)object).c0(4);
        int n8 = ((G)object).z();
        int n9 = ((G)object).z();
        ((G)object).c0(4);
        int n10 = ((G)object).z();
        String string = g.b(n10);
        if (string == null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Ignoring track with unsupported compression ");
            ((StringBuilder)object).append(n10);
            u.h("StreamFormatChunk", ((StringBuilder)object).toString());
            return null;
        }
        object = new v.b();
        ((v.b)object).F0(n8).h0(n9).y0(string);
        return new g(((v.b)object).P());
    }

    public static a e(int n8, G object) {
        if (n8 == 2) {
            return g.d((G)object);
        }
        if (n8 == 1) {
            return g.f((G)object);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Ignoring strf box for unsupported track type: ");
        ((StringBuilder)object).append(d0.v0(n8));
        u.h("StreamFormatChunk", ((StringBuilder)object).toString());
        return null;
    }

    private static a f(G object) {
        int n8 = ((G)object).E();
        Object object2 = g.c(n8);
        if (object2 == null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Ignoring track with unsupported format tag ");
            ((StringBuilder)object).append(n8);
            u.h("StreamFormatChunk", ((StringBuilder)object).toString());
            return null;
        }
        int n9 = ((G)object).E();
        int n10 = ((G)object).z();
        ((G)object).c0(6);
        int n11 = d0.j0(((G)object).E());
        n8 = ((G)object).a() > 0 ? ((G)object).E() : 0;
        v.b b8 = new v.b();
        b8.y0((String)object2).T(n9).z0(n10);
        if (((String)object2).equals("audio/raw") && n11 != 0) {
            b8.s0(n11);
        }
        if (((String)object2).equals("audio/mp4a-latm") && n8 > 0) {
            object2 = new byte[n8];
            ((G)object).q((byte[])object2, 0, n8);
            b8.k0(z.A(object2));
        }
        return new g(b8.P());
    }

    @Override
    public int a() {
        return 1718776947;
    }
}

