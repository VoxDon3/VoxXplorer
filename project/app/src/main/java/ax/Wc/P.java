/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

public abstract class P {
    /*
     * Enabled aggressive block sorting
     */
    public static String a(int n8, int n9) {
        String string;
        StringBuilder stringBuilder;
        block4: {
            block5: {
                if (n8 == 64) break block5;
                if (n8 != 128) {
                    if (n8 != 192) {
                        stringBuilder = new StringBuilder();
                        string = "[UNIVERSAL ";
                        break block4;
                    } else {
                        stringBuilder = new StringBuilder();
                        string = "[PRIVATE ";
                    }
                    break block4;
                } else {
                    stringBuilder = new StringBuilder();
                    string = "[CONTEXT ";
                }
                break block4;
            }
            stringBuilder = new StringBuilder();
            string = "[APPLICATION ";
        }
        stringBuilder.append(string);
        stringBuilder.append(n9);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

