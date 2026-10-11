/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.ws;

import ax.xc.h;

public final class MessageDeflaterKt {
    private static final h EMPTY_DEFLATE_BLOCK = h.e0.b("000000ffff");
    private static final int LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION = 4;

    public static final /* synthetic */ h access$getEMPTY_DEFLATE_BLOCK$p() {
        return EMPTY_DEFLATE_BLOCK;
    }
}

