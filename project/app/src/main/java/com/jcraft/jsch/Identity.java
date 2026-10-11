/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.JSchException;

public interface Identity {
    public byte[] a(byte[] var1, String var2);

    public String b();

    public boolean c();

    public void clear();

    public byte[] d();

    public boolean e(byte[] var1) throws JSchException;

    public byte[] f(byte[] var1);

    public String getName();
}

