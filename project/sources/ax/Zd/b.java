package ax.Zd;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class b implements ax.ae.a {
    private final p a = new p();
    private final InheritableThreadLocal<Map<String, String>> b = new a();

    class a extends InheritableThreadLocal<Map<String, String>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.InheritableThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, String> childValue(Map<String, String> map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    }
}
