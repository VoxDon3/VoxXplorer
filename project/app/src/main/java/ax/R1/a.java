/*
 * Decompiled with CFR 0.152.
 */
package ax.R1;

import android.text.TextUtils;
import ax.q7.c;

final class a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    private a(int n8, int n9, int n10, int n11, int n12, int n13) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
        this.e = n12;
        this.f = n13;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static a a(String string) {
        ax.S0.a.a(string.startsWith("Format:"));
        String[] stringArray = TextUtils.split((String)string.substring(7), (String)",");
        int n8 = -1;
        int n9 = -1;
        int n10 = -1;
        int n11 = -1;
        int n12 = -1;
        block21: for (int i8 = 0; i8 < stringArray.length; ++i8) {
            int n13;
            string = ax.q7.c.e(stringArray[i8].trim());
            string.getClass();
            int n14 = -1;
            switch (string.hashCode()) {
                case 109780401: {
                    if (!string.equals("style")) break;
                    n14 = 1;
                    break;
                }
                case 109757538: {
                    if (!string.equals("start")) break;
                    n14 = 2;
                    break;
                }
                case 102749521: {
                    if (!string.equals("layer")) break;
                    n14 = 3;
                    break;
                }
                case 3556653: {
                    if (!string.equals("text")) break;
                    n14 = 4;
                    break;
                }
                case 100571: {
                    if (!string.equals("end")) break;
                    n14 = 5;
                    break;
                }
            }
            switch (n14) {
                default: {
                    n13 = -1;
                    break;
                }
                case 1: {
                    n13 = 4;
                    break;
                }
                case 2: {
                    n13 = 3;
                    break;
                }
                case 3: {
                    n13 = 2;
                    break;
                }
                case 4: {
                    n13 = 1;
                    break;
                }
                case 5: {
                    n13 = 0;
                }
            }
            switch (n13) {
                default: {
                    continue block21;
                }
                case 4: {
                    n11 = i8;
                    continue block21;
                }
                case 3: {
                    n9 = i8;
                    continue block21;
                }
                case 2: {
                    n8 = i8;
                    continue block21;
                }
                case 1: {
                    n12 = i8;
                    continue block21;
                }
                case 0: {
                    n10 = i8;
                }
            }
        }
        if (n9 != -1 && n10 != -1 && n12 != -1) {
            return new a(n8, n9, n10, n11, n12, stringArray.length);
        }
        return null;
    }
}

