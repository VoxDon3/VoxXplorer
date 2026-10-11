.class public final synthetic Lax/Y0/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic q:Lax/S0/f;


# direct methods
.method public synthetic constructor <init>(Lax/S0/f;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Y0/B;->q:Lax/S0/f;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Y0/B;->q:Lax/S0/f;

    invoke-virtual {v0, p1}, Lax/S0/f;->e(Ljava/lang/Runnable;)V

    return-void
.end method
