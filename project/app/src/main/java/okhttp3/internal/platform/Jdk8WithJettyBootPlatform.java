/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform;

import ax.Gb.g;
import ax.Gb.l;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;

public final class Jdk8WithJettyBootPlatform
extends Platform {
    public static final Companion Companion = new Companion(null);
    private final Class<?> clientProviderClass;
    private final Method getMethod;
    private final Method putMethod;
    private final Method removeMethod;
    private final Class<?> serverProviderClass;

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> clazz, Class<?> clazz2) {
        l.f(method, "putMethod");
        l.f(method2, "getMethod");
        l.f(method3, "removeMethod");
        l.f(clazz, "clientProviderClass");
        l.f(clazz2, "serverProviderClass");
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = clazz;
        this.serverProviderClass = clazz2;
    }

    @Override
    public void afterHandshake(SSLSocket sSLSocket) {
        IllegalAccessException illegalAccessException2;
        block3: {
            l.f(sSLSocket, "sslSocket");
            try {
                this.removeMethod.invoke(null, sSLSocket);
                return;
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (IllegalAccessException illegalAccessException2) {
                break block3;
            }
            throw new AssertionError("failed to remove ALPN", invocationTargetException);
        }
        throw new AssertionError("failed to remove ALPN", illegalAccessException2);
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String object, List<? extends Protocol> object2) {
        InvocationTargetException invocationTargetException2;
        block3: {
            l.f(sSLSocket, "sslSocket");
            l.f(object2, "protocols");
            object = Platform.Companion.alpnProtocolNames((List<? extends Protocol>)object2);
            try {
                ClassLoader classLoader = Platform.class.getClassLoader();
                Class<?> clazz = this.clientProviderClass;
                object2 = this.serverProviderClass;
                AlpnProvider alpnProvider = new AlpnProvider((List<String>)object);
                object = Proxy.newProxyInstance(classLoader, new Class[]{clazz, object2}, (InvocationHandler)alpnProvider);
                this.putMethod.invoke(null, sSLSocket, object);
                return;
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InvocationTargetException invocationTargetException2) {
                break block3;
            }
            throw new AssertionError("failed to set ALPN", illegalAccessException);
        }
        throw new AssertionError("failed to set ALPN", invocationTargetException2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public String getSelectedProtocol(SSLSocket object) {
        l.f(object, "sslSocket");
        try {
            object = Proxy.getInvocationHandler(this.getMethod.invoke(null, object));
            l.d(object, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            object = (AlpnProvider)object;
            if (!((AlpnProvider)object).getUnsupported() && ((AlpnProvider)object).getSelected() == null) {
                Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError("failed to get ALPN selected protocol", illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new AssertionError("failed to get ALPN selected protocol", invocationTargetException);
        }
        if (!((AlpnProvider)object).getUnsupported()) return ((AlpnProvider)object).getSelected();
        return null;
    }

    private static final class AlpnProvider
    implements InvocationHandler {
        private final List<String> protocols;
        private String selected;
        private boolean unsupported;

        public AlpnProvider(List<String> list) {
            l.f(list, "protocols");
            this.protocols = list;
        }

        public final String getSelected() {
            return this.selected;
        }

        public final boolean getUnsupported() {
            return this.unsupported;
        }

        @Override
        public Object invoke(Object object, Method object2, Object[] object3) throws Throwable {
            l.f(object, "proxy");
            l.f(object2, "method");
            object = object3;
            if (object3 == null) {
                object = new Object[]{};
            }
            object3 = ((Method)object2).getName();
            Object object4 = ((Method)object2).getReturnType();
            if (l.a(object3, "supports") && l.a(Boolean.TYPE, object4)) {
                return Boolean.TRUE;
            }
            if (l.a(object3, "unsupported") && l.a(Void.TYPE, object4)) {
                this.unsupported = true;
                return null;
            }
            if (l.a(object3, "protocols") && ((Object[])object).length == 0) {
                return this.protocols;
            }
            if ((l.a(object3, "selectProtocol") || l.a(object3, "select")) && l.a(String.class, object4) && ((Object[])object).length == 1 && (object4 = object[0]) instanceof List) {
                l.d(object4, "null cannot be cast to non-null type kotlin.collections.List<*>");
                object = (List)object4;
                int n8 = object.size();
                if (n8 >= 0) {
                    int n9 = 0;
                    while (true) {
                        object2 = object.get(n9);
                        l.d(object2, "null cannot be cast to non-null type kotlin.String");
                        object2 = (String)object2;
                        if (this.protocols.contains(object2)) {
                            this.selected = object2;
                            return object2;
                        }
                        if (n9 == n8) break;
                        ++n9;
                    }
                }
                this.selected = object = this.protocols.get(0);
                return object;
            }
            if ((l.a(object3, "protocolSelected") || l.a(object3, "selected")) && ((Object[])object).length == 1) {
                object = object[0];
                l.d(object, "null cannot be cast to non-null type kotlin.String");
                this.selected = (String)object;
                return null;
            }
            return ((Method)object2).invoke(this, Arrays.copyOf(object, ((Object[])object).length));
        }

        public final void setSelected(String string) {
            this.selected = string;
        }

        public final void setUnsupported(boolean bl) {
            this.unsupported = bl;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final Platform buildIfSupported() {
            Object object = System.getProperty("java.specification.version", "unknown");
            try {
                l.e(object, "jvmVersion");
                int n8 = Integer.parseInt((String)object);
                if (n8 >= 9) {
                    return null;
                }
            }
            catch (NumberFormatException numberFormatException) {}
            try {
                object = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("org.eclipse.jetty.alpn.ALPN");
                stringBuilder.append("$Provider");
                Class<?> clazz = Class.forName(stringBuilder.toString(), true, null);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("org.eclipse.jetty.alpn.ALPN");
                stringBuilder2.append("$ClientProvider");
                Class<?> clazz2 = Class.forName(stringBuilder2.toString(), true, null);
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("org.eclipse.jetty.alpn.ALPN");
                stringBuilder3.append("$ServerProvider");
                Class<?> clazz3 = Class.forName(stringBuilder3.toString(), true, null);
                Method method = ((Class)object).getMethod("put", SSLSocket.class, clazz);
                Method method2 = ((Class)object).getMethod("get", SSLSocket.class);
                object = ((Class)object).getMethod("remove", SSLSocket.class);
                l.e(method, "putMethod");
                l.e(method2, "getMethod");
                l.e(object, "removeMethod");
                l.e(clazz2, "clientProviderClass");
                l.e(clazz3, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(method, method2, (Method)object, clazz2, clazz3);
            }
            catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                return null;
            }
        }
    }
}

