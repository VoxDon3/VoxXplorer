package j$.nio.file;

import j$.nio.file.attribute.C3788a;
import j$.util.C3809e;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class x {
    public static final w a;
    public static final w b;
    public static final w c;
    public static final w d;

    public static /* synthetic */ java.nio.file.StandardOpenOption a(StandardOpenOption standardOpenOption) {
        if (standardOpenOption == null) {
            return null;
        }
        return standardOpenOption == StandardOpenOption.READ ? java.nio.file.StandardOpenOption.READ : standardOpenOption == StandardOpenOption.WRITE ? java.nio.file.StandardOpenOption.WRITE : standardOpenOption == StandardOpenOption.APPEND ? java.nio.file.StandardOpenOption.APPEND : standardOpenOption == StandardOpenOption.TRUNCATE_EXISTING ? java.nio.file.StandardOpenOption.TRUNCATE_EXISTING : standardOpenOption == StandardOpenOption.CREATE ? java.nio.file.StandardOpenOption.CREATE : standardOpenOption == StandardOpenOption.CREATE_NEW ? java.nio.file.StandardOpenOption.CREATE_NEW : standardOpenOption == StandardOpenOption.DELETE_ON_CLOSE ? java.nio.file.StandardOpenOption.DELETE_ON_CLOSE : standardOpenOption == StandardOpenOption.SPARSE ? java.nio.file.StandardOpenOption.SPARSE : standardOpenOption == StandardOpenOption.SYNC ? java.nio.file.StandardOpenOption.SYNC : java.nio.file.StandardOpenOption.DSYNC;
    }

    public static /* synthetic */ LinkOption[] i(java.nio.file.LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        LinkOption[] linkOptionArr2 = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static /* synthetic */ java.nio.file.LinkOption[] k(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        java.nio.file.LinkOption[] linkOptionArr2 = new java.nio.file.LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : java.nio.file.LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static WatchEvent.Kind[] l(A[] aArr) {
        if (aArr == null) {
            return null;
        }
        int length = aArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            A a2 = aArr[i];
            kindArr[i] = a2 == null ? null : a2 == b ? StandardWatchEventKinds.ENTRY_CREATE : a2 == c ? StandardWatchEventKinds.ENTRY_DELETE : a2 == d ? StandardWatchEventKinds.ENTRY_MODIFY : a2 == a ? StandardWatchEventKinds.OVERFLOW : a2 instanceof y ? ((y) a2).a : new z(a2);
        }
        return kindArr;
    }

    public static Class d(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributes.class) {
            return j$.nio.file.attribute.BasicFileAttributes.class;
        }
        if (cls == j$.nio.file.attribute.BasicFileAttributes.class) {
            return BasicFileAttributes.class;
        }
        if (cls == PosixFileAttributes.class) {
            return j$.nio.file.attribute.v.class;
        }
        if (cls == j$.nio.file.attribute.v.class) {
            return PosixFileAttributes.class;
        }
        if (cls == j$.nio.file.attribute.h.class) {
            return DosFileAttributes.class;
        }
        if (cls == DosFileAttributes.class) {
            return j$.nio.file.attribute.h.class;
        }
        C3809e.a("java.nio.file.attribute.BasicFileAttributes", cls);
        throw null;
    }

    public static A[] j(WatchEvent.Kind[] kindArr) {
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        A[] aArr = new A[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Kind kind = kindArr[i];
            aArr[i] = kind == null ? null : kind == StandardWatchEventKinds.ENTRY_CREATE ? b : kind == StandardWatchEventKinds.ENTRY_DELETE ? c : kind == StandardWatchEventKinds.ENTRY_MODIFY ? d : kind == StandardWatchEventKinds.OVERFLOW ? a : kind instanceof z ? ((z) kind).a : new y(kind);
        }
        return aArr;
    }

    public static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Path) {
            return o.j((Path) obj);
        }
        return obj instanceof java.nio.file.Path ? n.j((java.nio.file.Path) obj) : obj;
    }

    static {
        int i = 0;
        a = new w(i, "OVERFLOW", Object.class);
        Class<Path> cls = Path.class;
        b = new w(i, "ENTRY_CREATE", cls);
        c = new w(i, "ENTRY_DELETE", cls);
        d = new w(i, "ENTRY_MODIFY", cls);
    }

    public static Class c(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributeView.class) {
            return j$.nio.file.attribute.d.class;
        }
        if (cls == j$.nio.file.attribute.d.class) {
            return BasicFileAttributeView.class;
        }
        if (cls == PosixFileAttributeView.class) {
            return j$.nio.file.attribute.u.class;
        }
        if (cls == j$.nio.file.attribute.u.class) {
            return PosixFileAttributeView.class;
        }
        if (cls == FileOwnerAttributeView.class) {
            return j$.nio.file.attribute.q.class;
        }
        if (cls == j$.nio.file.attribute.q.class) {
            return FileOwnerAttributeView.class;
        }
        if (cls == j$.nio.file.attribute.g.class) {
            return DosFileAttributeView.class;
        }
        if (cls == DosFileAttributeView.class) {
            return j$.nio.file.attribute.g.class;
        }
        if (cls == j$.nio.file.attribute.x.class) {
            return UserDefinedFileAttributeView.class;
        }
        if (cls == UserDefinedFileAttributeView.class) {
            return j$.nio.file.attribute.x.class;
        }
        if (cls == C3788a.class) {
            return AclFileAttributeView.class;
        }
        if (cls == AclFileAttributeView.class) {
            return C3788a.class;
        }
        C3809e.a("java.nio.file.attribute.FileAttributeView", cls);
        throw null;
    }

    public static Set g(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof OpenOption) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(l.a((OpenOption) it.next()));
                } catch (ClassCastException e) {
                    C3809e.a("java.nio.file.OpenOption", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof java.nio.file.OpenOption)) {
                C3809e.a("java.nio.file.OpenOption", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(k.a((java.nio.file.OpenOption) it2.next()));
                } catch (ClassCastException e2) {
                    C3809e.a("java.nio.file.OpenOption", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static Object f(Object obj) {
        if (obj instanceof FileTime) {
            try {
                return j$.com.android.tools.r8.a.y((FileTime) obj);
            } catch (ClassCastException e) {
                C3809e.a("java.nio.file.attribute.FileTime", e);
                throw null;
            }
        }
        if (!(obj instanceof j$.nio.file.attribute.s)) {
            return obj;
        }
        try {
            return j$.com.android.tools.r8.a.D((j$.nio.file.attribute.s) obj);
        } catch (ClassCastException e2) {
            C3809e.a("java.nio.file.attribute.FileTime", e2);
            throw null;
        }
    }

    public static Map e(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str, f(map.get(str)));
        }
        return hashMap;
    }

    public static Set h(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof j$.nio.file.attribute.w) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    j$.nio.file.attribute.w wVar = (j$.nio.file.attribute.w) it.next();
                    hashSet.add(wVar == null ? null : wVar == j$.nio.file.attribute.w.OWNER_READ ? PosixFilePermission.OWNER_READ : wVar == j$.nio.file.attribute.w.OWNER_WRITE ? PosixFilePermission.OWNER_WRITE : wVar == j$.nio.file.attribute.w.OWNER_EXECUTE ? PosixFilePermission.OWNER_EXECUTE : wVar == j$.nio.file.attribute.w.GROUP_READ ? PosixFilePermission.GROUP_READ : wVar == j$.nio.file.attribute.w.GROUP_WRITE ? PosixFilePermission.GROUP_WRITE : wVar == j$.nio.file.attribute.w.GROUP_EXECUTE ? PosixFilePermission.GROUP_EXECUTE : wVar == j$.nio.file.attribute.w.OTHERS_READ ? PosixFilePermission.OTHERS_READ : wVar == j$.nio.file.attribute.w.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE);
                } catch (ClassCastException e) {
                    C3809e.a("java.nio.file.attribute.PosixFilePermission", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof PosixFilePermission)) {
                C3809e.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermission = (PosixFilePermission) it2.next();
                    hashSet.add(posixFilePermission == null ? null : posixFilePermission == PosixFilePermission.OWNER_READ ? j$.nio.file.attribute.w.OWNER_READ : posixFilePermission == PosixFilePermission.OWNER_WRITE ? j$.nio.file.attribute.w.OWNER_WRITE : posixFilePermission == PosixFilePermission.OWNER_EXECUTE ? j$.nio.file.attribute.w.OWNER_EXECUTE : posixFilePermission == PosixFilePermission.GROUP_READ ? j$.nio.file.attribute.w.GROUP_READ : posixFilePermission == PosixFilePermission.GROUP_WRITE ? j$.nio.file.attribute.w.GROUP_WRITE : posixFilePermission == PosixFilePermission.GROUP_EXECUTE ? j$.nio.file.attribute.w.GROUP_EXECUTE : posixFilePermission == PosixFilePermission.OTHERS_READ ? j$.nio.file.attribute.w.OTHERS_READ : posixFilePermission == PosixFilePermission.OTHERS_WRITE ? j$.nio.file.attribute.w.OTHERS_WRITE : j$.nio.file.attribute.w.OTHERS_EXECUTE);
                } catch (ClassCastException e2) {
                    C3809e.a("java.nio.file.attribute.PosixFilePermission", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }
}
