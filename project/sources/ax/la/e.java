package ax.la;

import com.pcloud.sdk.internal.C3785d;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class e {
    public static /* synthetic */ String a(String str) {
        return str;
    }

    public static InterfaceC2493c b(final String str) {
        return C3785d.a(new Callable() { // from class: ax.la.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.a(str);
            }
        });
    }
}
