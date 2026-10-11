.class public final synthetic Lax/o1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic q:Lax/S0/q;


# direct methods
.method public synthetic constructor <init>(Lax/S0/q;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/o1/r;->q:Lax/S0/q;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/r;->q:Lax/S0/q;

    invoke-interface {v0, p1}, Lax/S0/q;->c(Ljava/lang/Runnable;)Z

    return-void
.end method
