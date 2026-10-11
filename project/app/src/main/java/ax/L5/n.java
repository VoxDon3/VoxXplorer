/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import ax.M5.b;
import ax.j6.k;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

public class n {
    @ResultIgnorabilityUnspecified
    public static <ResultT> boolean a(Status status, ResultT ResultT, k<ResultT> k8) {
        if (status.C()) {
            return k8.e(ResultT);
        }
        return k8.d(b.a(status));
    }
}

