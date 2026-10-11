/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Logger;
import java.util.logging.Level;

public class JulLogger
implements Logger {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(JSch.class.getName());

    static Level c(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3 && n8 != 4) {
                        return Level.FINER;
                    }
                    return Level.SEVERE;
                }
                return Level.WARNING;
            }
            return Level.INFO;
        }
        return Level.FINE;
    }

    @Override
    public void a(int n8, String string) {
        this.b(n8, string, null);
    }

    @Override
    public void b(int n8, String string, Throwable throwable) {
        if (throwable == null) {
            a.log(JulLogger.c(n8), string);
            return;
        }
        a.log(JulLogger.c(n8), string, throwable);
    }

    @Override
    public boolean isEnabled(int n8) {
        return a.isLoggable(JulLogger.c(n8));
    }
}

