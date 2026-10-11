/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Sc.f;
import ax.Sc.i;
import ax.Tc.b;
import java.io.File;
import java.text.ParseException;
import java.util.Locale;

public class m
extends b {
    public m(f f8) {
        super("(\\S+)\\s+(?:(\\d+)\\s+)?(?:(\\S+)\\s+(\\S+)\\s+)?(\\*STMF|\\*DIR|\\*FILE|\\*MEM)\\s+((\\S+\\s*)+)?");
        this.f(f8);
    }

    private boolean k(String string) {
        return string == null || string.isEmpty();
        {
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public i c(String var1_1) {
        block22: {
            block21: {
                var5_2 = new i();
                var5_2.n((String)var1_1);
                if (!this.g((String)var1_1)) break block22;
                var7_3 = this.e(1);
                var6_4 = this.e(2);
                var3_5 = 3;
                if (this.k(this.e(3)) && this.k(this.e(4))) {
                    var4_6 = "";
                } else {
                    var1_1 = new StringBuilder();
                    var1_1.append(this.e(3));
                    var1_1.append(" ");
                    var1_1.append(this.e(4));
                    var4_6 = var1_1.toString();
                }
                var9_8 = this.e(5);
                var1_1 = this.e(6);
                try {
                    var5_2.p(super.j((String)var4_6));
                }
                catch (ParseException var8_9) {
                    // empty catch block
                }
                if (var9_8.equalsIgnoreCase("*STMF")) {
                    if (!this.k(var6_4) && !this.k((String)var1_1)) {
                        var2_10 = 1;
lbl28:
                        // 2 sources

                        while (true) {
                            var3_5 = 0;
                            break block21;
                            break;
                        }
                    }
                    return null;
                }
                if (!var9_8.equalsIgnoreCase("*DIR")) ** GOTO lbl38
                if (!this.k(var6_4) && !this.k((String)var1_1)) {
                    var2_10 = 1;
                    var3_5 = 1;
                } else {
                    return null;
lbl38:
                    // 1 sources

                    if (var9_8.equalsIgnoreCase("*FILE")) {
                        if (var1_1 != null) {
                            var4_6 = var1_1;
                            if (var1_1.toUpperCase(Locale.ROOT).endsWith(".SAVF")) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    var2_10 = 0;
                                    var1_1 = var4_6;
                                    ** continue;
                                    break;
                                }
                            }
                        }
                        return null;
                    }
                    if (var9_8.equalsIgnoreCase("*MEM")) {
                        if (this.k((String)var1_1)) {
                            return null;
                        }
                        if (this.k(var6_4) && this.k((String)var4_6)) {
                            var4_6 = var1_1.replace('/', File.separatorChar);
                            ** continue;
                        }
                        return null;
                    }
                    var2_10 = 1;
                }
            }
            var5_2.q(var3_5);
            var5_2.r(var7_3);
            try {
                var5_2.o(Long.parseLong(var6_4));
            }
            catch (NumberFormatException var4_7) {
                // empty catch block
            }
            var4_6 = var1_1;
            if (var1_1.endsWith("/")) {
                var4_6 = var1_1.substring(0, var1_1.length() - 1);
            }
            var1_1 = var4_6;
            if (var2_10 != 0) {
                var2_10 = var4_6.lastIndexOf(47);
                var1_1 = var4_6;
                if (var2_10 > -1) {
                    var1_1 = var4_6.substring(var2_10 + 1);
                }
            }
            var5_2.l((String)var1_1);
            return var5_2;
        }
        return null;
    }

    @Override
    protected f i() {
        return new f("OS/400", "yy/MM/dd HH:mm:ss", null);
    }
}

