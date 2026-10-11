/*
 * Decompiled with CFR 0.152.
 */
package ax.Zd;

import ax.Zd.p;
import ax.ae.a;
import java.util.HashMap;
import java.util.Map;

public class b
implements a {
    private final p a = new p();
    private final InheritableThreadLocal<Map<String, String>> b = new InheritableThreadLocal<Map<String, String>>(this){
        final b a;
        {
            this.a = b8;
        }

        protected Map<String, String> a(Map<String, String> map) {
            if (map == null) {
                return null;
            }
            return new HashMap<String, String>(map);
        }
    };
}

