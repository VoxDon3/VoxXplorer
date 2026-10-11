package java.util.function;

public final class Consumer$CC {
    private Consumer$CC() { }

    public static Consumer<Object> $default$andThen(Consumer<Object> consumer, Consumer<Object> consumer2) {
        java.util.Objects.requireNonNull(consumer2);
        return t -> {
            consumer.accept(t);
            consumer2.accept(t);
        };
    }
}
