.class Lax/V2/a$a;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/V2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field h:Landroid/content/Context;

.field i:Lcom/voxdon/xplorer/bookmark/Bookmark;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/voxdon/xplorer/bookmark/Bookmark;)V
    .registers 4

    .line 1
    sget-object v0, Lax/u3/q$e;->f0:Lax/u3/q$e;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lax/V2/a$a;->h:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p2, p0, Lax/V2/a$a;->i:Lcom/voxdon/xplorer/bookmark/Bookmark;

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


# virtual methods
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/V2/a$a;->w([Ljava/lang/Void;)Ljava/lang/Boolean;

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

.method protected varargs w([Ljava/lang/Void;)Ljava/lang/Boolean;
    .registers 4

    .line 1
    :try_start_0
    iget-object p1, p0, Lax/V2/a$a;->h:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v0, p0, Lax/V2/a$a;->i:Lcom/voxdon/xplorer/bookmark/Bookmark;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p1, v0, v1}, Lax/V2/b;->a(Landroid/content/Context;Lcom/voxdon/xplorer/bookmark/Bookmark;Z)Z
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_0 .. :try_end_8} :catch_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_8} :catch_16

    .line 7
    .line 8
    .line 9
    goto :goto_16

    .line 10
    :catch_9
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "ADD_HISTORY_ERROR! SQLITEFULL"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 21
    .line 22
    .line 23
    :catch_16
    :goto_16
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    return-object p1
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
    .line 42
    .line 43
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
