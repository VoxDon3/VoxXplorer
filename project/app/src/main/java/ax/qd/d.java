/*
 * Decompiled with CFR 0.152.
 */
package ax.qd;

public class d {
    private String a;
    private int b;
    private char c;
    private StringBuffer d = new StringBuffer();

    public d(String string) {
        this(string, ',');
    }

    public d(String string, char c8) {
        this.a = string;
        this.b = -1;
        this.c = c8;
    }

    public boolean a() {
        return this.b != this.a.length();
    }

    /*
     * Enabled aggressive block sorting
     */
    public String b() {
        int n8;
        if (this.b == this.a.length()) {
            return null;
        }
        this.d.setLength(0);
        boolean bl = false;
        boolean bl2 = false;
        for (n8 = this.b + 1; n8 != this.a.length(); ++n8) {
            char c8;
            block10: {
                boolean bl3;
                block9: {
                    block8: {
                        c8 = this.a.charAt(n8);
                        if (c8 != '\"') break block8;
                        bl3 = bl2;
                        if (!bl) {
                            bl3 = bl2 ^ true;
                        }
                        break block9;
                    }
                    bl3 = bl2;
                    if (bl) break block9;
                    if (!bl2) break block10;
                    bl3 = bl2;
                }
                this.d.append(c8);
                bl = false;
                bl2 = bl3;
                continue;
            }
            if (c8 == '\\') {
                this.d.append(c8);
                bl = true;
                continue;
            }
            if (c8 == this.c) break;
            this.d.append(c8);
        }
        this.b = n8;
        return this.d.toString();
    }
}

