.class public final synthetic Lax/i1/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q7/f;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, Lax/P0/P;

    invoke-static {p1}, Lax/i1/q0;->a(Lax/P0/P;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
