/*
 * Decompiled with CFR 0.152.
 */
package ax.Z7;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import ax.Z7.l;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

class k {
    private final SharedPreferences a;

    public k(Context context, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FirebaseHeartBeat");
        stringBuilder.append(string);
        this.a = context.getSharedPreferences(stringBuilder.toString(), 0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a() {
        synchronized (this) {
            try {
                var1_1 = this.a.getLong("fire-count", 0L);
                var4_2 = "";
                var7_3 = this.a.getAll().entrySet().iterator();
                var3_4 = null;
            }
            catch (Throwable var3_5) {}
            throw var3_5;
            block3: while (true) {
                if (!var7_3.hasNext()) {
                    var7_3 = this.a;
                    var5_6 = new HashSet();
                    var6_7 = new HashSet(var7_3.getStringSet((String)var4_2, var5_6));
                    var6_7.remove(var3_4);
                    this.a.edit().putStringSet((String)var4_2, var6_7).putLong("fire-count", var1_1 - 1L).commit();
                    return;
                }
                var9_9 = var7_3.next();
                if (!(var9_9.getValue() instanceof Set)) continue;
                var8_8 = ((Set)var9_9.getValue()).iterator();
                var6_7 = var3_4;
                var5_6 = var4_2;
                while (true) {
                    var4_2 = var5_6;
                    var3_4 = var6_7;
                    if (var8_8.hasNext()) ** break;
                    continue block3;
                    var3_4 = (String)var8_8.next();
                    if (var6_7 != null && var6_7.compareTo((String)var3_4) <= 0) continue;
                    var5_6 = (String)var9_9.getKey();
                    var6_7 = var3_4;
                }
                break;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String d(long l8) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        Object object = new Date(l8);
                        return j.DateRetargetClass.toInstant((Date)object).atOffset(j.ZoneOffset.UTC).toLocalDateTime().format(j.DateTimeFormatter.ISO_LOCAL_DATE);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                Object object = new SimpleDateFormat("yyyy-MM-dd", Locale.UK);
                Date date = new Date(l8);
                return ((DateFormat)object).format(date);
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private String e(String string) {
        // MONITORENTER : this
        for (Map.Entry entry : this.a.getAll().entrySet()) {
            if (!(entry.getValue() instanceof Set)) continue;
            Iterator iterator = ((Set)entry.getValue()).iterator();
            while (iterator.hasNext()) {
                if (!string.equals((String)iterator.next())) continue;
                string = (String)entry.getKey();
                // MONITOREXIT : this
                return string;
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void f(String string) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                String string2;
                block6: {
                    try {
                        string2 = this.e(string);
                        if (string2 != null) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    return;
                }
                SharedPreferences sharedPreferences = this.a;
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet(sharedPreferences.getStringSet(string2, hashSet));
                hashSet2.remove(string);
                if (hashSet2.isEmpty()) {
                    this.a.edit().remove(string2).commit();
                } else {
                    this.a.edit().putStringSet(string2, hashSet2).commit();
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void i(String string, String string2) {
        synchronized (this) {
            this.f(string2);
            SharedPreferences sharedPreferences = this.a;
            HashSet hashSet = new HashSet();
            HashSet<String> hashSet2 = new HashSet<String>(sharedPreferences.getStringSet(string, hashSet));
            hashSet2.add(string2);
            this.a.edit().putStringSet(string, hashSet2).commit();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void b() {
        synchronized (this) {
            try {
                SharedPreferences.Editor editor = this.a.edit();
                Iterator iterator = this.a.getAll().entrySet().iterator();
                int n8 = 0;
                while (iterator.hasNext()) {
                    Map.Entry entry = iterator.next();
                    if (!(entry.getValue() instanceof Set)) continue;
                    HashSet<String> hashSet = (HashSet<String>)entry.getValue();
                    String string = this.d(System.currentTimeMillis());
                    entry = (String)entry.getKey();
                    if (hashSet.contains(string)) {
                        hashSet = new HashSet<String>();
                        hashSet.add(string);
                        ++n8;
                        editor.putStringSet((String)((Object)entry), hashSet);
                        continue;
                    }
                    editor.remove((String)((Object)entry));
                }
                if (n8 == 0) {
                    editor.remove("fire-count");
                } else {
                    editor.putLong("fire-count", (long)n8);
                }
                editor.commit();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    List<l> c() {
        synchronized (this) {
            try {
                ArrayList<l> arrayList = new ArrayList<l>();
                Iterator iterator = this.a.getAll().entrySet().iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        this.h(System.currentTimeMillis());
                        return arrayList;
                    }
                    Map.Entry entry = iterator.next();
                    if (!(entry.getValue() instanceof Set)) continue;
                    HashSet hashSet = new HashSet((Set)entry.getValue());
                    hashSet.remove(this.d(System.currentTimeMillis()));
                    if (hashSet.isEmpty()) continue;
                    entry = (String)entry.getKey();
                    ArrayList<String> arrayList2 = new ArrayList<String>(hashSet);
                    arrayList.add(l.a((String)((Object)entry), arrayList2));
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void g(long l8, String string) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                long l9;
                String string2;
                block6: {
                    block8: {
                        String string3;
                        block7: {
                            try {
                                string2 = this.d(l8);
                                if (!this.a.getString("last-used-date", "").equals(string2)) break block6;
                                string3 = this.e(string2);
                                if (string3 != null) break block7;
                            }
                            catch (Throwable throwable2) {}
                            return;
                        }
                        boolean bl = string3.equals(string);
                        if (!bl) break block8;
                        return;
                    }
                    this.i(string, string2);
                    return;
                    break block9;
                }
                l8 = l9 = this.a.getLong("fire-count", 0L);
                if (l9 + 1L == 30L) {
                    this.a();
                    l8 = this.a.getLong("fire-count", 0L);
                }
                SharedPreferences sharedPreferences = this.a;
                HashSet hashSet = new HashSet();
                HashSet<String> hashSet2 = new HashSet<String>(sharedPreferences.getStringSet(string, hashSet));
                hashSet2.add(string2);
                this.a.edit().putStringSet(string, hashSet2).putLong("fire-count", l8 + 1L).putString("last-used-date", string2).commit();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void h(long l8) {
        synchronized (this) {
            this.a.edit().putLong("fire-global", l8).commit();
            return;
        }
    }
}

