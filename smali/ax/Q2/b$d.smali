.class Lax/Q2/b$d;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/Q2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic h:Lax/Q2/b;


# direct methods
.method constructor <init>(Lax/Q2/b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/Q2/b$d;->h:Lax/Q2/b;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->e0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    return-void
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
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/Q2/b$d;->w([Ljava/lang/Void;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method protected w([Ljava/lang/Void;)Ljava/lang/Boolean;
    .registers 3

    .line 1
    iget-object p1, p0, Lax/Q2/b$d;->h:Lax/Q2/b;

    .line 2
    .line 3
    invoke-static {p1}, Lax/Q2/b;->a(Lax/Q2/b;)Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lax/i3/a;->h(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lax/Q2/b$d;->h:Lax/Q2/b;

    .line 11
    .line 12
    invoke-static {p1}, Lax/Q2/b;->a(Lax/Q2/b;)Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {p1, v0}, Lax/Q2/b;->b(Lax/Q2/b;Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lax/Q2/b$d;->h:Lax/Q2/b;

    .line 20
    .line 21
    invoke-static {p1}, Lax/Q2/b;->a(Lax/Q2/b;)Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-static {p1, v0}, Lcom/voxdon/xplorer/receiver/StorageCheckReceiver;->b(Landroid/content/Context;Z)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/voxdon/xplorer/provider/MyFileProvider;->l()Lcom/voxdon/xplorer/provider/MyFileProvider;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_29

    .line 34
    .line 35
    invoke-static {}, Lcom/voxdon/xplorer/provider/MyFileProvider;->l()Lcom/voxdon/xplorer/provider/MyFileProvider;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Lcom/voxdon/xplorer/provider/MyFileProvider;->z()V

    .line 40
    .line 41
    .line 42
    :cond_29
    const/4 p1, 0x0

    .line 43
    return-object p1
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
