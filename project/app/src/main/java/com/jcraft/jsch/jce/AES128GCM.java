/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch.jce;

import com.jcraft.jsch.jce.AESGCM;

public class AES128GCM
extends AESGCM {
    @Override
    public int d() {
        return 16;
    }
}

