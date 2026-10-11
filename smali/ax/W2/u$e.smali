.class Lax/W2/u$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/W2/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field a:Lax/W2/t$a;

.field b:Z

.field c:Landroid/os/ParcelFileDescriptor;

.field d:Ljava/lang/String;

.field e:Lcom/voxdon/xplorer/file/n;

.field f:Lax/c3/k;

.field g:Ljava/lang/String;

.field h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation
.end field

.field i:J

.field j:Ljava/io/FileInputStream;

.field k:Lax/Ec/a;

.field l:J

.field m:Z

.field n:Lax/Bc/n;

.field o:Z

.field p:Z

.field q:Lax/Dc/T;

.field r:Z

.field s:Ljava/lang/String;

.field t:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lax/Ac/a;",
            ">;"
        }
    .end annotation
.end field

.field u:Z

.field v:Lax/Cc/d;

.field w:Lax/Cc/c;


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lax/W2/u$a;)V
    .registers 2

    .line 2
    invoke-direct {p0}, Lax/W2/u$e;-><init>()V

    return-void
.end method

.method static synthetic a(Lax/W2/u$e;)Z
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/W2/u$e;->b()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
    .line 6
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

.method private b()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/W2/u$e;->a:Lax/W2/t$a;

    .line 2
    .line 3
    sget-object v1, Lax/W2/t$a;->d0:Lax/W2/t$a;

    .line 4
    .line 5
    if-eq v0, v1, :cond_d

    .line 6
    .line 7
    sget-object v1, Lax/W2/t$a;->c0:Lax/W2/t$a;

    .line 8
    .line 9
    if-ne v0, v1, :cond_b

    .line 10
    .line 11
    goto :goto_d

    .line 12
    :cond_b
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_d
    :goto_d
    const/4 v0, 0x1

    .line 15
    return v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
