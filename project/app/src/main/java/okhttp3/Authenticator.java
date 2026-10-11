/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.l;
import java.io.IOException;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.authenticator.JavaNetAuthenticator;

public interface Authenticator {
    public static final Companion Companion = okhttp3.Authenticator$Companion.$$INSTANCE;
    public static final Authenticator JAVA_NET_AUTHENTICATOR;
    public static final Authenticator NONE;

    static {
        NONE = new Companion.AuthenticatorNone();
        JAVA_NET_AUTHENTICATOR = new JavaNetAuthenticator(null, 1, null);
    }

    public Request authenticate(Route var1, Response var2) throws IOException;

    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        private static final class AuthenticatorNone
        implements Authenticator {
            @Override
            public Request authenticate(Route route, Response response) {
                l.f(response, "response");
                return null;
            }
        }
    }
}

