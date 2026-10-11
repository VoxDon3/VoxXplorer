package ax.n7;

/* loaded from: classes3.dex */
final class d {
    private static final ThreadLocal<char[]> a = new a();

    static class a extends ThreadLocal<char[]> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    static char[] a() {
        return a.get();
    }
}
