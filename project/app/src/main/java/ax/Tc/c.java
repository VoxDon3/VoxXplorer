/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Sc.f;
import ax.Tc.a;
import ax.Tc.d;
import ax.Tc.h;
import ax.Tc.i;
import ax.Tc.j;
import ax.Tc.k;
import ax.Tc.l;
import ax.Tc.m;
import ax.Tc.n;
import ax.Tc.q;
import ax.Tc.s;
import java.util.Locale;
import java.util.regex.Pattern;

public class c
implements d {
    private static final Pattern a = Pattern.compile("(\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*\\.)+\\p{javaJavaIdentifierStart}(\\p{javaJavaIdentifierPart})*");

    /*
     * Unable to fully structure code
     */
    private ax.Sc.j c(String var1_1, f var2_2) {
        block17: {
            if (!c.a.matcher(var1_1).matches()) break block17;
            try {
                var3_3 = Class.forName(var1_1);
            }
            catch (ClassNotFoundException var3_7) {
                ** continue;
            }
            try {
                var4_8 = (ax.Sc.j)var3_3.newInstance();
                ** GOTO lbl28
            }
            catch (ExceptionInInitializerError var3_4) {
            }
            catch (Exception var3_5) {
            }
            catch (ClassCastException var5_11) {
                ** GOTO lbl18
            }
            var4_9 = new n("Error initializing parser", (Throwable)var3_6);
            throw var4_9;
lbl18:
            // 1 sources

            var6_12 = new StringBuilder();
            var6_12.append(var3_3.getName());
            var6_12.append(" does not implement the interface org.apache.commons.net.ftp.FTPFileEntryParser.");
            var4_10 = new n(var6_12.toString(), var5_11);
            throw var4_10;
        }
        while (true) {
            block18: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    var4_8 = null;
lbl28:
                                    // 2 sources

                                    var3_3 = var4_8;
                                    if (var4_8 != null) break block18;
                                    var3_3 = var1_1.toUpperCase(Locale.ENGLISH);
                                    if (!var3_3.contains("UNIX_LTRIM")) break block19;
                                    var3_3 = new q((f)var2_2, true);
                                    break block18;
                                }
                                if (!var3_3.contains("UNIX")) break block20;
                                var3_3 = new q((f)var2_2, false);
                                break block18;
                            }
                            if (!var3_3.contains("VMS")) break block21;
                            var3_3 = new s((f)var2_2);
                            break block18;
                        }
                        if (!var3_3.contains("WINDOWS")) break block22;
                        var3_3 = this.d((f)var2_2);
                        break block18;
                    }
                    if (!var3_3.contains("OS/2")) break block23;
                    var3_3 = new l((f)var2_2);
                    break block18;
                }
                if (var3_3.contains("OS/400") || var3_3.contains("AS/400")) ** GOTO lbl70
                if (var3_3.contains("MVS")) {
                    var3_3 = new h();
                } else if (var3_3.contains("NETWARE")) {
                    var3_3 = new k((f)var2_2);
                } else if (var3_3.contains("MACOS PETER")) {
                    var3_3 = new i((f)var2_2);
                } else if (var3_3.contains("TYPE: L8")) {
                    var3_3 = new q((f)var2_2);
                } else {
                    var2_2 = new StringBuilder();
                    var2_2.append("Unknown parser type: ");
                    var2_2.append(var1_1);
                    throw new n(var2_2.toString());
lbl70:
                    // 1 sources

                    var3_3 = this.e((f)var2_2);
                }
            }
            if (var3_3 instanceof ax.Sc.a) {
                ((ax.Sc.a)var3_3).f((f)var2_2);
            }
            return var3_3;
        }
    }

    private ax.Sc.j d(f object) {
        if (object != null && "WINDOWS".equals(((f)object).e())) {
            return new j((f)object);
        }
        f f8 = object != null ? new f((f)object) : null;
        object = new j((f)object);
        boolean bl = f8 != null && "UNIX_LTRIM".equals(f8.e());
        return new a(new ax.Sc.j[]{object, new q(f8, bl)});
    }

    private ax.Sc.j e(f object) {
        if (object != null && "OS/400".equals(((f)object).e())) {
            return new m((f)object);
        }
        f f8 = object != null ? new f((f)object) : null;
        object = new m((f)object);
        boolean bl = f8 != null && "UNIX_LTRIM".equals(f8.e());
        return new a(new ax.Sc.j[]{object, new q(f8, bl)});
    }

    @Override
    public ax.Sc.j a(String string) {
        if (string != null) {
            return this.c(string, null);
        }
        throw new n("Parser key cannot be null");
    }

    @Override
    public ax.Sc.j b(f f8) throws n {
        return this.c(f8.e(), f8);
    }
}

