/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ax.M5.p;
import ax.b6.k7;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.g2;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class i2 {
    private final String a;
    private final Bundle b;
    private Bundle c;
    private final g2 d;

    public i2(g2 g22, String string, Bundle bundle) {
        this.d = g22;
        p.f(string);
        this.a = string;
        this.b = new Bundle();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String c(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        Iterator iterator = bundle.keySet().iterator();
        while (true) {
            JSONException jSONException2;
            block15: {
                Object object;
                block20: {
                    JSONObject jSONObject;
                    block14: {
                        block19: {
                            block18: {
                                block12: {
                                    block17: {
                                        block16: {
                                            block13: {
                                                if (!iterator.hasNext()) {
                                                    return jSONArray.toString();
                                                }
                                                String string = (String)iterator.next();
                                                object = bundle.get(string);
                                                if (object == null) continue;
                                                try {
                                                    jSONObject = new JSONObject();
                                                    jSONObject.put("n", (Object)string);
                                                    boolean bl = k7.a();
                                                    if (!bl || !this.d.d().t(F.B0)) break block12;
                                                    if (!(object instanceof String)) break block13;
                                                    jSONObject.put("v", (Object)String.valueOf(object));
                                                    jSONObject.put("t", (Object)"s");
                                                    break block14;
                                                }
                                                catch (JSONException jSONException2) {
                                                    break block15;
                                                }
                                            }
                                            if (!(object instanceof Long)) break block16;
                                            jSONObject.put("v", (Object)String.valueOf(object));
                                            jSONObject.put("t", (Object)"l");
                                            break block14;
                                        }
                                        if (!(object instanceof int[])) break block17;
                                        jSONObject.put("v", (Object)Arrays.toString((int[])object));
                                        jSONObject.put("t", (Object)"ia");
                                        break block14;
                                    }
                                    if (object instanceof long[]) {
                                        jSONObject.put("v", (Object)Arrays.toString((long[])object));
                                        jSONObject.put("t", (Object)"la");
                                        break block14;
                                    } else if (object instanceof Double) {
                                        jSONObject.put("v", (Object)String.valueOf(object));
                                        jSONObject.put("t", (Object)"d");
                                        break block14;
                                    } else {
                                        this.d.k().G().b("Cannot serialize bundle value to SharedPreferences. Type", object.getClass());
                                        continue;
                                    }
                                }
                                jSONObject.put("v", (Object)String.valueOf(object));
                                if (!(object instanceof String)) break block18;
                                jSONObject.put("t", (Object)"s");
                                break block14;
                            }
                            if (!(object instanceof Long)) break block19;
                            jSONObject.put("t", (Object)"l");
                            break block14;
                        }
                        if (!(object instanceof Double)) break block20;
                        jSONObject.put("t", (Object)"d");
                    }
                    jSONArray.put((Object)jSONObject);
                    continue;
                }
                this.d.k().G().b("Cannot serialize bundle value to SharedPreferences. Type", object.getClass());
                continue;
            }
            this.d.k().G().b("Cannot serialize bundle value to SharedPreferences", (Object)jSONException2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Bundle a() {
        block28: {
            block29: {
                if (this.c != null) break block28;
                var7_1 = this.d.J().getString(this.a, null);
                if (var7_1 == null) break block29;
                var6_3 = new Bundle();
                var5_4 = new JSONArray(var7_1);
                var2_6 = 0;
                while (true) {
                    block27: {
                        block26: {
                            block25: {
                                block21: {
                                    block22: {
                                        block23: {
                                            block24: {
                                                var1_7 = var5_4.length();
                                                if (var2_6 >= var1_7) break;
                                                var8_10 /* !! */  = var5_4.getJSONObject(var2_6);
                                                var7_1 = var8_10 /* !! */ .getString("n");
                                                var9_11 = var8_10 /* !! */ .getString("t");
                                                var1_7 = var9_11.hashCode();
                                                if (var1_7 == 100) break block21;
                                                if (var1_7 == 108) break block22;
                                                if (var1_7 == 115) break block23;
                                                if (var1_7 == 3352) break block24;
                                                if (var1_7 != 3445) break block25;
                                                if (!var9_11.equals("la")) break block25;
                                                var1_7 = 4;
                                                break block26;
                                            }
                                            if (!var9_11.equals("ia")) break block25;
                                            var1_7 = 3;
                                            break block26;
                                        }
                                        if (!var9_11.equals("s")) break block25;
                                        var1_7 = 0;
                                        break block26;
                                    }
                                    if (!var9_11.equals("l")) break block25;
                                    var1_7 = 2;
                                    break block26;
                                }
                                var4_9 = var9_11.equals("d");
                                if (!var4_9) break block25;
                                var1_7 = 1;
                                break block26;
                            }
                            var1_7 = -1;
                        }
                        if (var1_7 == 0) ** GOTO lbl84
                        if (var1_7 == 1) ** GOTO lbl82
                        if (var1_7 == 2) ** GOTO lbl80
                        if (var1_7 == 3) ** GOTO lbl69
                        if (var1_7 == 4) ** GOTO lbl58
                        this.d.k().G().b("Unrecognized persisted bundle type. Type", var9_11);
                        break block27;
lbl58:
                        // 1 sources

                        if (!k7.a() || !this.d.d().t(F.B0)) break block27;
                        var9_11 = new JSONArray(var8_10 /* !! */ .getString("v"));
                        var3_8 = var9_11.length();
                        var8_10 /* !! */  = (JSONObject)new long[var3_8];
                        for (var1_7 = 0; var1_7 < var3_8; ++var1_7) {
                            var8_10 /* !! */ [var1_7] = (JSONObject)var9_11.optLong(var1_7);
                            continue;
                        }
                        var6_3.putLongArray(var7_1, (long[])var8_10 /* !! */ );
                        break block27;
lbl69:
                        // 1 sources

                        if (!k7.a() || !this.d.d().t(F.B0)) break block27;
                        var9_11 = new JSONArray(var8_10 /* !! */ .getString("v"));
                        var3_8 = var9_11.length();
                        var8_10 /* !! */  = (JSONObject)new int[var3_8];
                        for (var1_7 = 0; var1_7 < var3_8; ++var1_7) {
                            var8_10 /* !! */ [var1_7] = (JSONObject)var9_11.optInt(var1_7);
                            continue;
                        }
                        try {
                            var6_3.putIntArray(var7_1, (int[])var8_10 /* !! */ );
                            break block27;
lbl80:
                            // 1 sources

                            var6_3.putLong(var7_1, Long.parseLong(var8_10 /* !! */ .getString("v")));
                            break block27;
lbl82:
                            // 1 sources

                            var6_3.putDouble(var7_1, Double.parseDouble(var8_10 /* !! */ .getString("v")));
                            break block27;
lbl84:
                            // 1 sources

                            var6_3.putString(var7_1, var8_10 /* !! */ .getString("v"));
                        }
                        catch (NumberFormatException | JSONException var7_2) {
                            this.d.k().G().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    ++var2_6;
                }
                this.c = var6_3;
                {
                    catch (JSONException var5_5) {
                        this.d.k().G().a("Error loading bundle from SharedPreferences. Values will be lost");
                    }
                }
            }
            if (this.c == null) {
                this.c = this.b;
            }
        }
        return this.c;
    }

    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle = this.d.J().edit();
        if (bundle2.size() == 0) {
            bundle.remove(this.a);
        } else {
            bundle.putString(this.a, this.c(bundle2));
        }
        bundle.apply();
        this.c = bundle2;
    }
}

