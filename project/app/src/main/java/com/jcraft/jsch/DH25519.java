/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.DHXEC;

class DH25519
extends DHXEC {
    public DH25519() {
        this.D = "sha-256";
        this.E = "X25519";
        this.F = 32;
    }
}

