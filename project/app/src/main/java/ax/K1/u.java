/*
 * Decompiled with CFR 0.152.
 */
package ax.K1;

import ax.S0.a;
import ax.q1.U;

public final class u {
    public final boolean a;
    public final String b;
    public final U.a c;
    public final int d;
    public final byte[] e;

    public u(boolean bl, String string, int n8, byte[] byArray, int n9, int n10, byte[] byArray2) {
        boolean bl2 = false;
        boolean bl3 = n8 == 0;
        if (byArray2 == null) {
            bl2 = true;
        }
        ax.S0.a.a(bl2 ^ bl3);
        this.a = bl;
        this.b = string;
        this.d = n8;
        this.e = byArray2;
        this.c = new U.a(u.a(string), byArray, n9, n10);
    }

    private static int a(String string) {
        if (string == null) {
            return 1;
        }
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 3049895: {
                if (!string.equals("cens")) break;
                n8 = 3;
                break;
            }
            case 3049879: {
                if (!string.equals("cenc")) break;
                n8 = 2;
                break;
            }
            case 3046671: {
                if (!string.equals("cbcs")) break;
                n8 = 1;
                break;
            }
            case 3046605: {
                if (!string.equals("cbc1")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported protection scheme type '");
                stringBuilder.append(string);
                stringBuilder.append("'. Assuming AES-CTR crypto mode.");
                ax.S0.u.h("TrackEncryptionBox", stringBuilder.toString());
            }
            case 2: 
            case 3: {
                return 1;
            }
            case 0: 
            case 1: 
        }
        return 2;
    }
}

