/*
 * Decompiled with CFR 0.152.
 */
package ax.T0;

import ax.S0.G;

public final class a {
    public final int a;
    public final int b;
    public final String c;

    private a(int n8, int n9, String string) {
        this.a = n8;
        this.b = n9;
        this.c = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static a a(G object) {
        ((G)object).c0(2);
        int n8 = ((G)object).M();
        int n9 = n8 >> 1;
        n8 = ((G)object).M() >> 3 & 0x1F | (n8 & 1) << 5;
        if (n9 != 4 && n9 != 5 && n9 != 7 && n9 != 8) {
            if (n9 == 9) {
                object = "dvav";
            } else {
                if (n9 != 10) return null;
                object = "dav1";
            }
        } else {
            object = "dvhe";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        String string = ".";
        object = n9 < 10 ? ".0" : ".";
        stringBuilder.append((String)object);
        stringBuilder.append(n9);
        object = string;
        if (n8 < 10) {
            object = ".0";
        }
        stringBuilder.append((String)object);
        stringBuilder.append(n8);
        return new a(n9, n8, stringBuilder.toString());
    }
}

