package java.util.function;

public final class Function$CC {
    private Function$CC() { }

    public static <T, R> Function<T, R> $default$compose(Function<T, R> function, Function<T, R> function2) {
        java.util.Objects.requireNonNull(function2);
        return t -> function2.apply(function.apply(t));
    }

    public static <T, R> Function<T, R> $default$andThen(Function<T, R> function, Function<T, R> function2) {
        java.util.Objects.requireNonNull(function2);
        return t -> function2.apply(function.apply(t));
    }
}
