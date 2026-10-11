/*
 * Decompiled with CFR 0.152.
 */
package ax.T;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import ax.S.e;
import ax.T.k;
import ax.Z.k;
import java.io.IOException;

public class j
extends k {
    private Font h(FontFamily fontFamily, int n8) {
        int n9 = (n8 & 1) != 0 ? 700 : 400;
        int n10 = 1;
        n8 = (n8 & 2) != 0 ? 1 : 0;
        FontStyle fontStyle = new FontStyle(n9, n8);
        Font font = fontFamily.getFont(0);
        n9 = j.i(fontStyle, font.getStyle());
        for (n8 = n10; n8 < fontFamily.getSize(); ++n8) {
            Font font2 = fontFamily.getFont(n8);
            int n11 = j.i(fontStyle, font2.getStyle());
            n10 = n9;
            if (n11 < n9) {
                font = font2;
                n10 = n11;
            }
            n9 = n10;
        }
        return font;
    }

    private static int i(FontStyle fontStyle, FontStyle fontStyle2) {
        int n8 = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        int n9 = fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2;
        return n8 + n9;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Typeface a(Context object, e.c c8, Resources resources, int n8) {
        Font.Builder builder;
        Object var7_15 = null;
        e.d[] dArray = builder.a();
        int n9 = dArray.length;
        int n10 = 0;
        Object var1_2 = null;
        while (true) {
            block10: {
                Object var1_7;
                Object var1_3;
                if (n10 < n9) {
                    Resources var3_13;
                    e.d d8 = dArray[n10];
                    builder = new Font.Builder((Resources)var3_13, d8.b());
                    d8 = builder.setWeight(d8.e()).setSlant(d8.f() ? 1 : 0).setTtcIndex(d8.c()).setFontVariationSettings(d8.d()).build();
                    if (var1_3 == null) {
                        Font.Builder builder2 = builder = new FontFamily.Builder((Font)d8);
                        break block10;
                    } else {
                        var1_3.addFont((Font)d8);
                    }
                    break block10;
                }
                if (var1_3 == null) {
                    return null;
                }
                try {
                    int var4_14;
                    FontFamily fontFamily = var1_3.build();
                    builder = new Typeface.CustomFallbackBuilder(fontFamily);
                    Typeface typeface = builder.setStyle(this.h(fontFamily, (int)var4_14).getStyle()).build();
                    return var1_7;
                }
                catch (Exception exception) {
                    Object var1_9 = var7_15;
                    return var1_7;
                }
                catch (IOException iOException) {}
            }
            ++n10;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Typeface b(Context var1_1, CancellationSignal var2_4, k.b[] var3_5, int var4_6) {
        var8_7 = var1_1.getContentResolver();
        var6_8 = var3_5.length;
        var1_1 = null;
        {
            catch (Exception var1_2) {
                return null;
            }
            block10: for (var5_9 = 0; var5_9 < var6_8; ++var5_9) {
                block15: {
                    block14: {
                        block13: {
                            var10_13 = var3_5[var5_9];
                            var7_10 = var1_1;
                            try {
                                var9_11 = var8_7.openFileDescriptor(var10_13.d(), "r", var2_4);
                                if (var9_11 != null) break block13;
                                var7_10 = var1_1;
                                if (var9_11 == null) ** GOTO lbl20
lbl16:
                                // 3 sources

                                while (true) {
                                    var7_10 = var1_1;
                                    var9_11.close();
                                    var7_10 = var1_1;
lbl20:
                                    // 3 sources

                                    while (true) {
                                        var1_1 = var7_10;
                                        continue block10;
                                        break;
                                    }
                                    break;
                                }
                            }
                            catch (IOException var1_3) {
                                ** continue;
                            }
                        }
                        try {
                            var7_10 = new Font.Builder(var9_11);
                            var7_10 = var7_10.setWeight(var10_13.e()).setSlant((int)var10_13.f()).setTtcIndex(var10_13.c()).build();
                            if (var1_1 != null) break block14;
                            var1_1 = var7_10 = new FontFamily.Builder((Font)var7_10);
                            ** GOTO lbl16
                        }
                        catch (Throwable var10_14) {
                            break block15;
                        }
                    }
                    var1_1.addFont((Font)var7_10);
                    ** continue;
                }
                try {
                    var9_11.close();
                    ** GOTO lbl45
                }
                catch (Throwable var9_12) {}
                var7_10 = var1_1;
                {
                    var10_14.addSuppressed(var9_12);
lbl45:
                    // 2 sources

                    var7_10 = var1_1;
                    throw var10_14;
                }
            }
        }
        if (var1_1 != null) ** GOTO lbl-1000
        return null;
lbl-1000:
        // 1 sources

        {
            var2_4 = var1_1.build();
            var1_1 = new Typeface.CustomFallbackBuilder((FontFamily)var2_4);
            return var1_1.setStyle(this.h((FontFamily)var2_4, var4_6).getStyle()).build();
        }
    }

    @Override
    public Typeface d(Context context, Resources resources, int n8, String string, int n9) {
        try {
            context = new Font.Builder(resources, n8);
            context = context.build();
            resources = new FontFamily.Builder((Font)context);
            resources = resources.build();
            string = new Typeface.CustomFallbackBuilder((FontFamily)resources);
            context = string.setStyle(context.getStyle()).build();
            return context;
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    protected k.b g(k.b[] bArray, int n8) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}

