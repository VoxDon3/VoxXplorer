.class public final synthetic Lax/i1/n0;
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

    invoke-virtual {p1}, Lax/P0/P;->g()Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method
