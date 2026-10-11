/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.jce.AESGCM;

public class AES256GCM
extends AESGCM {
    @Override
    public int d() {
        return 32;
    }
}

