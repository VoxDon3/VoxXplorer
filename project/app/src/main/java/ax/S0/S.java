/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.security.NetworkSecurityPolicy;

public final class S {
    public static /* bridge */ /* synthetic */ boolean a(NetworkSecurityPolicy networkSecurityPolicy, String string) {
        return networkSecurityPolicy.isCleartextTrafficPermitted(string);
    }
}

