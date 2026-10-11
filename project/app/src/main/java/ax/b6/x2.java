/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import ax.b6.A2;
import ax.b6.B2;
import ax.b6.D2;
import ax.b6.E2;
import ax.b6.F2;
import ax.b6.w2;
import ax.b6.z2;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class x2
implements z2 {
    private final AtomicBoolean a = new AtomicBoolean();
    private HashMap<String, String> b = null;
    private final HashMap<String, Boolean> c = new HashMap(16, 1.0f);
    private final HashMap<String, Integer> d = new HashMap(16, 1.0f);
    private final HashMap<String, Long> e = new HashMap(16, 1.0f);
    private final HashMap<String, Float> f = new HashMap(16, 1.0f);
    private Object g = null;
    private boolean h = false;
    private String[] i = new String[0];
    private final F2 j = new D2();

    static /* bridge */ /* synthetic */ AtomicBoolean b(x2 x22) {
        return x22.a;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String a(ContentResolver object, String string, String string2) {
        String[] stringArray;
        block25: {
            if (object == null) {
                throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
            }
            synchronized (this) {
                int n8;
                Object object2;
                Object object3;
                int n9;
                try {
                    stringArray = this.b;
                    n9 = 0;
                    string2 = null;
                    object3 = null;
                    if (stringArray == null) {
                        this.a.set(false);
                        stringArray = new HashMap(16, 1.0f);
                        this.b = stringArray;
                        stringArray = new Object();
                        this.g = stringArray;
                        stringArray = w2.a;
                        object2 = new A2(this, null);
                        object.registerContentObserver((Uri)stringArray, true, (ContentObserver)object2);
                    } else if (this.a.getAndSet(false)) {
                        this.b.clear();
                        this.c.clear();
                        this.d.clear();
                        this.e.clear();
                        this.f.clear();
                        stringArray = new Object();
                        this.g = stringArray;
                        this.h = false;
                    }
                    stringArray = this.g;
                    if (this.b.containsKey(string)) {
                        string = this.b.get(string);
                        object = object3;
                        if (string == null) return object;
                        return string;
                    }
                    object3 = this.i;
                    n8 = ((String[])object3).length;
                }
                catch (Throwable throwable) {}
                throw throwable;
                while (n9 < n8) {
                    if (string.startsWith(object3[n9])) {
                        block23: {
                            if (this.h) return null;
                            stringArray = this.i;
                            object3 = this.j;
                            object2 = new B2();
                            object3 = (HashMap)object3.a((ContentResolver)object, stringArray, object2);
                            if (((HashMap)object3).isEmpty()) break block23;
                            object = ((HashMap)object3).keySet();
                            object.removeAll(this.c.keySet());
                            object.removeAll(this.d.keySet());
                            object.removeAll(this.e.keySet());
                            object.removeAll(this.f.keySet());
                        }
                        if (!((HashMap)object3).isEmpty()) {
                            if (this.b.isEmpty()) {
                                this.b = object3;
                            } else {
                                this.b.putAll((Map<String, String>)object3);
                            }
                        }
                        this.h = true;
                        break block24;
                    }
                    ++n9;
                }
            }
            try {
                string2 = this.j.b((ContentResolver)object, string);
                object = string2;
                if (string2 == null) break block25;
                object = string2;
                if (!string2.equals(null)) break block25;
                object = null;
            }
            catch (E2 e22) {
                return null;
            }
        }
        synchronized (this) {
            try {
                if (stringArray == this.g) {
                    this.b.put(string, (String)object);
                }
                // MONITOREXIT @DISABLED, blocks:[4, 7] lbl80 : MonitorExitStatement: MONITOREXIT : this
                if (object == null) return null;
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
        {
            block24: {
                catch (E2 e23) {}
            }
            if (!this.b.containsKey(string)) return null;
            string = this.b.get(string);
            object = string2;
            if (string == null) return object;
            return string;
        }
    }
}

