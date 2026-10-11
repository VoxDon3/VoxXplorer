/*
 * Decompiled with CFR 0.152.
 */
package ax.I2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import ax.B2.i;
import ax.G2.b;
import ax.Gb.l;
import ax.I2.h;
import ax.I2.k;
import ax.L2.m;
import ax.L2.q;
import ax.N2.c;

public final class j
extends h<b> {
    private final ConnectivityManager f;
    private final a g;

    public j(Context object, c c8) {
        l.f(object, "context");
        l.f(c8, "taskExecutor");
        super((Context)object, c8);
        object = this.d().getSystemService("connectivity");
        l.d(object, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager)object;
        this.g = new ConnectivityManager.NetworkCallback(this){
            final j a;
            {
                this.a = j8;
            }

            public void onCapabilitiesChanged(Network object, NetworkCapabilities networkCapabilities) {
                l.f(object, "network");
                l.f(networkCapabilities, "capabilities");
                i i8 = i.e();
                String string = k.b();
                object = new StringBuilder();
                ((StringBuilder)object).append("Network capabilities changed: ");
                ((StringBuilder)object).append(networkCapabilities);
                i8.a(string, ((StringBuilder)object).toString());
                object = this.a;
                ((h)object).g(k.c(((j)object).f));
            }

            public void onLost(Network object) {
                l.f(object, "network");
                i.e().a(k.b(), "Network connection lost");
                object = this.a;
                ((h)object).g(k.c(((j)object).f));
            }
        };
    }

    @Override
    public void h() {
        block4: {
            IllegalArgumentException illegalArgumentException2;
            block3: {
                try {
                    i.e().a(k.b(), "Registering network callback");
                    q.a(this.f, this.g);
                    return;
                }
                catch (SecurityException securityException) {
                }
                catch (IllegalArgumentException illegalArgumentException2) {
                    break block3;
                }
                i.e().d(k.b(), "Received exception while registering network callback", securityException);
                break block4;
            }
            i.e().d(k.b(), "Received exception while registering network callback", illegalArgumentException2);
        }
    }

    @Override
    public void i() {
        block4: {
            IllegalArgumentException illegalArgumentException2;
            block3: {
                try {
                    i.e().a(k.b(), "Unregistering network callback");
                    m.c(this.f, this.g);
                    return;
                }
                catch (SecurityException securityException) {
                }
                catch (IllegalArgumentException illegalArgumentException2) {
                    break block3;
                }
                i.e().d(k.b(), "Received exception while unregistering network callback", securityException);
                break block4;
            }
            i.e().d(k.b(), "Received exception while unregistering network callback", illegalArgumentException2);
        }
    }

    public b k() {
        return k.c(this.f);
    }
}

