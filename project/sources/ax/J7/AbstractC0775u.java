package ax.J7;

import com.google.auto.value.AutoValue;
import java.io.File;

@AutoValue
/* renamed from: ax.J7.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0775u {
    public static AbstractC0775u a(ax.L7.F f, String str, File file) {
        return new C0757b(f, str, file);
    }

    public abstract ax.L7.F b();

    public abstract File c();

    public abstract String d();
}
