.class public final Lax/K3/a$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/K3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:J

.field private final c:[J

.field private final d:[Ljava/io/File;

.field final synthetic e:Lax/K3/a;


# direct methods
.method private constructor <init>(Lax/K3/a;Ljava/lang/String;J[Ljava/io/File;[J)V
    .registers 7

    .line 2
    iput-object p1, p0, Lax/K3/a$e;->e:Lax/K3/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lax/K3/a$e;->a:Ljava/lang/String;

    .line 4
    iput-wide p3, p0, Lax/K3/a$e;->b:J

    .line 5
    iput-object p5, p0, Lax/K3/a$e;->d:[Ljava/io/File;

    .line 6
    iput-object p6, p0, Lax/K3/a$e;->c:[J

    return-void
.end method

.method synthetic constructor <init>(Lax/K3/a;Ljava/lang/String;J[Ljava/io/File;[JLax/K3/a$a;)V
    .registers 8

    .line 1
    invoke-direct/range {p0 .. p6}, Lax/K3/a$e;-><init>(Lax/K3/a;Ljava/lang/String;J[Ljava/io/File;[J)V

    return-void
.end method


# virtual methods
.method public a(I)Ljava/io/File;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/K3/a$e;->d:[Ljava/io/File;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
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
