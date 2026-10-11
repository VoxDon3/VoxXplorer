.class Lax/a3/y$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a3/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lax/a3/y;


# direct methods
.method constructor <init>(Lax/a3/y;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/y$d;->q:Lax/a3/y;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method


# virtual methods
.method public run()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/a3/y$d;->q:Lax/a3/y;

    .line 2
    .line 3
    invoke-static {v0}, Lax/a3/y;->e3(Lax/a3/y;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lax/a3/y$d;->q:Lax/a3/y;

    .line 7
    .line 8
    invoke-static {v0}, Lax/a3/y;->n3(Lax/a3/y;)Landroid/os/Handler;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-wide/16 v1, 0x3e8

    .line 13
    .line 14
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method
