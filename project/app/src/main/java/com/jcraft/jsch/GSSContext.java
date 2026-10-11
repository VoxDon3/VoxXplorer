/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.JSchException;

public interface GSSContext {
    public byte[] a(byte[] var1, int var2, int var3) throws JSchException;

    public boolean b();

    public void c(String var1, String var2) throws JSchException;

    public void d();

    public byte[] e(byte[] var1, int var2, int var3);
}

