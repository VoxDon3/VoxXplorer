package ax.U3;

import ax.U3.j;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public interface h {

    @Deprecated
    public static final h a = new a();
    public static final h b = new j.a().a();

    static class a implements h {
        a() {
        }

        @Override // ax.U3.h
        public Map<String, String> a() {
            return Collections.EMPTY_MAP;
        }
    }

    Map<String, String> a();
}
