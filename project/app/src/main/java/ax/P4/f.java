/*
 * Decompiled with CFR 0.152.
 */
package ax.P4;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;

public final class f {
    public static /* bridge */ /* synthetic */ Signature[] a(SigningInfo signingInfo) {
        return signingInfo.getSigningCertificateHistory();
    }
}

