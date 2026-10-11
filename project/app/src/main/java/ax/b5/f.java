/*
 * Decompiled with CFR 0.152.
 */
package ax.b5;

import java.util.AbstractMap;

public final class f
extends j.ConcurrentHashMap<String, String> {
    public static final f c0 = new f();
    private final Object q = new Object();

    private f() {
        super(180, 0.8f, 4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String a(String string) {
        block7: {
            Object object = (String)((AbstractMap)((Object)this)).get(string);
            if (object != null) {
                return object;
            }
            if (((AbstractMap)((Object)this)).size() >= 180) {
                object = this.q;
                synchronized (object) {
                    Throwable throwable2;
                    block6: {
                        block5: {
                            try {
                                if (((AbstractMap)((Object)this)).size() < 180) break block5;
                                ((AbstractMap)((Object)this)).clear();
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        break block7;
                    }
                    throw throwable2;
                }
            }
        }
        string = string.intern();
        ((AbstractMap)((Object)this)).put(string, string);
        return string;
    }
}

