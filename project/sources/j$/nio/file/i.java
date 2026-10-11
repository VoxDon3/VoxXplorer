package j$.nio.file;

import java.net.URI;
import java.security.AccessController;

/* loaded from: classes2.dex */
public abstract class i {
    public static final FileSystem a = ((j$.nio.file.spi.c) AccessController.doPrivileged(new h())).j(URI.create("file:///"));
}
