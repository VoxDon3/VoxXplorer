package ax.b6;

import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: ax.b6.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1658s {
    public static final InterfaceC1658s f = new C1714z();
    public static final InterfaceC1658s g = new C1643q();
    public static final InterfaceC1658s h = new C1603l("continue");
    public static final InterfaceC1658s i = new C1603l("break");
    public static final InterfaceC1658s j = new C1603l("return");
    public static final InterfaceC1658s k = new C1567h(Boolean.TRUE);
    public static final InterfaceC1658s l = new C1567h(Boolean.FALSE);
    public static final InterfaceC1658s m = new C1674u(HttpUrl.FRAGMENT_ENCODE_SET);

    InterfaceC1658s c();

    Boolean e();

    Double f();

    String g();

    Iterator<InterfaceC1658s> i();

    InterfaceC1658s k(String str, Z2 z2, List<InterfaceC1658s> list);
}
