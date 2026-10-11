.class public final synthetic Lax/S0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:I

.field public final synthetic d0:Lax/S0/t$a;

.field public final synthetic q:Ljava/util/concurrent/CopyOnWriteArraySet;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;ILax/S0/t$a;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/S0/s;->q:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput p2, p0, Lax/S0/s;->c0:I

    iput-object p3, p0, Lax/S0/s;->d0:Lax/S0/t$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/S0/s;->q:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget v1, p0, Lax/S0/s;->c0:I

    iget-object v2, p0, Lax/S0/s;->d0:Lax/S0/t$a;

    invoke-static {v0, v1, v2}, Lax/S0/t;->a(Ljava/util/concurrent/CopyOnWriteArraySet;ILax/S0/t$a;)V

    return-void
.end method
