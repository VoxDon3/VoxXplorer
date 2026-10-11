.class public final synthetic Lax/U0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q7/o;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .registers 2

    .line 1
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Lax/U0/n$c;->n(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method
