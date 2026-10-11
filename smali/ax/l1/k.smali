.class public final synthetic Lax/l1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/l1/n$j$a;


# instance fields
.field public final synthetic a:Lax/l1/n$e;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lax/l1/n$e;Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/l1/k;->a:Lax/l1/n$e;

    iput-object p2, p0, Lax/l1/k;->b:Ljava/lang/String;

    iput-object p3, p0, Lax/l1/k;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(ILax/P0/P;[I)Ljava/util/List;
    .registers 10

    .line 1
    iget-object v0, p0, Lax/l1/k;->a:Lax/l1/n$e;

    iget-object v1, p0, Lax/l1/k;->b:Ljava/lang/String;

    iget-object v2, p0, Lax/l1/k;->c:Ljava/lang/String;

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lax/l1/n;->x(Lax/l1/n$e;Ljava/lang/String;Ljava/lang/String;ILax/P0/P;[I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
