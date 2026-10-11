/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import ax.q5.h;
import ax.q5.m;
import com.google.android.datatransport.cct.d;

@Keep
public class CctBackendFactory
implements ax.q5.d {
    @Override
    public m create(h h8) {
        return new d(h8.b(), h8.e(), h8.d());
    }
}

