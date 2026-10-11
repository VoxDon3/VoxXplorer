.class Lax/M0/c$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/M0/c$f;->binderDied()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lax/M0/c$f;


# direct methods
.method constructor <init>(Lax/M0/c$f;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/M0/c$f$a;->q:Lax/M0/c$f;

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
    .registers 3

    .line 1
    iget-object v0, p0, Lax/M0/c$f$a;->q:Lax/M0/c$f;

    .line 2
    .line 3
    iget-object v1, v0, Lax/M0/c$f;->i:Lax/M0/c;

    .line 4
    .line 5
    iget-object v1, v1, Lax/M0/c;->e:Lax/B/a;

    .line 6
    .line 7
    iget-object v0, v0, Lax/M0/c$f;->f:Lax/M0/c$o;

    .line 8
    .line 9
    invoke-interface {v0}, Lax/M0/c$o;->asBinder()Landroid/os/IBinder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v1, v0}, Lax/B/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
