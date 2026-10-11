package ax.q1;

import android.net.Uri;
import ax.N1.t;
import java.util.List;
import java.util.Map;

/* renamed from: ax.q1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2863x {
    public static final InterfaceC2863x a = new InterfaceC2863x() { // from class: ax.q1.v
        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x a(t.a aVar) {
            return C2862w.d(this, aVar);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x b(int i) {
            return C2862w.b(this, i);
        }

        @Override // ax.q1.InterfaceC2863x
        public final r[] c() {
            return C2862w.e();
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x d(boolean z) {
            return C2862w.c(this, z);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ r[] e(Uri uri, Map map) {
            return C2862w.a(this, uri, map);
        }
    };

    InterfaceC2863x a(t.a aVar);

    InterfaceC2863x b(int i);

    r[] c();

    @Deprecated
    InterfaceC2863x d(boolean z);

    r[] e(Uri uri, Map<String, List<String>> map);
}
