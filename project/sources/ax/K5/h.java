package ax.K5;

import ax.K5.l;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class h<R extends l> {

    public interface a {
        void a(Status status);
    }

    public abstract void a(a aVar);

    @ResultIgnorabilityUnspecified
    public abstract R b(long j, TimeUnit timeUnit);
}
