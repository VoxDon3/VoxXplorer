package ax.q5;

import android.content.Context;
import ax.z5.InterfaceC3550a;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class h {
    public static h a(Context context, InterfaceC3550a interfaceC3550a, InterfaceC3550a interfaceC3550a2, String str) {
        return new c(context, interfaceC3550a, interfaceC3550a2, str);
    }

    public abstract Context b();

    public abstract String c();

    public abstract InterfaceC3550a d();

    public abstract InterfaceC3550a e();
}
