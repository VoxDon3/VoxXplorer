/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.DHXEC;

class DH448
extends DHXEC {
    public DH448() {
        this.D = "sha-512";
        this.E = "X448";
        this.F = 56;
    }
}

