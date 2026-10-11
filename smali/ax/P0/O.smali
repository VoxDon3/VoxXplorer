.class public final synthetic Lax/P0/O;
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
    check-cast p1, Landroid/os/Bundle;

    invoke-static {p1}, Lax/P0/v;->e(Landroid/os/Bundle;)Lax/P0/v;

    move-result-object p1

    return-object p1
.end method
