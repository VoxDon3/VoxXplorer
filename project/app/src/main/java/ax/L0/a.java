/*
 * Decompiled with CFR 0.152.
 */
package ax.L0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public final class a {
    private static final Object f = new Object();
    private static a g;
    private final Context a;
    private final HashMap<BroadcastReceiver, ArrayList<c>> b = new HashMap();
    private final HashMap<String, ArrayList<c>> c = new HashMap();
    private final ArrayList<b> d = new ArrayList();
    private final Handler e;

    private a(Context context) {
        this.a = context;
        this.e = new Handler(this, context.getMainLooper()){
            final a a;
            {
                this.a = a8;
                super(looper);
            }

            public void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                this.a.a();
            }
        };
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a b(Context object) {
        Object object2 = f;
        synchronized (object2) {
            try {
                a a8;
                if (g != null) return g;
                g = a8 = new a(object.getApplicationContext());
                return g;
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
    void a() {
        block4: while (true) {
            int n8;
            b[] bArray;
            int n9;
            Object object = this.b;
            synchronized (object) {
                try {
                    n9 = this.d.size();
                    if (n9 <= 0) {
                        return;
                    }
                    bArray = new b[n9];
                    this.d.toArray(bArray);
                    this.d.clear();
                    // MONITOREXIT @DISABLED, blocks:[0, 2, 4] lbl13 : MonitorExitStatement: MONITOREXIT : var6_7
                    n8 = 0;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
            while (true) {
                if (n8 >= n9) continue block4;
                b b8 = bArray[n8];
                int n10 = b8.b.size();
                for (int i8 = 0; i8 < n10; ++i8) {
                    object = b8.b.get(i8);
                    if (((c)object).d) continue;
                    ((c)object).b.onReceive(this.a, b8.a);
                }
                ++n8;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(BroadcastReceiver object, IntentFilter intentFilter) {
        HashMap<BroadcastReceiver, ArrayList<c>> hashMap = this.b;
        synchronized (hashMap) {
            Throwable throwable2;
            block7: {
                ArrayList<c> arrayList;
                Object object2;
                c c8;
                block6: {
                    try {
                        c8 = new c(intentFilter, (BroadcastReceiver)object);
                        object2 = this.b.get(object);
                        arrayList = object2;
                        if (object2 != null) break block6;
                        arrayList = new ArrayList<c>(1);
                        this.b.put((BroadcastReceiver)object, arrayList);
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                arrayList.add(c8);
                for (int i8 = 0; i8 < intentFilter.countActions(); ++i8) {
                    object2 = intentFilter.getAction(i8);
                    arrayList = this.c.get(object2);
                    object = arrayList;
                    if (arrayList == null) {
                        object = new ArrayList(1);
                        this.c.put((String)object2, (ArrayList<c>)object);
                    }
                    object.add(c8);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean d(Intent var1_1) {
        var8_3 = this.b;
        synchronized (var8_3) {
            block19: {
                try {
                    var7_4 = var1_1.getAction();
                    var12_5 = var1_1.resolveTypeIfNeeded(this.a.getContentResolver());
                    var9_6 = var1_1.getData();
                    var11_7 = var1_1.getScheme();
                    var10_8 = var1_1.getCategories();
                    var2_9 = (var1_1.getFlags() & 8) != 0 ? 1 : 0;
                    if (var2_9 != 0) {
                        var5_10 = new StringBuilder();
                        var5_10.append("Resolving type ");
                        var5_10.append(var12_5);
                        var5_10.append(" scheme ");
                        var5_10.append(var11_7);
                        var5_10.append(" of intent ");
                        var5_10.append(var1_1);
                        Log.v((String)"LocalBroadcastManager", (String)var5_10.toString());
                    }
                    if ((var13_11 = this.c.get(var1_1.getAction())) == null) break block19;
                    if (var2_9 != 0) {
                        var5_10 = new StringBuilder();
                        var5_10.append("Action list: ");
                        var5_10.append(var13_11);
                        Log.v((String)"LocalBroadcastManager", (String)var5_10.toString());
                    }
                    var6_12 /* !! */  = null;
                }
                catch (Throwable var1_2) {}
                throw var1_2;
                for (var3_13 = 0; var3_13 < var13_11.size(); ++var3_13) {
                    var14_15 = var13_11.get(var3_13);
                    if (var2_9 != 0) {
                        var5_10 = new StringBuilder();
                        var5_10.append("Matching against filter ");
                        var5_10.append(var14_15.a);
                        Log.v((String)"LocalBroadcastManager", (String)var5_10.toString());
                    }
                    if (var14_15.c) {
                        if (var2_9 != 0) {
                            Log.v((String)"LocalBroadcastManager", (String)"  Filter's target already added");
                        }
                        var5_10 = var6_12 /* !! */ ;
                    } else {
                        var4_14 = var14_15.a.match((String)var7_4, var12_5, var11_7, var9_6, var10_8, "LocalBroadcastManager");
                        if (var4_14 >= 0) {
                            if (var2_9 != 0) {
                                var5_10 = new StringBuilder();
                                var5_10.append("  Filter matched!  match=0x");
                                var5_10.append(Integer.toHexString(var4_14));
                                Log.v((String)"LocalBroadcastManager", (String)var5_10.toString());
                            }
                            var5_10 = var6_12 /* !! */ ;
                            if (var6_12 /* !! */  == null) {
                                var5_10 = new ArrayList();
                            }
                            var5_10.add(var14_15);
                            var14_15.c = true;
                        } else {
                            var5_10 = var6_12 /* !! */ ;
                            if (var2_9 != 0) {
                                var5_10 = var4_14 != -4 ? (var4_14 != -3 ? (var4_14 != -2 ? (var4_14 != -1 ? "unknown reason" : "type") : "data") : "action") : "category";
                                var14_15 = new StringBuilder();
                                var14_15.append("  Filter did not match: ");
                                var14_15.append((String)var5_10);
                                Log.v((String)"LocalBroadcastManager", (String)var14_15.toString());
                                var5_10 = var6_12 /* !! */ ;
                            }
                        }
                    }
                    var6_12 /* !! */  = var5_10;
                }
                if (var6_12 /* !! */  == null) break block19;
                ** GOTO lbl-1000
            }
            return false;
lbl-1000:
            // 2 sources

            {
                for (var2_9 = 0; var2_9 < var6_12 /* !! */ .size(); ++var2_9) {
                    ((c)var6_12 /* !! */ .get((int)var2_9)).c = false;
                }
            }
            var5_10 = this.d;
            var7_4 = new b(var1_1, var6_12 /* !! */ );
            var5_10.add(var7_4);
            if (!this.e.hasMessages(1)) {
                this.e.sendEmptyMessage(1);
            }
            return true;
        }
    }

    public void e(Intent intent) {
        if (this.d(intent)) {
            this.a();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f(BroadcastReceiver broadcastReceiver) {
        HashMap<BroadcastReceiver, ArrayList<c>> hashMap = this.b;
        synchronized (hashMap) {
            int n8;
            ArrayList<c> arrayList;
            try {
                arrayList = this.b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                n8 = arrayList.size() - 1;
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                c c8;
                if (n8 >= 0) {
                    c8 = arrayList.get(n8);
                    c8.d = true;
                } else {
                    return;
                }
                for (int i8 = 0; i8 < c8.a.countActions(); ++i8) {
                    String string = c8.a.getAction(i8);
                    ArrayList<c> arrayList2 = this.c.get(string);
                    if (arrayList2 == null) continue;
                    for (int i9 = arrayList2.size() - 1; i9 >= 0; --i9) {
                        c c9 = arrayList2.get(i9);
                        if (c9.b != broadcastReceiver) continue;
                        c9.d = true;
                        arrayList2.remove(i9);
                    }
                    if (arrayList2.size() > 0) continue;
                    this.c.remove(string);
                }
                --n8;
            }
        }
    }

    private static final class b {
        final Intent a;
        final ArrayList<c> b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.a = intent;
            this.b = arrayList;
        }
    }

    private static final class c {
        final IntentFilter a;
        final BroadcastReceiver b;
        boolean c;
        boolean d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.a = intentFilter;
            this.b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(128);
            stringBuilder.append("Receiver{");
            stringBuilder.append(this.b);
            stringBuilder.append(" filter=");
            stringBuilder.append(this.a);
            if (this.d) {
                stringBuilder.append(" DEAD");
            }
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }
}

