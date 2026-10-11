.class public final synthetic Lax/l1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/l1/n$j$a;


# instance fields
.field public final synthetic a:Lax/l1/n$e;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:[I

.field public final synthetic d:Landroid/graphics/Point;


# direct methods
.method public synthetic constructor <init>(Lax/l1/n$e;Ljava/lang/String;[ILandroid/graphics/Point;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/l1/g;->a:Lax/l1/n$e;

    iput-object p2, p0, Lax/l1/g;->b:Ljava/lang/String;

    iput-object p3, p0, Lax/l1/g;->c:[I

    iput-object p4, p0, Lax/l1/g;->d:Landroid/graphics/Point;

    return-void
.end method


# virtual methods
.method public final a(ILax/P0/P;[I)Ljava/util/List;
    .registers 11

    .line 1
    iget-object v0, p0, Lax/l1/g;->a:Lax/l1/n$e;

    iget-object v1, p0, Lax/l1/g;->b:Ljava/lang/String;

    iget-object v2, p0, Lax/l1/g;->c:[I

    iget-object v3, p0, Lax/l1/g;->d:Landroid/graphics/Point;

    move v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, Lax/l1/n;->v(Lax/l1/n$e;Ljava/lang/String;[ILandroid/graphics/Point;ILax/P0/P;[I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
