/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import ax.Xd.d;
import ax.Xd.f;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Logger;

public class Slf4jLogger
implements Logger {
    private static final d a = f.k(JSch.class);

    @Override
    public void a(int n8, String string) {
        this.b(n8, string, null);
    }

    @Override
    public void b(int n8, String string, Throwable throwable) {
        if (!this.isEnabled(n8)) {
            return;
        }
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3 && n8 != 4) {
                        a.x(string, throwable);
                        return;
                    }
                    a.h(string, throwable);
                    return;
                }
                a.w(string, throwable);
                return;
            }
            a.v(string, throwable);
            return;
        }
        a.y(string, throwable);
    }

    @Override
    public boolean isEnabled(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3 && n8 != 4) {
                        return a.o();
                    }
                    return a.j();
                }
                return a.c();
            }
            return a.l();
        }
        return a.e();
    }
}

