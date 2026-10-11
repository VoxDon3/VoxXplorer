package ax.M9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class a extends ax.P9.c {
    protected Map<String, Object> e;

    public a(String str, f fVar, List<ax.S9.c> list) {
        super(str, fVar, list);
        this.e = new HashMap();
    }

    protected <T> T q(String str) {
        return (T) this.e.get(str);
    }

    protected boolean r(String str) {
        return this.e.containsKey(str);
    }
}
