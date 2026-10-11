/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.KDF;

public interface SCrypt
extends KDF {
    public void d(byte[] var1, int var2, int var3, int var4) throws Exception;
}

