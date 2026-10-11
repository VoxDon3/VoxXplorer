package ax.oa;

/* loaded from: classes3.dex */
public enum b {
    WINREG_V1_0("winreg interface", "338cd001-2244-31f1-aaaa-900038001003:v1.0"),
    SRVSVC_V3_0("srvsvc interface", "4b324fc8-1670-01d3-1278-5a47bf6ee188:v3.0"),
    LSASVC_V0_0("lsarpc interface", "12345778-1234-ABCD-EF00-0123456789AB:v0.0"),
    SAMSVC_V1_0("samr interface", "12345778-1234-ABCD-EF00-0123456789AC:v1.0"),
    SVCCTL_V2_0("svcctl_interface", "367abb81-9844-35f1-ad32-98f038001003:v2.0"),
    NDR_32BIT_V2("NDR transfer syntax identifier", "8a885d04-1ceb-11c9-9fe8-08002b104860:v2.0");

    private final String c0;
    private final byte[] d0 = new byte[16];
    private final short e0;
    private final short f0;
    private final String q;

    b(String str, String str2) {
        this.q = str;
        this.c0 = str2;
        String[] split = str2.split(":", 2);
        String[] split2 = split[0].split("-", 5);
        String[] strArr = {split2[0], split2[1], split2[2]};
        String[] strArr2 = {split2[3], split2[4]};
        int i = 0;
        int i2 = 0;
        int i3 = 4;
        for (int i4 = 3; i < i4; i4 = 3) {
            String str3 = strArr[i];
            byte[] bytes = str3.getBytes();
            for (int length = str3.length() - 2; length >= 0; length -= 2) {
                for (int i5 = length; i5 < length + 2; i5++) {
                    byte b = bytes[i5];
                    byte[] bArr = this.d0;
                    bArr[i2] = (byte) (bArr[i2] | ((byte) (Character.digit(b, 16) << i3)));
                    if (i3 == 0) {
                        i2++;
                        i3 = 4;
                    } else {
                        i3 = 0;
                    }
                }
            }
            i++;
        }
        for (int i6 = 0; i6 < 2; i6++) {
            for (byte b2 : strArr2[i6].getBytes()) {
                byte[] bArr2 = this.d0;
                bArr2[i2] = (byte) (((byte) (Character.digit(b2, 16) << i3)) | bArr2[i2]);
                if (i3 == 0) {
                    i2++;
                    i3 = 4;
                } else {
                    i3 = 0;
                }
            }
        }
        String[] split3 = split[1].split("\\.", 2);
        this.e0 = Short.valueOf(split3[0].substring(1)).shortValue();
        this.f0 = Short.valueOf(split3[1]).shortValue();
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
