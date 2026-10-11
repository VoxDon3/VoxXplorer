/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GooglePlayServicesManifestException
extends IllegalStateException {
    private final int q;

    public GooglePlayServicesManifestException(int n8, String string) {
        super(string);
        this.q = n8;
    }
}

