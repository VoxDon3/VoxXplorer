/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

final class a
extends PathClassLoader {
    a(String string, ClassLoader classLoader) {
        super(string, classLoader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final Class loadClass(String string, boolean bl) throws ClassNotFoundException {
        if (string.startsWith("java.")) return super.loadClass(string, bl);
        if (string.startsWith("android.")) return super.loadClass(string, bl);
        try {
            return ((ClassLoader)((Object)this)).findClass(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return super.loadClass(string, bl);
        }
    }
}

