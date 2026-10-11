.class Lcom/example/android/uamp/MusicService$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/R4/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/example/android/uamp/MusicService;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/example/android/uamp/MusicService;


# direct methods
.method constructor <init>(Lcom/example/android/uamp/MusicService;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/example/android/uamp/MusicService$a;->a:Lcom/example/android/uamp/MusicService;

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
.method public a()V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/example/android/uamp/MusicService$a;->a:Lcom/example/android/uamp/MusicService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/example/android/uamp/MusicService;->C(Lcom/example/android/uamp/MusicService;)Lax/R4/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/example/android/uamp/MusicService$a;->a:Lcom/example/android/uamp/MusicService;

    .line 8
    .line 9
    sget v2, Lax/P4/i;->d:I

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v1, v2, v3}, Lax/R4/g;->N(Ljava/lang/String;ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
.end method

.method public b(I)V
    .registers 2

    .line 1
    iget-object p1, p0, Lcom/example/android/uamp/MusicService$a;->a:Lcom/example/android/uamp/MusicService;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/example/android/uamp/MusicService;->C(Lcom/example/android/uamp/MusicService;)Lax/R4/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lax/R4/g;->z()V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public c(Ljava/lang/String;Ljava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/example/android/uamp/MusicService$a;->a:Lcom/example/android/uamp/MusicService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/example/android/uamp/MusicService;->B(Lcom/example/android/uamp/MusicService;)Landroid/support/v4/media/session/MediaSessionCompat;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p2}, Landroid/support/v4/media/session/MediaSessionCompat;->n(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lcom/example/android/uamp/MusicService$a;->a:Lcom/example/android/uamp/MusicService;

    .line 11
    .line 12
    invoke-static {p2}, Lcom/example/android/uamp/MusicService;->B(Lcom/example/android/uamp/MusicService;)Landroid/support/v4/media/session/MediaSessionCompat;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->o(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public u(Landroid/support/v4/media/MediaMetadataCompat;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/example/android/uamp/MusicService$a;->a:Lcom/example/android/uamp/MusicService;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/example/android/uamp/MusicService;->B(Lcom/example/android/uamp/MusicService;)Landroid/support/v4/media/session/MediaSessionCompat;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->l(Landroid/support/v4/media/MediaMetadataCompat;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/example/android/uamp/MusicService$a;->a:Lcom/example/android/uamp/MusicService;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/example/android/uamp/MusicService;->C(Lcom/example/android/uamp/MusicService;)Lax/R4/g;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lax/R4/g;->u()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const-string v1, "file.manager.music.player.QUEUE_POSITION"

    .line 26
    .line 27
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/example/android/uamp/MusicService$a;->a:Lcom/example/android/uamp/MusicService;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/example/android/uamp/MusicService;->C(Lcom/example/android/uamp/MusicService;)Lax/R4/g;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lax/R4/g;->v()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const-string v1, "file.manager.music.player.QUEUE_SIZE"

    .line 41
    .line 42
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/example/android/uamp/MusicService$a;->a:Lcom/example/android/uamp/MusicService;

    .line 46
    .line 47
    invoke-static {v0}, Lcom/example/android/uamp/MusicService;->B(Lcom/example/android/uamp/MusicService;)Landroid/support/v4/media/session/MediaSessionCompat;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->j(Landroid/os/Bundle;)V

    .line 52
    .line 53
    .line 54
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
