/*
 * Decompiled with CFR 0.152.
 */
package ax.oa;

public final class b
extends Enum<b> {
    public static final /* enum */ b g0 = new b("winreg interface", "338cd001-2244-31f1-aaaa-900038001003:v1.0");
    public static final /* enum */ b h0 = new b("srvsvc interface", "4b324fc8-1670-01d3-1278-5a47bf6ee188:v3.0");
    public static final /* enum */ b i0 = new b("lsarpc interface", "12345778-1234-ABCD-EF00-0123456789AB:v0.0");
    public static final /* enum */ b j0 = new b("samr interface", "12345778-1234-ABCD-EF00-0123456789AC:v1.0");
    public static final /* enum */ b k0 = new b("svcctl_interface", "367abb81-9844-35f1-ad32-98f038001003:v2.0");
    public static final /* enum */ b l0 = new b("NDR transfer syntax identifier", "8a885d04-1ceb-11c9-9fe8-08002b104860:v2.0");
    private static final b[] m0 = b.d();
    private final String c0;
    private final byte[] d0 = new byte[16];
    private final short e0;
    private final short f0;
    private final String q;

    private b(String string, String object) {
        int n9;
        Object object2;
        int n10;
        this.q = string;
        this.c0 = object;
        stringArray = object.split(":", 2);
        object = stringArray[0].split("-", 5);
        Object object3 = object[0];
        String string2 = object[1];
        Object object4 = object[2];
        string = object[3];
        object = object[4];
        int n11 = 0;
        int n12 = 4;
        for (n10 = 0; n10 < 3; ++n10) {
            Object object5 = (new String[]{object3, string2, object4})[n10];
            byte[] byArray = ((String)object5).getBytes();
            object2 = n12;
            for (n8 = ((String)object5).length() - 2; n8 >= 0; n8 -= 2) {
                n9 = n11;
                for (n12 = n8; n12 < n8 + 2; ++n12) {
                    n11 = byArray[n12];
                    object5 = this.d0;
                    object5[n9] = (byte)(object5[n9] | (byte)(Character.digit(n11, 16) << object2));
                    if (object2 == 0) {
                        ++n9;
                        n11 = 4;
                    } else {
                        n11 = 0;
                    }
                    object2 = n11;
                }
                n11 = n9;
            }
            n12 = object2;
        }
        n9 = 0;
        n8 = n12;
        n10 = n11;
        for (n11 = n9; n11 < 2; ++n11) {
            object3 = (new String[]{string, object})[n11].getBytes();
            n9 = ((Object)object3).length;
            for (n12 = 0; n12 < n9; ++n12) {
                object2 = object3[n12];
                object4 = this.d0;
                Object object6 = object4[n10];
                object4[n10] = (byte)((byte)(Character.digit(object2, 16) << n8) | object6);
                if (n8 == 0) {
                    ++n10;
                    n8 = 4;
                    continue;
                }
                n8 = 0;
            }
        }
        stringArray = stringArray[1].split("\\.", 2);
        this.e0 = Short.valueOf(stringArray[0].substring(1));
        this.f0 = Short.valueOf(stringArray[1]);
    }

    private static /* synthetic */ b[] d() {
        return new b[]{g0, h0, i0, j0, k0, l0};
    }

    public static b valueOf(String string) {
        return Enum.valueOf(b.class, string);
    }

    public static b[] values() {
        return (b[])m0.clone();
    }

    public short h() {
        return this.e0;
    }

    public short j() {
        return this.f0;
    }

    public String l() {
        return this.q;
    }

    public String n() {
        return this.c0;
    }

    public byte[] p() {
        return this.d0;
    }
}

