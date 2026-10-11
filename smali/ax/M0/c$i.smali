.class Lax/M0/c$i;
.super Lax/M0/c$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/M0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/M0/c$i$b;
    }
.end annotation


# instance fields
.field final synthetic e:Lax/M0/c;


# direct methods
.method constructor <init>(Lax/M0/c;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/M0/c$i;->e:Lax/M0/c;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/M0/c$h;-><init>(Lax/M0/c;)V

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
    .registers 3

    .line 1
    new-instance v0, Lax/M0/c$i$b;

    .line 2
    .line 3
    iget-object v1, p0, Lax/M0/c$i;->e:Lax/M0/c;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lax/M0/c$i$b;-><init>(Lax/M0/c$i;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lax/M0/c$h;->b:Landroid/service/media/MediaBrowserService;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/service/media/MediaBrowserService;->onCreate()V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public g(Ljava/lang/String;Lax/M0/c$m;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lax/M0/c$m<",
            "Landroid/os/Parcel;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lax/M0/c$i$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lax/M0/c$i$a;-><init>(Lax/M0/c$i;Ljava/lang/Object;Lax/M0/c$m;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lax/M0/c$i;->e:Lax/M0/c;

    .line 7
    .line 8
    iget-object v1, p2, Lax/M0/c;->c:Lax/M0/c$f;

    .line 9
    .line 10
    iput-object v1, p2, Lax/M0/c;->f:Lax/M0/c$f;

    .line 11
    .line 12
    invoke-virtual {p2, p1, v0}, Lax/M0/c;->r(Ljava/lang/String;Lax/M0/c$l;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lax/M0/c$i;->e:Lax/M0/c;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    iput-object p2, p1, Lax/M0/c;->f:Lax/M0/c$f;

    .line 19
    .line 20
    return-void
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
