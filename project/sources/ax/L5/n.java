package ax.L5;

import ax.M5.C0807b;
import ax.j6.C2328k;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public class n {
    @ResultIgnorabilityUnspecified
    public static <ResultT> boolean a(Status status, ResultT resultt, C2328k<ResultT> c2328k) {
        return status.C() ? c2328k.e(resultt) : c2328k.d(C0807b.a(status));
    }
}
