/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.HostKey;
import com.jcraft.jsch.UserInfo;

public interface HostKeyRepository {
    public String a();

    public void b(HostKey var1, UserInfo var2);

    public int c(String var1, byte[] var2);

    public void d(String var1, String var2, byte[] var3);

    public HostKey[] e(String var1, String var2);
}

