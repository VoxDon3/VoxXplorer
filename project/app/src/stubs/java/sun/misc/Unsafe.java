package sun.misc;

/** Compile-time stub: Android's libcore ships this class at runtime, it is just hidden from android.jar. */
public final class Unsafe {
    public static final int ADDRESS_OFFSET = 16;
    public static final int ARRAY_BASE_OFFSET = 32;
    public static final int ARRAY_INDEX_SCALE = 4;
    public static final int OBJECT_FIELD_OFFSET = 24;

    private static final Unsafe THE_UNSAFE;

    static {
        Unsafe u = null;
        try {
            java.lang.reflect.Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            u = (Unsafe) f.get(null);
        } catch (Throwable ignored) {
        }
        THE_UNSAFE = u;
    }

    public static Unsafe getUnsafe() {
        return THE_UNSAFE;
    }

    public int arrayBaseOffset(Class<?> arrayClass) { return 0; }
    public int arrayIndexScale(Class<?> arrayClass) { return 0; }
    public int addressSize() { return 0; }
    public int objectFieldOffset(Class<?> c, String fieldName) { return 0; }
    public long objectFieldOffset(Class<?> c, long fieldAddress) { return 0; }
    public int staticFieldOffset(Class<?> c, String fieldName) { return 0; }
    public int staticFieldBase(Class<?> c) { return 0; }
    public Object staticFieldBase(Class<?> c, boolean isBase) { return null; }
    public Object allocateInstance(Class<?> cls) throws InstantiationException { return null; }
    public void copyMemory(Object srcBase, long srcOffset, Object destBase, long destOffset, long bytes) { }
    public void copyMemory(long srcAddress, long destAddress, long bytes) { }

    public byte getByte(Object o, long offset) { return 0; }
    public void putByte(Object o, long offset, byte x) { }
    public boolean getBoolean(Object o, long offset) { return false; }
    public void putBoolean(Object o, long offset, boolean x) { }
    public char getChar(Object o, long offset) { return 0; }
    public void putChar(Object o, long offset, char x) { }
    public short getShort(Object o, long offset) { return 0; }
    public void putShort(Object o, long offset, short x) { }
    public int getInt(Object o, long offset) { return 0; }
    public void putInt(Object o, long offset, int x) { }
    public long getLong(Object o, long offset) { return 0L; }
    public void putLong(Object o, long offset, long x) { }
    public float getFloat(Object o, long offset) { return 0f; }
    public void putFloat(Object o, long offset, float x) { }
    public double getDouble(Object o, long offset) { return 0d; }
    public void putDouble(Object o, long offset, double x) { }
    public Object getObject(Object o, long offset) { return null; }
    public void putObject(Object o, long offset, Object x) { }

    public byte getByte(long address) { return 0; }
    public void putByte(long address, byte x) { }
    public boolean getBoolean(long address) { return false; }
    public void putBoolean(long address, boolean x) { }
    public char getChar(long address) { return 0; }
    public void putChar(long address, char x) { }
    public short getShort(long address) { return 0; }
    public void putShort(long address, short x) { }
    public int getInt(long address) { return 0; }
    public void putInt(long address, int x) { }
    public long getLong(long address) { return 0L; }
    public void putLong(long address, long x) { }
    public float getFloat(long address) { return 0f; }
    public void putFloat(long address, float x) { }
    public double getDouble(long address) { return 0d; }
    public void putDouble(long address, double x) { }
    public Object getObject(long address) { return null; }
    public void putObject(long address, Object x) { }

    public boolean compareAndSwapInt(Object o, long offset, int expected, int value) { return false; }
    public boolean compareAndSwapLong(Object o, long offset, long expected, long value) { return false; }
    public boolean compareAndSwapObject(Object o, long offset, Object expected, Object value) { return false; }
    public void loadFence() { }
    public void storeFence() { }
}