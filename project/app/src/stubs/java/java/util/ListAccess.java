package java.util;

/** Compile-time shim: jadx emitted ((AbstractList) this).modCount++ in classes that live outside
 *  java.util, where the protected field is not reachable. Same-package access is legal. */
public final class ListAccess {
    private ListAccess() { }

    public static void incModCount(AbstractList<?> list) {
        list.modCount++;
    }
}
